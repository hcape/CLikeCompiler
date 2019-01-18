lexer grammar ulNoActions;

T20 : '(' ;
T21 : ')' ;
T22 : ',' ;
T23 : '{' ;
T24 : '}' ;
T25 : ';' ;
T26 : '=' ;
T27 : '==' ;
T28 : '<' ;
T29 : '+' ;
T30 : '-' ;
T31 : '*' ;
T32 : '[' ;
T33 : ']' ;

// $ANTLR src "ulNoActions.g" 261
IF	        : 'if'
	        ;

// $ANTLR src "ulNoActions.g" 264
ELSE            : 'else'
                ;

// $ANTLR src "ulNoActions.g" 267
WHILE           : 'while'
                ;

// $ANTLR src "ulNoActions.g" 270
PRINT           : 'print'
                ;
// $ANTLR src "ulNoActions.g" 272
PRINTLN         : 'println'
                ;

// $ANTLR src "ulNoActions.g" 275
RETURN          : 'return'
                ;

// $ANTLR src "ulNoActions.g" 278
TYPE            : 'int' | 'float' | 'char' | 'string' | 'boolean' | 'void'
                ;

// $ANTLR src "ulNoActions.g" 281
TRUE            : 'true'
                ;

// $ANTLR src "ulNoActions.g" 284
FALSE           : 'false'
                ;

// $ANTLR src "ulNoActions.g" 287
FLOATCONSTANT   : ('0'..'9')+ '.' ('0'..'9')+
                ; 

// $ANTLR src "ulNoActions.g" 290
STRINGCONSTANT  : '"' ('a'..'z' | 'A'..'Z' | '_' | ' ' | '0'..'9' )* '"' 
                ; 

// $ANTLR src "ulNoActions.g" 293
CHARCONSTANT    : '\'' ('a'..'z' | 'A'..'Z' | '_' | ' ' | '0'..'9' ) '\''
                ; 

// $ANTLR src "ulNoActions.g" 296
INTEGERCONSTANT : ('0'..'9')+
                ; 

// $ANTLR src "ulNoActions.g" 299
ID	        : ('a'..'z' | 'A'..'Z' | '_' )('a'..'z' | 'A'..'Z' | '_' | '0'..'9' )* 
	        ;

/* These two lines match whitespace and comments 
 * and ignore them.
 * You want to leave these as last in the file.  
 * Add new lexical rules above 
 */
// $ANTLR src "ulNoActions.g" 307
WS      : ( '\t' | ' ' | ('\r' | '\n') )+ { $channel = HIDDEN; skip();}
        ;

// $ANTLR src "ulNoActions.g" 310
COMMENT : '//' ~('\r' | '\n')* ('\r' | '\n') { $channel = HIDDEN;}
        ;