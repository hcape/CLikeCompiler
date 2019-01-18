// $ANTLR 3.0.1 ulNoActions.g 2018-04-07 12:15:18

        import AST.*;
        import Type.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class ulNoActionsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IF", "WHILE", "RETURN", "PRINT", "PRINTLN", "ELSE", "FLOATCONSTANT", "INTEGERCONSTANT", "CHARCONSTANT", "STRINGCONSTANT", "TRUE", "FALSE", "TYPE", "ID", "WS", "COMMENT", "'('", "')'", "','", "'{'", "'}'", "';'", "'='", "'=='", "'<'", "'+'", "'-'", "'*'", "'['", "']'"
    };
    public static final int PRINT=7;
    public static final int PRINTLN=8;
    public static final int COMMENT=19;
    public static final int RETURN=6;
    public static final int CHARCONSTANT=12;
    public static final int STRINGCONSTANT=13;
    public static final int ELSE=9;
    public static final int ID=17;
    public static final int WS=18;
    public static final int EOF=-1;
    public static final int IF=4;
    public static final int TYPE=16;
    public static final int TRUE=14;
    public static final int FLOATCONSTANT=10;
    public static final int INTEGERCONSTANT=11;
    public static final int WHILE=5;
    public static final int FALSE=15;

        public ulNoActionsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[37+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "ulNoActions.g"; }



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



    // $ANTLR start program
    // ulNoActions.g:44:1: program returns [Program prog] : (f= function )+ EOF ;
    public final Program program() throws RecognitionException {
        Program prog = null;

        Function f = null;


         prog = new Program();
        try {
            // ulNoActions.g:46:9: ( (f= function )+ EOF )
            // ulNoActions.g:46:11: (f= function )+ EOF
            {
            // ulNoActions.g:46:11: (f= function )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==TYPE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ulNoActions.g:46:12: f= function
            	    {
            	    pushFollow(FOLLOW_function_in_program52);
            	    f=function();
            	    _fsp--;
            	    if (failed) return prog;
            	    if ( backtracking==0 ) {
            	       prog.addElement(f); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (backtracking>0) {failed=true; return prog;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_program58); if (failed) return prog;

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return prog;
    }
    // $ANTLR end program


    // $ANTLR start function
    // ulNoActions.g:49:1: function returns [Function f] : fd= functionDecl fb= functionBody ;
    public final Function function() throws RecognitionException {
        Function f = null;

        FunctionDeclaration fd = null;

        FunctionBody fb = null;


        try {
            // ulNoActions.g:50:9: (fd= functionDecl fb= functionBody )
            // ulNoActions.g:50:11: fd= functionDecl fb= functionBody
            {
            pushFollow(FOLLOW_functionDecl_in_function100);
            fd=functionDecl();
            _fsp--;
            if (failed) return f;
            pushFollow(FOLLOW_functionBody_in_function106);
            fb=functionBody();
            _fsp--;
            if (failed) return f;
            if ( backtracking==0 ) {
              f = new Function(fd,fb);
            }

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return f;
    }
    // $ANTLR end function


    // $ANTLR start functionDecl
    // ulNoActions.g:54:1: functionDecl returns [FunctionDeclaration f] : ct= compoundType id= identifier '(' fp= formalParameters ')' ;
    public final FunctionDeclaration functionDecl() throws RecognitionException {
        FunctionDeclaration f = null;

        TypeNode ct = null;

        Identifier id = null;

        FormalParameterList fp = null;


        try {
            // ulNoActions.g:55:17: (ct= compoundType id= identifier '(' fp= formalParameters ')' )
            // ulNoActions.g:55:19: ct= compoundType id= identifier '(' fp= formalParameters ')'
            {
            pushFollow(FOLLOW_compoundType_in_functionDecl157);
            ct=compoundType();
            _fsp--;
            if (failed) return f;
            pushFollow(FOLLOW_identifier_in_functionDecl163);
            id=identifier();
            _fsp--;
            if (failed) return f;
            match(input,20,FOLLOW_20_in_functionDecl165); if (failed) return f;
            pushFollow(FOLLOW_formalParameters_in_functionDecl171);
            fp=formalParameters();
            _fsp--;
            if (failed) return f;
            match(input,21,FOLLOW_21_in_functionDecl173); if (failed) return f;
            if ( backtracking==0 ) {
               f = new FunctionDeclaration(ct, id, fp);
            }

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return f;
    }
    // $ANTLR end functionDecl


    // $ANTLR start formalParameters
    // ulNoActions.g:60:1: formalParameters returns [FormalParameterList fpl] : (cpt= compoundType id= identifier (mf= moreFormals )* )? ;
    public final FormalParameterList formalParameters() throws RecognitionException {
        FormalParameterList fpl = null;

        TypeNode cpt = null;

        Identifier id = null;

        FormalParameter mf = null;


        fpl = new FormalParameterList();
        try {
            // ulNoActions.g:62:17: ( (cpt= compoundType id= identifier (mf= moreFormals )* )? )
            // ulNoActions.g:62:19: (cpt= compoundType id= identifier (mf= moreFormals )* )?
            {
            // ulNoActions.g:62:19: (cpt= compoundType id= identifier (mf= moreFormals )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TYPE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ulNoActions.g:62:20: cpt= compoundType id= identifier (mf= moreFormals )*
                    {
                    pushFollow(FOLLOW_compoundType_in_formalParameters242);
                    cpt=compoundType();
                    _fsp--;
                    if (failed) return fpl;
                    pushFollow(FOLLOW_identifier_in_formalParameters248);
                    id=identifier();
                    _fsp--;
                    if (failed) return fpl;
                    if ( backtracking==0 ) {
                       fpl.addFormalParameter(new FormalParameter(cpt, id)); 
                    }
                    // ulNoActions.g:63:19: (mf= moreFormals )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==22) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ulNoActions.g:63:20: mf= moreFormals
                    	    {
                    	    pushFollow(FOLLOW_moreFormals_in_formalParameters275);
                    	    mf=moreFormals();
                    	    _fsp--;
                    	    if (failed) return fpl;
                    	    if ( backtracking==0 ) {
                    	      fpl.addFormalParameter(mf); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return fpl;
    }
    // $ANTLR end formalParameters


    // $ANTLR start moreFormals
    // ulNoActions.g:66:1: moreFormals returns [FormalParameter fp] : ( ',' cpt= compoundType id= identifier ) ;
    public final FormalParameter moreFormals() throws RecognitionException {
        FormalParameter fp = null;

        TypeNode cpt = null;

        Identifier id = null;


        try {
            // ulNoActions.g:67:17: ( ( ',' cpt= compoundType id= identifier ) )
            // ulNoActions.g:67:19: ( ',' cpt= compoundType id= identifier )
            {
            // ulNoActions.g:67:19: ( ',' cpt= compoundType id= identifier )
            // ulNoActions.g:67:20: ',' cpt= compoundType id= identifier
            {
            match(input,22,FOLLOW_22_in_moreFormals328); if (failed) return fp;
            pushFollow(FOLLOW_compoundType_in_moreFormals334);
            cpt=compoundType();
            _fsp--;
            if (failed) return fp;
            pushFollow(FOLLOW_identifier_in_moreFormals340);
            id=identifier();
            _fsp--;
            if (failed) return fp;
            if ( backtracking==0 ) {
              fp = new FormalParameter(cpt, id);
            }

            }


            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return fp;
    }
    // $ANTLR end moreFormals


    // $ANTLR start functionBody
    // ulNoActions.g:70:1: functionBody returns [FunctionBody fb] : '{' (v= varDecl )* (s= statement )* '}' ;
    public final FunctionBody functionBody() throws RecognitionException {
        FunctionBody fb = null;

        VariableDeclaration v = null;

        Statement s = null;


        fb = new FunctionBody();
        try {
            // ulNoActions.g:72:17: ( '{' (v= varDecl )* (s= statement )* '}' )
            // ulNoActions.g:72:19: '{' (v= varDecl )* (s= statement )* '}'
            {
            match(input,23,FOLLOW_23_in_functionBody409); if (failed) return fb;
            // ulNoActions.g:72:23: (v= varDecl )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==TYPE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ulNoActions.g:72:24: v= varDecl
            	    {
            	    pushFollow(FOLLOW_varDecl_in_functionBody416);
            	    v=varDecl();
            	    _fsp--;
            	    if (failed) return fb;
            	    if ( backtracking==0 ) {
            	      fb.vdl.addVariable(v);
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ulNoActions.g:72:63: (s= statement )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=IF && LA5_0<=PRINTLN)||(LA5_0>=FLOATCONSTANT && LA5_0<=FALSE)||LA5_0==ID||LA5_0==20||LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ulNoActions.g:72:64: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_functionBody427);
            	    s=statement();
            	    _fsp--;
            	    if (failed) return fb;
            	    if ( backtracking==0 ) {
            	      fb.sl.addStatement(s);
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,24,FOLLOW_24_in_functionBody432); if (failed) return fb;

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return fb;
    }
    // $ANTLR end functionBody


    // $ANTLR start varDecl
    // ulNoActions.g:75:1: varDecl returns [VariableDeclaration vd] : (ct= compoundType id= identifier ) ';' ;
    public final VariableDeclaration varDecl() throws RecognitionException {
        VariableDeclaration vd = null;

        TypeNode ct = null;

        Identifier id = null;


        try {
            // ulNoActions.g:76:17: ( (ct= compoundType id= identifier ) ';' )
            // ulNoActions.g:76:18: (ct= compoundType id= identifier ) ';'
            {
            // ulNoActions.g:76:18: (ct= compoundType id= identifier )
            // ulNoActions.g:76:19: ct= compoundType id= identifier
            {
            pushFollow(FOLLOW_compoundType_in_varDecl483);
            ct=compoundType();
            _fsp--;
            if (failed) return vd;
            pushFollow(FOLLOW_identifier_in_varDecl489);
            id=identifier();
            _fsp--;
            if (failed) return vd;
            if ( backtracking==0 ) {
              vd = new VariableDeclaration(ct, id); 
            }

            }

            match(input,25,FOLLOW_25_in_varDecl495); if (failed) return vd;

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return vd;
    }
    // $ANTLR end varDecl


    // $ANTLR start statement
    // ulNoActions.g:79:1: statement returns [Statement s] options {backtrack=true; } : ( ';' | e= expr ';' | id= identifier exb= exprBracket '=' e1= expr ';' | IF '(' e= expr ')' b= block el= elseBlock | WHILE '(' e6= expr ')' blo= block | p= printstatement | pl= printlnstatement | r= RETURN (e5= expr )? ';' );
    public final Statement statement() throws RecognitionException {
        Statement s = null;

        Token r=null;
        Expression e = null;

        Identifier id = null;

        Expression exb = null;

        Expression e1 = null;

        Block b = null;

        Block el = null;

        Expression e6 = null;

        Block blo = null;

        PrintStatement p = null;

        PrintlnStatement pl = null;

        Expression e5 = null;


        try {
            // ulNoActions.g:81:18: ( ';' | e= expr ';' | id= identifier exb= exprBracket '=' e1= expr ';' | IF '(' e= expr ')' b= block el= elseBlock | WHILE '(' e6= expr ')' blo= block | p= printstatement | pl= printlnstatement | r= RETURN (e5= expr )? ';' )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt7=1;
                }
                break;
            case ID:
                {
                int LA7_2 = input.LA(2);

                if ( (synpred2()) ) {
                    alt7=2;
                }
                else if ( (synpred3()) ) {
                    alt7=3;
                }
                else {
                    if (backtracking>0) {failed=true; return s;}
                    NoViableAltException nvae =
                        new NoViableAltException("79:1: statement returns [Statement s] options {backtrack=true; } : ( ';' | e= expr ';' | id= identifier exb= exprBracket '=' e1= expr ';' | IF '(' e= expr ')' b= block el= elseBlock | WHILE '(' e6= expr ')' blo= block | p= printstatement | pl= printlnstatement | r= RETURN (e5= expr )? ';' );", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case FLOATCONSTANT:
            case INTEGERCONSTANT:
            case CHARCONSTANT:
            case STRINGCONSTANT:
            case TRUE:
            case FALSE:
            case 20:
                {
                alt7=2;
                }
                break;
            case IF:
                {
                alt7=4;
                }
                break;
            case WHILE:
                {
                alt7=5;
                }
                break;
            case PRINT:
                {
                alt7=6;
                }
                break;
            case PRINTLN:
                {
                alt7=7;
                }
                break;
            case RETURN:
                {
                alt7=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return s;}
                NoViableAltException nvae =
                    new NoViableAltException("79:1: statement returns [Statement s] options {backtrack=true; } : ( ';' | e= expr ';' | id= identifier exb= exprBracket '=' e1= expr ';' | IF '(' e= expr ')' b= block el= elseBlock | WHILE '(' e6= expr ')' blo= block | p= printstatement | pl= printlnstatement | r= RETURN (e5= expr )? ';' );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ulNoActions.g:81:20: ';'
                    {
                    match(input,25,FOLLOW_25_in_statement556); if (failed) return s;

                    }
                    break;
                case 2 :
                    // ulNoActions.g:82:20: e= expr ';'
                    {
                    pushFollow(FOLLOW_expr_in_statement581);
                    e=expr();
                    _fsp--;
                    if (failed) return s;
                    match(input,25,FOLLOW_25_in_statement583); if (failed) return s;
                    if ( backtracking==0 ) {
                      s = new ExpressionStatement(e);
                    }

                    }
                    break;
                case 3 :
                    // ulNoActions.g:84:20: id= identifier exb= exprBracket '=' e1= expr ';'
                    {
                    pushFollow(FOLLOW_identifier_in_statement635);
                    id=identifier();
                    _fsp--;
                    if (failed) return s;
                    pushFollow(FOLLOW_exprBracket_in_statement641);
                    exb=exprBracket();
                    _fsp--;
                    if (failed) return s;
                    match(input,26,FOLLOW_26_in_statement643); if (failed) return s;
                    pushFollow(FOLLOW_expr_in_statement648);
                    e1=expr();
                    _fsp--;
                    if (failed) return s;
                    match(input,25,FOLLOW_25_in_statement650); if (failed) return s;
                    if ( backtracking==0 ) {
                       s = new AssignmentStatement(id, exb, e1);
                    }

                    }
                    break;
                case 4 :
                    // ulNoActions.g:86:20: IF '(' e= expr ')' b= block el= elseBlock
                    {
                    match(input,IF,FOLLOW_IF_in_statement698); if (failed) return s;
                    match(input,20,FOLLOW_20_in_statement700); if (failed) return s;
                    pushFollow(FOLLOW_expr_in_statement706);
                    e=expr();
                    _fsp--;
                    if (failed) return s;
                    match(input,21,FOLLOW_21_in_statement708); if (failed) return s;
                    pushFollow(FOLLOW_block_in_statement714);
                    b=block();
                    _fsp--;
                    if (failed) return s;
                    pushFollow(FOLLOW_elseBlock_in_statement720);
                    el=elseBlock();
                    _fsp--;
                    if (failed) return s;
                    if ( backtracking==0 ) {
                       s = new IfStatement(e, b, el);
                    }

                    }
                    break;
                case 5 :
                    // ulNoActions.g:87:20: WHILE '(' e6= expr ')' blo= block
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement743); if (failed) return s;
                    match(input,20,FOLLOW_20_in_statement745); if (failed) return s;
                    pushFollow(FOLLOW_expr_in_statement751);
                    e6=expr();
                    _fsp--;
                    if (failed) return s;
                    match(input,21,FOLLOW_21_in_statement753); if (failed) return s;
                    pushFollow(FOLLOW_block_in_statement757);
                    blo=block();
                    _fsp--;
                    if (failed) return s;
                    if ( backtracking==0 ) {
                       s = new WhileStatement(e6,blo);
                    }

                    }
                    break;
                case 6 :
                    // ulNoActions.g:88:20: p= printstatement
                    {
                    pushFollow(FOLLOW_printstatement_in_statement784);
                    p=printstatement();
                    _fsp--;
                    if (failed) return s;
                    if ( backtracking==0 ) {
                      s = p;
                    }

                    }
                    break;
                case 7 :
                    // ulNoActions.g:89:20: pl= printlnstatement
                    {
                    pushFollow(FOLLOW_printlnstatement_in_statement811);
                    pl=printlnstatement();
                    _fsp--;
                    if (failed) return s;
                    if ( backtracking==0 ) {
                      s =pl;
                    }

                    }
                    break;
                case 8 :
                    // ulNoActions.g:90:20: r= RETURN (e5= expr )? ';'
                    {
                    r=(Token)input.LT(1);
                    match(input,RETURN,FOLLOW_RETURN_in_statement838); if (failed) return s;
                    // ulNoActions.g:90:31: (e5= expr )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=FLOATCONSTANT && LA6_0<=FALSE)||LA6_0==ID||LA6_0==20) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ulNoActions.g:90:32: e5= expr
                            {
                            pushFollow(FOLLOW_expr_in_statement845);
                            e5=expr();
                            _fsp--;
                            if (failed) return s;

                            }
                            break;

                    }

                    match(input,25,FOLLOW_25_in_statement849); if (failed) return s;
                    if ( backtracking==0 ) {
                      s = new ReturnStatement(e5, r.getLine(), r.getCharPositionInLine());
                    }

                    }
                    break;

            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return s;
    }
    // $ANTLR end statement


    // $ANTLR start printstatement
    // ulNoActions.g:93:1: printstatement returns [PrintStatement p] : PRINT e= expr ';' ;
    public final PrintStatement printstatement() throws RecognitionException {
        PrintStatement p = null;

        Expression e = null;


        try {
            // ulNoActions.g:94:17: ( PRINT e= expr ';' )
            // ulNoActions.g:94:19: PRINT e= expr ';'
            {
            match(input,PRINT,FOLLOW_PRINT_in_printstatement896); if (failed) return p;
            pushFollow(FOLLOW_expr_in_printstatement902);
            e=expr();
            _fsp--;
            if (failed) return p;
            match(input,25,FOLLOW_25_in_printstatement904); if (failed) return p;
            if ( backtracking==0 ) {
               p = new PrintStatement(e); 
            }

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return p;
    }
    // $ANTLR end printstatement


    // $ANTLR start printlnstatement
    // ulNoActions.g:97:1: printlnstatement returns [PrintlnStatement p] : PRINTLN e= expr ';' ;
    public final PrintlnStatement printlnstatement() throws RecognitionException {
        PrintlnStatement p = null;

        Expression e = null;


        try {
            // ulNoActions.g:98:17: ( PRINTLN e= expr ';' )
            // ulNoActions.g:98:19: PRINTLN e= expr ';'
            {
            match(input,PRINTLN,FOLLOW_PRINTLN_in_printlnstatement951); if (failed) return p;
            pushFollow(FOLLOW_expr_in_printlnstatement957);
            e=expr();
            _fsp--;
            if (failed) return p;
            match(input,25,FOLLOW_25_in_printlnstatement959); if (failed) return p;
            if ( backtracking==0 ) {
               p = new PrintlnStatement(e); 
            }

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return p;
    }
    // $ANTLR end printlnstatement


    // $ANTLR start elseBlock
    // ulNoActions.g:101:1: fragment elseBlock returns [Block b] : ( ELSE blo= block )? ;
    public final Block elseBlock() throws RecognitionException {
        Block b = null;

        Block blo = null;


         b = null; 
        try {
            // ulNoActions.g:104:17: ( ( ELSE blo= block )? )
            // ulNoActions.g:104:19: ( ELSE blo= block )?
            {
            // ulNoActions.g:104:19: ( ELSE blo= block )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ELSE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ulNoActions.g:104:20: ELSE blo= block
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_elseBlock1015); if (failed) return b;
                    pushFollow(FOLLOW_block_in_elseBlock1021);
                    blo=block();
                    _fsp--;
                    if (failed) return b;
                    if ( backtracking==0 ) {
                      b = blo ;
                    }

                    }
                    break;

            }


            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return b;
    }
    // $ANTLR end elseBlock


    // $ANTLR start block
    // ulNoActions.g:107:1: block returns [Block block] : '{' (s= statement )* '}' ;
    public final Block block() throws RecognitionException {
        Block block = null;

        Statement s = null;


        block = new Block();
        try {
            // ulNoActions.g:109:17: ( '{' (s= statement )* '}' )
            // ulNoActions.g:109:19: '{' (s= statement )* '}'
            {
            match(input,23,FOLLOW_23_in_block1075); if (failed) return block;
            // ulNoActions.g:109:23: (s= statement )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=IF && LA9_0<=PRINTLN)||(LA9_0>=FLOATCONSTANT && LA9_0<=FALSE)||LA9_0==ID||LA9_0==20||LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ulNoActions.g:109:24: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block1082);
            	    s=statement();
            	    _fsp--;
            	    if (failed) return block;
            	    if ( backtracking==0 ) {
            	      block.sl.addStatement(s);
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,24,FOLLOW_24_in_block1088); if (failed) return block;

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return block;
    }
    // $ANTLR end block


    // $ANTLR start expr
    // ulNoActions.g:112:1: expr returns [Expression e] : e1= exprEquiv ( '==' e2= exprEquiv )* ;
    public final Expression expr() throws RecognitionException {
        Expression e = null;

        Expression e1 = null;

        Expression e2 = null;


         Expression it = null; 
        try {
            // ulNoActions.g:115:17: (e1= exprEquiv ( '==' e2= exprEquiv )* )
            // ulNoActions.g:115:19: e1= exprEquiv ( '==' e2= exprEquiv )*
            {
            pushFollow(FOLLOW_exprEquiv_in_expr1166);
            e1=exprEquiv();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
               it = e1; 
            }
            // ulNoActions.g:116:17: ( '==' e2= exprEquiv )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ulNoActions.g:117:25: '==' e2= exprEquiv
            	    {
            	    match(input,27,FOLLOW_27_in_expr1213); if (failed) return e;
            	    pushFollow(FOLLOW_exprEquiv_in_expr1219);
            	    e2=exprEquiv();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	      it = new EqualityExpression(it, e2);
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            if ( backtracking==0 ) {
               e = it; 
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return e;
    }
    // $ANTLR end expr


    // $ANTLR start exprEquiv
    // ulNoActions.g:121:1: fragment exprEquiv returns [Expression e] : e1= exprLess ( '<' e2= exprLess )* ;
    public final Expression exprEquiv() throws RecognitionException {
        Expression e = null;

        Expression e1 = null;

        Expression e2 = null;


         Expression it = null; 
        try {
            // ulNoActions.g:125:17: (e1= exprLess ( '<' e2= exprLess )* )
            // ulNoActions.g:125:19: e1= exprLess ( '<' e2= exprLess )*
            {
            pushFollow(FOLLOW_exprLess_in_exprEquiv1308);
            e1=exprLess();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
               it = e1;
            }
            // ulNoActions.g:126:17: ( '<' e2= exprLess )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ulNoActions.g:127:25: '<' e2= exprLess
            	    {
            	    match(input,28,FOLLOW_28_in_exprEquiv1355); if (failed) return e;
            	    pushFollow(FOLLOW_exprLess_in_exprEquiv1361);
            	    e2=exprLess();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	      it = new LessThanExpression(it, e2);
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            if ( backtracking==0 ) {
               e = it; 
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return e;
    }
    // $ANTLR end exprEquiv


    // $ANTLR start exprLess
    // ulNoActions.g:131:1: fragment exprLess returns [Expression e] : e1= exprAddSub ( '+' e2= exprAddSub | '-' e2= exprAddSub )* ;
    public final Expression exprLess() throws RecognitionException {
        Expression e = null;

        Expression e1 = null;

        Expression e2 = null;


         Expression it = null; 
        try {
            // ulNoActions.g:136:17: (e1= exprAddSub ( '+' e2= exprAddSub | '-' e2= exprAddSub )* )
            // ulNoActions.g:136:19: e1= exprAddSub ( '+' e2= exprAddSub | '-' e2= exprAddSub )*
            {
            pushFollow(FOLLOW_exprAddSub_in_exprLess1445);
            e1=exprAddSub();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
              it = e1 ;
            }
            // ulNoActions.g:137:17: ( '+' e2= exprAddSub | '-' e2= exprAddSub )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }
                else if ( (LA12_0==30) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // ulNoActions.g:138:25: '+' e2= exprAddSub
            	    {
            	    match(input,29,FOLLOW_29_in_exprLess1491); if (failed) return e;
            	    pushFollow(FOLLOW_exprAddSub_in_exprLess1497);
            	    e2=exprAddSub();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	      it = new AddExpression(it, e2);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ulNoActions.g:140:25: '-' e2= exprAddSub
            	    {
            	    match(input,30,FOLLOW_30_in_exprLess1551); if (failed) return e;
            	    pushFollow(FOLLOW_exprAddSub_in_exprLess1557);
            	    e2=exprAddSub();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	      it = new SubtractExpression(it, e2);
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            if ( backtracking==0 ) {
               e = it; 
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return e;
    }
    // $ANTLR end exprLess


    // $ANTLR start exprAddSub
    // ulNoActions.g:143:1: fragment exprAddSub returns [Expression e] : e1= exprAtom ( '*' e2= exprAtom )* ;
    public final Expression exprAddSub() throws RecognitionException {
        Expression e = null;

        Expression e1 = null;

        Expression e2 = null;


         Expression it = null; 
        try {
            // ulNoActions.g:147:17: (e1= exprAtom ( '*' e2= exprAtom )* )
            // ulNoActions.g:147:19: e1= exprAtom ( '*' e2= exprAtom )*
            {
            pushFollow(FOLLOW_exprAtom_in_exprAddSub1638);
            e1=exprAtom();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
               it = e1; 
            }
            // ulNoActions.g:148:17: ( '*' e2= exprAtom )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ulNoActions.g:149:25: '*' e2= exprAtom
            	    {
            	    match(input,31,FOLLOW_31_in_exprAddSub1684); if (failed) return e;
            	    pushFollow(FOLLOW_exprAtom_in_exprAddSub1690);
            	    e2=exprAtom();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	      it = new MultExpression(it, e2);
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            if ( backtracking==0 ) {
               e = it; 
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return e;
    }
    // $ANTLR end exprAddSub


    // $ANTLR start exprAtom
    // ulNoActions.g:153:1: fragment exprAtom returns [Expression e] : (id= identifier exb= exprBracket | id= identifier '(' el= exprList ')' | lit= literal | ( '(' e1= expr ')' ) );
    public final Expression exprAtom() throws RecognitionException {
        Expression e = null;

        Identifier id = null;

        Expression exb = null;

        ExpressionList el = null;

        Expression lit = null;

        Expression e1 = null;


        try {
            // ulNoActions.g:155:18: (id= identifier exb= exprBracket | id= identifier '(' el= exprList ')' | lit= literal | ( '(' e1= expr ')' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==20) ) {
                    alt14=2;
                }
                else if ( ((LA14_1>=21 && LA14_1<=22)||LA14_1==25||(LA14_1>=27 && LA14_1<=33)) ) {
                    alt14=1;
                }
                else {
                    if (backtracking>0) {failed=true; return e;}
                    NoViableAltException nvae =
                        new NoViableAltException("153:1: fragment exprAtom returns [Expression e] : (id= identifier exb= exprBracket | id= identifier '(' el= exprList ')' | lit= literal | ( '(' e1= expr ')' ) );", 14, 1, input);

                    throw nvae;
                }
                }
                break;
            case FLOATCONSTANT:
            case INTEGERCONSTANT:
            case CHARCONSTANT:
            case STRINGCONSTANT:
            case TRUE:
            case FALSE:
                {
                alt14=3;
                }
                break;
            case 20:
                {
                alt14=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("153:1: fragment exprAtom returns [Expression e] : (id= identifier exb= exprBracket | id= identifier '(' el= exprList ')' | lit= literal | ( '(' e1= expr ')' ) );", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ulNoActions.g:155:20: id= identifier exb= exprBracket
                    {
                    pushFollow(FOLLOW_identifier_in_exprAtom1764);
                    id=identifier();
                    _fsp--;
                    if (failed) return e;
                    pushFollow(FOLLOW_exprBracket_in_exprAtom1770);
                    exb=exprBracket();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e = new Declaration(id, exb);
                    }

                    }
                    break;
                case 2 :
                    // ulNoActions.g:156:20: id= identifier '(' el= exprList ')'
                    {
                    pushFollow(FOLLOW_identifier_in_exprAtom1797);
                    id=identifier();
                    _fsp--;
                    if (failed) return e;
                    match(input,20,FOLLOW_20_in_exprAtom1799); if (failed) return e;
                    pushFollow(FOLLOW_exprList_in_exprAtom1805);
                    el=exprList();
                    _fsp--;
                    if (failed) return e;
                    match(input,21,FOLLOW_21_in_exprAtom1807); if (failed) return e;
                    if ( backtracking==0 ) {
                      e = new FunctionCall(id, el);
                    }

                    }
                    break;
                case 3 :
                    // ulNoActions.g:157:20: lit= literal
                    {
                    pushFollow(FOLLOW_literal_in_exprAtom1834);
                    lit=literal();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e = lit;
                    }

                    }
                    break;
                case 4 :
                    // ulNoActions.g:158:20: ( '(' e1= expr ')' )
                    {
                    // ulNoActions.g:158:20: ( '(' e1= expr ')' )
                    // ulNoActions.g:158:21: '(' e1= expr ')'
                    {
                    match(input,20,FOLLOW_20_in_exprAtom1858); if (failed) return e;
                    pushFollow(FOLLOW_expr_in_exprAtom1864);
                    e1=expr();
                    _fsp--;
                    if (failed) return e;
                    match(input,21,FOLLOW_21_in_exprAtom1866); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = new ParenExpression(e1);
                    }

                    }


                    }
                    break;

            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return e;
    }
    // $ANTLR end exprAtom


    // $ANTLR start exprBracket
    // ulNoActions.g:161:1: exprBracket returns [Expression e] : ( '[' e1= expr ']' )? ;
    public final Expression exprBracket() throws RecognitionException {
        Expression e = null;

        Expression e1 = null;


        Expression it = null; 
        try {
            // ulNoActions.g:164:18: ( ( '[' e1= expr ']' )? )
            // ulNoActions.g:164:20: ( '[' e1= expr ']' )?
            {
            // ulNoActions.g:164:20: ( '[' e1= expr ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ulNoActions.g:164:21: '[' e1= expr ']'
                    {
                    match(input,32,FOLLOW_32_in_exprBracket1929); if (failed) return e;
                    pushFollow(FOLLOW_expr_in_exprBracket1935);
                    e1=expr();
                    _fsp--;
                    if (failed) return e;
                    match(input,33,FOLLOW_33_in_exprBracket1937); if (failed) return e;
                    if ( backtracking==0 ) {
                      it = e1;
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
              e = it; 
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return e;
    }
    // $ANTLR end exprBracket


    // $ANTLR start exprList
    // ulNoActions.g:168:1: exprList returns [ExpressionList el] : (e1= expr (e2= exprMore )* )? ;
    public final ExpressionList exprList() throws RecognitionException {
        ExpressionList el = null;

        Expression e1 = null;

        Expression e2 = null;


         el = new ExpressionList(); 
        try {
            // ulNoActions.g:170:18: ( (e1= expr (e2= exprMore )* )? )
            // ulNoActions.g:170:20: (e1= expr (e2= exprMore )* )?
            {
            // ulNoActions.g:170:20: (e1= expr (e2= exprMore )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=FLOATCONSTANT && LA17_0<=FALSE)||LA17_0==ID||LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ulNoActions.g:170:22: e1= expr (e2= exprMore )*
                    {
                    pushFollow(FOLLOW_expr_in_exprList2000);
                    e1=expr();
                    _fsp--;
                    if (failed) return el;
                    if ( backtracking==0 ) {
                       el.addExpression(e1);
                    }
                    // ulNoActions.g:171:20: (e2= exprMore )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==22) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ulNoActions.g:171:21: e2= exprMore
                    	    {
                    	    pushFollow(FOLLOW_exprMore_in_exprList2028);
                    	    e2=exprMore();
                    	    _fsp--;
                    	    if (failed) return el;
                    	    if ( backtracking==0 ) {
                    	       el.addExpression(e2); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return el;
    }
    // $ANTLR end exprList


    // $ANTLR start exprMore
    // ulNoActions.g:174:1: exprMore returns [Expression exp] : ',' e= expr ;
    public final Expression exprMore() throws RecognitionException {
        Expression exp = null;

        Expression e = null;


        try {
            // ulNoActions.g:175:18: ( ',' e= expr )
            // ulNoActions.g:175:20: ',' e= expr
            {
            match(input,22,FOLLOW_22_in_exprMore2083); if (failed) return exp;
            pushFollow(FOLLOW_expr_in_exprMore2089);
            e=expr();
            _fsp--;
            if (failed) return exp;
            if ( backtracking==0 ) {
              exp = e;
            }

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return exp;
    }
    // $ANTLR end exprMore


    // $ANTLR start compoundType
    // ulNoActions.g:178:1: compoundType returns [TypeNode t] : (ty= type | at= type '[' i= integerconstant ']' );
    public final TypeNode compoundType() throws RecognitionException {
        TypeNode t = null;

        TypeNode ty = null;

        TypeNode at = null;

        IntegerLiteral i = null;


        try {
            // ulNoActions.g:179:18: (ty= type | at= type '[' i= integerconstant ']' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==TYPE) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==ID) ) {
                    alt18=1;
                }
                else if ( (LA18_1==32) ) {
                    alt18=2;
                }
                else {
                    if (backtracking>0) {failed=true; return t;}
                    NoViableAltException nvae =
                        new NoViableAltException("178:1: compoundType returns [TypeNode t] : (ty= type | at= type '[' i= integerconstant ']' );", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("178:1: compoundType returns [TypeNode t] : (ty= type | at= type '[' i= integerconstant ']' );", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ulNoActions.g:179:20: ty= type
                    {
                    pushFollow(FOLLOW_type_in_compoundType2142);
                    ty=type();
                    _fsp--;
                    if (failed) return t;
                    if ( backtracking==0 ) {
                      t = ty;
                    }

                    }
                    break;
                case 2 :
                    // ulNoActions.g:180:20: at= type '[' i= integerconstant ']'
                    {
                    pushFollow(FOLLOW_type_in_compoundType2169);
                    at=type();
                    _fsp--;
                    if (failed) return t;
                    match(input,32,FOLLOW_32_in_compoundType2171); if (failed) return t;
                    pushFollow(FOLLOW_integerconstant_in_compoundType2177);
                    i=integerconstant();
                    _fsp--;
                    if (failed) return t;
                    match(input,33,FOLLOW_33_in_compoundType2179); if (failed) return t;
                    if ( backtracking==0 ) {
                      t = new TypeNode(new ArrayType(at.t, i), i.l, i.o);
                    }

                    }
                    break;

            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return t;
    }
    // $ANTLR end compoundType


    // $ANTLR start floatconstant
    // ulNoActions.g:183:1: floatconstant returns [FloatLiteral f] : fl= FLOATCONSTANT ;
    public final FloatLiteral floatconstant() throws RecognitionException {
        FloatLiteral f = null;

        Token fl=null;

        try {
            // ulNoActions.g:184:17: (fl= FLOATCONSTANT )
            // ulNoActions.g:184:19: fl= FLOATCONSTANT
            {
            fl=(Token)input.LT(1);
            match(input,FLOATCONSTANT,FOLLOW_FLOATCONSTANT_in_floatconstant2231); if (failed) return f;
            if ( backtracking==0 ) {
              f = new FloatLiteral(Float.parseFloat(fl.getText()), fl.getLine(), fl.getCharPositionInLine());
            }

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return f;
    }
    // $ANTLR end floatconstant


    // $ANTLR start integerconstant
    // ulNoActions.g:189:1: integerconstant returns [IntegerLiteral l] : i= INTEGERCONSTANT ;
    public final IntegerLiteral integerconstant() throws RecognitionException {
        IntegerLiteral l = null;

        Token i=null;

        try {
            // ulNoActions.g:190:17: (i= INTEGERCONSTANT )
            // ulNoActions.g:190:19: i= INTEGERCONSTANT
            {
            i=(Token)input.LT(1);
            match(input,INTEGERCONSTANT,FOLLOW_INTEGERCONSTANT_in_integerconstant2300); if (failed) return l;
            if ( backtracking==0 ) {
              l = new IntegerLiteral(Integer.parseInt(i.getText()), i.getLine(), i.getCharPositionInLine());
            }

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return l;
    }
    // $ANTLR end integerconstant


    // $ANTLR start charconstant
    // ulNoActions.g:194:1: charconstant returns [CharacterLiteral c] : ch= CHARCONSTANT ;
    public final CharacterLiteral charconstant() throws RecognitionException {
        CharacterLiteral c = null;

        Token ch=null;

        try {
            // ulNoActions.g:195:17: (ch= CHARCONSTANT )
            // ulNoActions.g:195:19: ch= CHARCONSTANT
            {
            ch=(Token)input.LT(1);
            match(input,CHARCONSTANT,FOLLOW_CHARCONSTANT_in_charconstant2368); if (failed) return c;
            if ( backtracking==0 ) {
              c = new CharacterLiteral(ch.getText().charAt(1), ch.getLine(), ch.getCharPositionInLine());
            }

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return c;
    }
    // $ANTLR end charconstant


    // $ANTLR start stringconstant
    // ulNoActions.g:199:1: stringconstant returns [StringLiteral s] : st= STRINGCONSTANT ;
    public final StringLiteral stringconstant() throws RecognitionException {
        StringLiteral s = null;

        Token st=null;

        try {
            // ulNoActions.g:200:17: (st= STRINGCONSTANT )
            // ulNoActions.g:200:19: st= STRINGCONSTANT
            {
            st=(Token)input.LT(1);
            match(input,STRINGCONSTANT,FOLLOW_STRINGCONSTANT_in_stringconstant2436); if (failed) return s;
            if ( backtracking==0 ) {
              s = new StringLiteral(st.getText(), st.getLine(), st.getCharPositionInLine());
            }

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return s;
    }
    // $ANTLR end stringconstant


    // $ANTLR start trueconstant
    // ulNoActions.g:204:1: trueconstant returns [BooleanLiteral b] : t= TRUE ;
    public final BooleanLiteral trueconstant() throws RecognitionException {
        BooleanLiteral b = null;

        Token t=null;

        try {
            // ulNoActions.g:205:17: (t= TRUE )
            // ulNoActions.g:205:19: t= TRUE
            {
            t=(Token)input.LT(1);
            match(input,TRUE,FOLLOW_TRUE_in_trueconstant2504); if (failed) return b;
            if ( backtracking==0 ) {
              b = new BooleanLiteral(t.getText(), t.getLine(), t.getCharPositionInLine());
            }

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return b;
    }
    // $ANTLR end trueconstant


    // $ANTLR start falseconstant
    // ulNoActions.g:209:1: falseconstant returns [BooleanLiteral b] : f= FALSE ;
    public final BooleanLiteral falseconstant() throws RecognitionException {
        BooleanLiteral b = null;

        Token f=null;

        try {
            // ulNoActions.g:210:17: (f= FALSE )
            // ulNoActions.g:210:19: f= FALSE
            {
            f=(Token)input.LT(1);
            match(input,FALSE,FOLLOW_FALSE_in_falseconstant2572); if (failed) return b;
            if ( backtracking==0 ) {
              b = new BooleanLiteral(f.getText(), f.getLine(), f.getCharPositionInLine());
            }

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return b;
    }
    // $ANTLR end falseconstant


    // $ANTLR start type
    // ulNoActions.g:215:1: type returns [TypeNode ty] : t= TYPE ;
    public final TypeNode type() throws RecognitionException {
        TypeNode ty = null;

        Token t=null;

        try {
            // ulNoActions.g:215:27: (t= TYPE )
            // ulNoActions.g:216:1: t= TYPE
            {
            t=(Token)input.LT(1);
            match(input,TYPE,FOLLOW_TYPE_in_type2622); if (failed) return ty;
            if ( backtracking==0 ) {

                      if(t.getText().equals("void"))
                      {
                              ty = new TypeNode(new VoidType(), t.getLine(), t.getCharPositionInLine());
                      }
                      else if(t.getText().equals("int"))
                      {
                              ty = new TypeNode(new IntegerType(), t.getLine(), t.getCharPositionInLine());
                      }
                      else if(t.getText().equals("float"))
                      {
                              ty = new TypeNode(new FloatType(), t.getLine(), t.getCharPositionInLine());
                      }
                      else if(t.getText().equals("char"))
                      {
                              ty = new TypeNode(new CharType(), t.getLine(), t.getCharPositionInLine());
                      }
                      else if(t.getText().equals("string"))
                      {
                              ty = new TypeNode(new StringType(), t.getLine(), t.getCharPositionInLine());
                      }
                      else if(t.getText().equals("boolean"))
                      {
                              ty = new TypeNode(new BooleanType(), t.getLine(), t.getCharPositionInLine());
                      }

            }

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ty;
    }
    // $ANTLR end type


    // $ANTLR start literal
    // ulNoActions.g:246:1: literal returns [Expression e] : (f= floatconstant | i= integerconstant | s= stringconstant | c= charconstant | t= trueconstant | fl= falseconstant );
    public final Expression literal() throws RecognitionException {
        Expression e = null;

        FloatLiteral f = null;

        IntegerLiteral i = null;

        StringLiteral s = null;

        CharacterLiteral c = null;

        BooleanLiteral t = null;

        BooleanLiteral fl = null;


        try {
            // ulNoActions.g:247:18: (f= floatconstant | i= integerconstant | s= stringconstant | c= charconstant | t= trueconstant | fl= falseconstant )
            int alt19=6;
            switch ( input.LA(1) ) {
            case FLOATCONSTANT:
                {
                alt19=1;
                }
                break;
            case INTEGERCONSTANT:
                {
                alt19=2;
                }
                break;
            case STRINGCONSTANT:
                {
                alt19=3;
                }
                break;
            case CHARCONSTANT:
                {
                alt19=4;
                }
                break;
            case TRUE:
                {
                alt19=5;
                }
                break;
            case FALSE:
                {
                alt19=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("246:1: literal returns [Expression e] : (f= floatconstant | i= integerconstant | s= stringconstant | c= charconstant | t= trueconstant | fl= falseconstant );", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ulNoActions.g:247:20: f= floatconstant
                    {
                    pushFollow(FOLLOW_floatconstant_in_literal2659);
                    f=floatconstant();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e = f;
                    }

                    }
                    break;
                case 2 :
                    // ulNoActions.g:248:20: i= integerconstant
                    {
                    pushFollow(FOLLOW_integerconstant_in_literal2685);
                    i=integerconstant();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e = i;
                    }

                    }
                    break;
                case 3 :
                    // ulNoActions.g:249:20: s= stringconstant
                    {
                    pushFollow(FOLLOW_stringconstant_in_literal2712);
                    s=stringconstant();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e = s;
                    }

                    }
                    break;
                case 4 :
                    // ulNoActions.g:250:20: c= charconstant
                    {
                    pushFollow(FOLLOW_charconstant_in_literal2739);
                    c=charconstant();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e = c;
                    }

                    }
                    break;
                case 5 :
                    // ulNoActions.g:251:20: t= trueconstant
                    {
                    pushFollow(FOLLOW_trueconstant_in_literal2766);
                    t=trueconstant();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e = t;
                    }

                    }
                    break;
                case 6 :
                    // ulNoActions.g:252:20: fl= falseconstant
                    {
                    pushFollow(FOLLOW_falseconstant_in_literal2793);
                    fl=falseconstant();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e = fl;
                    }

                    }
                    break;

            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return e;
    }
    // $ANTLR end literal


    // $ANTLR start identifier
    // ulNoActions.g:255:1: identifier returns [Identifier i] : a= ID ;
    public final Identifier identifier() throws RecognitionException {
        Identifier i = null;

        Token a=null;

        try {
            // ulNoActions.g:256:18: (a= ID )
            // ulNoActions.g:256:20: a= ID
            {
            a=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_identifier2846); if (failed) return i;
            if ( backtracking==0 ) {
              i = new Identifier(a.getText(), a.getLine(), a.getCharPositionInLine());
            }

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return i;
    }
    // $ANTLR end identifier

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // ulNoActions.g:82:20: ( expr ';' )
        // ulNoActions.g:82:20: expr ';'
        {
        pushFollow(FOLLOW_expr_in_synpred2581);
        expr();
        _fsp--;
        if (failed) return ;
        match(input,25,FOLLOW_25_in_synpred2583); if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // ulNoActions.g:84:20: ( identifier exprBracket '=' expr ';' )
        // ulNoActions.g:84:20: identifier exprBracket '=' expr ';'
        {
        pushFollow(FOLLOW_identifier_in_synpred3635);
        identifier();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_exprBracket_in_synpred3641);
        exprBracket();
        _fsp--;
        if (failed) return ;
        match(input,26,FOLLOW_26_in_synpred3643); if (failed) return ;
        pushFollow(FOLLOW_expr_in_synpred3648);
        expr();
        _fsp--;
        if (failed) return ;
        match(input,25,FOLLOW_25_in_synpred3650); if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    public final boolean synpred2() {
        backtracking++;
        int start = input.mark();
        try {
            synpred2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred3() {
        backtracking++;
        int start = input.mark();
        try {
            synpred3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_function_in_program52 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_EOF_in_program58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDecl_in_function100 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_functionBody_in_function106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundType_in_functionDecl157 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_functionDecl163 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_functionDecl165 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_formalParameters_in_functionDecl171 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_functionDecl173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundType_in_formalParameters242 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_formalParameters248 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_moreFormals_in_formalParameters275 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_moreFormals328 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_compoundType_in_moreFormals334 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_moreFormals340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_functionBody409 = new BitSet(new long[]{0x000000000313FDF0L});
    public static final BitSet FOLLOW_varDecl_in_functionBody416 = new BitSet(new long[]{0x000000000313FDF0L});
    public static final BitSet FOLLOW_statement_in_functionBody427 = new BitSet(new long[]{0x000000000312FDF0L});
    public static final BitSet FOLLOW_24_in_functionBody432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundType_in_varDecl483 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_varDecl489 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_varDecl495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_statement556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement581 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_statement583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_statement635 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_exprBracket_in_statement641 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_statement643 = new BitSet(new long[]{0x000000000012FC00L});
    public static final BitSet FOLLOW_expr_in_statement648 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_statement650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement698 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_statement700 = new BitSet(new long[]{0x000000000012FC00L});
    public static final BitSet FOLLOW_expr_in_statement706 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_statement708 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_block_in_statement714 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_elseBlock_in_statement720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement743 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_statement745 = new BitSet(new long[]{0x000000000012FC00L});
    public static final BitSet FOLLOW_expr_in_statement751 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_statement753 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_block_in_statement757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printstatement_in_statement784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printlnstatement_in_statement811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement838 = new BitSet(new long[]{0x000000000212FC00L});
    public static final BitSet FOLLOW_expr_in_statement845 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_statement849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_printstatement896 = new BitSet(new long[]{0x000000000012FC00L});
    public static final BitSet FOLLOW_expr_in_printstatement902 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_printstatement904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINTLN_in_printlnstatement951 = new BitSet(new long[]{0x000000000012FC00L});
    public static final BitSet FOLLOW_expr_in_printlnstatement957 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_printlnstatement959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseBlock1015 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_block_in_elseBlock1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_block1075 = new BitSet(new long[]{0x000000000312FDF0L});
    public static final BitSet FOLLOW_statement_in_block1082 = new BitSet(new long[]{0x000000000312FDF0L});
    public static final BitSet FOLLOW_24_in_block1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprEquiv_in_expr1166 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_expr1213 = new BitSet(new long[]{0x000000000012FC00L});
    public static final BitSet FOLLOW_exprEquiv_in_expr1219 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_exprLess_in_exprEquiv1308 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_exprEquiv1355 = new BitSet(new long[]{0x000000000012FC00L});
    public static final BitSet FOLLOW_exprLess_in_exprEquiv1361 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_exprAddSub_in_exprLess1445 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_29_in_exprLess1491 = new BitSet(new long[]{0x000000000012FC00L});
    public static final BitSet FOLLOW_exprAddSub_in_exprLess1497 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_30_in_exprLess1551 = new BitSet(new long[]{0x000000000012FC00L});
    public static final BitSet FOLLOW_exprAddSub_in_exprLess1557 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_exprAtom_in_exprAddSub1638 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_exprAddSub1684 = new BitSet(new long[]{0x000000000012FC00L});
    public static final BitSet FOLLOW_exprAtom_in_exprAddSub1690 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_identifier_in_exprAtom1764 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_exprBracket_in_exprAtom1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_exprAtom1797 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_exprAtom1799 = new BitSet(new long[]{0x000000000032FC00L});
    public static final BitSet FOLLOW_exprList_in_exprAtom1805 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_exprAtom1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_exprAtom1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_exprAtom1858 = new BitSet(new long[]{0x000000000012FC00L});
    public static final BitSet FOLLOW_expr_in_exprAtom1864 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_exprAtom1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_exprBracket1929 = new BitSet(new long[]{0x000000000012FC00L});
    public static final BitSet FOLLOW_expr_in_exprBracket1935 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_exprBracket1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2000 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_exprMore_in_exprList2028 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_exprMore2083 = new BitSet(new long[]{0x000000000012FC00L});
    public static final BitSet FOLLOW_expr_in_exprMore2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_compoundType2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_compoundType2169 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_compoundType2171 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_integerconstant_in_compoundType2177 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_compoundType2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATCONSTANT_in_floatconstant2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGERCONSTANT_in_integerconstant2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARCONSTANT_in_charconstant2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGCONSTANT_in_stringconstant2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_trueconstant2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_falseconstant2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatconstant_in_literal2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerconstant_in_literal2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringconstant_in_literal2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_charconstant_in_literal2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trueconstant_in_literal2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_falseconstant_in_literal2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred2581 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_synpred2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_synpred3635 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_exprBracket_in_synpred3641 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_synpred3643 = new BitSet(new long[]{0x000000000012FC00L});
    public static final BitSet FOLLOW_expr_in_synpred3648 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_synpred3650 = new BitSet(new long[]{0x0000000000000002L});

}