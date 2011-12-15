// $ANTLR 3.3 Nov 30, 2010 12:50:56 /Users/andrei/proj/jedi/antlr/Jedi.g 2011-12-15 10:05:34

package br.ufpb.iged.jedi;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class JediParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROG", "FIELDDEC", "PARAMDEC", "METHOD", "ID", "INT", "COMMENT", "WS", "ESC_SEQ", "STRING", "CHAR", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'klass'", "'{'", "'}'", "';'", "'int'", "'('", "','", "')'", "'if'", "'else'", "'while'", "'for'", "'='", "'to'", "'downto'", "'&&'", "'||'", "'>'", "'<'", "'!='", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'true'", "'false'", "'null'"
    };
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


        public JediParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public JediParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return JediParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/andrei/proj/jedi/antlr/Jedi.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /Users/andrei/proj/jedi/antlr/Jedi.g:62:1: prog : ( klass )+ -> ^( PROG ( klass )+ ) ;
    public final JediParser.prog_return prog() throws RecognitionException {
        JediParser.prog_return retval = new JediParser.prog_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JediParser.klass_return klass1 = null;


        RewriteRuleSubtreeStream stream_klass=new RewriteRuleSubtreeStream(adaptor,"rule klass");
        try {
            // /Users/andrei/proj/jedi/antlr/Jedi.g:62:6: ( ( klass )+ -> ^( PROG ( klass )+ ) )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:62:8: ( klass )+
            {
            // /Users/andrei/proj/jedi/antlr/Jedi.g:62:8: ( klass )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/andrei/proj/jedi/antlr/Jedi.g:62:8: klass
            	    {
            	    pushFollow(FOLLOW_klass_in_prog491);
            	    klass1=klass();

            	    state._fsp--;

            	    stream_klass.add(klass1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);



            // AST REWRITE
            // elements: klass
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 62:15: -> ^( PROG ( klass )+ )
            {
                // /Users/andrei/proj/jedi/antlr/Jedi.g:62:18: ^( PROG ( klass )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROG, "PROG"), root_1);

                if ( !(stream_klass.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_klass.hasNext() ) {
                    adaptor.addChild(root_1, stream_klass.nextTree());

                }
                stream_klass.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class klass_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "klass"
    // /Users/andrei/proj/jedi/antlr/Jedi.g:64:1: klass : 'klass' ID '{' ( classItem )* '}' ;
    public final JediParser.klass_return klass() throws RecognitionException {
        JediParser.klass_return retval = new JediParser.klass_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal2=null;
        Token ID3=null;
        Token char_literal4=null;
        Token char_literal6=null;
        JediParser.classItem_return classItem5 = null;


        Object string_literal2_tree=null;
        Object ID3_tree=null;
        Object char_literal4_tree=null;
        Object char_literal6_tree=null;

        try {
            // /Users/andrei/proj/jedi/antlr/Jedi.g:64:7: ( 'klass' ID '{' ( classItem )* '}' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:64:9: 'klass' ID '{' ( classItem )* '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal2=(Token)match(input,18,FOLLOW_18_in_klass511); 
            string_literal2_tree = (Object)adaptor.create(string_literal2);
            adaptor.addChild(root_0, string_literal2_tree);

            ID3=(Token)match(input,ID,FOLLOW_ID_in_klass513); 
            ID3_tree = (Object)adaptor.create(ID3);
            adaptor.addChild(root_0, ID3_tree);

            char_literal4=(Token)match(input,19,FOLLOW_19_in_klass515); 
            char_literal4_tree = (Object)adaptor.create(char_literal4);
            adaptor.addChild(root_0, char_literal4_tree);

            // /Users/andrei/proj/jedi/antlr/Jedi.g:64:24: ( classItem )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/andrei/proj/jedi/antlr/Jedi.g:64:24: classItem
            	    {
            	    pushFollow(FOLLOW_classItem_in_klass517);
            	    classItem5=classItem();

            	    state._fsp--;

            	    adaptor.addChild(root_0, classItem5.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            char_literal6=(Token)match(input,20,FOLLOW_20_in_klass520); 
            char_literal6_tree = (Object)adaptor.create(char_literal6);
            adaptor.addChild(root_0, char_literal6_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "klass"

    public static class classItem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classItem"
    // /Users/andrei/proj/jedi/antlr/Jedi.g:66:1: classItem : ( field | method );
    public final JediParser.classItem_return classItem() throws RecognitionException {
        JediParser.classItem_return retval = new JediParser.classItem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JediParser.field_return field7 = null;

        JediParser.method_return method8 = null;



        try {
            // /Users/andrei/proj/jedi/antlr/Jedi.g:67:2: ( field | method )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==ID) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==21) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==23) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:67:4: field
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_field_in_classItem531);
                    field7=field();

                    state._fsp--;

                    adaptor.addChild(root_0, field7.getTree());

                    }
                    break;
                case 2 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:68:4: method
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_method_in_classItem536);
                    method8=method();

                    state._fsp--;

                    adaptor.addChild(root_0, method8.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classItem"

    public static class field_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field"
    // /Users/andrei/proj/jedi/antlr/Jedi.g:71:1: field : type ID ';' -> ^( FIELDDEC type ID ) ;
    public final JediParser.field_return field() throws RecognitionException {
        JediParser.field_return retval = new JediParser.field_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID10=null;
        Token char_literal11=null;
        JediParser.type_return type9 = null;


        Object ID10_tree=null;
        Object char_literal11_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /Users/andrei/proj/jedi/antlr/Jedi.g:71:7: ( type ID ';' -> ^( FIELDDEC type ID ) )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:71:9: type ID ';'
            {
            pushFollow(FOLLOW_type_in_field547);
            type9=type();

            state._fsp--;

            stream_type.add(type9.getTree());
            ID10=(Token)match(input,ID,FOLLOW_ID_in_field549);  
            stream_ID.add(ID10);

            char_literal11=(Token)match(input,21,FOLLOW_21_in_field551);  
            stream_21.add(char_literal11);



            // AST REWRITE
            // elements: ID, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 71:21: -> ^( FIELDDEC type ID )
            {
                // /Users/andrei/proj/jedi/antlr/Jedi.g:71:24: ^( FIELDDEC type ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELDDEC, "FIELDDEC"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "field"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /Users/andrei/proj/jedi/antlr/Jedi.g:73:1: type : 'int' ;
    public final JediParser.type_return type() throws RecognitionException {
        JediParser.type_return retval = new JediParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal12=null;

        Object string_literal12_tree=null;

        try {
            // /Users/andrei/proj/jedi/antlr/Jedi.g:73:6: ( 'int' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:73:8: 'int'
            {
            root_0 = (Object)adaptor.nil();

            string_literal12=(Token)match(input,22,FOLLOW_22_in_type570); 
            string_literal12_tree = (Object)adaptor.create(string_literal12);
            adaptor.addChild(root_0, string_literal12_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class method_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method"
    // /Users/andrei/proj/jedi/antlr/Jedi.g:75:1: method : type ID '(' ( param ( ',' param )* )? ')' '{' ( stat )* '}' -> ^( METHOD type ID ( param )+ ( stat )* ) ;
    public final JediParser.method_return method() throws RecognitionException {
        JediParser.method_return retval = new JediParser.method_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID14=null;
        Token char_literal15=null;
        Token char_literal17=null;
        Token char_literal19=null;
        Token char_literal20=null;
        Token char_literal22=null;
        JediParser.type_return type13 = null;

        JediParser.param_return param16 = null;

        JediParser.param_return param18 = null;

        JediParser.stat_return stat21 = null;


        Object ID14_tree=null;
        Object char_literal15_tree=null;
        Object char_literal17_tree=null;
        Object char_literal19_tree=null;
        Object char_literal20_tree=null;
        Object char_literal22_tree=null;
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
        try {
            // /Users/andrei/proj/jedi/antlr/Jedi.g:75:8: ( type ID '(' ( param ( ',' param )* )? ')' '{' ( stat )* '}' -> ^( METHOD type ID ( param )+ ( stat )* ) )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:75:11: type ID '(' ( param ( ',' param )* )? ')' '{' ( stat )* '}'
            {
            pushFollow(FOLLOW_type_in_method580);
            type13=type();

            state._fsp--;

            stream_type.add(type13.getTree());
            ID14=(Token)match(input,ID,FOLLOW_ID_in_method582);  
            stream_ID.add(ID14);

            char_literal15=(Token)match(input,23,FOLLOW_23_in_method584);  
            stream_23.add(char_literal15);

            // /Users/andrei/proj/jedi/antlr/Jedi.g:75:23: ( param ( ',' param )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:75:24: param ( ',' param )*
                    {
                    pushFollow(FOLLOW_param_in_method587);
                    param16=param();

                    state._fsp--;

                    stream_param.add(param16.getTree());
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:75:30: ( ',' param )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==24) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /Users/andrei/proj/jedi/antlr/Jedi.g:75:31: ',' param
                    	    {
                    	    char_literal17=(Token)match(input,24,FOLLOW_24_in_method590);  
                    	    stream_24.add(char_literal17);

                    	    pushFollow(FOLLOW_param_in_method592);
                    	    param18=param();

                    	    state._fsp--;

                    	    stream_param.add(param18.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal19=(Token)match(input,25,FOLLOW_25_in_method598);  
            stream_25.add(char_literal19);

            char_literal20=(Token)match(input,19,FOLLOW_19_in_method603);  
            stream_19.add(char_literal20);

            // /Users/andrei/proj/jedi/antlr/Jedi.g:76:8: ( stat )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=ID && LA6_0<=INT)||(LA6_0>=STRING && LA6_0<=CHAR)||LA6_0==19||LA6_0==23||LA6_0==26||(LA6_0>=28 && LA6_0<=29)||(LA6_0>=44 && LA6_0<=46)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/andrei/proj/jedi/antlr/Jedi.g:76:8: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_method605);
            	    stat21=stat();

            	    state._fsp--;

            	    stream_stat.add(stat21.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            char_literal22=(Token)match(input,20,FOLLOW_20_in_method608);  
            stream_20.add(char_literal22);



            // AST REWRITE
            // elements: ID, type, stat, param
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 76:18: -> ^( METHOD type ID ( param )+ ( stat )* )
            {
                // /Users/andrei/proj/jedi/antlr/Jedi.g:76:21: ^( METHOD type ID ( param )+ ( stat )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());
                if ( !(stream_param.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_param.hasNext() ) {
                    adaptor.addChild(root_1, stream_param.nextTree());

                }
                stream_param.reset();
                // /Users/andrei/proj/jedi/antlr/Jedi.g:76:45: ( stat )*
                while ( stream_stat.hasNext() ) {
                    adaptor.addChild(root_1, stream_stat.nextTree());

                }
                stream_stat.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method"

    public static class param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param"
    // /Users/andrei/proj/jedi/antlr/Jedi.g:78:1: param : type ID -> ^( PARAMDEC type ID ) ;
    public final JediParser.param_return param() throws RecognitionException {
        JediParser.param_return retval = new JediParser.param_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID24=null;
        JediParser.type_return type23 = null;


        Object ID24_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /Users/andrei/proj/jedi/antlr/Jedi.g:78:7: ( type ID -> ^( PARAMDEC type ID ) )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:78:10: type ID
            {
            pushFollow(FOLLOW_type_in_param634);
            type23=type();

            state._fsp--;

            stream_type.add(type23.getTree());
            ID24=(Token)match(input,ID,FOLLOW_ID_in_param636);  
            stream_ID.add(ID24);



            // AST REWRITE
            // elements: type, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 78:19: -> ^( PARAMDEC type ID )
            {
                // /Users/andrei/proj/jedi/antlr/Jedi.g:78:22: ^( PARAMDEC type ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMDEC, "PARAMDEC"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "param"

    public static class stat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stat"
    // /Users/andrei/proj/jedi/antlr/Jedi.g:88:1: stat : ( expr | '{' ( stat )* '}' | 'if' cond stat ( 'else' stat )? | 'while' cond stat | 'for' '(' ID '=' expr ( 'to' | 'downto' ) expr ')' stat );
    public final JediParser.stat_return stat() throws RecognitionException {
        JediParser.stat_return retval = new JediParser.stat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal26=null;
        Token char_literal28=null;
        Token string_literal29=null;
        Token string_literal32=null;
        Token string_literal34=null;
        Token string_literal37=null;
        Token char_literal38=null;
        Token ID39=null;
        Token char_literal40=null;
        Token set42=null;
        Token char_literal44=null;
        JediParser.expr_return expr25 = null;

        JediParser.stat_return stat27 = null;

        JediParser.cond_return cond30 = null;

        JediParser.stat_return stat31 = null;

        JediParser.stat_return stat33 = null;

        JediParser.cond_return cond35 = null;

        JediParser.stat_return stat36 = null;

        JediParser.expr_return expr41 = null;

        JediParser.expr_return expr43 = null;

        JediParser.stat_return stat45 = null;


        Object char_literal26_tree=null;
        Object char_literal28_tree=null;
        Object string_literal29_tree=null;
        Object string_literal32_tree=null;
        Object string_literal34_tree=null;
        Object string_literal37_tree=null;
        Object char_literal38_tree=null;
        Object ID39_tree=null;
        Object char_literal40_tree=null;
        Object set42_tree=null;
        Object char_literal44_tree=null;

        try {
            // /Users/andrei/proj/jedi/antlr/Jedi.g:88:9: ( expr | '{' ( stat )* '}' | 'if' cond stat ( 'else' stat )? | 'while' cond stat | 'for' '(' ID '=' expr ( 'to' | 'downto' ) expr ')' stat )
            int alt9=5;
            switch ( input.LA(1) ) {
            case ID:
            case INT:
            case STRING:
            case CHAR:
            case 23:
            case 44:
            case 45:
            case 46:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 26:
                {
                alt9=3;
                }
                break;
            case 28:
                {
                alt9=4;
                }
                break;
            case 29:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:88:12: expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_stat669);
                    expr25=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr25.getTree());

                    }
                    break;
                case 2 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:89:4: '{' ( stat )* '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal26=(Token)match(input,19,FOLLOW_19_in_stat674); 
                    char_literal26_tree = (Object)adaptor.create(char_literal26);
                    adaptor.addChild(root_0, char_literal26_tree);

                    // /Users/andrei/proj/jedi/antlr/Jedi.g:89:8: ( stat )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=ID && LA7_0<=INT)||(LA7_0>=STRING && LA7_0<=CHAR)||LA7_0==19||LA7_0==23||LA7_0==26||(LA7_0>=28 && LA7_0<=29)||(LA7_0>=44 && LA7_0<=46)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/andrei/proj/jedi/antlr/Jedi.g:89:8: stat
                    	    {
                    	    pushFollow(FOLLOW_stat_in_stat676);
                    	    stat27=stat();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, stat27.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    char_literal28=(Token)match(input,20,FOLLOW_20_in_stat679); 
                    char_literal28_tree = (Object)adaptor.create(char_literal28);
                    adaptor.addChild(root_0, char_literal28_tree);


                    }
                    break;
                case 3 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:90:4: 'if' cond stat ( 'else' stat )?
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal29=(Token)match(input,26,FOLLOW_26_in_stat684); 
                    string_literal29_tree = (Object)adaptor.create(string_literal29);
                    adaptor.addChild(root_0, string_literal29_tree);

                    pushFollow(FOLLOW_cond_in_stat686);
                    cond30=cond();

                    state._fsp--;

                    adaptor.addChild(root_0, cond30.getTree());
                    pushFollow(FOLLOW_stat_in_stat688);
                    stat31=stat();

                    state._fsp--;

                    adaptor.addChild(root_0, stat31.getTree());
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:90:19: ( 'else' stat )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==27) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/andrei/proj/jedi/antlr/Jedi.g:90:20: 'else' stat
                            {
                            string_literal32=(Token)match(input,27,FOLLOW_27_in_stat691); 
                            string_literal32_tree = (Object)adaptor.create(string_literal32);
                            adaptor.addChild(root_0, string_literal32_tree);

                            pushFollow(FOLLOW_stat_in_stat693);
                            stat33=stat();

                            state._fsp--;

                            adaptor.addChild(root_0, stat33.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:91:4: 'while' cond stat
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal34=(Token)match(input,28,FOLLOW_28_in_stat700); 
                    string_literal34_tree = (Object)adaptor.create(string_literal34);
                    adaptor.addChild(root_0, string_literal34_tree);

                    pushFollow(FOLLOW_cond_in_stat702);
                    cond35=cond();

                    state._fsp--;

                    adaptor.addChild(root_0, cond35.getTree());
                    pushFollow(FOLLOW_stat_in_stat704);
                    stat36=stat();

                    state._fsp--;

                    adaptor.addChild(root_0, stat36.getTree());

                    }
                    break;
                case 5 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:92:4: 'for' '(' ID '=' expr ( 'to' | 'downto' ) expr ')' stat
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal37=(Token)match(input,29,FOLLOW_29_in_stat709); 
                    string_literal37_tree = (Object)adaptor.create(string_literal37);
                    adaptor.addChild(root_0, string_literal37_tree);

                    char_literal38=(Token)match(input,23,FOLLOW_23_in_stat711); 
                    char_literal38_tree = (Object)adaptor.create(char_literal38);
                    adaptor.addChild(root_0, char_literal38_tree);

                    ID39=(Token)match(input,ID,FOLLOW_ID_in_stat713); 
                    ID39_tree = (Object)adaptor.create(ID39);
                    adaptor.addChild(root_0, ID39_tree);

                    char_literal40=(Token)match(input,30,FOLLOW_30_in_stat715); 
                    char_literal40_tree = (Object)adaptor.create(char_literal40);
                    adaptor.addChild(root_0, char_literal40_tree);

                    pushFollow(FOLLOW_expr_in_stat717);
                    expr41=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr41.getTree());
                    set42=(Token)input.LT(1);
                    if ( (input.LA(1)>=31 && input.LA(1)<=32) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set42));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_expr_in_stat727);
                    expr43=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr43.getTree());
                    char_literal44=(Token)match(input,25,FOLLOW_25_in_stat729); 
                    char_literal44_tree = (Object)adaptor.create(char_literal44);
                    adaptor.addChild(root_0, char_literal44_tree);

                    pushFollow(FOLLOW_stat_in_stat731);
                    stat45=stat();

                    state._fsp--;

                    adaptor.addChild(root_0, stat45.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stat"

    public static class cond_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cond"
    // /Users/andrei/proj/jedi/antlr/Jedi.g:96:1: cond : '(' expr ')' ;
    public final JediParser.cond_return cond() throws RecognitionException {
        JediParser.cond_return retval = new JediParser.cond_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal46=null;
        Token char_literal48=null;
        JediParser.expr_return expr47 = null;


        Object char_literal46_tree=null;
        Object char_literal48_tree=null;

        try {
            // /Users/andrei/proj/jedi/antlr/Jedi.g:96:6: ( '(' expr ')' )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:96:8: '(' expr ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal46=(Token)match(input,23,FOLLOW_23_in_cond742); 
            char_literal46_tree = (Object)adaptor.create(char_literal46);
            adaptor.addChild(root_0, char_literal46_tree);

            pushFollow(FOLLOW_expr_in_cond744);
            expr47=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr47.getTree());
            char_literal48=(Token)match(input,25,FOLLOW_25_in_cond746); 
            char_literal48_tree = (Object)adaptor.create(char_literal48);
            adaptor.addChild(root_0, char_literal48_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cond"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /Users/andrei/proj/jedi/antlr/Jedi.g:108:1: expr : relExpr ( ( '&&' | '||' ) relExpr )* ;
    public final JediParser.expr_return expr() throws RecognitionException {
        JediParser.expr_return retval = new JediParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set50=null;
        JediParser.relExpr_return relExpr49 = null;

        JediParser.relExpr_return relExpr51 = null;


        Object set50_tree=null;

        try {
            // /Users/andrei/proj/jedi/antlr/Jedi.g:108:6: ( relExpr ( ( '&&' | '||' ) relExpr )* )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:108:8: relExpr ( ( '&&' | '||' ) relExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relExpr_in_expr765);
            relExpr49=relExpr();

            state._fsp--;

            adaptor.addChild(root_0, relExpr49.getTree());
            // /Users/andrei/proj/jedi/antlr/Jedi.g:108:16: ( ( '&&' | '||' ) relExpr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=33 && LA10_0<=34)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/andrei/proj/jedi/antlr/Jedi.g:108:17: ( '&&' | '||' ) relExpr
            	    {
            	    set50=(Token)input.LT(1);
            	    set50=(Token)input.LT(1);
            	    if ( (input.LA(1)>=33 && input.LA(1)<=34) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set50), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relExpr_in_expr777);
            	    relExpr51=relExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relExpr51.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class relExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relExpr"
    // /Users/andrei/proj/jedi/antlr/Jedi.g:110:1: relExpr : addExpr ( ( '>' | '<' | '=' | '!=' | '>=' | '<=' ) addExpr )* ;
    public final JediParser.relExpr_return relExpr() throws RecognitionException {
        JediParser.relExpr_return retval = new JediParser.relExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set53=null;
        JediParser.addExpr_return addExpr52 = null;

        JediParser.addExpr_return addExpr54 = null;


        Object set53_tree=null;

        try {
            // /Users/andrei/proj/jedi/antlr/Jedi.g:110:9: ( addExpr ( ( '>' | '<' | '=' | '!=' | '>=' | '<=' ) addExpr )* )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:110:11: addExpr ( ( '>' | '<' | '=' | '!=' | '>=' | '<=' ) addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_addExpr_in_relExpr788);
            addExpr52=addExpr();

            state._fsp--;

            adaptor.addChild(root_0, addExpr52.getTree());
            // /Users/andrei/proj/jedi/antlr/Jedi.g:110:19: ( ( '>' | '<' | '=' | '!=' | '>=' | '<=' ) addExpr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30||(LA11_0>=35 && LA11_0<=39)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/andrei/proj/jedi/antlr/Jedi.g:110:20: ( '>' | '<' | '=' | '!=' | '>=' | '<=' ) addExpr
            	    {
            	    set53=(Token)input.LT(1);
            	    set53=(Token)input.LT(1);
            	    if ( input.LA(1)==30||(input.LA(1)>=35 && input.LA(1)<=39) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set53), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_addExpr_in_relExpr816);
            	    addExpr54=addExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, addExpr54.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relExpr"

    public static class addExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpr"
    // /Users/andrei/proj/jedi/antlr/Jedi.g:112:1: addExpr : multExpr ( ( '+' | '-' ) multExpr )* ;
    public final JediParser.addExpr_return addExpr() throws RecognitionException {
        JediParser.addExpr_return retval = new JediParser.addExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set56=null;
        JediParser.multExpr_return multExpr55 = null;

        JediParser.multExpr_return multExpr57 = null;


        Object set56_tree=null;

        try {
            // /Users/andrei/proj/jedi/antlr/Jedi.g:112:9: ( multExpr ( ( '+' | '-' ) multExpr )* )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:112:11: multExpr ( ( '+' | '-' ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multExpr_in_addExpr828);
            multExpr55=multExpr();

            state._fsp--;

            adaptor.addChild(root_0, multExpr55.getTree());
            // /Users/andrei/proj/jedi/antlr/Jedi.g:112:20: ( ( '+' | '-' ) multExpr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=40 && LA12_0<=41)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/andrei/proj/jedi/antlr/Jedi.g:112:21: ( '+' | '-' ) multExpr
            	    {
            	    set56=(Token)input.LT(1);
            	    set56=(Token)input.LT(1);
            	    if ( (input.LA(1)>=40 && input.LA(1)<=41) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set56), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr840);
            	    multExpr57=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr57.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "addExpr"

    public static class multExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multExpr"
    // /Users/andrei/proj/jedi/antlr/Jedi.g:114:1: multExpr : primary ( ( '*' | '/' ) primary )* ;
    public final JediParser.multExpr_return multExpr() throws RecognitionException {
        JediParser.multExpr_return retval = new JediParser.multExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set59=null;
        JediParser.primary_return primary58 = null;

        JediParser.primary_return primary60 = null;


        Object set59_tree=null;

        try {
            // /Users/andrei/proj/jedi/antlr/Jedi.g:114:9: ( primary ( ( '*' | '/' ) primary )* )
            // /Users/andrei/proj/jedi/antlr/Jedi.g:114:11: primary ( ( '*' | '/' ) primary )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_primary_in_multExpr850);
            primary58=primary();

            state._fsp--;

            adaptor.addChild(root_0, primary58.getTree());
            // /Users/andrei/proj/jedi/antlr/Jedi.g:114:19: ( ( '*' | '/' ) primary )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=42 && LA13_0<=43)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/andrei/proj/jedi/antlr/Jedi.g:114:20: ( '*' | '/' ) primary
            	    {
            	    set59=(Token)input.LT(1);
            	    set59=(Token)input.LT(1);
            	    if ( (input.LA(1)>=42 && input.LA(1)<=43) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set59), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_primary_in_multExpr862);
            	    primary60=primary();

            	    state._fsp--;

            	    adaptor.addChild(root_0, primary60.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multExpr"

    public static class primary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primary"
    // /Users/andrei/proj/jedi/antlr/Jedi.g:116:1: primary : ( INT | ID | '(' expr ')' | CHAR | STRING | 'true' | 'false' | 'null' );
    public final JediParser.primary_return primary() throws RecognitionException {
        JediParser.primary_return retval = new JediParser.primary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT61=null;
        Token ID62=null;
        Token char_literal63=null;
        Token char_literal65=null;
        Token CHAR66=null;
        Token STRING67=null;
        Token string_literal68=null;
        Token string_literal69=null;
        Token string_literal70=null;
        JediParser.expr_return expr64 = null;


        Object INT61_tree=null;
        Object ID62_tree=null;
        Object char_literal63_tree=null;
        Object char_literal65_tree=null;
        Object CHAR66_tree=null;
        Object STRING67_tree=null;
        Object string_literal68_tree=null;
        Object string_literal69_tree=null;
        Object string_literal70_tree=null;

        try {
            // /Users/andrei/proj/jedi/antlr/Jedi.g:116:9: ( INT | ID | '(' expr ')' | CHAR | STRING | 'true' | 'false' | 'null' )
            int alt14=8;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt14=1;
                }
                break;
            case ID:
                {
                alt14=2;
                }
                break;
            case 23:
                {
                alt14=3;
                }
                break;
            case CHAR:
                {
                alt14=4;
                }
                break;
            case STRING:
                {
                alt14=5;
                }
                break;
            case 44:
                {
                alt14=6;
                }
                break;
            case 45:
                {
                alt14=7;
                }
                break;
            case 46:
                {
                alt14=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:116:11: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT61=(Token)match(input,INT,FOLLOW_INT_in_primary874); 
                    INT61_tree = (Object)adaptor.create(INT61);
                    adaptor.addChild(root_0, INT61_tree);


                    }
                    break;
                case 2 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:117:4: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID62=(Token)match(input,ID,FOLLOW_ID_in_primary879); 
                    ID62_tree = (Object)adaptor.create(ID62);
                    adaptor.addChild(root_0, ID62_tree);


                    }
                    break;
                case 3 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:119:4: '(' expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal63=(Token)match(input,23,FOLLOW_23_in_primary886); 
                    char_literal63_tree = (Object)adaptor.create(char_literal63);
                    adaptor.addChild(root_0, char_literal63_tree);

                    pushFollow(FOLLOW_expr_in_primary888);
                    expr64=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr64.getTree());
                    char_literal65=(Token)match(input,25,FOLLOW_25_in_primary890); 
                    char_literal65_tree = (Object)adaptor.create(char_literal65);
                    adaptor.addChild(root_0, char_literal65_tree);


                    }
                    break;
                case 4 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:120:4: CHAR
                    {
                    root_0 = (Object)adaptor.nil();

                    CHAR66=(Token)match(input,CHAR,FOLLOW_CHAR_in_primary895); 
                    CHAR66_tree = (Object)adaptor.create(CHAR66);
                    adaptor.addChild(root_0, CHAR66_tree);


                    }
                    break;
                case 5 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:121:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING67=(Token)match(input,STRING,FOLLOW_STRING_in_primary900); 
                    STRING67_tree = (Object)adaptor.create(STRING67);
                    adaptor.addChild(root_0, STRING67_tree);


                    }
                    break;
                case 6 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:122:4: 'true'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal68=(Token)match(input,44,FOLLOW_44_in_primary905); 
                    string_literal68_tree = (Object)adaptor.create(string_literal68);
                    adaptor.addChild(root_0, string_literal68_tree);


                    }
                    break;
                case 7 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:123:4: 'false'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal69=(Token)match(input,45,FOLLOW_45_in_primary910); 
                    string_literal69_tree = (Object)adaptor.create(string_literal69);
                    adaptor.addChild(root_0, string_literal69_tree);


                    }
                    break;
                case 8 :
                    // /Users/andrei/proj/jedi/antlr/Jedi.g:124:4: 'null'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal70=(Token)match(input,46,FOLLOW_46_in_primary915); 
                    string_literal70_tree = (Object)adaptor.create(string_literal70);
                    adaptor.addChild(root_0, string_literal70_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primary"

    // Delegated rules


 

    public static final BitSet FOLLOW_klass_in_prog491 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_klass511 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_klass513 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_klass515 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_classItem_in_klass517 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_20_in_klass520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_classItem531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_classItem536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_field547 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_field549 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_field551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_type570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_method580 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_method582 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_method584 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_param_in_method587 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_method590 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_param_in_method592 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_method598 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_method603 = new BitSet(new long[]{0x0000700034986300L});
    public static final BitSet FOLLOW_stat_in_method605 = new BitSet(new long[]{0x0000700034986300L});
    public static final BitSet FOLLOW_20_in_method608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_param634 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_param636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stat669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_stat674 = new BitSet(new long[]{0x0000700034986300L});
    public static final BitSet FOLLOW_stat_in_stat676 = new BitSet(new long[]{0x0000700034986300L});
    public static final BitSet FOLLOW_20_in_stat679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_stat684 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_cond_in_stat686 = new BitSet(new long[]{0x0000700034886300L});
    public static final BitSet FOLLOW_stat_in_stat688 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_stat691 = new BitSet(new long[]{0x0000700034886300L});
    public static final BitSet FOLLOW_stat_in_stat693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_stat700 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_cond_in_stat702 = new BitSet(new long[]{0x0000700034886300L});
    public static final BitSet FOLLOW_stat_in_stat704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_stat709 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_stat711 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_stat713 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_stat715 = new BitSet(new long[]{0x0000700000806300L});
    public static final BitSet FOLLOW_expr_in_stat717 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_set_in_stat719 = new BitSet(new long[]{0x0000700000806300L});
    public static final BitSet FOLLOW_expr_in_stat727 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_stat729 = new BitSet(new long[]{0x0000700034886300L});
    public static final BitSet FOLLOW_stat_in_stat731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_cond742 = new BitSet(new long[]{0x0000700000806300L});
    public static final BitSet FOLLOW_expr_in_cond744 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_cond746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relExpr_in_expr765 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_set_in_expr768 = new BitSet(new long[]{0x0000700000806300L});
    public static final BitSet FOLLOW_relExpr_in_expr777 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_addExpr_in_relExpr788 = new BitSet(new long[]{0x000000F840000002L});
    public static final BitSet FOLLOW_set_in_relExpr791 = new BitSet(new long[]{0x0000700000806300L});
    public static final BitSet FOLLOW_addExpr_in_relExpr816 = new BitSet(new long[]{0x000000F840000002L});
    public static final BitSet FOLLOW_multExpr_in_addExpr828 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_set_in_addExpr831 = new BitSet(new long[]{0x0000700000806300L});
    public static final BitSet FOLLOW_multExpr_in_addExpr840 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_primary_in_multExpr850 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_set_in_multExpr853 = new BitSet(new long[]{0x0000700000806300L});
    public static final BitSet FOLLOW_primary_in_multExpr862 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_INT_in_primary874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_primary886 = new BitSet(new long[]{0x0000700000806300L});
    public static final BitSet FOLLOW_expr_in_primary888 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_primary890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primary895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_primary905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_primary910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_primary915 = new BitSet(new long[]{0x0000000000000002L});

}