grammar ulNoActions;

@header {
        import AST.*;
        import Type.*;
}

@members
{

HashMap memory = new HashMap();

protected void mismatch (IntStream input, int ttype, BitSet follow)
        throws RecognitionException
{
        throw new MismatchedTokenException(ttype, input);
}
public void recoverFromMismatchedSet (IntStream input,
                                      RecognitionException e,
                                      BitSet follow)
        throws RecognitionException
{
        reportError(e);
        throw e;
}
}

@rulecatch {
        catch (RecognitionException ex) {
                reportError(ex);
                throw ex;
        }
}

/*
 * This is a subset of the ulGrammar to show you how
 * to make new production rules.
 * You will need to:
 *  - change type to be compoundType and include appropriate productions
 *  - introduce optional formalParameters
 *  - change functionBody to include variable declarations and statements 
 */

program returns [Program prog]
@init{ prog = new Program();}
        : (f = function { prog.addElement(f); })+ EOF
        ;
         
function returns [Function f]
        : fd = functionDecl fb = functionBody
        {$f = new Function(fd,fb);}
        ;

functionDecl returns [FunctionDeclaration f]
                : ct = compoundType id = identifier '(' fp = formalParameters ')'
                { f = new FunctionDeclaration(ct, id, fp);}
	         ;


formalParameters returns [FormalParameterList fpl]
@init {fpl = new FormalParameterList();} 
                : (cpt = compoundType id = identifier { fpl.addFormalParameter(new FormalParameter(cpt, id)); }
                  (mf = moreFormals {fpl.addFormalParameter(mf); })*)?
                 ;

moreFormals returns [FormalParameter fp]
                : (',' cpt = compoundType id = identifier {fp = new FormalParameter(cpt, id);})
                ;
                
functionBody returns [FunctionBody fb]
@init {fb = new FunctionBody();}
                : '{' (v = varDecl {fb.vdl.addVariable(v);})* (s = statement{fb.sl.addStatement(s);})* '}'
	        ;

varDecl returns [VariableDeclaration vd]         
                :(ct = compoundType id = identifier {vd = new VariableDeclaration(ct, id); } ) ';'
                 ;

statement returns [Statement s]   
options {backtrack=true;}    
                 : ';'
                 | e = expr ';' 
                        {s = new ExpressionStatement(e);}
                 | id = identifier exb = exprBracket '=' e1 =expr ';' 
                        { s = new AssignmentStatement(id, exb, e1);}
                 | IF '(' e = expr ')' b = block el = elseBlock { s = new IfStatement(e, b, el);}
                 | WHILE '(' e6 = expr ')' blo=block { s = new WhileStatement(e6,blo);}
                 | p = printstatement {s = p;}
                 | pl = printlnstatement {s =pl;}
                 | r = RETURN (e5 = expr)? ';' {s = new ReturnStatement(e5, $r.line, $r.pos);}
                ;

printstatement returns [PrintStatement p]
                : PRINT e = expr ';' { p = new PrintStatement(e); }
                ;

printlnstatement returns [PrintlnStatement p]
                : PRINTLN e = expr ';' { p = new PrintlnStatement(e); }
                ;

fragment 
elseBlock returns [Block b]
@init { b = null; }
                : (ELSE blo = block {b = blo ;})?
                 ;

block returns [Block block]
@init{block = new Block();}
                : '{' (s = statement {$block.sl.addStatement(s);})* '}'
                ;

expr returns [Expression e]
@init { Expression it = null; }
@after { e = it; }                   
                : e1 = exprEquiv { it = e1; }
                ( 
                        '==' e2 = exprEquiv {it = new EqualityExpression(it, e2);}
                )*
                ;

fragment
exprEquiv returns [Expression e]
@init { Expression it = null; }
@after { e = it; }       
                : e1 = exprLess { it = e1;}
                ( 
                        '<' e2 = exprLess {it = new LessThanExpression(it, e2);}
                )*
                ;

fragment 
exprLess returns [Expression e]
@init { Expression it = null; }
@after { e = it; }

                : e1 = exprAddSub {it = e1 ;}
                (
                        '+' e2 = exprAddSub {it = new AddExpression(it, e2);}
                        |
                        '-' e2 = exprAddSub {it = new SubtractExpression(it, e2);}
                )*
                ;
fragment
exprAddSub returns [Expression e]
@init { Expression it = null; }
@after { e = it; }
                : e1 = exprAtom { it = e1; }
                (
                        '*' e2 = exprAtom {it = new MultExpression(it, e2);}
                )*
                 ;

fragment
exprAtom returns [Expression e]
                 : id = identifier exb = exprBracket {e = new Declaration(id, exb);}
                 | id = identifier '(' el = exprList ')' {e = new FunctionCall(id, el);}
                 | lit = literal {e = lit;}
                 | ('(' e1 = expr ')' { e = new ParenExpression(e1);}  )
                 ;
 
exprBracket returns [Expression e]
@init {Expression it = null; }
@after{e = it; }
                 : ('[' e1 = expr ']' {it = e1;})?
                 ;


exprList returns [ExpressionList el]
@init { el = new ExpressionList(); }
                 : ( e1 = expr { $el.addExpression(e1);}
                   (e2 = exprMore { $el.addExpression(e2); } )*)?
                 ;

exprMore returns [Expression exp] 
                 : ',' e = expr {exp = e;}
                 ;

compoundType returns [TypeNode t]
                 : ty = type {t = ty;}
                 | at = type '[' i = integerconstant ']' {t = new TypeNode(new ArrayType(at.t, i), i.l, i.o);}
                 ;

floatconstant returns [FloatLiteral f]
                : fl = FLOATCONSTANT
                {f = new FloatLiteral(Float.parseFloat($fl.text), $fl.line, $fl.pos);}
                 ;


integerconstant returns [IntegerLiteral l]
                : i = INTEGERCONSTANT
                {l = new IntegerLiteral(Integer.parseInt($i.text), $i.line, $i.pos);}
                 ;

charconstant returns [CharacterLiteral c]
                : ch = CHARCONSTANT
                {c = new CharacterLiteral($ch.text.charAt(1), $ch.line, $ch.pos);}
                 ;

stringconstant returns [StringLiteral s]
                : st = STRINGCONSTANT
                {s = new StringLiteral($st.text, $st.line, $st.pos);}
                 ;

trueconstant returns [BooleanLiteral b]
                : t = TRUE
                {b = new BooleanLiteral($t.text, $t.line, $t.pos);}
                 ;

falseconstant returns [BooleanLiteral b]
                : f = FALSE
                {b = new BooleanLiteral($f.text, $f.line, $f.pos);}
                ;


type returns [TypeNode ty]:
t= TYPE
{
        if(t.getText().equals("void"))
        {
                ty = new TypeNode(new VoidType(), $t.line, $t.pos);
        }
        else if(t.getText().equals("int"))
        {
                ty = new TypeNode(new IntegerType(), $t.line, $t.pos);
        }
        else if(t.getText().equals("float"))
        {
                ty = new TypeNode(new FloatType(), $t.line, $t.pos);
        }
        else if(t.getText().equals("char"))
        {
                ty = new TypeNode(new CharType(), $t.line, $t.pos);
        }
        else if(t.getText().equals("string"))
        {
                ty = new TypeNode(new StringType(), $t.line, $t.pos);
        }
        else if(t.getText().equals("boolean"))
        {
                ty = new TypeNode(new BooleanType(), $t.line, $t.pos);
        }
}
;


literal returns [Expression e]
                 : f = floatconstant {e = f;}
                 | i =integerconstant {e = i;}
                 | s = stringconstant {e = s;}
                 | c = charconstant {e = c;}
                 | t = trueconstant {e = t;}
                 | fl = falseconstant {e = fl;}
                 ;

identifier returns [Identifier i]
                 : a = ID {i = new Identifier($a.text, $a.line, $a.pos);}
	         ;

/* Lexer */
	 
IF	        : 'if'
	        ;

ELSE            : 'else'
                ;

WHILE           : 'while'
                ;

PRINT           : 'print'
                ;
PRINTLN         : 'println'
                ;

RETURN          : 'return'
                ;

TYPE            : 'int' | 'float' | 'char' | 'string' | 'boolean' | 'void'
                ;

TRUE            : 'true'
                ;

FALSE           : 'false'
                ;

FLOATCONSTANT   : ('0'..'9')+ '.' ('0'..'9')+
                ; 

STRINGCONSTANT  : '"' ('a'..'z' | 'A'..'Z' | '_' | ' ' | '0'..'9' )* '"' 
                ; 

CHARCONSTANT    : '\'' ('a'..'z' | 'A'..'Z' | '_' | ' ' | '0'..'9' ) '\''
                ; 

INTEGERCONSTANT : ('0'..'9')+
                ; 

ID	        : ('a'..'z' | 'A'..'Z' | '_' )('a'..'z' | 'A'..'Z' | '_' | '0'..'9' )* 
	        ;

/* These two lines match whitespace and comments 
 * and ignore them.
 * You want to leave these as last in the file.  
 * Add new lexical rules above 
 */
WS      : ( '\t' | ' ' | ('\r' | '\n') )+ { $channel = HIDDEN; skip();}
        ;

COMMENT : '//' ~('\r' | '\n')* ('\r' | '\n') { $channel = HIDDEN;}
        ;