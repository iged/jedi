// $ANTLR 3.3 Nov 30, 2010 12:50:56 /Users/andrei/proj/jedi/antlr/Jedi.g 2011-12-15 10:05:35

package br.ufpb.iged.jedi;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JediLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int PROG=4;
    public static final int FIELDDEC=5;
    public static final int PARAMDEC=6;
    public static final int METHOD=7;
    public static final int ID=8;
    public static final int INT=9;
    public static final int COMMENT=10;
    public static final int WS=11;
    public static final int ESC_SEQ=12;
    public static final int STRING=13;
    public static final int CHAR=14;
    public static final int HEX_DIGIT=15;
    public static final int UNICODE_ESC=16;
    public static final int OCTAL_ESC=17;

    // delegates
    // delegators

    public JediLexer() {;} 
    public JediLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public JediLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/andrei/proj/jedi/antlr/Jedi.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:7:7: ( 'klass' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:7:9: 'klass'
            {
            match("klass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:8:7: ( '{' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:8:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:9:7: ( '}' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:9:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:10:7: ( ';' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:10:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:11:7: ( 'int' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:11:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:12:7: ( '(' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:12:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:13:7: ( ',' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:14:7: ( ')' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:14:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:15:7: ( 'if' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:15:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:16:7: ( 'else' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:16:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:17:7: ( 'while' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:17:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:18:7: ( 'for' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:18:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:19:7: ( '=' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:19:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:20:7: ( 'to' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:20:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:21:7: ( 'downto' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:21:9: 'downto'
            {
            match("downto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:22:7: ( '&&' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:22:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:23:7: ( '||' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:23:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:24:7: ( '>' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:24:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:25:7: ( '<' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:25:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:26:7: ( '!=' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:26:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:27:7: ( '>=' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:27:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:28:7: ( '<=' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:28:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:29:7: ( '+' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:29:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:30:7: ( '-' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:30:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:31:7: ( '*' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:31:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:32:7: ( '/' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:32:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:33:7: ( 'true' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:33:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:34:7: ( 'false' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:34:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:35:7: ( 'null' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:35:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:14:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:14:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/andrei/proj/jedi/antlr/Jedi.g:14:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/andrei/proj/jedi/antlr/Jedi.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:17:5: ( ( '0' .. '9' )+ )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:17:7: ( '0' .. '9' )+
            {
            // /Users/andrei/proj/jedi/antlr/Jedi.g:17:7: ( '0' .. '9' )+
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
            	    // /Users/andrei/proj/jedi/antlr/Jedi.g:17:7: '0' .. '9'
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:21:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='/') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='/') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='*') ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:21:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // /Users/andrei/proj/jedi/antlr/Jedi.g:21:14: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/andrei/proj/jedi/antlr/Jedi.g:21:14: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // /Users/andrei/proj/jedi/antlr/Jedi.g:21:28: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/andrei/proj/jedi/antlr/Jedi.g:21:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:22:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /Users/andrei/proj/jedi/antlr/Jedi.g:22:14: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Users/andrei/proj/jedi/antlr/Jedi.g:22:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:25:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:25:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:33:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:33:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /Users/andrei/proj/jedi/antlr/Jedi.g:33:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/andrei/proj/jedi/antlr/Jedi.g:33:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/andrei/proj/jedi/antlr/Jedi.g:33:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrei/proj/jedi/antlr/Jedi.g:36:5: ( '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:36:8: '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // /Users/andrei/proj/jedi/antlr/Jedi.g:36:13: ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\\') ) {
                alt8=1;
            }
            else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:36:15: ESC_SEQ
                    {
                    mESC_SEQ(); 

                    }
                    break;
                case 2 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:36:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /Users/andrei/proj/jedi/antlr/Jedi.g:40:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:40:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /Users/andrei/proj/jedi/antlr/Jedi.g:44:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt9=1;
                    }
                    break;
                case 'u':
                    {
                    alt9=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt9=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:44:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:45:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:46:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /Users/andrei/proj/jedi/antlr/Jedi.g:51:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\\') ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>='0' && LA10_1<='3')) ) {
                    int LA10_2 = input.LA(3);

                    if ( ((LA10_2>='0' && LA10_2<='7')) ) {
                        int LA10_4 = input.LA(4);

                        if ( ((LA10_4>='0' && LA10_4<='7')) ) {
                            alt10=1;
                        }
                        else {
                            alt10=2;}
                    }
                    else {
                        alt10=3;}
                }
                else if ( ((LA10_1>='4' && LA10_1<='7')) ) {
                    int LA10_3 = input.LA(3);

                    if ( ((LA10_3>='0' && LA10_3<='7')) ) {
                        alt10=2;
                    }
                    else {
                        alt10=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:51:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:51:14: ( '0' .. '3' )
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:51:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // /Users/andrei/proj/jedi/antlr/Jedi.g:51:25: ( '0' .. '7' )
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:51:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Users/andrei/proj/jedi/antlr/Jedi.g:51:36: ( '0' .. '7' )
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:51:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:52:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:52:14: ( '0' .. '7' )
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:52:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Users/andrei/proj/jedi/antlr/Jedi.g:52:25: ( '0' .. '7' )
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:52:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:53:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:53:14: ( '0' .. '7' )
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:53:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /Users/andrei/proj/jedi/antlr/Jedi.g:58:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:58:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // /Users/andrei/proj/jedi/antlr/Jedi.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | ID | INT | COMMENT | WS | STRING | CHAR )
        int alt11=35;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:130: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:136: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:142: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:148: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:154: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:160: T__43
                {
                mT__43(); 

                }
                break;
            case 27 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:166: T__44
                {
                mT__44(); 

                }
                break;
            case 28 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:172: T__45
                {
                mT__45(); 

                }
                break;
            case 29 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:178: T__46
                {
                mT__46(); 

                }
                break;
            case 30 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:184: ID
                {
                mID(); 

                }
                break;
            case 31 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:187: INT
                {
                mINT(); 

                }
                break;
            case 32 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:191: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 33 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:199: WS
                {
                mWS(); 

                }
                break;
            case 34 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:202: STRING
                {
                mSTRING(); 

                }
                break;
            case 35 :
                // /Users/andrei/proj/jedi/antlr/Jedi.g:1:209: CHAR
                {
                mCHAR(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\31\3\uffff\1\31\3\uffff\3\31\1\uffff\2\31\2\uffff\1\51"+
        "\1\53\4\uffff\1\55\1\31\5\uffff\2\31\1\61\4\31\1\66\2\31\6\uffff"+
        "\2\31\1\73\1\uffff\2\31\1\76\1\31\1\uffff\4\31\1\uffff\1\104\1\31"+
        "\1\uffff\1\31\1\107\1\31\1\111\1\112\1\uffff\1\113\1\114\1\uffff"+
        "\1\31\4\uffff\1\116\1\uffff";
    static final String DFA11_eofS =
        "\117\uffff";
    static final String DFA11_minS =
        "\1\11\1\154\3\uffff\1\146\3\uffff\1\154\1\150\1\141\1\uffff\2\157"+
        "\2\uffff\2\75\4\uffff\1\52\1\165\5\uffff\1\141\1\164\1\60\1\163"+
        "\1\151\1\162\1\154\1\60\1\165\1\167\6\uffff\1\154\1\163\1\60\1\uffff"+
        "\1\145\1\154\1\60\1\163\1\uffff\1\145\1\156\1\154\1\163\1\uffff"+
        "\1\60\1\145\1\uffff\1\145\1\60\1\164\2\60\1\uffff\2\60\1\uffff\1"+
        "\157\4\uffff\1\60\1\uffff";
    static final String DFA11_maxS =
        "\1\175\1\154\3\uffff\1\156\3\uffff\1\154\1\150\1\157\1\uffff\1\162"+
        "\1\157\2\uffff\2\75\4\uffff\1\57\1\165\5\uffff\1\141\1\164\1\172"+
        "\1\163\1\151\1\162\1\154\1\172\1\165\1\167\6\uffff\1\154\1\163\1"+
        "\172\1\uffff\1\145\1\154\1\172\1\163\1\uffff\1\145\1\156\1\154\1"+
        "\163\1\uffff\1\172\1\145\1\uffff\1\145\1\172\1\164\2\172\1\uffff"+
        "\2\172\1\uffff\1\157\4\uffff\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\uffff\1\6\1\7\1\10\3\uffff\1\15\2\uffff\1"+
        "\20\1\21\2\uffff\1\24\1\27\1\30\1\31\2\uffff\1\36\1\37\1\41\1\42"+
        "\1\43\12\uffff\1\25\1\22\1\26\1\23\1\40\1\32\3\uffff\1\11\4\uffff"+
        "\1\16\4\uffff\1\5\2\uffff\1\14\5\uffff\1\12\2\uffff\1\33\1\uffff"+
        "\1\35\1\1\1\13\1\34\1\uffff\1\17";
    static final String DFA11_specialS =
        "\117\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\33\2\uffff\1\33\22\uffff\1\33\1\23\1\34\3\uffff\1\17\1\35"+
            "\1\6\1\10\1\26\1\24\1\7\1\25\1\uffff\1\27\12\32\1\uffff\1\4"+
            "\1\22\1\14\1\21\2\uffff\32\31\4\uffff\1\31\1\uffff\3\31\1\16"+
            "\1\11\1\13\2\31\1\5\1\31\1\1\2\31\1\30\5\31\1\15\2\31\1\12\3"+
            "\31\1\2\1\20\1\3",
            "\1\36",
            "",
            "",
            "",
            "\1\40\7\uffff\1\37",
            "",
            "",
            "",
            "\1\41",
            "\1\42",
            "\1\44\15\uffff\1\43",
            "",
            "\1\45\2\uffff\1\46",
            "\1\47",
            "",
            "",
            "\1\50",
            "\1\52",
            "",
            "",
            "",
            "",
            "\1\54\4\uffff\1\54",
            "\1\56",
            "",
            "",
            "",
            "",
            "",
            "\1\57",
            "\1\60",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\67",
            "\1\70",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\71",
            "\1\72",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\74",
            "\1\75",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\77",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\105",
            "",
            "\1\106",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\110",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\115",
            "",
            "",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | ID | INT | COMMENT | WS | STRING | CHAR );";
        }
    }
 

}