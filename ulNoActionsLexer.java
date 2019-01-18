// $ANTLR 3.0.1 ulNoActions.g 2018-04-07 12:15:18

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ulNoActionsLexer extends Lexer {
    public static final int PRINT=7;
    public static final int PRINTLN=8;
    public static final int COMMENT=19;
    public static final int RETURN=6;
    public static final int T21=21;
    public static final int T20=20;
    public static final int T23=23;
    public static final int CHARCONSTANT=12;
    public static final int T22=22;
    public static final int T25=25;
    public static final int T24=24;
    public static final int STRINGCONSTANT=13;
    public static final int T27=27;
    public static final int ELSE=9;
    public static final int T26=26;
    public static final int T29=29;
    public static final int ID=17;
    public static final int T28=28;
    public static final int WS=18;
    public static final int EOF=-1;
    public static final int IF=4;
    public static final int TYPE=16;
    public static final int Tokens=34;
    public static final int TRUE=14;
    public static final int FLOATCONSTANT=10;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int INTEGERCONSTANT=11;
    public static final int T33=33;
    public static final int WHILE=5;
    public static final int FALSE=15;
    public ulNoActionsLexer() {;} 
    public ulNoActionsLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "ulNoActions.g"; }

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ulNoActions.g:3:5: ( '(' )
            // ulNoActions.g:3:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ulNoActions.g:4:5: ( ')' )
            // ulNoActions.g:4:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ulNoActions.g:5:5: ( ',' )
            // ulNoActions.g:5:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ulNoActions.g:6:5: ( '{' )
            // ulNoActions.g:6:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ulNoActions.g:7:5: ( '}' )
            // ulNoActions.g:7:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ulNoActions.g:8:5: ( ';' )
            // ulNoActions.g:8:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ulNoActions.g:9:5: ( '=' )
            // ulNoActions.g:9:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ulNoActions.g:10:5: ( '==' )
            // ulNoActions.g:10:7: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ulNoActions.g:11:5: ( '<' )
            // ulNoActions.g:11:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ulNoActions.g:12:5: ( '+' )
            // ulNoActions.g:12:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ulNoActions.g:13:5: ( '-' )
            // ulNoActions.g:13:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ulNoActions.g:14:5: ( '*' )
            // ulNoActions.g:14:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ulNoActions.g:15:5: ( '[' )
            // ulNoActions.g:15:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ulNoActions.g:16:5: ( ']' )
            // ulNoActions.g:16:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start IF
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            // ulNoActions.g:261:12: ( 'if' )
            // ulNoActions.g:261:14: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IF

    // $ANTLR start ELSE
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            // ulNoActions.g:264:17: ( 'else' )
            // ulNoActions.g:264:19: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ELSE

    // $ANTLR start WHILE
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            // ulNoActions.g:267:17: ( 'while' )
            // ulNoActions.g:267:19: 'while'
            {
            match("while"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WHILE

    // $ANTLR start PRINT
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            // ulNoActions.g:270:17: ( 'print' )
            // ulNoActions.g:270:19: 'print'
            {
            match("print"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PRINT

    // $ANTLR start PRINTLN
    public final void mPRINTLN() throws RecognitionException {
        try {
            int _type = PRINTLN;
            // ulNoActions.g:272:17: ( 'println' )
            // ulNoActions.g:272:19: 'println'
            {
            match("println"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PRINTLN

    // $ANTLR start RETURN
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            // ulNoActions.g:275:17: ( 'return' )
            // ulNoActions.g:275:19: 'return'
            {
            match("return"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RETURN

    // $ANTLR start TYPE
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            // ulNoActions.g:278:17: ( 'int' | 'float' | 'char' | 'string' | 'boolean' | 'void' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt1=1;
                }
                break;
            case 'f':
                {
                alt1=2;
                }
                break;
            case 'c':
                {
                alt1=3;
                }
                break;
            case 's':
                {
                alt1=4;
                }
                break;
            case 'b':
                {
                alt1=5;
                }
                break;
            case 'v':
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("278:1: TYPE : ( 'int' | 'float' | 'char' | 'string' | 'boolean' | 'void' );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ulNoActions.g:278:19: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // ulNoActions.g:278:27: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 3 :
                    // ulNoActions.g:278:37: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 4 :
                    // ulNoActions.g:278:46: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 5 :
                    // ulNoActions.g:278:57: 'boolean'
                    {
                    match("boolean"); 


                    }
                    break;
                case 6 :
                    // ulNoActions.g:278:69: 'void'
                    {
                    match("void"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TYPE

    // $ANTLR start TRUE
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            // ulNoActions.g:281:17: ( 'true' )
            // ulNoActions.g:281:19: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TRUE

    // $ANTLR start FALSE
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            // ulNoActions.g:284:17: ( 'false' )
            // ulNoActions.g:284:19: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FALSE

    // $ANTLR start FLOATCONSTANT
    public final void mFLOATCONSTANT() throws RecognitionException {
        try {
            int _type = FLOATCONSTANT;
            // ulNoActions.g:287:17: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // ulNoActions.g:287:19: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // ulNoActions.g:287:19: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ulNoActions.g:287:20: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match('.'); 
            // ulNoActions.g:287:35: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ulNoActions.g:287:36: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FLOATCONSTANT

    // $ANTLR start STRINGCONSTANT
    public final void mSTRINGCONSTANT() throws RecognitionException {
        try {
            int _type = STRINGCONSTANT;
            // ulNoActions.g:290:17: ( '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' | '0' .. '9' )* '\"' )
            // ulNoActions.g:290:19: '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' | '0' .. '9' )* '\"'
            {
            match('\"'); 
            // ulNoActions.g:290:23: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==' '||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ulNoActions.g:
            	    {
            	    if ( input.LA(1)==' '||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRINGCONSTANT

    // $ANTLR start CHARCONSTANT
    public final void mCHARCONSTANT() throws RecognitionException {
        try {
            int _type = CHARCONSTANT;
            // ulNoActions.g:293:17: ( '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' | '0' .. '9' ) '\\'' )
            // ulNoActions.g:293:19: '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' | '0' .. '9' ) '\\''
            {
            match('\''); 
            if ( input.LA(1)==' '||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            match('\''); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CHARCONSTANT

    // $ANTLR start INTEGERCONSTANT
    public final void mINTEGERCONSTANT() throws RecognitionException {
        try {
            int _type = INTEGERCONSTANT;
            // ulNoActions.g:296:17: ( ( '0' .. '9' )+ )
            // ulNoActions.g:296:19: ( '0' .. '9' )+
            {
            // ulNoActions.g:296:19: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ulNoActions.g:296:20: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INTEGERCONSTANT

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // ulNoActions.g:299:12: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ulNoActions.g:299:14: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ulNoActions.g:299:42: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ulNoActions.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ID

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // ulNoActions.g:307:9: ( ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+ )
            // ulNoActions.g:307:11: ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+
            {
            // ulNoActions.g:307:11: ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ulNoActions.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

             channel = HIDDEN; skip();

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // ulNoActions.g:310:9: ( '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' | '\\n' ) )
            // ulNoActions.g:310:11: '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' | '\\n' )
            {
            match("//"); 

            // ulNoActions.g:310:16: (~ ( '\\r' | '\\n' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ulNoActions.g:310:16: ~ ( '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

             channel = HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    public void mTokens() throws RecognitionException {
        // ulNoActions.g:1:8: ( T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | IF | ELSE | WHILE | PRINT | PRINTLN | RETURN | TYPE | TRUE | FALSE | FLOATCONSTANT | STRINGCONSTANT | CHARCONSTANT | INTEGERCONSTANT | ID | WS | COMMENT )
        int alt9=30;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // ulNoActions.g:1:10: T20
                {
                mT20(); 

                }
                break;
            case 2 :
                // ulNoActions.g:1:14: T21
                {
                mT21(); 

                }
                break;
            case 3 :
                // ulNoActions.g:1:18: T22
                {
                mT22(); 

                }
                break;
            case 4 :
                // ulNoActions.g:1:22: T23
                {
                mT23(); 

                }
                break;
            case 5 :
                // ulNoActions.g:1:26: T24
                {
                mT24(); 

                }
                break;
            case 6 :
                // ulNoActions.g:1:30: T25
                {
                mT25(); 

                }
                break;
            case 7 :
                // ulNoActions.g:1:34: T26
                {
                mT26(); 

                }
                break;
            case 8 :
                // ulNoActions.g:1:38: T27
                {
                mT27(); 

                }
                break;
            case 9 :
                // ulNoActions.g:1:42: T28
                {
                mT28(); 

                }
                break;
            case 10 :
                // ulNoActions.g:1:46: T29
                {
                mT29(); 

                }
                break;
            case 11 :
                // ulNoActions.g:1:50: T30
                {
                mT30(); 

                }
                break;
            case 12 :
                // ulNoActions.g:1:54: T31
                {
                mT31(); 

                }
                break;
            case 13 :
                // ulNoActions.g:1:58: T32
                {
                mT32(); 

                }
                break;
            case 14 :
                // ulNoActions.g:1:62: T33
                {
                mT33(); 

                }
                break;
            case 15 :
                // ulNoActions.g:1:66: IF
                {
                mIF(); 

                }
                break;
            case 16 :
                // ulNoActions.g:1:69: ELSE
                {
                mELSE(); 

                }
                break;
            case 17 :
                // ulNoActions.g:1:74: WHILE
                {
                mWHILE(); 

                }
                break;
            case 18 :
                // ulNoActions.g:1:80: PRINT
                {
                mPRINT(); 

                }
                break;
            case 19 :
                // ulNoActions.g:1:86: PRINTLN
                {
                mPRINTLN(); 

                }
                break;
            case 20 :
                // ulNoActions.g:1:94: RETURN
                {
                mRETURN(); 

                }
                break;
            case 21 :
                // ulNoActions.g:1:101: TYPE
                {
                mTYPE(); 

                }
                break;
            case 22 :
                // ulNoActions.g:1:106: TRUE
                {
                mTRUE(); 

                }
                break;
            case 23 :
                // ulNoActions.g:1:111: FALSE
                {
                mFALSE(); 

                }
                break;
            case 24 :
                // ulNoActions.g:1:117: FLOATCONSTANT
                {
                mFLOATCONSTANT(); 

                }
                break;
            case 25 :
                // ulNoActions.g:1:131: STRINGCONSTANT
                {
                mSTRINGCONSTANT(); 

                }
                break;
            case 26 :
                // ulNoActions.g:1:146: CHARCONSTANT
                {
                mCHARCONSTANT(); 

                }
                break;
            case 27 :
                // ulNoActions.g:1:159: INTEGERCONSTANT
                {
                mINTEGERCONSTANT(); 

                }
                break;
            case 28 :
                // ulNoActions.g:1:175: ID
                {
                mID(); 

                }
                break;
            case 29 :
                // ulNoActions.g:1:178: WS
                {
                mWS(); 

                }
                break;
            case 30 :
                // ulNoActions.g:1:181: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\7\uffff\1\40\6\uffff\13\34\1\56\7\uffff\1\60\14\34\3\uffff\1\75"+
        "\13\34\1\uffff\1\111\5\34\1\75\2\34\1\75\1\121\1\uffff\1\122\1\124"+
        "\1\34\1\126\1\75\2\34\2\uffff\1\34\1\uffff\1\132\1\uffff\1\75\1"+
        "\34\1\134\1\uffff\1\75\1\uffff";
    static final String DFA9_eofS =
        "\135\uffff";
    static final String DFA9_minS =
        "\1\11\6\uffff\1\75\6\uffff\1\146\1\154\1\150\1\162\1\145\1\141\1"+
        "\150\1\164\2\157\1\162\1\56\7\uffff\1\60\1\164\1\163\2\151\1\164"+
        "\1\154\1\157\1\141\1\162\1\157\1\151\1\165\3\uffff\1\60\1\145\1"+
        "\154\1\156\1\165\1\163\1\141\1\162\1\151\1\154\1\144\1\145\1\uffff"+
        "\1\60\1\145\1\164\1\162\1\145\1\164\1\60\1\156\1\145\2\60\1\uffff"+
        "\2\60\1\156\2\60\1\147\1\141\2\uffff\1\156\1\uffff\1\60\1\uffff"+
        "\1\60\1\156\1\60\1\uffff\1\60\1\uffff";
    static final String DFA9_maxS =
        "\1\175\6\uffff\1\75\6\uffff\1\156\1\154\1\150\1\162\1\145\1\154"+
        "\1\150\1\164\2\157\1\162\1\71\7\uffff\1\172\1\164\1\163\2\151\1"+
        "\164\1\154\1\157\1\141\1\162\1\157\1\151\1\165\3\uffff\1\172\1\145"+
        "\1\154\1\156\1\165\1\163\1\141\1\162\1\151\1\154\1\144\1\145\1\uffff"+
        "\1\172\1\145\1\164\1\162\1\145\1\164\1\172\1\156\1\145\2\172\1\uffff"+
        "\2\172\1\156\2\172\1\147\1\141\2\uffff\1\156\1\uffff\1\172\1\uffff"+
        "\1\172\1\156\1\172\1\uffff\1\172\1\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\11\1\12\1\13\1\14\1\15"+
        "\1\16\14\uffff\1\31\1\32\1\34\1\35\1\36\1\10\1\7\15\uffff\1\33\1"+
        "\30\1\17\14\uffff\1\25\13\uffff\1\20\7\uffff\1\26\1\21\1\uffff\1"+
        "\22\1\uffff\1\27\3\uffff\1\24\1\uffff\1\23";
    static final String DFA9_specialS =
        "\135\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\35\2\uffff\1\35\22\uffff\1\35\1\uffff\1\32\4\uffff\1\33\1"+
            "\1\1\2\1\13\1\11\1\3\1\12\1\uffff\1\36\12\31\1\uffff\1\6\1\10"+
            "\1\7\3\uffff\32\34\1\14\1\uffff\1\15\1\uffff\1\34\1\uffff\1"+
            "\34\1\26\1\24\1\34\1\17\1\23\2\34\1\16\6\34\1\21\1\34\1\22\1"+
            "\25\1\30\1\34\1\27\1\20\3\34\1\4\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\41\7\uffff\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47\12\uffff\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\57\1\uffff\12\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\117",
            "\1\120",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\13\34\1\123\16\34",
            "\1\125",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\127",
            "\1\130",
            "",
            "",
            "\1\131",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\133",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | IF | ELSE | WHILE | PRINT | PRINTLN | RETURN | TYPE | TRUE | FALSE | FLOATCONSTANT | STRINGCONSTANT | CHARCONSTANT | INTEGERCONSTANT | ID | WS | COMMENT );";
        }
    }
 

}