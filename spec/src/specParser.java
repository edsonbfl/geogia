// $ANTLR 3.0.1 ./src/spec.g3 2007-09-21 10:21:53

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class specParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Identifier", "ENUM", "FloatingPointLiteral", "CharacterLiteral", "StringLiteral", "HexLiteral", "OctalLiteral", "DecimalLiteral", "HexDigit", "IntegerTypeSuffix", "Exponent", "FloatTypeSuffix", "EscapeSequence", "UnicodeEscape", "OctalEscape", "Letter", "JavaIDDigit", "WS", "COMMENT", "LINE_COMMENT", "'\\u0e41\\u0e1e\\u0e47\\u0e04\\u0e40\\u0e01\\u0e08'", "'\\u0e19\\u0e33\\u0e40\\u0e02\\u0e49\\u0e32'", "'static'", "'.'", "'*'", "';'", "'\\u0e2d\\u0e18\\u0e34\\u0e1a\\u0e32\\u0e22'", "'<'", "','", "'>'", "'extends'", "'&'", "'implements'", "'{'", "'}'", "'interface'", "'\\u0e14\\u0e31\\u0e07\\u0e19\\u0e35\\u0e49'", "'\\u0e08\\u0e1a'", "'\\u0e01\\u0e48\\u0e2d\\u0e19'", "'('", "')'", "'\\u0e2b\\u0e25\\u0e31\\u0e07'", "':'", "'\\u0e01\\u0e33\\u0e2b\\u0e19\\u0e14\\u0e43\\u0e2b\\u0e49'", "'void'", "'['", "']'", "'throws'", "'='", "'public'", "'protected'", "'private'", "'abstract'", "'final'", "'native'", "'synchronized'", "'transient'", "'volatile'", "'strictfp'", "'boolean'", "'char'", "'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "'?'", "'super'", "'...'", "'null'", "'true'", "'false'", "'@'", "'default'", "'\\u0e43\\u0e2b\\u0e49\\u0e17\\u0e33'", "'\\u0e42\\u0e14\\u0e22'", "'assert'", "'if'", "'else'", "'for'", "'while'", "'do'", "'try'", "'finally'", "'switch'", "'return'", "'throw'", "'break'", "'continue'", "'catch'", "'case'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'||'", "'&&'", "'|'", "'^'", "'=='", "'!='", "'instanceof'", "'+'", "'-'", "'/'", "'%'", "'++'", "'--'", "'~'", "'!'", "'this'", "'new'", "'class'"
    };
    public static final int HexLiteral=9;
    public static final int LINE_COMMENT=23;
    public static final int FloatTypeSuffix=15;
    public static final int OctalLiteral=10;
    public static final int IntegerTypeSuffix=13;
    public static final int CharacterLiteral=7;
    public static final int Exponent=14;
    public static final int EOF=-1;
    public static final int DecimalLiteral=11;
    public static final int HexDigit=12;
    public static final int Identifier=4;
    public static final int StringLiteral=8;
    public static final int WS=21;
    public static final int ENUM=5;
    public static final int UnicodeEscape=17;
    public static final int FloatingPointLiteral=6;
    public static final int JavaIDDigit=20;
    public static final int COMMENT=22;
    public static final int EscapeSequence=16;
    public static final int OctalEscape=18;
    public static final int Letter=19;

        public specParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[399+1];
         }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("specParserTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "./src/spec.g3"; }


    public static class specUnit_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start specUnit
    // ./src/spec.g3:14:1: specUnit : ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* ;
    public final specUnit_return specUnit() throws RecognitionException {
        specUnit_return retval = new specUnit_return();
        retval.start = input.LT(1);
        int specUnit_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // ./src/spec.g3:15:2: ( ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* )
            // ./src/spec.g3:15:4: ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )*
            {
            // ./src/spec.g3:15:4: ( packageDeclaration )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ./src/spec.g3:0:0: packageDeclaration
                    {
                    pushFollow(FOLLOW_packageDeclaration_in_specUnit50);
                    packageDeclaration();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            // ./src/spec.g3:16:9: ( importDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ./src/spec.g3:0:0: importDeclaration
            	    {
            	    pushFollow(FOLLOW_importDeclaration_in_specUnit61);
            	    importDeclaration();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ./src/spec.g3:17:9: ( typeDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26||(LA3_0>=29 && LA3_0<=30)||LA3_0==39||(LA3_0>=53 && LA3_0<=62)||LA3_0==77) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ./src/spec.g3:0:0: typeDeclaration
            	    {
            	    pushFollow(FOLLOW_typeDeclaration_in_specUnit72);
            	    typeDeclaration();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 1, specUnit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end specUnit

    public static class packageDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start packageDeclaration
    // ./src/spec.g3:20:1: packageDeclaration : '\\u0e41\\u0e1e\\u0e47\\u0e04\\u0e40\\u0e01\\u0e08' qualifiedName ;
    public final packageDeclaration_return packageDeclaration() throws RecognitionException {
        packageDeclaration_return retval = new packageDeclaration_return();
        retval.start = input.LT(1);
        int packageDeclaration_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // ./src/spec.g3:21:2: ( '\\u0e41\\u0e1e\\u0e47\\u0e04\\u0e40\\u0e01\\u0e08' qualifiedName )
            // ./src/spec.g3:21:4: '\\u0e41\\u0e1e\\u0e47\\u0e04\\u0e40\\u0e01\\u0e08' qualifiedName
            {
            match(input,24,FOLLOW_24_in_packageDeclaration84); if (failed) return retval;
            pushFollow(FOLLOW_qualifiedName_in_packageDeclaration86);
            qualifiedName();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 2, packageDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end packageDeclaration

    public static class importDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start importDeclaration
    // ./src/spec.g3:24:1: importDeclaration : '\\u0e19\\u0e33\\u0e40\\u0e02\\u0e49\\u0e32' ( 'static' )? Identifier ( '.' Identifier )* ( '.' '*' )? ;
    public final importDeclaration_return importDeclaration() throws RecognitionException {
        importDeclaration_return retval = new importDeclaration_return();
        retval.start = input.LT(1);
        int importDeclaration_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // ./src/spec.g3:25:2: ( '\\u0e19\\u0e33\\u0e40\\u0e02\\u0e49\\u0e32' ( 'static' )? Identifier ( '.' Identifier )* ( '.' '*' )? )
            // ./src/spec.g3:25:4: '\\u0e19\\u0e33\\u0e40\\u0e02\\u0e49\\u0e32' ( 'static' )? Identifier ( '.' Identifier )* ( '.' '*' )?
            {
            match(input,25,FOLLOW_25_in_importDeclaration99); if (failed) return retval;
            // ./src/spec.g3:25:43: ( 'static' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ./src/spec.g3:0:0: 'static'
                    {
                    match(input,26,FOLLOW_26_in_importDeclaration101); if (failed) return retval;

                    }
                    break;

            }

            match(input,Identifier,FOLLOW_Identifier_in_importDeclaration104); if (failed) return retval;
            // ./src/spec.g3:25:64: ( '.' Identifier )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==Identifier) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ./src/spec.g3:25:65: '.' Identifier
            	    {
            	    match(input,27,FOLLOW_27_in_importDeclaration107); if (failed) return retval;
            	    match(input,Identifier,FOLLOW_Identifier_in_importDeclaration109); if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ./src/spec.g3:25:82: ( '.' '*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ./src/spec.g3:25:83: '.' '*'
                    {
                    match(input,27,FOLLOW_27_in_importDeclaration114); if (failed) return retval;
                    match(input,28,FOLLOW_28_in_importDeclaration116); if (failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 3, importDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end importDeclaration

    public static class typeDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start typeDeclaration
    // ./src/spec.g3:28:1: typeDeclaration : ( classOrInterfaceDeclaration | ';' );
    public final typeDeclaration_return typeDeclaration() throws RecognitionException {
        typeDeclaration_return retval = new typeDeclaration_return();
        retval.start = input.LT(1);
        int typeDeclaration_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // ./src/spec.g3:29:2: ( classOrInterfaceDeclaration | ';' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26||LA7_0==30||LA7_0==39||(LA7_0>=53 && LA7_0<=62)||LA7_0==77) ) {
                alt7=1;
            }
            else if ( (LA7_0==29) ) {
                alt7=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("28:1: typeDeclaration : ( classOrInterfaceDeclaration | ';' );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ./src/spec.g3:29:4: classOrInterfaceDeclaration
                    {
                    pushFollow(FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration130);
                    classOrInterfaceDeclaration();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:30:9: ';'
                    {
                    match(input,29,FOLLOW_29_in_typeDeclaration140); if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 4, typeDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end typeDeclaration

    public static class classOrInterfaceDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start classOrInterfaceDeclaration
    // ./src/spec.g3:33:1: classOrInterfaceDeclaration : ( modifier )* ( classDeclaration | interfaceDeclaration ) ;
    public final classOrInterfaceDeclaration_return classOrInterfaceDeclaration() throws RecognitionException {
        classOrInterfaceDeclaration_return retval = new classOrInterfaceDeclaration_return();
        retval.start = input.LT(1);
        int classOrInterfaceDeclaration_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // ./src/spec.g3:34:2: ( ( modifier )* ( classDeclaration | interfaceDeclaration ) )
            // ./src/spec.g3:34:4: ( modifier )* ( classDeclaration | interfaceDeclaration )
            {
            // ./src/spec.g3:34:4: ( modifier )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==77) ) {
                    int LA8_3 = input.LA(2);

                    if ( (LA8_3==Identifier) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==26||(LA8_0>=53 && LA8_0<=62)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ./src/spec.g3:0:0: modifier
            	    {
            	    pushFollow(FOLLOW_modifier_in_classOrInterfaceDeclaration152);
            	    modifier();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ./src/spec.g3:34:14: ( classDeclaration | interfaceDeclaration )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            else if ( (LA9_0==39||LA9_0==77) ) {
                alt9=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("34:14: ( classDeclaration | interfaceDeclaration )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ./src/spec.g3:34:15: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_classOrInterfaceDeclaration156);
                    classDeclaration();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:34:34: interfaceDeclaration
                    {
                    pushFollow(FOLLOW_interfaceDeclaration_in_classOrInterfaceDeclaration160);
                    interfaceDeclaration();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 5, classOrInterfaceDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end classOrInterfaceDeclaration

    public static class classDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start classDeclaration
    // ./src/spec.g3:37:1: classDeclaration : normalClassDeclaration ;
    public final classDeclaration_return classDeclaration() throws RecognitionException {
        classDeclaration_return retval = new classDeclaration_return();
        retval.start = input.LT(1);
        int classDeclaration_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // ./src/spec.g3:38:2: ( normalClassDeclaration )
            // ./src/spec.g3:38:4: normalClassDeclaration
            {
            pushFollow(FOLLOW_normalClassDeclaration_in_classDeclaration173);
            normalClassDeclaration();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 6, classDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end classDeclaration

    public static class normalClassDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start normalClassDeclaration
    // ./src/spec.g3:41:1: normalClassDeclaration : '\\u0e2d\\u0e18\\u0e34\\u0e1a\\u0e32\\u0e22' Identifier classBody ;
    public final normalClassDeclaration_return normalClassDeclaration() throws RecognitionException {
        normalClassDeclaration_return retval = new normalClassDeclaration_return();
        retval.start = input.LT(1);
        int normalClassDeclaration_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // ./src/spec.g3:42:2: ( '\\u0e2d\\u0e18\\u0e34\\u0e1a\\u0e32\\u0e22' Identifier classBody )
            // ./src/spec.g3:42:4: '\\u0e2d\\u0e18\\u0e34\\u0e1a\\u0e32\\u0e22' Identifier classBody
            {
            match(input,30,FOLLOW_30_in_normalClassDeclaration185); if (failed) return retval;
            match(input,Identifier,FOLLOW_Identifier_in_normalClassDeclaration187); if (failed) return retval;
            pushFollow(FOLLOW_classBody_in_normalClassDeclaration189);
            classBody();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 7, normalClassDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end normalClassDeclaration

    public static class typeParameters_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start typeParameters
    // ./src/spec.g3:45:1: typeParameters : '<' typeParameter ( ',' typeParameter )* '>' ;
    public final typeParameters_return typeParameters() throws RecognitionException {
        typeParameters_return retval = new typeParameters_return();
        retval.start = input.LT(1);
        int typeParameters_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // ./src/spec.g3:46:2: ( '<' typeParameter ( ',' typeParameter )* '>' )
            // ./src/spec.g3:46:4: '<' typeParameter ( ',' typeParameter )* '>'
            {
            match(input,31,FOLLOW_31_in_typeParameters201); if (failed) return retval;
            pushFollow(FOLLOW_typeParameter_in_typeParameters203);
            typeParameter();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:46:22: ( ',' typeParameter )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ./src/spec.g3:46:23: ',' typeParameter
            	    {
            	    match(input,32,FOLLOW_32_in_typeParameters206); if (failed) return retval;
            	    pushFollow(FOLLOW_typeParameter_in_typeParameters208);
            	    typeParameter();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,33,FOLLOW_33_in_typeParameters212); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 8, typeParameters_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end typeParameters

    public static class typeParameter_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start typeParameter
    // ./src/spec.g3:49:1: typeParameter : Identifier ( 'extends' bound )? ;
    public final typeParameter_return typeParameter() throws RecognitionException {
        typeParameter_return retval = new typeParameter_return();
        retval.start = input.LT(1);
        int typeParameter_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // ./src/spec.g3:50:2: ( Identifier ( 'extends' bound )? )
            // ./src/spec.g3:50:4: Identifier ( 'extends' bound )?
            {
            match(input,Identifier,FOLLOW_Identifier_in_typeParameter223); if (failed) return retval;
            // ./src/spec.g3:50:15: ( 'extends' bound )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ./src/spec.g3:50:16: 'extends' bound
                    {
                    match(input,34,FOLLOW_34_in_typeParameter226); if (failed) return retval;
                    pushFollow(FOLLOW_bound_in_typeParameter228);
                    bound();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 9, typeParameter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end typeParameter

    public static class bound_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start bound
    // ./src/spec.g3:53:1: bound : type ( '&' type )* ;
    public final bound_return bound() throws RecognitionException {
        bound_return retval = new bound_return();
        retval.start = input.LT(1);
        int bound_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // ./src/spec.g3:54:2: ( type ( '&' type )* )
            // ./src/spec.g3:54:4: type ( '&' type )*
            {
            pushFollow(FOLLOW_type_in_bound243);
            type();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:54:9: ( '&' type )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==35) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ./src/spec.g3:54:10: '&' type
            	    {
            	    match(input,35,FOLLOW_35_in_bound246); if (failed) return retval;
            	    pushFollow(FOLLOW_type_in_bound248);
            	    type();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 10, bound_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end bound

    public static class enumDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start enumDeclaration
    // ./src/spec.g3:57:1: enumDeclaration : ENUM Identifier ( 'implements' typeList )? enumBody ;
    public final enumDeclaration_return enumDeclaration() throws RecognitionException {
        enumDeclaration_return retval = new enumDeclaration_return();
        retval.start = input.LT(1);
        int enumDeclaration_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // ./src/spec.g3:58:2: ( ENUM Identifier ( 'implements' typeList )? enumBody )
            // ./src/spec.g3:58:4: ENUM Identifier ( 'implements' typeList )? enumBody
            {
            match(input,ENUM,FOLLOW_ENUM_in_enumDeclaration261); if (failed) return retval;
            match(input,Identifier,FOLLOW_Identifier_in_enumDeclaration263); if (failed) return retval;
            // ./src/spec.g3:58:20: ( 'implements' typeList )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ./src/spec.g3:58:21: 'implements' typeList
                    {
                    match(input,36,FOLLOW_36_in_enumDeclaration266); if (failed) return retval;
                    pushFollow(FOLLOW_typeList_in_enumDeclaration268);
                    typeList();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_enumBody_in_enumDeclaration272);
            enumBody();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 11, enumDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end enumDeclaration

    public static class enumBody_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start enumBody
    // ./src/spec.g3:61:1: enumBody : '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}' ;
    public final enumBody_return enumBody() throws RecognitionException {
        enumBody_return retval = new enumBody_return();
        retval.start = input.LT(1);
        int enumBody_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // ./src/spec.g3:62:2: ( '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}' )
            // ./src/spec.g3:62:4: '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}'
            {
            match(input,37,FOLLOW_37_in_enumBody284); if (failed) return retval;
            // ./src/spec.g3:62:8: ( enumConstants )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Identifier||LA14_0==77) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ./src/spec.g3:0:0: enumConstants
                    {
                    pushFollow(FOLLOW_enumConstants_in_enumBody286);
                    enumConstants();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            // ./src/spec.g3:62:23: ( ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ./src/spec.g3:0:0: ','
                    {
                    match(input,32,FOLLOW_32_in_enumBody289); if (failed) return retval;

                    }
                    break;

            }

            // ./src/spec.g3:62:28: ( enumBodyDeclarations )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ./src/spec.g3:0:0: enumBodyDeclarations
                    {
                    pushFollow(FOLLOW_enumBodyDeclarations_in_enumBody292);
                    enumBodyDeclarations();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            match(input,38,FOLLOW_38_in_enumBody295); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 12, enumBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end enumBody

    public static class enumConstants_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start enumConstants
    // ./src/spec.g3:65:1: enumConstants : enumConstant ( ',' enumConstant )* ;
    public final enumConstants_return enumConstants() throws RecognitionException {
        enumConstants_return retval = new enumConstants_return();
        retval.start = input.LT(1);
        int enumConstants_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // ./src/spec.g3:66:2: ( enumConstant ( ',' enumConstant )* )
            // ./src/spec.g3:66:4: enumConstant ( ',' enumConstant )*
            {
            pushFollow(FOLLOW_enumConstant_in_enumConstants306);
            enumConstant();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:66:17: ( ',' enumConstant )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==Identifier||LA17_1==77) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ./src/spec.g3:66:18: ',' enumConstant
            	    {
            	    match(input,32,FOLLOW_32_in_enumConstants309); if (failed) return retval;
            	    pushFollow(FOLLOW_enumConstant_in_enumConstants311);
            	    enumConstant();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 13, enumConstants_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end enumConstants

    public static class enumConstant_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start enumConstant
    // ./src/spec.g3:69:1: enumConstant : ( annotations )? Identifier ( arguments )? ( classBody )? ;
    public final enumConstant_return enumConstant() throws RecognitionException {
        enumConstant_return retval = new enumConstant_return();
        retval.start = input.LT(1);
        int enumConstant_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // ./src/spec.g3:70:2: ( ( annotations )? Identifier ( arguments )? ( classBody )? )
            // ./src/spec.g3:70:4: ( annotations )? Identifier ( arguments )? ( classBody )?
            {
            // ./src/spec.g3:70:4: ( annotations )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==77) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ./src/spec.g3:0:0: annotations
                    {
                    pushFollow(FOLLOW_annotations_in_enumConstant325);
                    annotations();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            match(input,Identifier,FOLLOW_Identifier_in_enumConstant328); if (failed) return retval;
            // ./src/spec.g3:70:28: ( arguments )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==43) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ./src/spec.g3:70:29: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_enumConstant331);
                    arguments();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            // ./src/spec.g3:70:41: ( classBody )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ./src/spec.g3:70:42: classBody
                    {
                    pushFollow(FOLLOW_classBody_in_enumConstant336);
                    classBody();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 14, enumConstant_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end enumConstant

    public static class enumBodyDeclarations_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start enumBodyDeclarations
    // ./src/spec.g3:73:1: enumBodyDeclarations : ';' ( classBodyDeclaration )* ;
    public final enumBodyDeclarations_return enumBodyDeclarations() throws RecognitionException {
        enumBodyDeclarations_return retval = new enumBodyDeclarations_return();
        retval.start = input.LT(1);
        int enumBodyDeclarations_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // ./src/spec.g3:74:2: ( ';' ( classBodyDeclaration )* )
            // ./src/spec.g3:74:4: ';' ( classBodyDeclaration )*
            {
            match(input,29,FOLLOW_29_in_enumBodyDeclarations350); if (failed) return retval;
            // ./src/spec.g3:74:8: ( classBodyDeclaration )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==26||LA21_0==29||LA21_0==42||LA21_0==45||LA21_0==47||(LA21_0>=53 && LA21_0<=62)||LA21_0==77||LA21_0==80) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ./src/spec.g3:74:9: classBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_classBodyDeclaration_in_enumBodyDeclarations353);
            	    classBodyDeclaration();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 15, enumBodyDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end enumBodyDeclarations

    public static class interfaceDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start interfaceDeclaration
    // ./src/spec.g3:77:1: interfaceDeclaration : ( normalInterfaceDeclaration | annotationTypeDeclaration );
    public final interfaceDeclaration_return interfaceDeclaration() throws RecognitionException {
        interfaceDeclaration_return retval = new interfaceDeclaration_return();
        retval.start = input.LT(1);
        int interfaceDeclaration_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // ./src/spec.g3:78:2: ( normalInterfaceDeclaration | annotationTypeDeclaration )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            else if ( (LA22_0==77) ) {
                alt22=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("77:1: interfaceDeclaration : ( normalInterfaceDeclaration | annotationTypeDeclaration );", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ./src/spec.g3:78:4: normalInterfaceDeclaration
                    {
                    pushFollow(FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration367);
                    normalInterfaceDeclaration();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:79:5: annotationTypeDeclaration
                    {
                    pushFollow(FOLLOW_annotationTypeDeclaration_in_interfaceDeclaration373);
                    annotationTypeDeclaration();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 16, interfaceDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end interfaceDeclaration

    public static class normalInterfaceDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start normalInterfaceDeclaration
    // ./src/spec.g3:82:1: normalInterfaceDeclaration : 'interface' Identifier ( typeParameters )? ( 'extends' typeList )? interfaceBody ;
    public final normalInterfaceDeclaration_return normalInterfaceDeclaration() throws RecognitionException {
        normalInterfaceDeclaration_return retval = new normalInterfaceDeclaration_return();
        retval.start = input.LT(1);
        int normalInterfaceDeclaration_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // ./src/spec.g3:83:2: ( 'interface' Identifier ( typeParameters )? ( 'extends' typeList )? interfaceBody )
            // ./src/spec.g3:83:4: 'interface' Identifier ( typeParameters )? ( 'extends' typeList )? interfaceBody
            {
            match(input,39,FOLLOW_39_in_normalInterfaceDeclaration385); if (failed) return retval;
            match(input,Identifier,FOLLOW_Identifier_in_normalInterfaceDeclaration387); if (failed) return retval;
            // ./src/spec.g3:83:27: ( typeParameters )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ./src/spec.g3:0:0: typeParameters
                    {
                    pushFollow(FOLLOW_typeParameters_in_normalInterfaceDeclaration389);
                    typeParameters();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            // ./src/spec.g3:83:43: ( 'extends' typeList )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ./src/spec.g3:83:44: 'extends' typeList
                    {
                    match(input,34,FOLLOW_34_in_normalInterfaceDeclaration393); if (failed) return retval;
                    pushFollow(FOLLOW_typeList_in_normalInterfaceDeclaration395);
                    typeList();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_interfaceBody_in_normalInterfaceDeclaration399);
            interfaceBody();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 17, normalInterfaceDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end normalInterfaceDeclaration

    public static class typeList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start typeList
    // ./src/spec.g3:86:1: typeList : type ( ',' type )* ;
    public final typeList_return typeList() throws RecognitionException {
        typeList_return retval = new typeList_return();
        retval.start = input.LT(1);
        int typeList_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // ./src/spec.g3:87:2: ( type ( ',' type )* )
            // ./src/spec.g3:87:4: type ( ',' type )*
            {
            pushFollow(FOLLOW_type_in_typeList411);
            type();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:87:9: ( ',' type )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==32) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ./src/spec.g3:87:10: ',' type
            	    {
            	    match(input,32,FOLLOW_32_in_typeList414); if (failed) return retval;
            	    pushFollow(FOLLOW_type_in_typeList416);
            	    type();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 18, typeList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end typeList

    public static class classBody_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start classBody
    // ./src/spec.g3:90:1: classBody : '\\u0e14\\u0e31\\u0e07\\u0e19\\u0e35\\u0e49' ( classBodyDeclaration )* '\\u0e08\\u0e1a' ;
    public final classBody_return classBody() throws RecognitionException {
        classBody_return retval = new classBody_return();
        retval.start = input.LT(1);
        int classBody_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // ./src/spec.g3:91:2: ( '\\u0e14\\u0e31\\u0e07\\u0e19\\u0e35\\u0e49' ( classBodyDeclaration )* '\\u0e08\\u0e1a' )
            // ./src/spec.g3:91:4: '\\u0e14\\u0e31\\u0e07\\u0e19\\u0e35\\u0e49' ( classBodyDeclaration )* '\\u0e08\\u0e1a'
            {
            match(input,40,FOLLOW_40_in_classBody430); if (failed) return retval;
            // ./src/spec.g3:91:43: ( classBodyDeclaration )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==26||LA26_0==29||LA26_0==42||LA26_0==45||LA26_0==47||(LA26_0>=53 && LA26_0<=62)||LA26_0==77||LA26_0==80) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ./src/spec.g3:0:0: classBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_classBodyDeclaration_in_classBody432);
            	    classBodyDeclaration();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            match(input,41,FOLLOW_41_in_classBody435); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 19, classBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end classBody

    public static class interfaceBody_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start interfaceBody
    // ./src/spec.g3:94:1: interfaceBody : '{' ( interfaceBodyDeclaration )* '}' ;
    public final interfaceBody_return interfaceBody() throws RecognitionException {
        interfaceBody_return retval = new interfaceBody_return();
        retval.start = input.LT(1);
        int interfaceBody_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // ./src/spec.g3:95:2: ( '{' ( interfaceBodyDeclaration )* '}' )
            // ./src/spec.g3:95:4: '{' ( interfaceBodyDeclaration )* '}'
            {
            match(input,37,FOLLOW_37_in_interfaceBody447); if (failed) return retval;
            // ./src/spec.g3:95:8: ( interfaceBodyDeclaration )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Identifier||LA27_0==26||(LA27_0>=29 && LA27_0<=31)||LA27_0==39||LA27_0==48||(LA27_0>=53 && LA27_0<=70)||LA27_0==77) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ./src/spec.g3:0:0: interfaceBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_interfaceBodyDeclaration_in_interfaceBody449);
            	    interfaceBodyDeclaration();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            match(input,38,FOLLOW_38_in_interfaceBody452); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 20, interfaceBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end interfaceBody

    public static class classBodyDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start classBodyDeclaration
    // ./src/spec.g3:98:1: classBodyDeclaration : ( ';' | ( 'static' )? block | ( modifier )* memberDecl );
    public final classBodyDeclaration_return classBodyDeclaration() throws RecognitionException {
        classBodyDeclaration_return retval = new classBodyDeclaration_return();
        retval.start = input.LT(1);
        int classBodyDeclaration_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // ./src/spec.g3:99:2: ( ';' | ( 'static' )? block | ( modifier )* memberDecl )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt30=1;
                }
                break;
            case 26:
                {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==80) ) {
                    alt30=2;
                }
                else if ( (LA30_2==26||LA30_2==42||LA30_2==45||LA30_2==47||(LA30_2>=53 && LA30_2<=62)||LA30_2==77) ) {
                    alt30=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("98:1: classBodyDeclaration : ( ';' | ( 'static' )? block | ( modifier )* memberDecl );", 30, 2, input);

                    throw nvae;
                }
                }
                break;
            case 80:
                {
                alt30=2;
                }
                break;
            case 42:
            case 45:
            case 47:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 77:
                {
                alt30=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("98:1: classBodyDeclaration : ( ';' | ( 'static' )? block | ( modifier )* memberDecl );", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ./src/spec.g3:99:4: ';'
                    {
                    match(input,29,FOLLOW_29_in_classBodyDeclaration463); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:100:4: ( 'static' )? block
                    {
                    // ./src/spec.g3:100:4: ( 'static' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==26) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ./src/spec.g3:0:0: 'static'
                            {
                            match(input,26,FOLLOW_26_in_classBodyDeclaration468); if (failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_block_in_classBodyDeclaration471);
                    block();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 3 :
                    // ./src/spec.g3:101:4: ( modifier )* memberDecl
                    {
                    // ./src/spec.g3:101:4: ( modifier )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==26||(LA29_0>=53 && LA29_0<=62)||LA29_0==77) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ./src/spec.g3:0:0: modifier
                    	    {
                    	    pushFollow(FOLLOW_modifier_in_classBodyDeclaration476);
                    	    modifier();
                    	    _fsp--;
                    	    if (failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    pushFollow(FOLLOW_memberDecl_in_classBodyDeclaration479);
                    memberDecl();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 21, classBodyDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end classBodyDeclaration

    public static class memberDecl_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start memberDecl
    // ./src/spec.g3:104:1: memberDecl : ( beforeDeclaration | afterDeclaration | specDeclaration );
    public final memberDecl_return memberDecl() throws RecognitionException {
        memberDecl_return retval = new memberDecl_return();
        retval.start = input.LT(1);
        int memberDecl_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // ./src/spec.g3:105:2: ( beforeDeclaration | afterDeclaration | specDeclaration )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt31=1;
                }
                break;
            case 45:
                {
                alt31=2;
                }
                break;
            case 47:
                {
                alt31=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("104:1: memberDecl : ( beforeDeclaration | afterDeclaration | specDeclaration );", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ./src/spec.g3:112:3: beforeDeclaration
                    {
                    pushFollow(FOLLOW_beforeDeclaration_in_memberDecl500);
                    beforeDeclaration();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:113:4: afterDeclaration
                    {
                    pushFollow(FOLLOW_afterDeclaration_in_memberDecl505);
                    afterDeclaration();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 3 :
                    // ./src/spec.g3:114:4: specDeclaration
                    {
                    pushFollow(FOLLOW_specDeclaration_in_memberDecl510);
                    specDeclaration();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 22, memberDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end memberDecl

    public static class beforeDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start beforeDeclaration
    // ./src/spec.g3:118:1: beforeDeclaration : '\\u0e01\\u0e48\\u0e2d\\u0e19' '(' symbolList ')' adviceBody ;
    public final beforeDeclaration_return beforeDeclaration() throws RecognitionException {
        beforeDeclaration_return retval = new beforeDeclaration_return();
        retval.start = input.LT(1);
        int beforeDeclaration_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // ./src/spec.g3:119:2: ( '\\u0e01\\u0e48\\u0e2d\\u0e19' '(' symbolList ')' adviceBody )
            // ./src/spec.g3:119:4: '\\u0e01\\u0e48\\u0e2d\\u0e19' '(' symbolList ')' adviceBody
            {
            match(input,42,FOLLOW_42_in_beforeDeclaration523); if (failed) return retval;
            match(input,43,FOLLOW_43_in_beforeDeclaration525); if (failed) return retval;
            pushFollow(FOLLOW_symbolList_in_beforeDeclaration527);
            symbolList();
            _fsp--;
            if (failed) return retval;
            match(input,44,FOLLOW_44_in_beforeDeclaration529); if (failed) return retval;
            pushFollow(FOLLOW_adviceBody_in_beforeDeclaration531);
            adviceBody();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 23, beforeDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end beforeDeclaration

    public static class afterDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start afterDeclaration
    // ./src/spec.g3:122:1: afterDeclaration : '\\u0e2b\\u0e25\\u0e31\\u0e07' '(' symbolList ')' adviceBody ;
    public final afterDeclaration_return afterDeclaration() throws RecognitionException {
        afterDeclaration_return retval = new afterDeclaration_return();
        retval.start = input.LT(1);
        int afterDeclaration_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // ./src/spec.g3:123:2: ( '\\u0e2b\\u0e25\\u0e31\\u0e07' '(' symbolList ')' adviceBody )
            // ./src/spec.g3:123:4: '\\u0e2b\\u0e25\\u0e31\\u0e07' '(' symbolList ')' adviceBody
            {
            match(input,45,FOLLOW_45_in_afterDeclaration543); if (failed) return retval;
            match(input,43,FOLLOW_43_in_afterDeclaration545); if (failed) return retval;
            pushFollow(FOLLOW_symbolList_in_afterDeclaration547);
            symbolList();
            _fsp--;
            if (failed) return retval;
            match(input,44,FOLLOW_44_in_afterDeclaration549); if (failed) return retval;
            pushFollow(FOLLOW_adviceBody_in_afterDeclaration551);
            adviceBody();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 24, afterDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end afterDeclaration

    public static class symbolList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start symbolList
    // ./src/spec.g3:126:1: symbolList : symbol ( ',' symbol )* ;
    public final symbolList_return symbolList() throws RecognitionException {
        symbolList_return retval = new symbolList_return();
        retval.start = input.LT(1);
        int symbolList_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // ./src/spec.g3:127:2: ( symbol ( ',' symbol )* )
            // ./src/spec.g3:127:4: symbol ( ',' symbol )*
            {
            pushFollow(FOLLOW_symbol_in_symbolList563);
            symbol();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:127:11: ( ',' symbol )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==32) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ./src/spec.g3:127:12: ',' symbol
            	    {
            	    match(input,32,FOLLOW_32_in_symbolList566); if (failed) return retval;
            	    pushFollow(FOLLOW_symbol_in_symbolList568);
            	    symbol();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 25, symbolList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end symbolList

    public static class symbol_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start symbol
    // ./src/spec.g3:130:1: symbol : ':' Identifier ;
    public final symbol_return symbol() throws RecognitionException {
        symbol_return retval = new symbol_return();
        retval.start = input.LT(1);
        int symbol_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // ./src/spec.g3:131:2: ( ':' Identifier )
            // ./src/spec.g3:131:4: ':' Identifier
            {
            match(input,46,FOLLOW_46_in_symbol583); if (failed) return retval;
            match(input,Identifier,FOLLOW_Identifier_in_symbol585); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 26, symbol_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end symbol

    public static class specDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start specDeclaration
    // ./src/spec.g3:134:1: specDeclaration : '\\u0e01\\u0e33\\u0e2b\\u0e19\\u0e14\\u0e43\\u0e2b\\u0e49' Identifier specBody ;
    public final specDeclaration_return specDeclaration() throws RecognitionException {
        specDeclaration_return retval = new specDeclaration_return();
        retval.start = input.LT(1);
        int specDeclaration_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // ./src/spec.g3:135:2: ( '\\u0e01\\u0e33\\u0e2b\\u0e19\\u0e14\\u0e43\\u0e2b\\u0e49' Identifier specBody )
            // ./src/spec.g3:135:4: '\\u0e01\\u0e33\\u0e2b\\u0e19\\u0e14\\u0e43\\u0e2b\\u0e49' Identifier specBody
            {
            match(input,47,FOLLOW_47_in_specDeclaration598); if (failed) return retval;
            match(input,Identifier,FOLLOW_Identifier_in_specDeclaration600); if (failed) return retval;
            pushFollow(FOLLOW_specBody_in_specDeclaration602);
            specBody();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 27, specDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end specDeclaration

    public static class genericMethodOrConstructorDecl_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start genericMethodOrConstructorDecl
    // ./src/spec.g3:138:1: genericMethodOrConstructorDecl : typeParameters genericMethodOrConstructorRest ;
    public final genericMethodOrConstructorDecl_return genericMethodOrConstructorDecl() throws RecognitionException {
        genericMethodOrConstructorDecl_return retval = new genericMethodOrConstructorDecl_return();
        retval.start = input.LT(1);
        int genericMethodOrConstructorDecl_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // ./src/spec.g3:139:2: ( typeParameters genericMethodOrConstructorRest )
            // ./src/spec.g3:139:4: typeParameters genericMethodOrConstructorRest
            {
            pushFollow(FOLLOW_typeParameters_in_genericMethodOrConstructorDecl614);
            typeParameters();
            _fsp--;
            if (failed) return retval;
            pushFollow(FOLLOW_genericMethodOrConstructorRest_in_genericMethodOrConstructorDecl616);
            genericMethodOrConstructorRest();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 28, genericMethodOrConstructorDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end genericMethodOrConstructorDecl

    public static class genericMethodOrConstructorRest_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start genericMethodOrConstructorRest
    // ./src/spec.g3:142:1: genericMethodOrConstructorRest : ( ( type | 'void' ) Identifier methodDeclaratorRest | Identifier constructorDeclaratorRest );
    public final genericMethodOrConstructorRest_return genericMethodOrConstructorRest() throws RecognitionException {
        genericMethodOrConstructorRest_return retval = new genericMethodOrConstructorRest_return();
        retval.start = input.LT(1);
        int genericMethodOrConstructorRest_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // ./src/spec.g3:143:2: ( ( type | 'void' ) Identifier methodDeclaratorRest | Identifier constructorDeclaratorRest )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Identifier) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==Identifier||LA34_1==27||LA34_1==31||LA34_1==49) ) {
                    alt34=1;
                }
                else if ( (LA34_1==43) ) {
                    alt34=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("142:1: genericMethodOrConstructorRest : ( ( type | 'void' ) Identifier methodDeclaratorRest | Identifier constructorDeclaratorRest );", 34, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA34_0==48||(LA34_0>=63 && LA34_0<=70)) ) {
                alt34=1;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("142:1: genericMethodOrConstructorRest : ( ( type | 'void' ) Identifier methodDeclaratorRest | Identifier constructorDeclaratorRest );", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ./src/spec.g3:143:4: ( type | 'void' ) Identifier methodDeclaratorRest
                    {
                    // ./src/spec.g3:143:4: ( type | 'void' )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==Identifier||(LA33_0>=63 && LA33_0<=70)) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==48) ) {
                        alt33=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("143:4: ( type | 'void' )", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // ./src/spec.g3:143:5: type
                            {
                            pushFollow(FOLLOW_type_in_genericMethodOrConstructorRest629);
                            type();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;
                        case 2 :
                            // ./src/spec.g3:143:12: 'void'
                            {
                            match(input,48,FOLLOW_48_in_genericMethodOrConstructorRest633); if (failed) return retval;

                            }
                            break;

                    }

                    match(input,Identifier,FOLLOW_Identifier_in_genericMethodOrConstructorRest636); if (failed) return retval;
                    pushFollow(FOLLOW_methodDeclaratorRest_in_genericMethodOrConstructorRest638);
                    methodDeclaratorRest();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:144:4: Identifier constructorDeclaratorRest
                    {
                    match(input,Identifier,FOLLOW_Identifier_in_genericMethodOrConstructorRest643); if (failed) return retval;
                    pushFollow(FOLLOW_constructorDeclaratorRest_in_genericMethodOrConstructorRest645);
                    constructorDeclaratorRest();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 29, genericMethodOrConstructorRest_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end genericMethodOrConstructorRest

    public static class methodDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start methodDeclaration
    // ./src/spec.g3:147:1: methodDeclaration : type Identifier methodDeclaratorRest ;
    public final methodDeclaration_return methodDeclaration() throws RecognitionException {
        methodDeclaration_return retval = new methodDeclaration_return();
        retval.start = input.LT(1);
        int methodDeclaration_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // ./src/spec.g3:148:2: ( type Identifier methodDeclaratorRest )
            // ./src/spec.g3:148:4: type Identifier methodDeclaratorRest
            {
            pushFollow(FOLLOW_type_in_methodDeclaration656);
            type();
            _fsp--;
            if (failed) return retval;
            match(input,Identifier,FOLLOW_Identifier_in_methodDeclaration658); if (failed) return retval;
            pushFollow(FOLLOW_methodDeclaratorRest_in_methodDeclaration660);
            methodDeclaratorRest();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 30, methodDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end methodDeclaration

    public static class fieldDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start fieldDeclaration
    // ./src/spec.g3:151:1: fieldDeclaration : type variableDeclarators ';' ;
    public final fieldDeclaration_return fieldDeclaration() throws RecognitionException {
        fieldDeclaration_return retval = new fieldDeclaration_return();
        retval.start = input.LT(1);
        int fieldDeclaration_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // ./src/spec.g3:152:2: ( type variableDeclarators ';' )
            // ./src/spec.g3:152:4: type variableDeclarators ';'
            {
            pushFollow(FOLLOW_type_in_fieldDeclaration671);
            type();
            _fsp--;
            if (failed) return retval;
            pushFollow(FOLLOW_variableDeclarators_in_fieldDeclaration673);
            variableDeclarators();
            _fsp--;
            if (failed) return retval;
            match(input,29,FOLLOW_29_in_fieldDeclaration675); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 31, fieldDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end fieldDeclaration

    public static class interfaceBodyDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start interfaceBodyDeclaration
    // ./src/spec.g3:155:1: interfaceBodyDeclaration : ( ( modifier )* interfaceMemberDecl | ';' );
    public final interfaceBodyDeclaration_return interfaceBodyDeclaration() throws RecognitionException {
        interfaceBodyDeclaration_return retval = new interfaceBodyDeclaration_return();
        retval.start = input.LT(1);
        int interfaceBodyDeclaration_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // ./src/spec.g3:156:2: ( ( modifier )* interfaceMemberDecl | ';' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Identifier||LA36_0==26||(LA36_0>=30 && LA36_0<=31)||LA36_0==39||LA36_0==48||(LA36_0>=53 && LA36_0<=70)||LA36_0==77) ) {
                alt36=1;
            }
            else if ( (LA36_0==29) ) {
                alt36=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("155:1: interfaceBodyDeclaration : ( ( modifier )* interfaceMemberDecl | ';' );", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ./src/spec.g3:156:4: ( modifier )* interfaceMemberDecl
                    {
                    // ./src/spec.g3:156:4: ( modifier )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==77) ) {
                            int LA35_6 = input.LA(2);

                            if ( (LA35_6==Identifier) ) {
                                alt35=1;
                            }


                        }
                        else if ( (LA35_0==26||(LA35_0>=53 && LA35_0<=62)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ./src/spec.g3:0:0: modifier
                    	    {
                    	    pushFollow(FOLLOW_modifier_in_interfaceBodyDeclaration688);
                    	    modifier();
                    	    _fsp--;
                    	    if (failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    pushFollow(FOLLOW_interfaceMemberDecl_in_interfaceBodyDeclaration691);
                    interfaceMemberDecl();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:157:6: ';'
                    {
                    match(input,29,FOLLOW_29_in_interfaceBodyDeclaration698); if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 32, interfaceBodyDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end interfaceBodyDeclaration

    public static class interfaceMemberDecl_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start interfaceMemberDecl
    // ./src/spec.g3:160:1: interfaceMemberDecl : ( interfaceMethodOrFieldDecl | interfaceGenericMethodDecl | 'void' Identifier voidInterfaceMethodDeclaratorRest | interfaceDeclaration | classDeclaration );
    public final interfaceMemberDecl_return interfaceMemberDecl() throws RecognitionException {
        interfaceMemberDecl_return retval = new interfaceMemberDecl_return();
        retval.start = input.LT(1);
        int interfaceMemberDecl_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // ./src/spec.g3:161:2: ( interfaceMethodOrFieldDecl | interfaceGenericMethodDecl | 'void' Identifier voidInterfaceMethodDeclaratorRest | interfaceDeclaration | classDeclaration )
            int alt37=5;
            switch ( input.LA(1) ) {
            case Identifier:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
                {
                alt37=1;
                }
                break;
            case 31:
                {
                alt37=2;
                }
                break;
            case 48:
                {
                alt37=3;
                }
                break;
            case 39:
            case 77:
                {
                alt37=4;
                }
                break;
            case 30:
                {
                alt37=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("160:1: interfaceMemberDecl : ( interfaceMethodOrFieldDecl | interfaceGenericMethodDecl | 'void' Identifier voidInterfaceMethodDeclaratorRest | interfaceDeclaration | classDeclaration );", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ./src/spec.g3:161:4: interfaceMethodOrFieldDecl
                    {
                    pushFollow(FOLLOW_interfaceMethodOrFieldDecl_in_interfaceMemberDecl709);
                    interfaceMethodOrFieldDecl();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:162:6: interfaceGenericMethodDecl
                    {
                    pushFollow(FOLLOW_interfaceGenericMethodDecl_in_interfaceMemberDecl716);
                    interfaceGenericMethodDecl();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 3 :
                    // ./src/spec.g3:163:9: 'void' Identifier voidInterfaceMethodDeclaratorRest
                    {
                    match(input,48,FOLLOW_48_in_interfaceMemberDecl726); if (failed) return retval;
                    match(input,Identifier,FOLLOW_Identifier_in_interfaceMemberDecl728); if (failed) return retval;
                    pushFollow(FOLLOW_voidInterfaceMethodDeclaratorRest_in_interfaceMemberDecl730);
                    voidInterfaceMethodDeclaratorRest();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 4 :
                    // ./src/spec.g3:164:9: interfaceDeclaration
                    {
                    pushFollow(FOLLOW_interfaceDeclaration_in_interfaceMemberDecl740);
                    interfaceDeclaration();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 5 :
                    // ./src/spec.g3:165:9: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_interfaceMemberDecl750);
                    classDeclaration();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 33, interfaceMemberDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end interfaceMemberDecl

    public static class interfaceMethodOrFieldDecl_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start interfaceMethodOrFieldDecl
    // ./src/spec.g3:168:1: interfaceMethodOrFieldDecl : type Identifier interfaceMethodOrFieldRest ;
    public final interfaceMethodOrFieldDecl_return interfaceMethodOrFieldDecl() throws RecognitionException {
        interfaceMethodOrFieldDecl_return retval = new interfaceMethodOrFieldDecl_return();
        retval.start = input.LT(1);
        int interfaceMethodOrFieldDecl_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // ./src/spec.g3:169:2: ( type Identifier interfaceMethodOrFieldRest )
            // ./src/spec.g3:169:4: type Identifier interfaceMethodOrFieldRest
            {
            pushFollow(FOLLOW_type_in_interfaceMethodOrFieldDecl762);
            type();
            _fsp--;
            if (failed) return retval;
            match(input,Identifier,FOLLOW_Identifier_in_interfaceMethodOrFieldDecl764); if (failed) return retval;
            pushFollow(FOLLOW_interfaceMethodOrFieldRest_in_interfaceMethodOrFieldDecl766);
            interfaceMethodOrFieldRest();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 34, interfaceMethodOrFieldDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end interfaceMethodOrFieldDecl

    public static class interfaceMethodOrFieldRest_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start interfaceMethodOrFieldRest
    // ./src/spec.g3:172:1: interfaceMethodOrFieldRest : ( constantDeclaratorsRest ';' | interfaceMethodDeclaratorRest );
    public final interfaceMethodOrFieldRest_return interfaceMethodOrFieldRest() throws RecognitionException {
        interfaceMethodOrFieldRest_return retval = new interfaceMethodOrFieldRest_return();
        retval.start = input.LT(1);
        int interfaceMethodOrFieldRest_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // ./src/spec.g3:173:2: ( constantDeclaratorsRest ';' | interfaceMethodDeclaratorRest )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==49||LA38_0==52) ) {
                alt38=1;
            }
            else if ( (LA38_0==43) ) {
                alt38=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("172:1: interfaceMethodOrFieldRest : ( constantDeclaratorsRest ';' | interfaceMethodDeclaratorRest );", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ./src/spec.g3:173:4: constantDeclaratorsRest ';'
                    {
                    pushFollow(FOLLOW_constantDeclaratorsRest_in_interfaceMethodOrFieldRest778);
                    constantDeclaratorsRest();
                    _fsp--;
                    if (failed) return retval;
                    match(input,29,FOLLOW_29_in_interfaceMethodOrFieldRest780); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:174:4: interfaceMethodDeclaratorRest
                    {
                    pushFollow(FOLLOW_interfaceMethodDeclaratorRest_in_interfaceMethodOrFieldRest785);
                    interfaceMethodDeclaratorRest();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 35, interfaceMethodOrFieldRest_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end interfaceMethodOrFieldRest

    public static class methodDeclaratorRest_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start methodDeclaratorRest
    // ./src/spec.g3:177:1: methodDeclaratorRest : formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( methodBody | ';' ) ;
    public final methodDeclaratorRest_return methodDeclaratorRest() throws RecognitionException {
        methodDeclaratorRest_return retval = new methodDeclaratorRest_return();
        retval.start = input.LT(1);
        int methodDeclaratorRest_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // ./src/spec.g3:178:2: ( formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( methodBody | ';' ) )
            // ./src/spec.g3:178:4: formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( methodBody | ';' )
            {
            pushFollow(FOLLOW_formalParameters_in_methodDeclaratorRest797);
            formalParameters();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:178:21: ( '[' ']' )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==49) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ./src/spec.g3:178:22: '[' ']'
            	    {
            	    match(input,49,FOLLOW_49_in_methodDeclaratorRest800); if (failed) return retval;
            	    match(input,50,FOLLOW_50_in_methodDeclaratorRest802); if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // ./src/spec.g3:179:9: ( 'throws' qualifiedNameList )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==51) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ./src/spec.g3:179:10: 'throws' qualifiedNameList
                    {
                    match(input,51,FOLLOW_51_in_methodDeclaratorRest815); if (failed) return retval;
                    pushFollow(FOLLOW_qualifiedNameList_in_methodDeclaratorRest817);
                    qualifiedNameList();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            // ./src/spec.g3:180:9: ( methodBody | ';' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==80) ) {
                alt41=1;
            }
            else if ( (LA41_0==29) ) {
                alt41=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("180:9: ( methodBody | ';' )", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ./src/spec.g3:180:13: methodBody
                    {
                    pushFollow(FOLLOW_methodBody_in_methodDeclaratorRest833);
                    methodBody();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:181:13: ';'
                    {
                    match(input,29,FOLLOW_29_in_methodDeclaratorRest847); if (failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 36, methodDeclaratorRest_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end methodDeclaratorRest

    public static class voidMethodDeclaratorRest_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start voidMethodDeclaratorRest
    // ./src/spec.g3:185:1: voidMethodDeclaratorRest : formalParameters ( 'throws' qualifiedNameList )? ( methodBody | ';' ) ;
    public final voidMethodDeclaratorRest_return voidMethodDeclaratorRest() throws RecognitionException {
        voidMethodDeclaratorRest_return retval = new voidMethodDeclaratorRest_return();
        retval.start = input.LT(1);
        int voidMethodDeclaratorRest_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // ./src/spec.g3:186:2: ( formalParameters ( 'throws' qualifiedNameList )? ( methodBody | ';' ) )
            // ./src/spec.g3:186:4: formalParameters ( 'throws' qualifiedNameList )? ( methodBody | ';' )
            {
            pushFollow(FOLLOW_formalParameters_in_voidMethodDeclaratorRest869);
            formalParameters();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:186:21: ( 'throws' qualifiedNameList )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==51) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ./src/spec.g3:186:22: 'throws' qualifiedNameList
                    {
                    match(input,51,FOLLOW_51_in_voidMethodDeclaratorRest872); if (failed) return retval;
                    pushFollow(FOLLOW_qualifiedNameList_in_voidMethodDeclaratorRest874);
                    qualifiedNameList();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            // ./src/spec.g3:187:9: ( methodBody | ';' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==80) ) {
                alt43=1;
            }
            else if ( (LA43_0==29) ) {
                alt43=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("187:9: ( methodBody | ';' )", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ./src/spec.g3:187:13: methodBody
                    {
                    pushFollow(FOLLOW_methodBody_in_voidMethodDeclaratorRest890);
                    methodBody();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:188:13: ';'
                    {
                    match(input,29,FOLLOW_29_in_voidMethodDeclaratorRest904); if (failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 37, voidMethodDeclaratorRest_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end voidMethodDeclaratorRest

    public static class interfaceMethodDeclaratorRest_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start interfaceMethodDeclaratorRest
    // ./src/spec.g3:192:1: interfaceMethodDeclaratorRest : formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';' ;
    public final interfaceMethodDeclaratorRest_return interfaceMethodDeclaratorRest() throws RecognitionException {
        interfaceMethodDeclaratorRest_return retval = new interfaceMethodDeclaratorRest_return();
        retval.start = input.LT(1);
        int interfaceMethodDeclaratorRest_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // ./src/spec.g3:193:2: ( formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';' )
            // ./src/spec.g3:193:4: formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';'
            {
            pushFollow(FOLLOW_formalParameters_in_interfaceMethodDeclaratorRest926);
            formalParameters();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:193:21: ( '[' ']' )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==49) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ./src/spec.g3:193:22: '[' ']'
            	    {
            	    match(input,49,FOLLOW_49_in_interfaceMethodDeclaratorRest929); if (failed) return retval;
            	    match(input,50,FOLLOW_50_in_interfaceMethodDeclaratorRest931); if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // ./src/spec.g3:193:32: ( 'throws' qualifiedNameList )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==51) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ./src/spec.g3:193:33: 'throws' qualifiedNameList
                    {
                    match(input,51,FOLLOW_51_in_interfaceMethodDeclaratorRest936); if (failed) return retval;
                    pushFollow(FOLLOW_qualifiedNameList_in_interfaceMethodDeclaratorRest938);
                    qualifiedNameList();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            match(input,29,FOLLOW_29_in_interfaceMethodDeclaratorRest942); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 38, interfaceMethodDeclaratorRest_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end interfaceMethodDeclaratorRest

    public static class interfaceGenericMethodDecl_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start interfaceGenericMethodDecl
    // ./src/spec.g3:196:1: interfaceGenericMethodDecl : typeParameters ( type | 'void' ) Identifier interfaceMethodDeclaratorRest ;
    public final interfaceGenericMethodDecl_return interfaceGenericMethodDecl() throws RecognitionException {
        interfaceGenericMethodDecl_return retval = new interfaceGenericMethodDecl_return();
        retval.start = input.LT(1);
        int interfaceGenericMethodDecl_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // ./src/spec.g3:197:2: ( typeParameters ( type | 'void' ) Identifier interfaceMethodDeclaratorRest )
            // ./src/spec.g3:197:4: typeParameters ( type | 'void' ) Identifier interfaceMethodDeclaratorRest
            {
            pushFollow(FOLLOW_typeParameters_in_interfaceGenericMethodDecl954);
            typeParameters();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:197:19: ( type | 'void' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Identifier||(LA46_0>=63 && LA46_0<=70)) ) {
                alt46=1;
            }
            else if ( (LA46_0==48) ) {
                alt46=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("197:19: ( type | 'void' )", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ./src/spec.g3:197:20: type
                    {
                    pushFollow(FOLLOW_type_in_interfaceGenericMethodDecl957);
                    type();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:197:27: 'void'
                    {
                    match(input,48,FOLLOW_48_in_interfaceGenericMethodDecl961); if (failed) return retval;

                    }
                    break;

            }

            match(input,Identifier,FOLLOW_Identifier_in_interfaceGenericMethodDecl964); if (failed) return retval;
            pushFollow(FOLLOW_interfaceMethodDeclaratorRest_in_interfaceGenericMethodDecl974);
            interfaceMethodDeclaratorRest();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 39, interfaceGenericMethodDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end interfaceGenericMethodDecl

    public static class voidInterfaceMethodDeclaratorRest_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start voidInterfaceMethodDeclaratorRest
    // ./src/spec.g3:201:1: voidInterfaceMethodDeclaratorRest : formalParameters ( 'throws' qualifiedNameList )? ';' ;
    public final voidInterfaceMethodDeclaratorRest_return voidInterfaceMethodDeclaratorRest() throws RecognitionException {
        voidInterfaceMethodDeclaratorRest_return retval = new voidInterfaceMethodDeclaratorRest_return();
        retval.start = input.LT(1);
        int voidInterfaceMethodDeclaratorRest_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // ./src/spec.g3:202:2: ( formalParameters ( 'throws' qualifiedNameList )? ';' )
            // ./src/spec.g3:202:4: formalParameters ( 'throws' qualifiedNameList )? ';'
            {
            pushFollow(FOLLOW_formalParameters_in_voidInterfaceMethodDeclaratorRest986);
            formalParameters();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:202:21: ( 'throws' qualifiedNameList )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==51) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ./src/spec.g3:202:22: 'throws' qualifiedNameList
                    {
                    match(input,51,FOLLOW_51_in_voidInterfaceMethodDeclaratorRest989); if (failed) return retval;
                    pushFollow(FOLLOW_qualifiedNameList_in_voidInterfaceMethodDeclaratorRest991);
                    qualifiedNameList();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            match(input,29,FOLLOW_29_in_voidInterfaceMethodDeclaratorRest995); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 40, voidInterfaceMethodDeclaratorRest_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end voidInterfaceMethodDeclaratorRest

    public static class constructorDeclaratorRest_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start constructorDeclaratorRest
    // ./src/spec.g3:205:1: constructorDeclaratorRest : formalParameters ( 'throws' qualifiedNameList )? methodBody ;
    public final constructorDeclaratorRest_return constructorDeclaratorRest() throws RecognitionException {
        constructorDeclaratorRest_return retval = new constructorDeclaratorRest_return();
        retval.start = input.LT(1);
        int constructorDeclaratorRest_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // ./src/spec.g3:206:2: ( formalParameters ( 'throws' qualifiedNameList )? methodBody )
            // ./src/spec.g3:206:4: formalParameters ( 'throws' qualifiedNameList )? methodBody
            {
            pushFollow(FOLLOW_formalParameters_in_constructorDeclaratorRest1007);
            formalParameters();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:206:21: ( 'throws' qualifiedNameList )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==51) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ./src/spec.g3:206:22: 'throws' qualifiedNameList
                    {
                    match(input,51,FOLLOW_51_in_constructorDeclaratorRest1010); if (failed) return retval;
                    pushFollow(FOLLOW_qualifiedNameList_in_constructorDeclaratorRest1012);
                    qualifiedNameList();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_methodBody_in_constructorDeclaratorRest1016);
            methodBody();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 41, constructorDeclaratorRest_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end constructorDeclaratorRest

    public static class constantDeclarator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start constantDeclarator
    // ./src/spec.g3:209:1: constantDeclarator : Identifier constantDeclaratorRest ;
    public final constantDeclarator_return constantDeclarator() throws RecognitionException {
        constantDeclarator_return retval = new constantDeclarator_return();
        retval.start = input.LT(1);
        int constantDeclarator_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // ./src/spec.g3:210:2: ( Identifier constantDeclaratorRest )
            // ./src/spec.g3:210:4: Identifier constantDeclaratorRest
            {
            match(input,Identifier,FOLLOW_Identifier_in_constantDeclarator1027); if (failed) return retval;
            pushFollow(FOLLOW_constantDeclaratorRest_in_constantDeclarator1029);
            constantDeclaratorRest();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 42, constantDeclarator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end constantDeclarator

    public static class variableDeclarators_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start variableDeclarators
    // ./src/spec.g3:213:1: variableDeclarators : variableDeclarator ( ',' variableDeclarator )* ;
    public final variableDeclarators_return variableDeclarators() throws RecognitionException {
        variableDeclarators_return retval = new variableDeclarators_return();
        retval.start = input.LT(1);
        int variableDeclarators_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // ./src/spec.g3:214:2: ( variableDeclarator ( ',' variableDeclarator )* )
            // ./src/spec.g3:214:4: variableDeclarator ( ',' variableDeclarator )*
            {
            pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1041);
            variableDeclarator();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:214:23: ( ',' variableDeclarator )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==32) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ./src/spec.g3:214:24: ',' variableDeclarator
            	    {
            	    match(input,32,FOLLOW_32_in_variableDeclarators1044); if (failed) return retval;
            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1046);
            	    variableDeclarator();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 43, variableDeclarators_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end variableDeclarators

    public static class variableDeclarator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start variableDeclarator
    // ./src/spec.g3:217:1: variableDeclarator : Identifier variableDeclaratorRest ;
    public final variableDeclarator_return variableDeclarator() throws RecognitionException {
        variableDeclarator_return retval = new variableDeclarator_return();
        retval.start = input.LT(1);
        int variableDeclarator_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // ./src/spec.g3:218:2: ( Identifier variableDeclaratorRest )
            // ./src/spec.g3:218:4: Identifier variableDeclaratorRest
            {
            match(input,Identifier,FOLLOW_Identifier_in_variableDeclarator1059); if (failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorRest_in_variableDeclarator1061);
            variableDeclaratorRest();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 44, variableDeclarator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end variableDeclarator

    public static class variableDeclaratorRest_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start variableDeclaratorRest
    // ./src/spec.g3:221:1: variableDeclaratorRest : ( ( '[' ']' )+ ( '=' variableInitializer )? | '=' variableInitializer | );
    public final variableDeclaratorRest_return variableDeclaratorRest() throws RecognitionException {
        variableDeclaratorRest_return retval = new variableDeclaratorRest_return();
        retval.start = input.LT(1);
        int variableDeclaratorRest_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // ./src/spec.g3:222:2: ( ( '[' ']' )+ ( '=' variableInitializer )? | '=' variableInitializer | )
            int alt52=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt52=1;
                }
                break;
            case 52:
                {
                alt52=2;
                }
                break;
            case EOF:
            case 29:
            case 32:
                {
                alt52=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("221:1: variableDeclaratorRest : ( ( '[' ']' )+ ( '=' variableInitializer )? | '=' variableInitializer | );", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ./src/spec.g3:222:4: ( '[' ']' )+ ( '=' variableInitializer )?
                    {
                    // ./src/spec.g3:222:4: ( '[' ']' )+
                    int cnt50=0;
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==49) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ./src/spec.g3:222:5: '[' ']'
                    	    {
                    	    match(input,49,FOLLOW_49_in_variableDeclaratorRest1074); if (failed) return retval;
                    	    match(input,50,FOLLOW_50_in_variableDeclaratorRest1076); if (failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt50 >= 1 ) break loop50;
                    	    if (backtracking>0) {failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(50, input);
                                throw eee;
                        }
                        cnt50++;
                    } while (true);

                    // ./src/spec.g3:222:15: ( '=' variableInitializer )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==52) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // ./src/spec.g3:222:16: '=' variableInitializer
                            {
                            match(input,52,FOLLOW_52_in_variableDeclaratorRest1081); if (failed) return retval;
                            pushFollow(FOLLOW_variableInitializer_in_variableDeclaratorRest1083);
                            variableInitializer();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ./src/spec.g3:223:4: '=' variableInitializer
                    {
                    match(input,52,FOLLOW_52_in_variableDeclaratorRest1090); if (failed) return retval;
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclaratorRest1092);
                    variableInitializer();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 3 :
                    // ./src/spec.g3:225:2: 
                    {
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 45, variableDeclaratorRest_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end variableDeclaratorRest

    public static class constantDeclaratorsRest_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start constantDeclaratorsRest
    // ./src/spec.g3:227:1: constantDeclaratorsRest : constantDeclaratorRest ( ',' constantDeclarator )* ;
    public final constantDeclaratorsRest_return constantDeclaratorsRest() throws RecognitionException {
        constantDeclaratorsRest_return retval = new constantDeclaratorsRest_return();
        retval.start = input.LT(1);
        int constantDeclaratorsRest_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // ./src/spec.g3:228:5: ( constantDeclaratorRest ( ',' constantDeclarator )* )
            // ./src/spec.g3:228:9: constantDeclaratorRest ( ',' constantDeclarator )*
            {
            pushFollow(FOLLOW_constantDeclaratorRest_in_constantDeclaratorsRest1112);
            constantDeclaratorRest();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:228:32: ( ',' constantDeclarator )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==32) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ./src/spec.g3:228:33: ',' constantDeclarator
            	    {
            	    match(input,32,FOLLOW_32_in_constantDeclaratorsRest1115); if (failed) return retval;
            	    pushFollow(FOLLOW_constantDeclarator_in_constantDeclaratorsRest1117);
            	    constantDeclarator();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 46, constantDeclaratorsRest_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end constantDeclaratorsRest

    public static class constantDeclaratorRest_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start constantDeclaratorRest
    // ./src/spec.g3:231:1: constantDeclaratorRest : ( '[' ']' )* '=' variableInitializer ;
    public final constantDeclaratorRest_return constantDeclaratorRest() throws RecognitionException {
        constantDeclaratorRest_return retval = new constantDeclaratorRest_return();
        retval.start = input.LT(1);
        int constantDeclaratorRest_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // ./src/spec.g3:232:2: ( ( '[' ']' )* '=' variableInitializer )
            // ./src/spec.g3:232:4: ( '[' ']' )* '=' variableInitializer
            {
            // ./src/spec.g3:232:4: ( '[' ']' )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==49) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ./src/spec.g3:232:5: '[' ']'
            	    {
            	    match(input,49,FOLLOW_49_in_constantDeclaratorRest1134); if (failed) return retval;
            	    match(input,50,FOLLOW_50_in_constantDeclaratorRest1136); if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            match(input,52,FOLLOW_52_in_constantDeclaratorRest1140); if (failed) return retval;
            pushFollow(FOLLOW_variableInitializer_in_constantDeclaratorRest1142);
            variableInitializer();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 47, constantDeclaratorRest_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end constantDeclaratorRest

    public static class variableDeclaratorId_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start variableDeclaratorId
    // ./src/spec.g3:235:1: variableDeclaratorId : Identifier ( '[' ']' )* ;
    public final variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
        variableDeclaratorId_return retval = new variableDeclaratorId_return();
        retval.start = input.LT(1);
        int variableDeclaratorId_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // ./src/spec.g3:236:2: ( Identifier ( '[' ']' )* )
            // ./src/spec.g3:236:4: Identifier ( '[' ']' )*
            {
            match(input,Identifier,FOLLOW_Identifier_in_variableDeclaratorId1154); if (failed) return retval;
            // ./src/spec.g3:236:15: ( '[' ']' )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==49) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ./src/spec.g3:236:16: '[' ']'
            	    {
            	    match(input,49,FOLLOW_49_in_variableDeclaratorId1157); if (failed) return retval;
            	    match(input,50,FOLLOW_50_in_variableDeclaratorId1159); if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 48, variableDeclaratorId_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end variableDeclaratorId

    public static class variableInitializer_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start variableInitializer
    // ./src/spec.g3:239:1: variableInitializer : ( arrayInitializer | expression );
    public final variableInitializer_return variableInitializer() throws RecognitionException {
        variableInitializer_return retval = new variableInitializer_return();
        retval.start = input.LT(1);
        int variableInitializer_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // ./src/spec.g3:240:2: ( arrayInitializer | expression )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==37) ) {
                alt56=1;
            }
            else if ( (LA56_0==Identifier||(LA56_0>=FloatingPointLiteral && LA56_0<=DecimalLiteral)||LA56_0==31||LA56_0==43||LA56_0==48||(LA56_0>=63 && LA56_0<=70)||LA56_0==72||(LA56_0>=74 && LA56_0<=76)||(LA56_0>=111 && LA56_0<=112)||(LA56_0>=115 && LA56_0<=120)) ) {
                alt56=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("239:1: variableInitializer : ( arrayInitializer | expression );", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ./src/spec.g3:240:4: arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer1172);
                    arrayInitializer();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:241:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_variableInitializer1182);
                    expression();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 49, variableInitializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end variableInitializer

    public static class arrayInitializer_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start arrayInitializer
    // ./src/spec.g3:244:1: arrayInitializer : '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' ;
    public final arrayInitializer_return arrayInitializer() throws RecognitionException {
        arrayInitializer_return retval = new arrayInitializer_return();
        retval.start = input.LT(1);
        int arrayInitializer_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // ./src/spec.g3:245:2: ( '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' )
            // ./src/spec.g3:245:4: '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}'
            {
            match(input,37,FOLLOW_37_in_arrayInitializer1194); if (failed) return retval;
            // ./src/spec.g3:245:8: ( variableInitializer ( ',' variableInitializer )* ( ',' )? )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==Identifier||(LA59_0>=FloatingPointLiteral && LA59_0<=DecimalLiteral)||LA59_0==31||LA59_0==37||LA59_0==43||LA59_0==48||(LA59_0>=63 && LA59_0<=70)||LA59_0==72||(LA59_0>=74 && LA59_0<=76)||(LA59_0>=111 && LA59_0<=112)||(LA59_0>=115 && LA59_0<=120)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ./src/spec.g3:245:9: variableInitializer ( ',' variableInitializer )* ( ',' )?
                    {
                    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer1197);
                    variableInitializer();
                    _fsp--;
                    if (failed) return retval;
                    // ./src/spec.g3:245:29: ( ',' variableInitializer )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==32) ) {
                            int LA57_1 = input.LA(2);

                            if ( (LA57_1==Identifier||(LA57_1>=FloatingPointLiteral && LA57_1<=DecimalLiteral)||LA57_1==31||LA57_1==37||LA57_1==43||LA57_1==48||(LA57_1>=63 && LA57_1<=70)||LA57_1==72||(LA57_1>=74 && LA57_1<=76)||(LA57_1>=111 && LA57_1<=112)||(LA57_1>=115 && LA57_1<=120)) ) {
                                alt57=1;
                            }


                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ./src/spec.g3:245:30: ',' variableInitializer
                    	    {
                    	    match(input,32,FOLLOW_32_in_arrayInitializer1200); if (failed) return retval;
                    	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer1202);
                    	    variableInitializer();
                    	    _fsp--;
                    	    if (failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    // ./src/spec.g3:245:56: ( ',' )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==32) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // ./src/spec.g3:245:57: ','
                            {
                            match(input,32,FOLLOW_32_in_arrayInitializer1207); if (failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,38,FOLLOW_38_in_arrayInitializer1214); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 50, arrayInitializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end arrayInitializer

    public static class modifier_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start modifier
    // ./src/spec.g3:248:1: modifier : ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' );
    public final modifier_return modifier() throws RecognitionException {
        modifier_return retval = new modifier_return();
        retval.start = input.LT(1);
        int modifier_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // ./src/spec.g3:249:5: ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )
            int alt60=12;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt60=1;
                }
                break;
            case 53:
                {
                alt60=2;
                }
                break;
            case 54:
                {
                alt60=3;
                }
                break;
            case 55:
                {
                alt60=4;
                }
                break;
            case 26:
                {
                alt60=5;
                }
                break;
            case 56:
                {
                alt60=6;
                }
                break;
            case 57:
                {
                alt60=7;
                }
                break;
            case 58:
                {
                alt60=8;
                }
                break;
            case 59:
                {
                alt60=9;
                }
                break;
            case 60:
                {
                alt60=10;
                }
                break;
            case 61:
                {
                alt60=11;
                }
                break;
            case 62:
                {
                alt60=12;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("248:1: modifier : ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' );", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ./src/spec.g3:249:9: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_modifier1230);
                    annotation();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:250:9: 'public'
                    {
                    match(input,53,FOLLOW_53_in_modifier1240); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // ./src/spec.g3:251:9: 'protected'
                    {
                    match(input,54,FOLLOW_54_in_modifier1250); if (failed) return retval;

                    }
                    break;
                case 4 :
                    // ./src/spec.g3:252:9: 'private'
                    {
                    match(input,55,FOLLOW_55_in_modifier1260); if (failed) return retval;

                    }
                    break;
                case 5 :
                    // ./src/spec.g3:253:9: 'static'
                    {
                    match(input,26,FOLLOW_26_in_modifier1270); if (failed) return retval;

                    }
                    break;
                case 6 :
                    // ./src/spec.g3:254:9: 'abstract'
                    {
                    match(input,56,FOLLOW_56_in_modifier1280); if (failed) return retval;

                    }
                    break;
                case 7 :
                    // ./src/spec.g3:255:9: 'final'
                    {
                    match(input,57,FOLLOW_57_in_modifier1290); if (failed) return retval;

                    }
                    break;
                case 8 :
                    // ./src/spec.g3:256:9: 'native'
                    {
                    match(input,58,FOLLOW_58_in_modifier1300); if (failed) return retval;

                    }
                    break;
                case 9 :
                    // ./src/spec.g3:257:9: 'synchronized'
                    {
                    match(input,59,FOLLOW_59_in_modifier1310); if (failed) return retval;

                    }
                    break;
                case 10 :
                    // ./src/spec.g3:258:9: 'transient'
                    {
                    match(input,60,FOLLOW_60_in_modifier1320); if (failed) return retval;

                    }
                    break;
                case 11 :
                    // ./src/spec.g3:259:9: 'volatile'
                    {
                    match(input,61,FOLLOW_61_in_modifier1330); if (failed) return retval;

                    }
                    break;
                case 12 :
                    // ./src/spec.g3:260:9: 'strictfp'
                    {
                    match(input,62,FOLLOW_62_in_modifier1340); if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 51, modifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end modifier

    public static class packageOrTypeName_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start packageOrTypeName
    // ./src/spec.g3:263:1: packageOrTypeName : Identifier ( '.' Identifier )* ;
    public final packageOrTypeName_return packageOrTypeName() throws RecognitionException {
        packageOrTypeName_return retval = new packageOrTypeName_return();
        retval.start = input.LT(1);
        int packageOrTypeName_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // ./src/spec.g3:264:2: ( Identifier ( '.' Identifier )* )
            // ./src/spec.g3:264:4: Identifier ( '.' Identifier )*
            {
            match(input,Identifier,FOLLOW_Identifier_in_packageOrTypeName1354); if (failed) return retval;
            // ./src/spec.g3:264:15: ( '.' Identifier )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==27) ) {
                    int LA61_1 = input.LA(2);

                    if ( (LA61_1==Identifier) ) {
                        int LA61_2 = input.LA(3);

                        if ( (synpred77()) ) {
                            alt61=1;
                        }


                    }


                }


                switch (alt61) {
            	case 1 :
            	    // ./src/spec.g3:264:16: '.' Identifier
            	    {
            	    match(input,27,FOLLOW_27_in_packageOrTypeName1357); if (failed) return retval;
            	    match(input,Identifier,FOLLOW_Identifier_in_packageOrTypeName1359); if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 52, packageOrTypeName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end packageOrTypeName

    public static class enumConstantName_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start enumConstantName
    // ./src/spec.g3:267:1: enumConstantName : Identifier ;
    public final enumConstantName_return enumConstantName() throws RecognitionException {
        enumConstantName_return retval = new enumConstantName_return();
        retval.start = input.LT(1);
        int enumConstantName_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // ./src/spec.g3:268:5: ( Identifier )
            // ./src/spec.g3:268:9: Identifier
            {
            match(input,Identifier,FOLLOW_Identifier_in_enumConstantName1377); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 53, enumConstantName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end enumConstantName

    public static class typeName_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start typeName
    // ./src/spec.g3:271:1: typeName : ( Identifier | packageOrTypeName '.' Identifier );
    public final typeName_return typeName() throws RecognitionException {
        typeName_return retval = new typeName_return();
        retval.start = input.LT(1);
        int typeName_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // ./src/spec.g3:272:2: ( Identifier | packageOrTypeName '.' Identifier )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==Identifier) ) {
                int LA62_1 = input.LA(2);

                if ( (LA62_1==EOF||(LA62_1>=Identifier && LA62_1<=ENUM)||LA62_1==26||(LA62_1>=29 && LA62_1<=32)||(LA62_1>=38 && LA62_1<=39)||(LA62_1>=42 && LA62_1<=45)||(LA62_1>=47 && LA62_1<=48)||(LA62_1>=53 && LA62_1<=70)||LA62_1==77) ) {
                    alt62=1;
                }
                else if ( (LA62_1==27) ) {
                    alt62=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("271:1: typeName : ( Identifier | packageOrTypeName '.' Identifier );", 62, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("271:1: typeName : ( Identifier | packageOrTypeName '.' Identifier );", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ./src/spec.g3:272:6: Identifier
                    {
                    match(input,Identifier,FOLLOW_Identifier_in_typeName1393); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:273:9: packageOrTypeName '.' Identifier
                    {
                    pushFollow(FOLLOW_packageOrTypeName_in_typeName1403);
                    packageOrTypeName();
                    _fsp--;
                    if (failed) return retval;
                    match(input,27,FOLLOW_27_in_typeName1405); if (failed) return retval;
                    match(input,Identifier,FOLLOW_Identifier_in_typeName1407); if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 54, typeName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end typeName

    public static class type_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start type
    // ./src/spec.g3:276:1: type : ( Identifier ( typeArguments )? ( '.' Identifier ( typeArguments )? )* ( '[' ']' )* | primitiveType ( '[' ']' )* );
    public final type_return type() throws RecognitionException {
        type_return retval = new type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // ./src/spec.g3:277:2: ( Identifier ( typeArguments )? ( '.' Identifier ( typeArguments )? )* ( '[' ']' )* | primitiveType ( '[' ']' )* )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==Identifier) ) {
                alt68=1;
            }
            else if ( ((LA68_0>=63 && LA68_0<=70)) ) {
                alt68=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("276:1: type : ( Identifier ( typeArguments )? ( '.' Identifier ( typeArguments )? )* ( '[' ']' )* | primitiveType ( '[' ']' )* );", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ./src/spec.g3:277:4: Identifier ( typeArguments )? ( '.' Identifier ( typeArguments )? )* ( '[' ']' )*
                    {
                    match(input,Identifier,FOLLOW_Identifier_in_type1418); if (failed) return retval;
                    // ./src/spec.g3:277:15: ( typeArguments )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==31) ) {
                        int LA63_1 = input.LA(2);

                        if ( (LA63_1==Identifier||(LA63_1>=63 && LA63_1<=71)) ) {
                            alt63=1;
                        }
                    }
                    switch (alt63) {
                        case 1 :
                            // ./src/spec.g3:277:16: typeArguments
                            {
                            pushFollow(FOLLOW_typeArguments_in_type1421);
                            typeArguments();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }

                    // ./src/spec.g3:277:32: ( '.' Identifier ( typeArguments )? )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==27) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ./src/spec.g3:277:33: '.' Identifier ( typeArguments )?
                    	    {
                    	    match(input,27,FOLLOW_27_in_type1426); if (failed) return retval;
                    	    match(input,Identifier,FOLLOW_Identifier_in_type1428); if (failed) return retval;
                    	    // ./src/spec.g3:277:48: ( typeArguments )?
                    	    int alt64=2;
                    	    int LA64_0 = input.LA(1);

                    	    if ( (LA64_0==31) ) {
                    	        int LA64_1 = input.LA(2);

                    	        if ( (LA64_1==Identifier||(LA64_1>=63 && LA64_1<=71)) ) {
                    	            alt64=1;
                    	        }
                    	    }
                    	    switch (alt64) {
                    	        case 1 :
                    	            // ./src/spec.g3:277:49: typeArguments
                    	            {
                    	            pushFollow(FOLLOW_typeArguments_in_type1431);
                    	            typeArguments();
                    	            _fsp--;
                    	            if (failed) return retval;

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    // ./src/spec.g3:277:68: ( '[' ']' )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==49) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ./src/spec.g3:277:69: '[' ']'
                    	    {
                    	    match(input,49,FOLLOW_49_in_type1439); if (failed) return retval;
                    	    match(input,50,FOLLOW_50_in_type1441); if (failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ./src/spec.g3:278:4: primitiveType ( '[' ']' )*
                    {
                    pushFollow(FOLLOW_primitiveType_in_type1448);
                    primitiveType();
                    _fsp--;
                    if (failed) return retval;
                    // ./src/spec.g3:278:18: ( '[' ']' )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==49) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ./src/spec.g3:278:19: '[' ']'
                    	    {
                    	    match(input,49,FOLLOW_49_in_type1451); if (failed) return retval;
                    	    match(input,50,FOLLOW_50_in_type1453); if (failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 55, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end type

    public static class primitiveType_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start primitiveType
    // ./src/spec.g3:281:1: primitiveType : ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' );
    public final primitiveType_return primitiveType() throws RecognitionException {
        primitiveType_return retval = new primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // ./src/spec.g3:282:5: ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' )
            // ./src/spec.g3:
            {
            if ( (input.LA(1)>=63 && input.LA(1)<=70) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_primitiveType0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 56, primitiveType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end primitiveType

    public static class variableModifier_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start variableModifier
    // ./src/spec.g3:292:1: variableModifier : ( 'final' | annotation );
    public final variableModifier_return variableModifier() throws RecognitionException {
        variableModifier_return retval = new variableModifier_return();
        retval.start = input.LT(1);
        int variableModifier_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // ./src/spec.g3:293:2: ( 'final' | annotation )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==57) ) {
                alt69=1;
            }
            else if ( (LA69_0==77) ) {
                alt69=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("292:1: variableModifier : ( 'final' | annotation );", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ./src/spec.g3:293:4: 'final'
                    {
                    match(input,57,FOLLOW_57_in_variableModifier1541); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:294:9: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_variableModifier1551);
                    annotation();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 57, variableModifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end variableModifier

    public static class typeArguments_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start typeArguments
    // ./src/spec.g3:297:1: typeArguments : '<' typeArgument ( ',' typeArgument )* '>' ;
    public final typeArguments_return typeArguments() throws RecognitionException {
        typeArguments_return retval = new typeArguments_return();
        retval.start = input.LT(1);
        int typeArguments_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // ./src/spec.g3:298:2: ( '<' typeArgument ( ',' typeArgument )* '>' )
            // ./src/spec.g3:298:4: '<' typeArgument ( ',' typeArgument )* '>'
            {
            match(input,31,FOLLOW_31_in_typeArguments1562); if (failed) return retval;
            pushFollow(FOLLOW_typeArgument_in_typeArguments1564);
            typeArgument();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:298:21: ( ',' typeArgument )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==32) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ./src/spec.g3:298:22: ',' typeArgument
            	    {
            	    match(input,32,FOLLOW_32_in_typeArguments1567); if (failed) return retval;
            	    pushFollow(FOLLOW_typeArgument_in_typeArguments1569);
            	    typeArgument();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            match(input,33,FOLLOW_33_in_typeArguments1573); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 58, typeArguments_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end typeArguments

    public static class typeArgument_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start typeArgument
    // ./src/spec.g3:301:1: typeArgument : ( type | '?' ( ( 'extends' | 'super' ) type )? );
    public final typeArgument_return typeArgument() throws RecognitionException {
        typeArgument_return retval = new typeArgument_return();
        retval.start = input.LT(1);
        int typeArgument_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // ./src/spec.g3:302:2: ( type | '?' ( ( 'extends' | 'super' ) type )? )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==Identifier||(LA72_0>=63 && LA72_0<=70)) ) {
                alt72=1;
            }
            else if ( (LA72_0==71) ) {
                alt72=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("301:1: typeArgument : ( type | '?' ( ( 'extends' | 'super' ) type )? );", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ./src/spec.g3:302:4: type
                    {
                    pushFollow(FOLLOW_type_in_typeArgument1585);
                    type();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:303:4: '?' ( ( 'extends' | 'super' ) type )?
                    {
                    match(input,71,FOLLOW_71_in_typeArgument1590); if (failed) return retval;
                    // ./src/spec.g3:303:8: ( ( 'extends' | 'super' ) type )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==34||LA71_0==72) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // ./src/spec.g3:303:9: ( 'extends' | 'super' ) type
                            {
                            if ( input.LA(1)==34||input.LA(1)==72 ) {
                                input.consume();
                                errorRecovery=false;failed=false;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_typeArgument1593);    throw mse;
                            }

                            pushFollow(FOLLOW_type_in_typeArgument1601);
                            type();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 59, typeArgument_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end typeArgument

    public static class qualifiedNameList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start qualifiedNameList
    // ./src/spec.g3:306:1: qualifiedNameList : qualifiedName ( ',' qualifiedName )* ;
    public final qualifiedNameList_return qualifiedNameList() throws RecognitionException {
        qualifiedNameList_return retval = new qualifiedNameList_return();
        retval.start = input.LT(1);
        int qualifiedNameList_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // ./src/spec.g3:307:2: ( qualifiedName ( ',' qualifiedName )* )
            // ./src/spec.g3:307:4: qualifiedName ( ',' qualifiedName )*
            {
            pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList1615);
            qualifiedName();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:307:18: ( ',' qualifiedName )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==32) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ./src/spec.g3:307:19: ',' qualifiedName
            	    {
            	    match(input,32,FOLLOW_32_in_qualifiedNameList1618); if (failed) return retval;
            	    pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList1620);
            	    qualifiedName();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 60, qualifiedNameList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end qualifiedNameList

    public static class formalParameters_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start formalParameters
    // ./src/spec.g3:310:1: formalParameters : '(' ( formalParameterDecls )? ')' ;
    public final formalParameters_return formalParameters() throws RecognitionException {
        formalParameters_return retval = new formalParameters_return();
        retval.start = input.LT(1);
        int formalParameters_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // ./src/spec.g3:311:2: ( '(' ( formalParameterDecls )? ')' )
            // ./src/spec.g3:311:4: '(' ( formalParameterDecls )? ')'
            {
            match(input,43,FOLLOW_43_in_formalParameters1634); if (failed) return retval;
            // ./src/spec.g3:311:8: ( formalParameterDecls )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==Identifier||LA74_0==57||(LA74_0>=63 && LA74_0<=70)||LA74_0==77) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ./src/spec.g3:0:0: formalParameterDecls
                    {
                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameters1636);
                    formalParameterDecls();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            match(input,44,FOLLOW_44_in_formalParameters1639); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 61, formalParameters_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end formalParameters

    public static class formalParameterDecls_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start formalParameterDecls
    // ./src/spec.g3:314:1: formalParameterDecls : ( 'final' )? ( annotations )? type ( formalParameterDeclsRest )? ;
    public final formalParameterDecls_return formalParameterDecls() throws RecognitionException {
        formalParameterDecls_return retval = new formalParameterDecls_return();
        retval.start = input.LT(1);
        int formalParameterDecls_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // ./src/spec.g3:315:2: ( ( 'final' )? ( annotations )? type ( formalParameterDeclsRest )? )
            // ./src/spec.g3:315:4: ( 'final' )? ( annotations )? type ( formalParameterDeclsRest )?
            {
            // ./src/spec.g3:315:4: ( 'final' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==57) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ./src/spec.g3:0:0: 'final'
                    {
                    match(input,57,FOLLOW_57_in_formalParameterDecls1651); if (failed) return retval;

                    }
                    break;

            }

            // ./src/spec.g3:315:13: ( annotations )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==77) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ./src/spec.g3:0:0: annotations
                    {
                    pushFollow(FOLLOW_annotations_in_formalParameterDecls1654);
                    annotations();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_formalParameterDecls1657);
            type();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:315:31: ( formalParameterDeclsRest )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==Identifier||LA77_0==73) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ./src/spec.g3:0:0: formalParameterDeclsRest
                    {
                    pushFollow(FOLLOW_formalParameterDeclsRest_in_formalParameterDecls1659);
                    formalParameterDeclsRest();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 62, formalParameterDecls_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end formalParameterDecls

    public static class formalParameterDeclsRest_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start formalParameterDeclsRest
    // ./src/spec.g3:318:1: formalParameterDeclsRest : ( variableDeclaratorId ( ',' formalParameterDecls )? | '...' variableDeclaratorId );
    public final formalParameterDeclsRest_return formalParameterDeclsRest() throws RecognitionException {
        formalParameterDeclsRest_return retval = new formalParameterDeclsRest_return();
        retval.start = input.LT(1);
        int formalParameterDeclsRest_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // ./src/spec.g3:319:2: ( variableDeclaratorId ( ',' formalParameterDecls )? | '...' variableDeclaratorId )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==Identifier) ) {
                alt79=1;
            }
            else if ( (LA79_0==73) ) {
                alt79=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("318:1: formalParameterDeclsRest : ( variableDeclaratorId ( ',' formalParameterDecls )? | '...' variableDeclaratorId );", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ./src/spec.g3:319:4: variableDeclaratorId ( ',' formalParameterDecls )?
                    {
                    pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest1672);
                    variableDeclaratorId();
                    _fsp--;
                    if (failed) return retval;
                    // ./src/spec.g3:319:25: ( ',' formalParameterDecls )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==32) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // ./src/spec.g3:319:26: ',' formalParameterDecls
                            {
                            match(input,32,FOLLOW_32_in_formalParameterDeclsRest1675); if (failed) return retval;
                            pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDeclsRest1677);
                            formalParameterDecls();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ./src/spec.g3:320:6: '...' variableDeclaratorId
                    {
                    match(input,73,FOLLOW_73_in_formalParameterDeclsRest1686); if (failed) return retval;
                    pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest1688);
                    variableDeclaratorId();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 63, formalParameterDeclsRest_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end formalParameterDeclsRest

    public static class methodBody_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start methodBody
    // ./src/spec.g3:323:1: methodBody : block ;
    public final methodBody_return methodBody() throws RecognitionException {
        methodBody_return retval = new methodBody_return();
        retval.start = input.LT(1);
        int methodBody_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // ./src/spec.g3:324:2: ( block )
            // ./src/spec.g3:324:4: block
            {
            pushFollow(FOLLOW_block_in_methodBody1700);
            block();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 64, methodBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end methodBody

    public static class qualifiedName_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start qualifiedName
    // ./src/spec.g3:327:1: qualifiedName : Identifier ( '.' Identifier )* ;
    public final qualifiedName_return qualifiedName() throws RecognitionException {
        qualifiedName_return retval = new qualifiedName_return();
        retval.start = input.LT(1);
        int qualifiedName_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // ./src/spec.g3:328:2: ( Identifier ( '.' Identifier )* )
            // ./src/spec.g3:328:4: Identifier ( '.' Identifier )*
            {
            match(input,Identifier,FOLLOW_Identifier_in_qualifiedName1711); if (failed) return retval;
            // ./src/spec.g3:328:15: ( '.' Identifier )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==27) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ./src/spec.g3:328:16: '.' Identifier
            	    {
            	    match(input,27,FOLLOW_27_in_qualifiedName1714); if (failed) return retval;
            	    match(input,Identifier,FOLLOW_Identifier_in_qualifiedName1716); if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 65, qualifiedName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end qualifiedName

    public static class literal_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start literal
    // ./src/spec.g3:331:1: literal : ( integerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // ./src/spec.g3:332:2: ( integerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' )
            int alt81=6;
            switch ( input.LA(1) ) {
            case HexLiteral:
            case OctalLiteral:
            case DecimalLiteral:
                {
                alt81=1;
                }
                break;
            case FloatingPointLiteral:
                {
                alt81=2;
                }
                break;
            case CharacterLiteral:
                {
                alt81=3;
                }
                break;
            case StringLiteral:
                {
                alt81=4;
                }
                break;
            case 75:
            case 76:
                {
                alt81=5;
                }
                break;
            case 74:
                {
                alt81=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("331:1: literal : ( integerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' );", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ./src/spec.g3:332:6: integerLiteral
                    {
                    pushFollow(FOLLOW_integerLiteral_in_literal1733);
                    integerLiteral();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:333:9: FloatingPointLiteral
                    {
                    match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_literal1743); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // ./src/spec.g3:334:9: CharacterLiteral
                    {
                    match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_literal1753); if (failed) return retval;

                    }
                    break;
                case 4 :
                    // ./src/spec.g3:335:9: StringLiteral
                    {
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal1763); if (failed) return retval;

                    }
                    break;
                case 5 :
                    // ./src/spec.g3:336:9: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_literal1773);
                    booleanLiteral();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 6 :
                    // ./src/spec.g3:337:9: 'null'
                    {
                    match(input,74,FOLLOW_74_in_literal1783); if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 66, literal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end literal

    public static class integerLiteral_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start integerLiteral
    // ./src/spec.g3:340:1: integerLiteral : ( HexLiteral | OctalLiteral | DecimalLiteral );
    public final integerLiteral_return integerLiteral() throws RecognitionException {
        integerLiteral_return retval = new integerLiteral_return();
        retval.start = input.LT(1);
        int integerLiteral_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // ./src/spec.g3:341:5: ( HexLiteral | OctalLiteral | DecimalLiteral )
            // ./src/spec.g3:
            {
            if ( (input.LA(1)>=HexLiteral && input.LA(1)<=DecimalLiteral) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_integerLiteral0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 67, integerLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end integerLiteral

    public static class booleanLiteral_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start booleanLiteral
    // ./src/spec.g3:346:1: booleanLiteral : ( 'true' | 'false' );
    public final booleanLiteral_return booleanLiteral() throws RecognitionException {
        booleanLiteral_return retval = new booleanLiteral_return();
        retval.start = input.LT(1);
        int booleanLiteral_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // ./src/spec.g3:347:5: ( 'true' | 'false' )
            // ./src/spec.g3:
            {
            if ( (input.LA(1)>=75 && input.LA(1)<=76) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_booleanLiteral0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 68, booleanLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end booleanLiteral

    public static class annotations_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start annotations
    // ./src/spec.g3:353:1: annotations : ( annotation )+ ;
    public final annotations_return annotations() throws RecognitionException {
        annotations_return retval = new annotations_return();
        retval.start = input.LT(1);
        int annotations_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // ./src/spec.g3:354:2: ( ( annotation )+ )
            // ./src/spec.g3:354:4: ( annotation )+
            {
            // ./src/spec.g3:354:4: ( annotation )+
            int cnt82=0;
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==77) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ./src/spec.g3:0:0: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotations1864);
            	    annotation();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt82 >= 1 ) break loop82;
            	    if (backtracking>0) {failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(82, input);
                        throw eee;
                }
                cnt82++;
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 69, annotations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end annotations

    public static class annotation_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start annotation
    // ./src/spec.g3:357:1: annotation : '@' typeName ( '(' ( Identifier '=' )? elementValue ')' )? ;
    public final annotation_return annotation() throws RecognitionException {
        annotation_return retval = new annotation_return();
        retval.start = input.LT(1);
        int annotation_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // ./src/spec.g3:358:2: ( '@' typeName ( '(' ( Identifier '=' )? elementValue ')' )? )
            // ./src/spec.g3:358:4: '@' typeName ( '(' ( Identifier '=' )? elementValue ')' )?
            {
            match(input,77,FOLLOW_77_in_annotation1876); if (failed) return retval;
            pushFollow(FOLLOW_typeName_in_annotation1878);
            typeName();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:358:17: ( '(' ( Identifier '=' )? elementValue ')' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==43) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ./src/spec.g3:358:18: '(' ( Identifier '=' )? elementValue ')'
                    {
                    match(input,43,FOLLOW_43_in_annotation1881); if (failed) return retval;
                    // ./src/spec.g3:358:22: ( Identifier '=' )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==Identifier) ) {
                        int LA83_1 = input.LA(2);

                        if ( (LA83_1==52) ) {
                            alt83=1;
                        }
                    }
                    switch (alt83) {
                        case 1 :
                            // ./src/spec.g3:358:23: Identifier '='
                            {
                            match(input,Identifier,FOLLOW_Identifier_in_annotation1884); if (failed) return retval;
                            match(input,52,FOLLOW_52_in_annotation1886); if (failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_elementValue_in_annotation1890);
                    elementValue();
                    _fsp--;
                    if (failed) return retval;
                    match(input,44,FOLLOW_44_in_annotation1892); if (failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 70, annotation_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end annotation

    public static class elementValue_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start elementValue
    // ./src/spec.g3:361:1: elementValue : ( conditionalExpression | annotation | elementValueArrayInitializer );
    public final elementValue_return elementValue() throws RecognitionException {
        elementValue_return retval = new elementValue_return();
        retval.start = input.LT(1);
        int elementValue_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // ./src/spec.g3:362:2: ( conditionalExpression | annotation | elementValueArrayInitializer )
            int alt85=3;
            switch ( input.LA(1) ) {
            case Identifier:
            case FloatingPointLiteral:
            case CharacterLiteral:
            case StringLiteral:
            case HexLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case 31:
            case 43:
            case 48:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 72:
            case 74:
            case 75:
            case 76:
            case 111:
            case 112:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
                {
                alt85=1;
                }
                break;
            case 77:
                {
                alt85=2;
                }
                break;
            case 37:
                {
                alt85=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("361:1: elementValue : ( conditionalExpression | annotation | elementValueArrayInitializer );", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // ./src/spec.g3:362:4: conditionalExpression
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_elementValue1906);
                    conditionalExpression();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:363:6: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_elementValue1913);
                    annotation();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 3 :
                    // ./src/spec.g3:364:6: elementValueArrayInitializer
                    {
                    pushFollow(FOLLOW_elementValueArrayInitializer_in_elementValue1920);
                    elementValueArrayInitializer();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 71, elementValue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end elementValue

    public static class elementValueArrayInitializer_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start elementValueArrayInitializer
    // ./src/spec.g3:367:1: elementValueArrayInitializer : '{' ( elementValue )? ( ',' )? '}' ;
    public final elementValueArrayInitializer_return elementValueArrayInitializer() throws RecognitionException {
        elementValueArrayInitializer_return retval = new elementValueArrayInitializer_return();
        retval.start = input.LT(1);
        int elementValueArrayInitializer_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // ./src/spec.g3:368:2: ( '{' ( elementValue )? ( ',' )? '}' )
            // ./src/spec.g3:368:4: '{' ( elementValue )? ( ',' )? '}'
            {
            match(input,37,FOLLOW_37_in_elementValueArrayInitializer1932); if (failed) return retval;
            // ./src/spec.g3:368:8: ( elementValue )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==Identifier||(LA86_0>=FloatingPointLiteral && LA86_0<=DecimalLiteral)||LA86_0==31||LA86_0==37||LA86_0==43||LA86_0==48||(LA86_0>=63 && LA86_0<=70)||LA86_0==72||(LA86_0>=74 && LA86_0<=77)||(LA86_0>=111 && LA86_0<=112)||(LA86_0>=115 && LA86_0<=120)) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ./src/spec.g3:368:9: elementValue
                    {
                    pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer1935);
                    elementValue();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            // ./src/spec.g3:368:24: ( ',' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==32) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ./src/spec.g3:368:25: ','
                    {
                    match(input,32,FOLLOW_32_in_elementValueArrayInitializer1940); if (failed) return retval;

                    }
                    break;

            }

            match(input,38,FOLLOW_38_in_elementValueArrayInitializer1944); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 72, elementValueArrayInitializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end elementValueArrayInitializer

    public static class annotationTypeDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start annotationTypeDeclaration
    // ./src/spec.g3:371:1: annotationTypeDeclaration : '@' 'interface' Identifier annotationTypeBody ;
    public final annotationTypeDeclaration_return annotationTypeDeclaration() throws RecognitionException {
        annotationTypeDeclaration_return retval = new annotationTypeDeclaration_return();
        retval.start = input.LT(1);
        int annotationTypeDeclaration_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // ./src/spec.g3:372:2: ( '@' 'interface' Identifier annotationTypeBody )
            // ./src/spec.g3:372:4: '@' 'interface' Identifier annotationTypeBody
            {
            match(input,77,FOLLOW_77_in_annotationTypeDeclaration1956); if (failed) return retval;
            match(input,39,FOLLOW_39_in_annotationTypeDeclaration1958); if (failed) return retval;
            match(input,Identifier,FOLLOW_Identifier_in_annotationTypeDeclaration1960); if (failed) return retval;
            pushFollow(FOLLOW_annotationTypeBody_in_annotationTypeDeclaration1962);
            annotationTypeBody();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 73, annotationTypeDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end annotationTypeDeclaration

    public static class annotationTypeBody_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start annotationTypeBody
    // ./src/spec.g3:375:1: annotationTypeBody : '{' ( annotationTypeElementDeclarations )? '}' ;
    public final annotationTypeBody_return annotationTypeBody() throws RecognitionException {
        annotationTypeBody_return retval = new annotationTypeBody_return();
        retval.start = input.LT(1);
        int annotationTypeBody_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // ./src/spec.g3:376:2: ( '{' ( annotationTypeElementDeclarations )? '}' )
            // ./src/spec.g3:376:4: '{' ( annotationTypeElementDeclarations )? '}'
            {
            match(input,37,FOLLOW_37_in_annotationTypeBody1974); if (failed) return retval;
            // ./src/spec.g3:376:8: ( annotationTypeElementDeclarations )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( ((LA88_0>=Identifier && LA88_0<=ENUM)||LA88_0==26||LA88_0==30||LA88_0==39||(LA88_0>=53 && LA88_0<=70)||LA88_0==77) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ./src/spec.g3:376:9: annotationTypeElementDeclarations
                    {
                    pushFollow(FOLLOW_annotationTypeElementDeclarations_in_annotationTypeBody1977);
                    annotationTypeElementDeclarations();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            match(input,38,FOLLOW_38_in_annotationTypeBody1981); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 74, annotationTypeBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end annotationTypeBody

    public static class annotationTypeElementDeclarations_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start annotationTypeElementDeclarations
    // ./src/spec.g3:379:1: annotationTypeElementDeclarations : ( annotationTypeElementDeclaration ) ( annotationTypeElementDeclaration )* ;
    public final annotationTypeElementDeclarations_return annotationTypeElementDeclarations() throws RecognitionException {
        annotationTypeElementDeclarations_return retval = new annotationTypeElementDeclarations_return();
        retval.start = input.LT(1);
        int annotationTypeElementDeclarations_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // ./src/spec.g3:380:2: ( ( annotationTypeElementDeclaration ) ( annotationTypeElementDeclaration )* )
            // ./src/spec.g3:380:4: ( annotationTypeElementDeclaration ) ( annotationTypeElementDeclaration )*
            {
            // ./src/spec.g3:380:4: ( annotationTypeElementDeclaration )
            // ./src/spec.g3:380:5: annotationTypeElementDeclaration
            {
            pushFollow(FOLLOW_annotationTypeElementDeclaration_in_annotationTypeElementDeclarations1994);
            annotationTypeElementDeclaration();
            _fsp--;
            if (failed) return retval;

            }

            // ./src/spec.g3:380:39: ( annotationTypeElementDeclaration )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( ((LA89_0>=Identifier && LA89_0<=ENUM)||LA89_0==26||LA89_0==30||LA89_0==39||(LA89_0>=53 && LA89_0<=70)||LA89_0==77) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // ./src/spec.g3:380:40: annotationTypeElementDeclaration
            	    {
            	    pushFollow(FOLLOW_annotationTypeElementDeclaration_in_annotationTypeElementDeclarations1998);
            	    annotationTypeElementDeclaration();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 75, annotationTypeElementDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end annotationTypeElementDeclarations

    public static class annotationTypeElementDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start annotationTypeElementDeclaration
    // ./src/spec.g3:383:1: annotationTypeElementDeclaration : ( modifier )* annotationTypeElementRest ;
    public final annotationTypeElementDeclaration_return annotationTypeElementDeclaration() throws RecognitionException {
        annotationTypeElementDeclaration_return retval = new annotationTypeElementDeclaration_return();
        retval.start = input.LT(1);
        int annotationTypeElementDeclaration_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // ./src/spec.g3:384:2: ( ( modifier )* annotationTypeElementRest )
            // ./src/spec.g3:384:4: ( modifier )* annotationTypeElementRest
            {
            // ./src/spec.g3:384:4: ( modifier )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==77) ) {
                    int LA90_5 = input.LA(2);

                    if ( (LA90_5==Identifier) ) {
                        alt90=1;
                    }


                }
                else if ( (LA90_0==26||(LA90_0>=53 && LA90_0<=62)) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // ./src/spec.g3:384:5: modifier
            	    {
            	    pushFollow(FOLLOW_modifier_in_annotationTypeElementDeclaration2013);
            	    modifier();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);

            pushFollow(FOLLOW_annotationTypeElementRest_in_annotationTypeElementDeclaration2017);
            annotationTypeElementRest();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 76, annotationTypeElementDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end annotationTypeElementDeclaration

    public static class annotationTypeElementRest_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start annotationTypeElementRest
    // ./src/spec.g3:387:1: annotationTypeElementRest : ( type Identifier annotationMethodOrConstantRest ';' | classDeclaration | interfaceDeclaration | enumDeclaration | annotationTypeDeclaration );
    public final annotationTypeElementRest_return annotationTypeElementRest() throws RecognitionException {
        annotationTypeElementRest_return retval = new annotationTypeElementRest_return();
        retval.start = input.LT(1);
        int annotationTypeElementRest_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // ./src/spec.g3:388:2: ( type Identifier annotationMethodOrConstantRest ';' | classDeclaration | interfaceDeclaration | enumDeclaration | annotationTypeDeclaration )
            int alt91=5;
            switch ( input.LA(1) ) {
            case Identifier:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
                {
                alt91=1;
                }
                break;
            case 30:
                {
                alt91=2;
                }
                break;
            case 39:
                {
                alt91=3;
                }
                break;
            case 77:
                {
                int LA91_5 = input.LA(2);

                if ( (LA91_5==39) ) {
                    int LA91_7 = input.LA(3);

                    if ( (synpred125()) ) {
                        alt91=3;
                    }
                    else if ( (true) ) {
                        alt91=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("387:1: annotationTypeElementRest : ( type Identifier annotationMethodOrConstantRest ';' | classDeclaration | interfaceDeclaration | enumDeclaration | annotationTypeDeclaration );", 91, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("387:1: annotationTypeElementRest : ( type Identifier annotationMethodOrConstantRest ';' | classDeclaration | interfaceDeclaration | enumDeclaration | annotationTypeDeclaration );", 91, 5, input);

                    throw nvae;
                }
                }
                break;
            case ENUM:
                {
                alt91=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("387:1: annotationTypeElementRest : ( type Identifier annotationMethodOrConstantRest ';' | classDeclaration | interfaceDeclaration | enumDeclaration | annotationTypeDeclaration );", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // ./src/spec.g3:388:4: type Identifier annotationMethodOrConstantRest ';'
                    {
                    pushFollow(FOLLOW_type_in_annotationTypeElementRest2029);
                    type();
                    _fsp--;
                    if (failed) return retval;
                    match(input,Identifier,FOLLOW_Identifier_in_annotationTypeElementRest2031); if (failed) return retval;
                    pushFollow(FOLLOW_annotationMethodOrConstantRest_in_annotationTypeElementRest2033);
                    annotationMethodOrConstantRest();
                    _fsp--;
                    if (failed) return retval;
                    match(input,29,FOLLOW_29_in_annotationTypeElementRest2035); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:389:6: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_annotationTypeElementRest2042);
                    classDeclaration();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 3 :
                    // ./src/spec.g3:390:6: interfaceDeclaration
                    {
                    pushFollow(FOLLOW_interfaceDeclaration_in_annotationTypeElementRest2049);
                    interfaceDeclaration();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 4 :
                    // ./src/spec.g3:391:6: enumDeclaration
                    {
                    pushFollow(FOLLOW_enumDeclaration_in_annotationTypeElementRest2056);
                    enumDeclaration();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 5 :
                    // ./src/spec.g3:392:6: annotationTypeDeclaration
                    {
                    pushFollow(FOLLOW_annotationTypeDeclaration_in_annotationTypeElementRest2063);
                    annotationTypeDeclaration();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 77, annotationTypeElementRest_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end annotationTypeElementRest

    public static class annotationMethodOrConstantRest_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start annotationMethodOrConstantRest
    // ./src/spec.g3:395:1: annotationMethodOrConstantRest : ( annotationMethodRest | annotationConstantRest );
    public final annotationMethodOrConstantRest_return annotationMethodOrConstantRest() throws RecognitionException {
        annotationMethodOrConstantRest_return retval = new annotationMethodOrConstantRest_return();
        retval.start = input.LT(1);
        int annotationMethodOrConstantRest_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // ./src/spec.g3:396:2: ( annotationMethodRest | annotationConstantRest )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==43) ) {
                alt92=1;
            }
            else if ( (LA92_0==Identifier) ) {
                alt92=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("395:1: annotationMethodOrConstantRest : ( annotationMethodRest | annotationConstantRest );", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // ./src/spec.g3:396:4: annotationMethodRest
                    {
                    pushFollow(FOLLOW_annotationMethodRest_in_annotationMethodOrConstantRest2075);
                    annotationMethodRest();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:397:6: annotationConstantRest
                    {
                    pushFollow(FOLLOW_annotationConstantRest_in_annotationMethodOrConstantRest2082);
                    annotationConstantRest();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 78, annotationMethodOrConstantRest_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end annotationMethodOrConstantRest

    public static class annotationMethodRest_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start annotationMethodRest
    // ./src/spec.g3:400:1: annotationMethodRest : '(' ')' ( defaultValue )? ;
    public final annotationMethodRest_return annotationMethodRest() throws RecognitionException {
        annotationMethodRest_return retval = new annotationMethodRest_return();
        retval.start = input.LT(1);
        int annotationMethodRest_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // ./src/spec.g3:401:3: ( '(' ')' ( defaultValue )? )
            // ./src/spec.g3:401:5: '(' ')' ( defaultValue )?
            {
            match(input,43,FOLLOW_43_in_annotationMethodRest2095); if (failed) return retval;
            match(input,44,FOLLOW_44_in_annotationMethodRest2097); if (failed) return retval;
            // ./src/spec.g3:401:13: ( defaultValue )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==78) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ./src/spec.g3:401:14: defaultValue
                    {
                    pushFollow(FOLLOW_defaultValue_in_annotationMethodRest2100);
                    defaultValue();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 79, annotationMethodRest_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end annotationMethodRest

    public static class annotationConstantRest_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start annotationConstantRest
    // ./src/spec.g3:404:1: annotationConstantRest : variableDeclarators ;
    public final annotationConstantRest_return annotationConstantRest() throws RecognitionException {
        annotationConstantRest_return retval = new annotationConstantRest_return();
        retval.start = input.LT(1);
        int annotationConstantRest_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // ./src/spec.g3:405:3: ( variableDeclarators )
            // ./src/spec.g3:405:5: variableDeclarators
            {
            pushFollow(FOLLOW_variableDeclarators_in_annotationConstantRest2117);
            variableDeclarators();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 80, annotationConstantRest_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end annotationConstantRest

    public static class defaultValue_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start defaultValue
    // ./src/spec.g3:408:1: defaultValue : 'default' elementValue ;
    public final defaultValue_return defaultValue() throws RecognitionException {
        defaultValue_return retval = new defaultValue_return();
        retval.start = input.LT(1);
        int defaultValue_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // ./src/spec.g3:409:3: ( 'default' elementValue )
            // ./src/spec.g3:409:5: 'default' elementValue
            {
            match(input,78,FOLLOW_78_in_defaultValue2132); if (failed) return retval;
            pushFollow(FOLLOW_elementValue_in_defaultValue2134);
            elementValue();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 81, defaultValue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end defaultValue

    public static class adviceBody_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start adviceBody
    // ./src/spec.g3:414:1: adviceBody : '\\u0e43\\u0e2b\\u0e49\\u0e17\\u0e33' ( blockStatement )* '\\u0e08\\u0e1a' ;
    public final adviceBody_return adviceBody() throws RecognitionException {
        adviceBody_return retval = new adviceBody_return();
        retval.start = input.LT(1);
        int adviceBody_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // ./src/spec.g3:415:2: ( '\\u0e43\\u0e2b\\u0e49\\u0e17\\u0e33' ( blockStatement )* '\\u0e08\\u0e1a' )
            // ./src/spec.g3:415:4: '\\u0e43\\u0e2b\\u0e49\\u0e17\\u0e33' ( blockStatement )* '\\u0e08\\u0e1a'
            {
            match(input,79,FOLLOW_79_in_adviceBody2148); if (failed) return retval;
            // ./src/spec.g3:415:37: ( blockStatement )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==Identifier||(LA94_0>=FloatingPointLiteral && LA94_0<=DecimalLiteral)||LA94_0==26||(LA94_0>=29 && LA94_0<=31)||LA94_0==39||LA94_0==43||LA94_0==48||(LA94_0>=53 && LA94_0<=70)||LA94_0==72||(LA94_0>=74 && LA94_0<=77)||(LA94_0>=80 && LA94_0<=82)||(LA94_0>=84 && LA94_0<=87)||(LA94_0>=89 && LA94_0<=93)||(LA94_0>=111 && LA94_0<=112)||(LA94_0>=115 && LA94_0<=120)) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // ./src/spec.g3:0:0: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_adviceBody2150);
            	    blockStatement();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            match(input,41,FOLLOW_41_in_adviceBody2153); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 82, adviceBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end adviceBody

    public static class specBody_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start specBody
    // ./src/spec.g3:418:1: specBody : block ;
    public final specBody_return specBody() throws RecognitionException {
        specBody_return retval = new specBody_return();
        retval.start = input.LT(1);
        int specBody_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // ./src/spec.g3:419:2: ( block )
            // ./src/spec.g3:419:4: block
            {
            pushFollow(FOLLOW_block_in_specBody2164);
            block();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 83, specBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end specBody

    public static class block_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start block
    // ./src/spec.g3:422:1: block : '\\u0e42\\u0e14\\u0e22' ( blockStatement )* '\\u0e08\\u0e1a' ;
    public final block_return block() throws RecognitionException {
        block_return retval = new block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // ./src/spec.g3:423:2: ( '\\u0e42\\u0e14\\u0e22' ( blockStatement )* '\\u0e08\\u0e1a' )
            // ./src/spec.g3:423:4: '\\u0e42\\u0e14\\u0e22' ( blockStatement )* '\\u0e08\\u0e1a'
            {
            match(input,80,FOLLOW_80_in_block2175); if (failed) return retval;
            // ./src/spec.g3:423:25: ( blockStatement )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==Identifier||(LA95_0>=FloatingPointLiteral && LA95_0<=DecimalLiteral)||LA95_0==26||(LA95_0>=29 && LA95_0<=31)||LA95_0==39||LA95_0==43||LA95_0==48||(LA95_0>=53 && LA95_0<=70)||LA95_0==72||(LA95_0>=74 && LA95_0<=77)||(LA95_0>=80 && LA95_0<=82)||(LA95_0>=84 && LA95_0<=87)||(LA95_0>=89 && LA95_0<=93)||(LA95_0>=111 && LA95_0<=112)||(LA95_0>=115 && LA95_0<=120)) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // ./src/spec.g3:0:0: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_block2177);
            	    blockStatement();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);

            match(input,41,FOLLOW_41_in_block2180); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 84, block_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end block

    public static class blockStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start blockStatement
    // ./src/spec.g3:426:1: blockStatement : ( localVariableDeclaration | classOrInterfaceDeclaration | statement );
    public final blockStatement_return blockStatement() throws RecognitionException {
        blockStatement_return retval = new blockStatement_return();
        retval.start = input.LT(1);
        int blockStatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // ./src/spec.g3:427:2: ( localVariableDeclaration | classOrInterfaceDeclaration | statement )
            int alt96=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                int LA96_1 = input.LA(2);

                if ( (LA96_1==26||LA96_1==30||LA96_1==39||(LA96_1>=53 && LA96_1<=62)||LA96_1==77) ) {
                    alt96=2;
                }
                else if ( (LA96_1==Identifier||(LA96_1>=63 && LA96_1<=70)) ) {
                    alt96=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("426:1: blockStatement : ( localVariableDeclaration | classOrInterfaceDeclaration | statement );", 96, 1, input);

                    throw nvae;
                }
                }
                break;
            case Identifier:
                {
                switch ( input.LA(2) ) {
                case 28:
                case 29:
                case 33:
                case 35:
                case 43:
                case 46:
                case 52:
                case 71:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 115:
                case 116:
                    {
                    alt96=3;
                    }
                    break;
                case 27:
                    {
                    int LA96_65 = input.LA(3);

                    if ( (synpred131()) ) {
                        alt96=1;
                    }
                    else if ( (true) ) {
                        alt96=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("426:1: blockStatement : ( localVariableDeclaration | classOrInterfaceDeclaration | statement );", 96, 65, input);

                        throw nvae;
                    }
                    }
                    break;
                case 49:
                    {
                    int LA96_66 = input.LA(3);

                    if ( (synpred131()) ) {
                        alt96=1;
                    }
                    else if ( (true) ) {
                        alt96=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("426:1: blockStatement : ( localVariableDeclaration | classOrInterfaceDeclaration | statement );", 96, 66, input);

                        throw nvae;
                    }
                    }
                    break;
                case 31:
                    {
                    int LA96_71 = input.LA(3);

                    if ( (synpred131()) ) {
                        alt96=1;
                    }
                    else if ( (true) ) {
                        alt96=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("426:1: blockStatement : ( localVariableDeclaration | classOrInterfaceDeclaration | statement );", 96, 71, input);

                        throw nvae;
                    }
                    }
                    break;
                case Identifier:
                    {
                    alt96=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("426:1: blockStatement : ( localVariableDeclaration | classOrInterfaceDeclaration | statement );", 96, 2, input);

                    throw nvae;
                }

                }
                break;
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
                {
                switch ( input.LA(2) ) {
                case 49:
                    {
                    int LA96_92 = input.LA(3);

                    if ( (synpred131()) ) {
                        alt96=1;
                    }
                    else if ( (true) ) {
                        alt96=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("426:1: blockStatement : ( localVariableDeclaration | classOrInterfaceDeclaration | statement );", 96, 92, input);

                        throw nvae;
                    }
                    }
                    break;
                case 27:
                    {
                    alt96=3;
                    }
                    break;
                case Identifier:
                    {
                    alt96=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("426:1: blockStatement : ( localVariableDeclaration | classOrInterfaceDeclaration | statement );", 96, 3, input);

                    throw nvae;
                }

                }
                break;
            case 26:
            case 30:
            case 39:
            case 53:
            case 54:
            case 55:
            case 56:
            case 58:
            case 60:
            case 61:
            case 62:
            case 77:
                {
                alt96=2;
                }
                break;
            case 59:
                {
                int LA96_11 = input.LA(2);

                if ( (LA96_11==26||LA96_11==30||LA96_11==39||(LA96_11>=53 && LA96_11<=62)||LA96_11==77) ) {
                    alt96=2;
                }
                else if ( (LA96_11==43) ) {
                    alt96=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("426:1: blockStatement : ( localVariableDeclaration | classOrInterfaceDeclaration | statement );", 96, 11, input);

                    throw nvae;
                }
                }
                break;
            case FloatingPointLiteral:
            case CharacterLiteral:
            case StringLiteral:
            case HexLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case 29:
            case 31:
            case 43:
            case 48:
            case 72:
            case 74:
            case 75:
            case 76:
            case 80:
            case 81:
            case 82:
            case 84:
            case 85:
            case 86:
            case 87:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 111:
            case 112:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
                {
                alt96=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("426:1: blockStatement : ( localVariableDeclaration | classOrInterfaceDeclaration | statement );", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // ./src/spec.g3:427:4: localVariableDeclaration
                    {
                    pushFollow(FOLLOW_localVariableDeclaration_in_blockStatement2192);
                    localVariableDeclaration();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:428:9: classOrInterfaceDeclaration
                    {
                    pushFollow(FOLLOW_classOrInterfaceDeclaration_in_blockStatement2202);
                    classOrInterfaceDeclaration();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 3 :
                    // ./src/spec.g3:429:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement2212);
                    statement();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 85, blockStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end blockStatement

    public static class localVariableDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start localVariableDeclaration
    // ./src/spec.g3:432:1: localVariableDeclaration : ( 'final' )? type variableDeclarators ';' ;
    public final localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        localVariableDeclaration_return retval = new localVariableDeclaration_return();
        retval.start = input.LT(1);
        int localVariableDeclaration_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // ./src/spec.g3:433:2: ( ( 'final' )? type variableDeclarators ';' )
            // ./src/spec.g3:433:4: ( 'final' )? type variableDeclarators ';'
            {
            // ./src/spec.g3:433:4: ( 'final' )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==57) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ./src/spec.g3:433:5: 'final'
                    {
                    match(input,57,FOLLOW_57_in_localVariableDeclaration2225); if (failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_localVariableDeclaration2229);
            type();
            _fsp--;
            if (failed) return retval;
            pushFollow(FOLLOW_variableDeclarators_in_localVariableDeclaration2231);
            variableDeclarators();
            _fsp--;
            if (failed) return retval;
            match(input,29,FOLLOW_29_in_localVariableDeclaration2233); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 86, localVariableDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end localVariableDeclaration

    public static class statement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start statement
    // ./src/spec.g3:436:1: statement : ( block | 'assert' expression ( ':' expression )? ';' | 'if' parExpression statement ( 'else' statement )? | 'for' '(' forControl ')' statement | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | 'try' block ( catches 'finally' block | catches | 'finally' block ) | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' ( expression )? ';' | 'throw' expression ';' | 'break' ( Identifier )? ';' | 'continue' ( Identifier )? ';' | ';' | statementExpression ';' | Identifier ':' statement );
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // ./src/spec.g3:437:2: ( block | 'assert' expression ( ':' expression )? ';' | 'if' parExpression statement ( 'else' statement )? | 'for' '(' forControl ')' statement | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | 'try' block ( catches 'finally' block | catches | 'finally' block ) | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' ( expression )? ';' | 'throw' expression ';' | 'break' ( Identifier )? ';' | 'continue' ( Identifier )? ';' | ';' | statementExpression ';' | Identifier ':' statement )
            int alt104=16;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt104=1;
                }
                break;
            case 81:
                {
                alt104=2;
                }
                break;
            case 82:
                {
                alt104=3;
                }
                break;
            case 84:
                {
                alt104=4;
                }
                break;
            case 85:
                {
                alt104=5;
                }
                break;
            case 86:
                {
                alt104=6;
                }
                break;
            case 87:
                {
                alt104=7;
                }
                break;
            case 89:
                {
                alt104=8;
                }
                break;
            case 59:
                {
                alt104=9;
                }
                break;
            case 90:
                {
                alt104=10;
                }
                break;
            case 91:
                {
                alt104=11;
                }
                break;
            case 92:
                {
                alt104=12;
                }
                break;
            case 93:
                {
                alt104=13;
                }
                break;
            case 29:
                {
                alt104=14;
                }
                break;
            case FloatingPointLiteral:
            case CharacterLiteral:
            case StringLiteral:
            case HexLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case 31:
            case 43:
            case 48:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 72:
            case 74:
            case 75:
            case 76:
            case 111:
            case 112:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
                {
                alt104=15;
                }
                break;
            case Identifier:
                {
                int LA104_32 = input.LA(2);

                if ( (LA104_32==46) ) {
                    alt104=16;
                }
                else if ( ((LA104_32>=27 && LA104_32<=29)||LA104_32==31||LA104_32==33||LA104_32==35||LA104_32==43||LA104_32==49||LA104_32==52||LA104_32==71||(LA104_32>=96 && LA104_32<=116)) ) {
                    alt104=15;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("436:1: statement : ( block | 'assert' expression ( ':' expression )? ';' | 'if' parExpression statement ( 'else' statement )? | 'for' '(' forControl ')' statement | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | 'try' block ( catches 'finally' block | catches | 'finally' block ) | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' ( expression )? ';' | 'throw' expression ';' | 'break' ( Identifier )? ';' | 'continue' ( Identifier )? ';' | ';' | statementExpression ';' | Identifier ':' statement );", 104, 32, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("436:1: statement : ( block | 'assert' expression ( ':' expression )? ';' | 'if' parExpression statement ( 'else' statement )? | 'for' '(' forControl ')' statement | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | 'try' block ( catches 'finally' block | catches | 'finally' block ) | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' ( expression )? ';' | 'throw' expression ';' | 'break' ( Identifier )? ';' | 'continue' ( Identifier )? ';' | ';' | statementExpression ';' | Identifier ':' statement );", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // ./src/spec.g3:437:4: block
                    {
                    pushFollow(FOLLOW_block_in_statement2245);
                    block();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:438:7: 'assert' expression ( ':' expression )? ';'
                    {
                    match(input,81,FOLLOW_81_in_statement2253); if (failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement2255);
                    expression();
                    _fsp--;
                    if (failed) return retval;
                    // ./src/spec.g3:438:27: ( ':' expression )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==46) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // ./src/spec.g3:438:28: ':' expression
                            {
                            match(input,46,FOLLOW_46_in_statement2258); if (failed) return retval;
                            pushFollow(FOLLOW_expression_in_statement2260);
                            expression();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }

                    match(input,29,FOLLOW_29_in_statement2264); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // ./src/spec.g3:439:7: 'if' parExpression statement ( 'else' statement )?
                    {
                    match(input,82,FOLLOW_82_in_statement2272); if (failed) return retval;
                    pushFollow(FOLLOW_parExpression_in_statement2274);
                    parExpression();
                    _fsp--;
                    if (failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2276);
                    statement();
                    _fsp--;
                    if (failed) return retval;
                    // ./src/spec.g3:439:36: ( 'else' statement )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==83) ) {
                        int LA99_1 = input.LA(2);

                        if ( (synpred137()) ) {
                            alt99=1;
                        }
                    }
                    switch (alt99) {
                        case 1 :
                            // ./src/spec.g3:439:37: 'else' statement
                            {
                            match(input,83,FOLLOW_83_in_statement2279); if (failed) return retval;
                            pushFollow(FOLLOW_statement_in_statement2281);
                            statement();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // ./src/spec.g3:440:7: 'for' '(' forControl ')' statement
                    {
                    match(input,84,FOLLOW_84_in_statement2291); if (failed) return retval;
                    match(input,43,FOLLOW_43_in_statement2293); if (failed) return retval;
                    pushFollow(FOLLOW_forControl_in_statement2295);
                    forControl();
                    _fsp--;
                    if (failed) return retval;
                    match(input,44,FOLLOW_44_in_statement2297); if (failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2299);
                    statement();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 5 :
                    // ./src/spec.g3:441:7: 'while' parExpression statement
                    {
                    match(input,85,FOLLOW_85_in_statement2307); if (failed) return retval;
                    pushFollow(FOLLOW_parExpression_in_statement2309);
                    parExpression();
                    _fsp--;
                    if (failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2311);
                    statement();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 6 :
                    // ./src/spec.g3:442:7: 'do' statement 'while' parExpression ';'
                    {
                    match(input,86,FOLLOW_86_in_statement2319); if (failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2321);
                    statement();
                    _fsp--;
                    if (failed) return retval;
                    match(input,85,FOLLOW_85_in_statement2323); if (failed) return retval;
                    pushFollow(FOLLOW_parExpression_in_statement2325);
                    parExpression();
                    _fsp--;
                    if (failed) return retval;
                    match(input,29,FOLLOW_29_in_statement2327); if (failed) return retval;

                    }
                    break;
                case 7 :
                    // ./src/spec.g3:443:7: 'try' block ( catches 'finally' block | catches | 'finally' block )
                    {
                    match(input,87,FOLLOW_87_in_statement2335); if (failed) return retval;
                    pushFollow(FOLLOW_block_in_statement2337);
                    block();
                    _fsp--;
                    if (failed) return retval;
                    // ./src/spec.g3:444:7: ( catches 'finally' block | catches | 'finally' block )
                    int alt100=3;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==94) ) {
                        int LA100_1 = input.LA(2);

                        if ( (LA100_1==43) ) {
                            int LA100_3 = input.LA(3);

                            if ( (synpred142()) ) {
                                alt100=1;
                            }
                            else if ( (synpred143()) ) {
                                alt100=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("444:7: ( catches 'finally' block | catches | 'finally' block )", 100, 3, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("444:7: ( catches 'finally' block | catches | 'finally' block )", 100, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA100_0==88) ) {
                        alt100=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("444:7: ( catches 'finally' block | catches | 'finally' block )", 100, 0, input);

                        throw nvae;
                    }
                    switch (alt100) {
                        case 1 :
                            // ./src/spec.g3:444:9: catches 'finally' block
                            {
                            pushFollow(FOLLOW_catches_in_statement2347);
                            catches();
                            _fsp--;
                            if (failed) return retval;
                            match(input,88,FOLLOW_88_in_statement2349); if (failed) return retval;
                            pushFollow(FOLLOW_block_in_statement2351);
                            block();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;
                        case 2 :
                            // ./src/spec.g3:445:9: catches
                            {
                            pushFollow(FOLLOW_catches_in_statement2361);
                            catches();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;
                        case 3 :
                            // ./src/spec.g3:446:9: 'finally' block
                            {
                            match(input,88,FOLLOW_88_in_statement2371); if (failed) return retval;
                            pushFollow(FOLLOW_block_in_statement2373);
                            block();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // ./src/spec.g3:448:7: 'switch' parExpression '{' switchBlockStatementGroups '}'
                    {
                    match(input,89,FOLLOW_89_in_statement2389); if (failed) return retval;
                    pushFollow(FOLLOW_parExpression_in_statement2391);
                    parExpression();
                    _fsp--;
                    if (failed) return retval;
                    match(input,37,FOLLOW_37_in_statement2393); if (failed) return retval;
                    pushFollow(FOLLOW_switchBlockStatementGroups_in_statement2395);
                    switchBlockStatementGroups();
                    _fsp--;
                    if (failed) return retval;
                    match(input,38,FOLLOW_38_in_statement2397); if (failed) return retval;

                    }
                    break;
                case 9 :
                    // ./src/spec.g3:449:7: 'synchronized' parExpression block
                    {
                    match(input,59,FOLLOW_59_in_statement2405); if (failed) return retval;
                    pushFollow(FOLLOW_parExpression_in_statement2407);
                    parExpression();
                    _fsp--;
                    if (failed) return retval;
                    pushFollow(FOLLOW_block_in_statement2409);
                    block();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 10 :
                    // ./src/spec.g3:450:7: 'return' ( expression )? ';'
                    {
                    match(input,90,FOLLOW_90_in_statement2417); if (failed) return retval;
                    // ./src/spec.g3:450:16: ( expression )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==Identifier||(LA101_0>=FloatingPointLiteral && LA101_0<=DecimalLiteral)||LA101_0==31||LA101_0==43||LA101_0==48||(LA101_0>=63 && LA101_0<=70)||LA101_0==72||(LA101_0>=74 && LA101_0<=76)||(LA101_0>=111 && LA101_0<=112)||(LA101_0>=115 && LA101_0<=120)) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // ./src/spec.g3:0:0: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement2419);
                            expression();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }

                    match(input,29,FOLLOW_29_in_statement2422); if (failed) return retval;

                    }
                    break;
                case 11 :
                    // ./src/spec.g3:451:7: 'throw' expression ';'
                    {
                    match(input,91,FOLLOW_91_in_statement2430); if (failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement2432);
                    expression();
                    _fsp--;
                    if (failed) return retval;
                    match(input,29,FOLLOW_29_in_statement2434); if (failed) return retval;

                    }
                    break;
                case 12 :
                    // ./src/spec.g3:452:7: 'break' ( Identifier )? ';'
                    {
                    match(input,92,FOLLOW_92_in_statement2442); if (failed) return retval;
                    // ./src/spec.g3:452:15: ( Identifier )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==Identifier) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // ./src/spec.g3:0:0: Identifier
                            {
                            match(input,Identifier,FOLLOW_Identifier_in_statement2444); if (failed) return retval;

                            }
                            break;

                    }

                    match(input,29,FOLLOW_29_in_statement2447); if (failed) return retval;

                    }
                    break;
                case 13 :
                    // ./src/spec.g3:453:7: 'continue' ( Identifier )? ';'
                    {
                    match(input,93,FOLLOW_93_in_statement2455); if (failed) return retval;
                    // ./src/spec.g3:453:18: ( Identifier )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==Identifier) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // ./src/spec.g3:0:0: Identifier
                            {
                            match(input,Identifier,FOLLOW_Identifier_in_statement2457); if (failed) return retval;

                            }
                            break;

                    }

                    match(input,29,FOLLOW_29_in_statement2460); if (failed) return retval;

                    }
                    break;
                case 14 :
                    // ./src/spec.g3:454:7: ';'
                    {
                    match(input,29,FOLLOW_29_in_statement2468); if (failed) return retval;

                    }
                    break;
                case 15 :
                    // ./src/spec.g3:455:7: statementExpression ';'
                    {
                    pushFollow(FOLLOW_statementExpression_in_statement2476);
                    statementExpression();
                    _fsp--;
                    if (failed) return retval;
                    match(input,29,FOLLOW_29_in_statement2478); if (failed) return retval;

                    }
                    break;
                case 16 :
                    // ./src/spec.g3:456:7: Identifier ':' statement
                    {
                    match(input,Identifier,FOLLOW_Identifier_in_statement2486); if (failed) return retval;
                    match(input,46,FOLLOW_46_in_statement2488); if (failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2490);
                    statement();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 87, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end statement

    public static class catches_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start catches
    // ./src/spec.g3:459:1: catches : catchClause ( catchClause )* ;
    public final catches_return catches() throws RecognitionException {
        catches_return retval = new catches_return();
        retval.start = input.LT(1);
        int catches_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // ./src/spec.g3:460:2: ( catchClause ( catchClause )* )
            // ./src/spec.g3:460:4: catchClause ( catchClause )*
            {
            pushFollow(FOLLOW_catchClause_in_catches2502);
            catchClause();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:460:16: ( catchClause )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==94) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // ./src/spec.g3:460:17: catchClause
            	    {
            	    pushFollow(FOLLOW_catchClause_in_catches2505);
            	    catchClause();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 88, catches_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end catches

    public static class catchClause_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start catchClause
    // ./src/spec.g3:463:1: catchClause : 'catch' '(' formalParameter ')' block ;
    public final catchClause_return catchClause() throws RecognitionException {
        catchClause_return retval = new catchClause_return();
        retval.start = input.LT(1);
        int catchClause_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // ./src/spec.g3:464:2: ( 'catch' '(' formalParameter ')' block )
            // ./src/spec.g3:464:4: 'catch' '(' formalParameter ')' block
            {
            match(input,94,FOLLOW_94_in_catchClause2519); if (failed) return retval;
            match(input,43,FOLLOW_43_in_catchClause2521); if (failed) return retval;
            pushFollow(FOLLOW_formalParameter_in_catchClause2523);
            formalParameter();
            _fsp--;
            if (failed) return retval;
            match(input,44,FOLLOW_44_in_catchClause2525); if (failed) return retval;
            pushFollow(FOLLOW_block_in_catchClause2527);
            block();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 89, catchClause_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end catchClause

    public static class formalParameter_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start formalParameter
    // ./src/spec.g3:467:1: formalParameter : ( variableModifier )* type variableDeclaratorId ;
    public final formalParameter_return formalParameter() throws RecognitionException {
        formalParameter_return retval = new formalParameter_return();
        retval.start = input.LT(1);
        int formalParameter_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }
            // ./src/spec.g3:468:2: ( ( variableModifier )* type variableDeclaratorId )
            // ./src/spec.g3:468:4: ( variableModifier )* type variableDeclaratorId
            {
            // ./src/spec.g3:468:4: ( variableModifier )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==57||LA106_0==77) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // ./src/spec.g3:0:0: variableModifier
            	    {
            	    pushFollow(FOLLOW_variableModifier_in_formalParameter2538);
            	    variableModifier();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);

            pushFollow(FOLLOW_type_in_formalParameter2541);
            type();
            _fsp--;
            if (failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameter2543);
            variableDeclaratorId();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 90, formalParameter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end formalParameter

    public static class switchBlockStatementGroups_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start switchBlockStatementGroups
    // ./src/spec.g3:471:1: switchBlockStatementGroups : ( switchBlockStatementGroup )* ;
    public final switchBlockStatementGroups_return switchBlockStatementGroups() throws RecognitionException {
        switchBlockStatementGroups_return retval = new switchBlockStatementGroups_return();
        retval.start = input.LT(1);
        int switchBlockStatementGroups_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }
            // ./src/spec.g3:472:2: ( ( switchBlockStatementGroup )* )
            // ./src/spec.g3:472:4: ( switchBlockStatementGroup )*
            {
            // ./src/spec.g3:472:4: ( switchBlockStatementGroup )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==78||LA107_0==95) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // ./src/spec.g3:472:5: switchBlockStatementGroup
            	    {
            	    pushFollow(FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups2557);
            	    switchBlockStatementGroup();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 91, switchBlockStatementGroups_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end switchBlockStatementGroups

    public static class switchBlockStatementGroup_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start switchBlockStatementGroup
    // ./src/spec.g3:475:1: switchBlockStatementGroup : switchLabel ( blockStatement )* ;
    public final switchBlockStatementGroup_return switchBlockStatementGroup() throws RecognitionException {
        switchBlockStatementGroup_return retval = new switchBlockStatementGroup_return();
        retval.start = input.LT(1);
        int switchBlockStatementGroup_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }
            // ./src/spec.g3:476:2: ( switchLabel ( blockStatement )* )
            // ./src/spec.g3:476:4: switchLabel ( blockStatement )*
            {
            pushFollow(FOLLOW_switchLabel_in_switchBlockStatementGroup2571);
            switchLabel();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:476:16: ( blockStatement )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==Identifier||(LA108_0>=FloatingPointLiteral && LA108_0<=DecimalLiteral)||LA108_0==26||(LA108_0>=29 && LA108_0<=31)||LA108_0==39||LA108_0==43||LA108_0==48||(LA108_0>=53 && LA108_0<=70)||LA108_0==72||(LA108_0>=74 && LA108_0<=77)||(LA108_0>=80 && LA108_0<=82)||(LA108_0>=84 && LA108_0<=87)||(LA108_0>=89 && LA108_0<=93)||(LA108_0>=111 && LA108_0<=112)||(LA108_0>=115 && LA108_0<=120)) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // ./src/spec.g3:0:0: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_switchBlockStatementGroup2573);
            	    blockStatement();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop108;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 92, switchBlockStatementGroup_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end switchBlockStatementGroup

    public static class switchLabel_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start switchLabel
    // ./src/spec.g3:479:1: switchLabel : ( 'case' constantExpression ':' | 'case' enumConstantName ':' | 'default' ':' );
    public final switchLabel_return switchLabel() throws RecognitionException {
        switchLabel_return retval = new switchLabel_return();
        retval.start = input.LT(1);
        int switchLabel_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }
            // ./src/spec.g3:480:2: ( 'case' constantExpression ':' | 'case' enumConstantName ':' | 'default' ':' )
            int alt109=3;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==95) ) {
                int LA109_1 = input.LA(2);

                if ( ((LA109_1>=FloatingPointLiteral && LA109_1<=DecimalLiteral)||LA109_1==31||LA109_1==43||LA109_1==48||(LA109_1>=63 && LA109_1<=70)||LA109_1==72||(LA109_1>=74 && LA109_1<=76)||(LA109_1>=111 && LA109_1<=112)||(LA109_1>=115 && LA109_1<=120)) ) {
                    alt109=1;
                }
                else if ( (LA109_1==Identifier) ) {
                    int LA109_20 = input.LA(3);

                    if ( (synpred160()) ) {
                        alt109=1;
                    }
                    else if ( (synpred161()) ) {
                        alt109=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("479:1: switchLabel : ( 'case' constantExpression ':' | 'case' enumConstantName ':' | 'default' ':' );", 109, 20, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("479:1: switchLabel : ( 'case' constantExpression ':' | 'case' enumConstantName ':' | 'default' ':' );", 109, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA109_0==78) ) {
                alt109=3;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("479:1: switchLabel : ( 'case' constantExpression ':' | 'case' enumConstantName ':' | 'default' ':' );", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // ./src/spec.g3:480:4: 'case' constantExpression ':'
                    {
                    match(input,95,FOLLOW_95_in_switchLabel2586); if (failed) return retval;
                    pushFollow(FOLLOW_constantExpression_in_switchLabel2588);
                    constantExpression();
                    _fsp--;
                    if (failed) return retval;
                    match(input,46,FOLLOW_46_in_switchLabel2590); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:481:6: 'case' enumConstantName ':'
                    {
                    match(input,95,FOLLOW_95_in_switchLabel2597); if (failed) return retval;
                    pushFollow(FOLLOW_enumConstantName_in_switchLabel2599);
                    enumConstantName();
                    _fsp--;
                    if (failed) return retval;
                    match(input,46,FOLLOW_46_in_switchLabel2601); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // ./src/spec.g3:482:6: 'default' ':'
                    {
                    match(input,78,FOLLOW_78_in_switchLabel2608); if (failed) return retval;
                    match(input,46,FOLLOW_46_in_switchLabel2610); if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 93, switchLabel_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end switchLabel

    public static class moreStatementExpressions_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start moreStatementExpressions
    // ./src/spec.g3:485:1: moreStatementExpressions : ( ',' statementExpression )* ;
    public final moreStatementExpressions_return moreStatementExpressions() throws RecognitionException {
        moreStatementExpressions_return retval = new moreStatementExpressions_return();
        retval.start = input.LT(1);
        int moreStatementExpressions_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }
            // ./src/spec.g3:486:2: ( ( ',' statementExpression )* )
            // ./src/spec.g3:486:4: ( ',' statementExpression )*
            {
            // ./src/spec.g3:486:4: ( ',' statementExpression )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==32) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // ./src/spec.g3:486:5: ',' statementExpression
            	    {
            	    match(input,32,FOLLOW_32_in_moreStatementExpressions2623); if (failed) return retval;
            	    pushFollow(FOLLOW_statementExpression_in_moreStatementExpressions2625);
            	    statementExpression();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 94, moreStatementExpressions_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end moreStatementExpressions

    public static class forControl_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start forControl
    // ./src/spec.g3:489:1: forControl : ( forVarControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );
    public final forControl_return forControl() throws RecognitionException {
        forControl_return retval = new forControl_return();
        retval.start = input.LT(1);
        int forControl_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }
            // ./src/spec.g3:490:2: ( forVarControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? )
            int alt114=2;
            switch ( input.LA(1) ) {
            case 57:
                {
                switch ( input.LA(2) ) {
                case 77:
                    {
                    alt114=1;
                    }
                    break;
                case Identifier:
                    {
                    int LA114_25 = input.LA(3);

                    if ( (synpred163()) ) {
                        alt114=1;
                    }
                    else if ( (true) ) {
                        alt114=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("489:1: forControl : ( forVarControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );", 114, 25, input);

                        throw nvae;
                    }
                    }
                    break;
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                    {
                    int LA114_26 = input.LA(3);

                    if ( (synpred163()) ) {
                        alt114=1;
                    }
                    else if ( (true) ) {
                        alt114=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("489:1: forControl : ( forVarControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );", 114, 26, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("489:1: forControl : ( forVarControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );", 114, 1, input);

                    throw nvae;
                }

                }
                break;
            case 77:
                {
                alt114=1;
                }
                break;
            case Identifier:
                {
                switch ( input.LA(2) ) {
                case 31:
                    {
                    int LA114_27 = input.LA(3);

                    if ( (synpred163()) ) {
                        alt114=1;
                    }
                    else if ( (true) ) {
                        alt114=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("489:1: forControl : ( forVarControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );", 114, 27, input);

                        throw nvae;
                    }
                    }
                    break;
                case 27:
                    {
                    int LA114_28 = input.LA(3);

                    if ( (synpred163()) ) {
                        alt114=1;
                    }
                    else if ( (true) ) {
                        alt114=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("489:1: forControl : ( forVarControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );", 114, 28, input);

                        throw nvae;
                    }
                    }
                    break;
                case 49:
                    {
                    int LA114_29 = input.LA(3);

                    if ( (synpred163()) ) {
                        alt114=1;
                    }
                    else if ( (true) ) {
                        alt114=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("489:1: forControl : ( forVarControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );", 114, 29, input);

                        throw nvae;
                    }
                    }
                    break;
                case Identifier:
                    {
                    int LA114_30 = input.LA(3);

                    if ( (synpred163()) ) {
                        alt114=1;
                    }
                    else if ( (true) ) {
                        alt114=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("489:1: forControl : ( forVarControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );", 114, 30, input);

                        throw nvae;
                    }
                    }
                    break;
                case 28:
                case 29:
                case 32:
                case 33:
                case 35:
                case 43:
                case 52:
                case 71:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 115:
                case 116:
                    {
                    alt114=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("489:1: forControl : ( forVarControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );", 114, 3, input);

                    throw nvae;
                }

                }
                break;
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
                {
                switch ( input.LA(2) ) {
                case 49:
                    {
                    int LA114_55 = input.LA(3);

                    if ( (synpred163()) ) {
                        alt114=1;
                    }
                    else if ( (true) ) {
                        alt114=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("489:1: forControl : ( forVarControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );", 114, 55, input);

                        throw nvae;
                    }
                    }
                    break;
                case Identifier:
                    {
                    int LA114_56 = input.LA(3);

                    if ( (synpred163()) ) {
                        alt114=1;
                    }
                    else if ( (true) ) {
                        alt114=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("489:1: forControl : ( forVarControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );", 114, 56, input);

                        throw nvae;
                    }
                    }
                    break;
                case 27:
                    {
                    alt114=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("489:1: forControl : ( forVarControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );", 114, 4, input);

                    throw nvae;
                }

                }
                break;
            case FloatingPointLiteral:
            case CharacterLiteral:
            case StringLiteral:
            case HexLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case 29:
            case 31:
            case 43:
            case 48:
            case 72:
            case 74:
            case 75:
            case 76:
            case 111:
            case 112:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
                {
                alt114=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("489:1: forControl : ( forVarControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // ./src/spec.g3:490:4: forVarControl
                    {
                    pushFollow(FOLLOW_forVarControl_in_forControl2638);
                    forVarControl();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:491:6: ( forInit )? ';' ( expression )? ';' ( forUpdate )?
                    {
                    // ./src/spec.g3:491:6: ( forInit )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==Identifier||(LA111_0>=FloatingPointLiteral && LA111_0<=DecimalLiteral)||LA111_0==31||LA111_0==43||LA111_0==48||LA111_0==57||(LA111_0>=63 && LA111_0<=70)||LA111_0==72||(LA111_0>=74 && LA111_0<=76)||(LA111_0>=111 && LA111_0<=112)||(LA111_0>=115 && LA111_0<=120)) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // ./src/spec.g3:0:0: forInit
                            {
                            pushFollow(FOLLOW_forInit_in_forControl2645);
                            forInit();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }

                    match(input,29,FOLLOW_29_in_forControl2648); if (failed) return retval;
                    // ./src/spec.g3:491:19: ( expression )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==Identifier||(LA112_0>=FloatingPointLiteral && LA112_0<=DecimalLiteral)||LA112_0==31||LA112_0==43||LA112_0==48||(LA112_0>=63 && LA112_0<=70)||LA112_0==72||(LA112_0>=74 && LA112_0<=76)||(LA112_0>=111 && LA112_0<=112)||(LA112_0>=115 && LA112_0<=120)) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // ./src/spec.g3:0:0: expression
                            {
                            pushFollow(FOLLOW_expression_in_forControl2650);
                            expression();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }

                    match(input,29,FOLLOW_29_in_forControl2653); if (failed) return retval;
                    // ./src/spec.g3:491:35: ( forUpdate )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==Identifier||(LA113_0>=FloatingPointLiteral && LA113_0<=DecimalLiteral)||LA113_0==31||LA113_0==43||LA113_0==48||(LA113_0>=63 && LA113_0<=70)||LA113_0==72||(LA113_0>=74 && LA113_0<=76)||(LA113_0>=111 && LA113_0<=112)||(LA113_0>=115 && LA113_0<=120)) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // ./src/spec.g3:0:0: forUpdate
                            {
                            pushFollow(FOLLOW_forUpdate_in_forControl2655);
                            forUpdate();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 95, forControl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end forControl

    public static class forInit_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start forInit
    // ./src/spec.g3:494:1: forInit : ( ( 'final' )? type variableDeclarators | expressionList );
    public final forInit_return forInit() throws RecognitionException {
        forInit_return retval = new forInit_return();
        retval.start = input.LT(1);
        int forInit_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }
            // ./src/spec.g3:495:2: ( ( 'final' )? type variableDeclarators | expressionList )
            int alt116=2;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt116=1;
                }
                break;
            case Identifier:
                {
                switch ( input.LA(2) ) {
                case 31:
                    {
                    int LA116_22 = input.LA(3);

                    if ( (synpred168()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("494:1: forInit : ( ( 'final' )? type variableDeclarators | expressionList );", 116, 22, input);

                        throw nvae;
                    }
                    }
                    break;
                case 27:
                    {
                    int LA116_23 = input.LA(3);

                    if ( (synpred168()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("494:1: forInit : ( ( 'final' )? type variableDeclarators | expressionList );", 116, 23, input);

                        throw nvae;
                    }
                    }
                    break;
                case 49:
                    {
                    int LA116_24 = input.LA(3);

                    if ( (synpred168()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("494:1: forInit : ( ( 'final' )? type variableDeclarators | expressionList );", 116, 24, input);

                        throw nvae;
                    }
                    }
                    break;
                case Identifier:
                    {
                    alt116=1;
                    }
                    break;
                case EOF:
                case 28:
                case 29:
                case 32:
                case 33:
                case 35:
                case 43:
                case 52:
                case 71:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 115:
                case 116:
                    {
                    alt116=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("494:1: forInit : ( ( 'final' )? type variableDeclarators | expressionList );", 116, 2, input);

                    throw nvae;
                }

                }
                break;
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
                {
                switch ( input.LA(2) ) {
                case 49:
                    {
                    int LA116_51 = input.LA(3);

                    if ( (synpred168()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("494:1: forInit : ( ( 'final' )? type variableDeclarators | expressionList );", 116, 51, input);

                        throw nvae;
                    }
                    }
                    break;
                case Identifier:
                    {
                    alt116=1;
                    }
                    break;
                case 27:
                    {
                    alt116=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("494:1: forInit : ( ( 'final' )? type variableDeclarators | expressionList );", 116, 3, input);

                    throw nvae;
                }

                }
                break;
            case FloatingPointLiteral:
            case CharacterLiteral:
            case StringLiteral:
            case HexLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case 31:
            case 43:
            case 48:
            case 72:
            case 74:
            case 75:
            case 76:
            case 111:
            case 112:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
                {
                alt116=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("494:1: forInit : ( ( 'final' )? type variableDeclarators | expressionList );", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // ./src/spec.g3:495:4: ( 'final' )? type variableDeclarators
                    {
                    // ./src/spec.g3:495:4: ( 'final' )?
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==57) ) {
                        alt115=1;
                    }
                    switch (alt115) {
                        case 1 :
                            // ./src/spec.g3:0:0: 'final'
                            {
                            match(input,57,FOLLOW_57_in_forInit2667); if (failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_forInit2670);
                    type();
                    _fsp--;
                    if (failed) return retval;
                    pushFollow(FOLLOW_variableDeclarators_in_forInit2672);
                    variableDeclarators();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:496:9: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_forInit2682);
                    expressionList();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 96, forInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end forInit

    public static class forVarControl_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start forVarControl
    // ./src/spec.g3:499:1: forVarControl : ( 'final' )? ( annotation )? type Identifier forVarControlRest ;
    public final forVarControl_return forVarControl() throws RecognitionException {
        forVarControl_return retval = new forVarControl_return();
        retval.start = input.LT(1);
        int forVarControl_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }
            // ./src/spec.g3:500:2: ( ( 'final' )? ( annotation )? type Identifier forVarControlRest )
            // ./src/spec.g3:500:4: ( 'final' )? ( annotation )? type Identifier forVarControlRest
            {
            // ./src/spec.g3:500:4: ( 'final' )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==57) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // ./src/spec.g3:0:0: 'final'
                    {
                    match(input,57,FOLLOW_57_in_forVarControl2694); if (failed) return retval;

                    }
                    break;

            }

            // ./src/spec.g3:500:13: ( annotation )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==77) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // ./src/spec.g3:500:14: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_forVarControl2698);
                    annotation();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_forVarControl2702);
            type();
            _fsp--;
            if (failed) return retval;
            match(input,Identifier,FOLLOW_Identifier_in_forVarControl2704); if (failed) return retval;
            pushFollow(FOLLOW_forVarControlRest_in_forVarControl2706);
            forVarControlRest();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 97, forVarControl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end forVarControl

    public static class forVarControlRest_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start forVarControlRest
    // ./src/spec.g3:503:1: forVarControlRest : ( variableDeclaratorRest ( ',' variableDeclarator )* ';' ( expression )? ':' ( forUpdate )? | ':' expression );
    public final forVarControlRest_return forVarControlRest() throws RecognitionException {
        forVarControlRest_return retval = new forVarControlRest_return();
        retval.start = input.LT(1);
        int forVarControlRest_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }
            // ./src/spec.g3:504:2: ( variableDeclaratorRest ( ',' variableDeclarator )* ';' ( expression )? ':' ( forUpdate )? | ':' expression )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==29||LA122_0==32||LA122_0==49||LA122_0==52) ) {
                alt122=1;
            }
            else if ( (LA122_0==46) ) {
                alt122=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("503:1: forVarControlRest : ( variableDeclaratorRest ( ',' variableDeclarator )* ';' ( expression )? ':' ( forUpdate )? | ':' expression );", 122, 0, input);

                throw nvae;
            }
            switch (alt122) {
                case 1 :
                    // ./src/spec.g3:504:4: variableDeclaratorRest ( ',' variableDeclarator )* ';' ( expression )? ':' ( forUpdate )?
                    {
                    pushFollow(FOLLOW_variableDeclaratorRest_in_forVarControlRest2717);
                    variableDeclaratorRest();
                    _fsp--;
                    if (failed) return retval;
                    // ./src/spec.g3:504:27: ( ',' variableDeclarator )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==32) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // ./src/spec.g3:504:28: ',' variableDeclarator
                    	    {
                    	    match(input,32,FOLLOW_32_in_forVarControlRest2720); if (failed) return retval;
                    	    pushFollow(FOLLOW_variableDeclarator_in_forVarControlRest2722);
                    	    variableDeclarator();
                    	    _fsp--;
                    	    if (failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop119;
                        }
                    } while (true);

                    match(input,29,FOLLOW_29_in_forVarControlRest2726); if (failed) return retval;
                    // ./src/spec.g3:504:57: ( expression )?
                    int alt120=2;
                    int LA120_0 = input.LA(1);

                    if ( (LA120_0==Identifier||(LA120_0>=FloatingPointLiteral && LA120_0<=DecimalLiteral)||LA120_0==31||LA120_0==43||LA120_0==48||(LA120_0>=63 && LA120_0<=70)||LA120_0==72||(LA120_0>=74 && LA120_0<=76)||(LA120_0>=111 && LA120_0<=112)||(LA120_0>=115 && LA120_0<=120)) ) {
                        alt120=1;
                    }
                    switch (alt120) {
                        case 1 :
                            // ./src/spec.g3:0:0: expression
                            {
                            pushFollow(FOLLOW_expression_in_forVarControlRest2728);
                            expression();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }

                    match(input,46,FOLLOW_46_in_forVarControlRest2731); if (failed) return retval;
                    // ./src/spec.g3:504:73: ( forUpdate )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==Identifier||(LA121_0>=FloatingPointLiteral && LA121_0<=DecimalLiteral)||LA121_0==31||LA121_0==43||LA121_0==48||(LA121_0>=63 && LA121_0<=70)||LA121_0==72||(LA121_0>=74 && LA121_0<=76)||(LA121_0>=111 && LA121_0<=112)||(LA121_0>=115 && LA121_0<=120)) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // ./src/spec.g3:0:0: forUpdate
                            {
                            pushFollow(FOLLOW_forUpdate_in_forVarControlRest2733);
                            forUpdate();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ./src/spec.g3:505:9: ':' expression
                    {
                    match(input,46,FOLLOW_46_in_forVarControlRest2744); if (failed) return retval;
                    pushFollow(FOLLOW_expression_in_forVarControlRest2746);
                    expression();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 98, forVarControlRest_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end forVarControlRest

    public static class forUpdate_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start forUpdate
    // ./src/spec.g3:508:1: forUpdate : expressionList ;
    public final forUpdate_return forUpdate() throws RecognitionException {
        forUpdate_return retval = new forUpdate_return();
        retval.start = input.LT(1);
        int forUpdate_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }
            // ./src/spec.g3:509:2: ( expressionList )
            // ./src/spec.g3:509:4: expressionList
            {
            pushFollow(FOLLOW_expressionList_in_forUpdate2757);
            expressionList();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 99, forUpdate_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end forUpdate

    public static class parExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start parExpression
    // ./src/spec.g3:514:1: parExpression : '(' expression ')' ;
    public final parExpression_return parExpression() throws RecognitionException {
        parExpression_return retval = new parExpression_return();
        retval.start = input.LT(1);
        int parExpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }
            // ./src/spec.g3:515:2: ( '(' expression ')' )
            // ./src/spec.g3:515:4: '(' expression ')'
            {
            match(input,43,FOLLOW_43_in_parExpression2770); if (failed) return retval;
            pushFollow(FOLLOW_expression_in_parExpression2772);
            expression();
            _fsp--;
            if (failed) return retval;
            match(input,44,FOLLOW_44_in_parExpression2774); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 100, parExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end parExpression

    public static class expressionList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start expressionList
    // ./src/spec.g3:518:1: expressionList : expression ( ',' expression )* ;
    public final expressionList_return expressionList() throws RecognitionException {
        expressionList_return retval = new expressionList_return();
        retval.start = input.LT(1);
        int expressionList_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }
            // ./src/spec.g3:519:5: ( expression ( ',' expression )* )
            // ./src/spec.g3:519:9: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_expressionList2791);
            expression();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:519:20: ( ',' expression )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( (LA123_0==32) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // ./src/spec.g3:519:21: ',' expression
            	    {
            	    match(input,32,FOLLOW_32_in_expressionList2794); if (failed) return retval;
            	    pushFollow(FOLLOW_expression_in_expressionList2796);
            	    expression();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop123;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 101, expressionList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end expressionList

    public static class statementExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start statementExpression
    // ./src/spec.g3:522:1: statementExpression : expression ;
    public final statementExpression_return statementExpression() throws RecognitionException {
        statementExpression_return retval = new statementExpression_return();
        retval.start = input.LT(1);
        int statementExpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }
            // ./src/spec.g3:523:2: ( expression )
            // ./src/spec.g3:523:4: expression
            {
            pushFollow(FOLLOW_expression_in_statementExpression2812);
            expression();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 102, statementExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end statementExpression

    public static class constantExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start constantExpression
    // ./src/spec.g3:526:1: constantExpression : expression ;
    public final constantExpression_return constantExpression() throws RecognitionException {
        constantExpression_return retval = new constantExpression_return();
        retval.start = input.LT(1);
        int constantExpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }
            // ./src/spec.g3:527:2: ( expression )
            // ./src/spec.g3:527:4: expression
            {
            pushFollow(FOLLOW_expression_in_constantExpression2824);
            expression();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 103, constantExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end constantExpression

    public static class expression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start expression
    // ./src/spec.g3:530:1: expression : conditionalExpression ( assignmentOperator expression )? ;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }
            // ./src/spec.g3:531:2: ( conditionalExpression ( assignmentOperator expression )? )
            // ./src/spec.g3:531:4: conditionalExpression ( assignmentOperator expression )?
            {
            pushFollow(FOLLOW_conditionalExpression_in_expression2836);
            conditionalExpression();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:531:26: ( assignmentOperator expression )?
            int alt124=2;
            switch ( input.LA(1) ) {
                case 52:
                    {
                    int LA124_1 = input.LA(2);

                    if ( (synpred176()) ) {
                        alt124=1;
                    }
                    }
                    break;
                case 96:
                    {
                    int LA124_2 = input.LA(2);

                    if ( (synpred176()) ) {
                        alt124=1;
                    }
                    }
                    break;
                case 97:
                    {
                    int LA124_3 = input.LA(2);

                    if ( (synpred176()) ) {
                        alt124=1;
                    }
                    }
                    break;
                case 98:
                    {
                    int LA124_4 = input.LA(2);

                    if ( (synpred176()) ) {
                        alt124=1;
                    }
                    }
                    break;
                case 99:
                    {
                    int LA124_5 = input.LA(2);

                    if ( (synpred176()) ) {
                        alt124=1;
                    }
                    }
                    break;
                case 100:
                    {
                    int LA124_6 = input.LA(2);

                    if ( (synpred176()) ) {
                        alt124=1;
                    }
                    }
                    break;
                case 101:
                    {
                    int LA124_7 = input.LA(2);

                    if ( (synpred176()) ) {
                        alt124=1;
                    }
                    }
                    break;
                case 102:
                    {
                    int LA124_8 = input.LA(2);

                    if ( (synpred176()) ) {
                        alt124=1;
                    }
                    }
                    break;
                case 103:
                    {
                    int LA124_9 = input.LA(2);

                    if ( (synpred176()) ) {
                        alt124=1;
                    }
                    }
                    break;
                case 31:
                    {
                    int LA124_10 = input.LA(2);

                    if ( (synpred176()) ) {
                        alt124=1;
                    }
                    }
                    break;
                case 33:
                    {
                    int LA124_11 = input.LA(2);

                    if ( (synpred176()) ) {
                        alt124=1;
                    }
                    }
                    break;
            }

            switch (alt124) {
                case 1 :
                    // ./src/spec.g3:531:27: assignmentOperator expression
                    {
                    pushFollow(FOLLOW_assignmentOperator_in_expression2839);
                    assignmentOperator();
                    _fsp--;
                    if (failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression2841);
                    expression();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 104, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end expression

    public static class assignmentOperator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start assignmentOperator
    // ./src/spec.g3:534:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '<' '<' '=' | '>' '>' '=' | '>' '>' '>' '=' );
    public final assignmentOperator_return assignmentOperator() throws RecognitionException {
        assignmentOperator_return retval = new assignmentOperator_return();
        retval.start = input.LT(1);
        int assignmentOperator_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }
            // ./src/spec.g3:535:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '<' '<' '=' | '>' '>' '=' | '>' '>' '>' '=' )
            int alt125=12;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt125=1;
                }
                break;
            case 96:
                {
                alt125=2;
                }
                break;
            case 97:
                {
                alt125=3;
                }
                break;
            case 98:
                {
                alt125=4;
                }
                break;
            case 99:
                {
                alt125=5;
                }
                break;
            case 100:
                {
                alt125=6;
                }
                break;
            case 101:
                {
                alt125=7;
                }
                break;
            case 102:
                {
                alt125=8;
                }
                break;
            case 103:
                {
                alt125=9;
                }
                break;
            case 31:
                {
                alt125=10;
                }
                break;
            case 33:
                {
                int LA125_11 = input.LA(2);

                if ( (LA125_11==33) ) {
                    int LA125_12 = input.LA(3);

                    if ( (synpred187()) ) {
                        alt125=11;
                    }
                    else if ( (true) ) {
                        alt125=12;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("534:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '<' '<' '=' | '>' '>' '=' | '>' '>' '>' '=' );", 125, 12, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("534:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '<' '<' '=' | '>' '>' '=' | '>' '>' '>' '=' );", 125, 11, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("534:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '<' '<' '=' | '>' '>' '=' | '>' '>' '>' '=' );", 125, 0, input);

                throw nvae;
            }

            switch (alt125) {
                case 1 :
                    // ./src/spec.g3:535:4: '='
                    {
                    match(input,52,FOLLOW_52_in_assignmentOperator2855); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:536:9: '+='
                    {
                    match(input,96,FOLLOW_96_in_assignmentOperator2865); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // ./src/spec.g3:537:9: '-='
                    {
                    match(input,97,FOLLOW_97_in_assignmentOperator2875); if (failed) return retval;

                    }
                    break;
                case 4 :
                    // ./src/spec.g3:538:9: '*='
                    {
                    match(input,98,FOLLOW_98_in_assignmentOperator2885); if (failed) return retval;

                    }
                    break;
                case 5 :
                    // ./src/spec.g3:539:9: '/='
                    {
                    match(input,99,FOLLOW_99_in_assignmentOperator2895); if (failed) return retval;

                    }
                    break;
                case 6 :
                    // ./src/spec.g3:540:9: '&='
                    {
                    match(input,100,FOLLOW_100_in_assignmentOperator2905); if (failed) return retval;

                    }
                    break;
                case 7 :
                    // ./src/spec.g3:541:9: '|='
                    {
                    match(input,101,FOLLOW_101_in_assignmentOperator2915); if (failed) return retval;

                    }
                    break;
                case 8 :
                    // ./src/spec.g3:542:9: '^='
                    {
                    match(input,102,FOLLOW_102_in_assignmentOperator2925); if (failed) return retval;

                    }
                    break;
                case 9 :
                    // ./src/spec.g3:543:9: '%='
                    {
                    match(input,103,FOLLOW_103_in_assignmentOperator2935); if (failed) return retval;

                    }
                    break;
                case 10 :
                    // ./src/spec.g3:544:9: '<' '<' '='
                    {
                    match(input,31,FOLLOW_31_in_assignmentOperator2945); if (failed) return retval;
                    match(input,31,FOLLOW_31_in_assignmentOperator2947); if (failed) return retval;
                    match(input,52,FOLLOW_52_in_assignmentOperator2949); if (failed) return retval;

                    }
                    break;
                case 11 :
                    // ./src/spec.g3:545:9: '>' '>' '='
                    {
                    match(input,33,FOLLOW_33_in_assignmentOperator2959); if (failed) return retval;
                    match(input,33,FOLLOW_33_in_assignmentOperator2961); if (failed) return retval;
                    match(input,52,FOLLOW_52_in_assignmentOperator2963); if (failed) return retval;

                    }
                    break;
                case 12 :
                    // ./src/spec.g3:546:9: '>' '>' '>' '='
                    {
                    match(input,33,FOLLOW_33_in_assignmentOperator2973); if (failed) return retval;
                    match(input,33,FOLLOW_33_in_assignmentOperator2975); if (failed) return retval;
                    match(input,33,FOLLOW_33_in_assignmentOperator2977); if (failed) return retval;
                    match(input,52,FOLLOW_52_in_assignmentOperator2979); if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 105, assignmentOperator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end assignmentOperator

    public static class conditionalExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start conditionalExpression
    // ./src/spec.g3:549:1: conditionalExpression : conditionalOrExpression ( '?' expression ':' expression )? ;
    public final conditionalExpression_return conditionalExpression() throws RecognitionException {
        conditionalExpression_return retval = new conditionalExpression_return();
        retval.start = input.LT(1);
        int conditionalExpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }
            // ./src/spec.g3:550:5: ( conditionalOrExpression ( '?' expression ':' expression )? )
            // ./src/spec.g3:550:9: conditionalOrExpression ( '?' expression ':' expression )?
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression2995);
            conditionalOrExpression();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:550:33: ( '?' expression ':' expression )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==71) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // ./src/spec.g3:550:35: '?' expression ':' expression
                    {
                    match(input,71,FOLLOW_71_in_conditionalExpression2999); if (failed) return retval;
                    pushFollow(FOLLOW_expression_in_conditionalExpression3001);
                    expression();
                    _fsp--;
                    if (failed) return retval;
                    match(input,46,FOLLOW_46_in_conditionalExpression3003); if (failed) return retval;
                    pushFollow(FOLLOW_expression_in_conditionalExpression3005);
                    expression();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 106, conditionalExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end conditionalExpression

    public static class conditionalOrExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start conditionalOrExpression
    // ./src/spec.g3:553:1: conditionalOrExpression : conditionalAndExpression ( '||' conditionalAndExpression )* ;
    public final conditionalOrExpression_return conditionalOrExpression() throws RecognitionException {
        conditionalOrExpression_return retval = new conditionalOrExpression_return();
        retval.start = input.LT(1);
        int conditionalOrExpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }
            // ./src/spec.g3:554:5: ( conditionalAndExpression ( '||' conditionalAndExpression )* )
            // ./src/spec.g3:554:9: conditionalAndExpression ( '||' conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression3024);
            conditionalAndExpression();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:554:34: ( '||' conditionalAndExpression )*
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( (LA127_0==104) ) {
                    alt127=1;
                }


                switch (alt127) {
            	case 1 :
            	    // ./src/spec.g3:554:36: '||' conditionalAndExpression
            	    {
            	    match(input,104,FOLLOW_104_in_conditionalOrExpression3028); if (failed) return retval;
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression3030);
            	    conditionalAndExpression();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop127;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 107, conditionalOrExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end conditionalOrExpression

    public static class conditionalAndExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start conditionalAndExpression
    // ./src/spec.g3:557:1: conditionalAndExpression : inclusiveOrExpression ( '&&' inclusiveOrExpression )* ;
    public final conditionalAndExpression_return conditionalAndExpression() throws RecognitionException {
        conditionalAndExpression_return retval = new conditionalAndExpression_return();
        retval.start = input.LT(1);
        int conditionalAndExpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }
            // ./src/spec.g3:558:5: ( inclusiveOrExpression ( '&&' inclusiveOrExpression )* )
            // ./src/spec.g3:558:9: inclusiveOrExpression ( '&&' inclusiveOrExpression )*
            {
            pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression3049);
            inclusiveOrExpression();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:558:31: ( '&&' inclusiveOrExpression )*
            loop128:
            do {
                int alt128=2;
                int LA128_0 = input.LA(1);

                if ( (LA128_0==105) ) {
                    alt128=1;
                }


                switch (alt128) {
            	case 1 :
            	    // ./src/spec.g3:558:33: '&&' inclusiveOrExpression
            	    {
            	    match(input,105,FOLLOW_105_in_conditionalAndExpression3053); if (failed) return retval;
            	    pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression3055);
            	    inclusiveOrExpression();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop128;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 108, conditionalAndExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end conditionalAndExpression

    public static class inclusiveOrExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start inclusiveOrExpression
    // ./src/spec.g3:561:1: inclusiveOrExpression : exclusiveOrExpression ( '|' exclusiveOrExpression )* ;
    public final inclusiveOrExpression_return inclusiveOrExpression() throws RecognitionException {
        inclusiveOrExpression_return retval = new inclusiveOrExpression_return();
        retval.start = input.LT(1);
        int inclusiveOrExpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }
            // ./src/spec.g3:562:5: ( exclusiveOrExpression ( '|' exclusiveOrExpression )* )
            // ./src/spec.g3:562:9: exclusiveOrExpression ( '|' exclusiveOrExpression )*
            {
            pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression3074);
            exclusiveOrExpression();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:562:31: ( '|' exclusiveOrExpression )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==106) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // ./src/spec.g3:562:33: '|' exclusiveOrExpression
            	    {
            	    match(input,106,FOLLOW_106_in_inclusiveOrExpression3078); if (failed) return retval;
            	    pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression3080);
            	    exclusiveOrExpression();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 109, inclusiveOrExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end inclusiveOrExpression

    public static class exclusiveOrExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start exclusiveOrExpression
    // ./src/spec.g3:565:1: exclusiveOrExpression : andExpression ( '^' andExpression )* ;
    public final exclusiveOrExpression_return exclusiveOrExpression() throws RecognitionException {
        exclusiveOrExpression_return retval = new exclusiveOrExpression_return();
        retval.start = input.LT(1);
        int exclusiveOrExpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }
            // ./src/spec.g3:566:5: ( andExpression ( '^' andExpression )* )
            // ./src/spec.g3:566:9: andExpression ( '^' andExpression )*
            {
            pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression3099);
            andExpression();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:566:23: ( '^' andExpression )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==107) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // ./src/spec.g3:566:25: '^' andExpression
            	    {
            	    match(input,107,FOLLOW_107_in_exclusiveOrExpression3103); if (failed) return retval;
            	    pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression3105);
            	    andExpression();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop130;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 110, exclusiveOrExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end exclusiveOrExpression

    public static class andExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start andExpression
    // ./src/spec.g3:569:1: andExpression : equalityExpression ( '&' equalityExpression )* ;
    public final andExpression_return andExpression() throws RecognitionException {
        andExpression_return retval = new andExpression_return();
        retval.start = input.LT(1);
        int andExpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }
            // ./src/spec.g3:570:5: ( equalityExpression ( '&' equalityExpression )* )
            // ./src/spec.g3:570:9: equalityExpression ( '&' equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_andExpression3124);
            equalityExpression();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:570:28: ( '&' equalityExpression )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==35) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // ./src/spec.g3:570:30: '&' equalityExpression
            	    {
            	    match(input,35,FOLLOW_35_in_andExpression3128); if (failed) return retval;
            	    pushFollow(FOLLOW_equalityExpression_in_andExpression3130);
            	    equalityExpression();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop131;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 111, andExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end andExpression

    public static class equalityExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start equalityExpression
    // ./src/spec.g3:573:1: equalityExpression : instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);
        int equalityExpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }
            // ./src/spec.g3:574:5: ( instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* )
            // ./src/spec.g3:574:9: instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )*
            {
            pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression3149);
            instanceOfExpression();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:574:30: ( ( '==' | '!=' ) instanceOfExpression )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( ((LA132_0>=108 && LA132_0<=109)) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // ./src/spec.g3:574:32: ( '==' | '!=' ) instanceOfExpression
            	    {
            	    if ( (input.LA(1)>=108 && input.LA(1)<=109) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpression3153);    throw mse;
            	    }

            	    pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression3161);
            	    instanceOfExpression();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop132;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 112, equalityExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end equalityExpression

    public static class instanceOfExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start instanceOfExpression
    // ./src/spec.g3:577:1: instanceOfExpression : relationalExpression ( 'instanceof' type )? ;
    public final instanceOfExpression_return instanceOfExpression() throws RecognitionException {
        instanceOfExpression_return retval = new instanceOfExpression_return();
        retval.start = input.LT(1);
        int instanceOfExpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }
            // ./src/spec.g3:578:5: ( relationalExpression ( 'instanceof' type )? )
            // ./src/spec.g3:578:9: relationalExpression ( 'instanceof' type )?
            {
            pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression3180);
            relationalExpression();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:578:30: ( 'instanceof' type )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==110) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // ./src/spec.g3:578:31: 'instanceof' type
                    {
                    match(input,110,FOLLOW_110_in_instanceOfExpression3183); if (failed) return retval;
                    pushFollow(FOLLOW_type_in_instanceOfExpression3185);
                    type();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 113, instanceOfExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end instanceOfExpression

    public static class relationalExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start relationalExpression
    // ./src/spec.g3:581:1: relationalExpression : shiftExpression ( relationalOp shiftExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);
        int relationalExpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }
            // ./src/spec.g3:582:5: ( shiftExpression ( relationalOp shiftExpression )* )
            // ./src/spec.g3:582:9: shiftExpression ( relationalOp shiftExpression )*
            {
            pushFollow(FOLLOW_shiftExpression_in_relationalExpression3203);
            shiftExpression();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:582:25: ( relationalOp shiftExpression )*
            loop134:
            do {
                int alt134=2;
                int LA134_0 = input.LA(1);

                if ( (LA134_0==31) ) {
                    int LA134_23 = input.LA(2);

                    if ( (LA134_23==31) ) {
                        int LA134_27 = input.LA(3);

                        if ( (synpred197()) ) {
                            alt134=1;
                        }


                    }
                    else if ( (LA134_23==Identifier||(LA134_23>=FloatingPointLiteral && LA134_23<=DecimalLiteral)||LA134_23==43||LA134_23==48||LA134_23==52||(LA134_23>=63 && LA134_23<=70)||LA134_23==72||(LA134_23>=74 && LA134_23<=76)||(LA134_23>=111 && LA134_23<=112)||(LA134_23>=115 && LA134_23<=120)) ) {
                        alt134=1;
                    }


                }
                else if ( (LA134_0==33) ) {
                    int LA134_24 = input.LA(2);

                    if ( (LA134_24==Identifier||(LA134_24>=FloatingPointLiteral && LA134_24<=DecimalLiteral)||LA134_24==31||LA134_24==43||LA134_24==48||LA134_24==52||(LA134_24>=63 && LA134_24<=70)||LA134_24==72||(LA134_24>=74 && LA134_24<=76)||(LA134_24>=111 && LA134_24<=112)||(LA134_24>=115 && LA134_24<=120)) ) {
                        alt134=1;
                    }


                }


                switch (alt134) {
            	case 1 :
            	    // ./src/spec.g3:582:27: relationalOp shiftExpression
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_relationalExpression3207);
            	    relationalOp();
            	    _fsp--;
            	    if (failed) return retval;
            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression3209);
            	    shiftExpression();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop134;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 114, relationalExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end relationalExpression

    public static class relationalOp_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start relationalOp
    // ./src/spec.g3:585:1: relationalOp : ( '<' '=' | '>' '=' | '<' | '>' ) ;
    public final relationalOp_return relationalOp() throws RecognitionException {
        relationalOp_return retval = new relationalOp_return();
        retval.start = input.LT(1);
        int relationalOp_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }
            // ./src/spec.g3:586:2: ( ( '<' '=' | '>' '=' | '<' | '>' ) )
            // ./src/spec.g3:586:4: ( '<' '=' | '>' '=' | '<' | '>' )
            {
            // ./src/spec.g3:586:4: ( '<' '=' | '>' '=' | '<' | '>' )
            int alt135=4;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==31) ) {
                int LA135_1 = input.LA(2);

                if ( (LA135_1==52) ) {
                    alt135=1;
                }
                else if ( (LA135_1==Identifier||(LA135_1>=FloatingPointLiteral && LA135_1<=DecimalLiteral)||LA135_1==31||LA135_1==43||LA135_1==48||(LA135_1>=63 && LA135_1<=70)||LA135_1==72||(LA135_1>=74 && LA135_1<=76)||(LA135_1>=111 && LA135_1<=112)||(LA135_1>=115 && LA135_1<=120)) ) {
                    alt135=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("586:4: ( '<' '=' | '>' '=' | '<' | '>' )", 135, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA135_0==33) ) {
                int LA135_2 = input.LA(2);

                if ( (LA135_2==52) ) {
                    alt135=2;
                }
                else if ( (LA135_2==Identifier||(LA135_2>=FloatingPointLiteral && LA135_2<=DecimalLiteral)||LA135_2==31||LA135_2==43||LA135_2==48||(LA135_2>=63 && LA135_2<=70)||LA135_2==72||(LA135_2>=74 && LA135_2<=76)||(LA135_2>=111 && LA135_2<=112)||(LA135_2>=115 && LA135_2<=120)) ) {
                    alt135=4;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("586:4: ( '<' '=' | '>' '=' | '<' | '>' )", 135, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("586:4: ( '<' '=' | '>' '=' | '<' | '>' )", 135, 0, input);

                throw nvae;
            }
            switch (alt135) {
                case 1 :
                    // ./src/spec.g3:586:5: '<' '='
                    {
                    match(input,31,FOLLOW_31_in_relationalOp3225); if (failed) return retval;
                    match(input,52,FOLLOW_52_in_relationalOp3227); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:586:15: '>' '='
                    {
                    match(input,33,FOLLOW_33_in_relationalOp3231); if (failed) return retval;
                    match(input,52,FOLLOW_52_in_relationalOp3233); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // ./src/spec.g3:586:25: '<'
                    {
                    match(input,31,FOLLOW_31_in_relationalOp3237); if (failed) return retval;

                    }
                    break;
                case 4 :
                    // ./src/spec.g3:586:31: '>'
                    {
                    match(input,33,FOLLOW_33_in_relationalOp3241); if (failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 115, relationalOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end relationalOp

    public static class shiftExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start shiftExpression
    // ./src/spec.g3:589:1: shiftExpression : additiveExpression ( shiftOp additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);
        int shiftExpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }
            // ./src/spec.g3:590:5: ( additiveExpression ( shiftOp additiveExpression )* )
            // ./src/spec.g3:590:9: additiveExpression ( shiftOp additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_shiftExpression3258);
            additiveExpression();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:590:28: ( shiftOp additiveExpression )*
            loop136:
            do {
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( (LA136_0==31) ) {
                    int LA136_1 = input.LA(2);

                    if ( (LA136_1==31) ) {
                        int LA136_27 = input.LA(3);

                        if ( (synpred201()) ) {
                            alt136=1;
                        }


                    }


                }
                else if ( (LA136_0==33) ) {
                    int LA136_2 = input.LA(2);

                    if ( (LA136_2==33) ) {
                        int LA136_48 = input.LA(3);

                        if ( (synpred201()) ) {
                            alt136=1;
                        }


                    }


                }


                switch (alt136) {
            	case 1 :
            	    // ./src/spec.g3:590:30: shiftOp additiveExpression
            	    {
            	    pushFollow(FOLLOW_shiftOp_in_shiftExpression3262);
            	    shiftOp();
            	    _fsp--;
            	    if (failed) return retval;
            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression3264);
            	    additiveExpression();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop136;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 116, shiftExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end shiftExpression

    public static class shiftOp_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start shiftOp
    // ./src/spec.g3:594:1: shiftOp : ( '<' '<' | '>' '>' '>' | '>' '>' ) ;
    public final shiftOp_return shiftOp() throws RecognitionException {
        shiftOp_return retval = new shiftOp_return();
        retval.start = input.LT(1);
        int shiftOp_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }
            // ./src/spec.g3:595:2: ( ( '<' '<' | '>' '>' '>' | '>' '>' ) )
            // ./src/spec.g3:595:4: ( '<' '<' | '>' '>' '>' | '>' '>' )
            {
            // ./src/spec.g3:595:4: ( '<' '<' | '>' '>' '>' | '>' '>' )
            int alt137=3;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==31) ) {
                alt137=1;
            }
            else if ( (LA137_0==33) ) {
                int LA137_2 = input.LA(2);

                if ( (LA137_2==33) ) {
                    int LA137_3 = input.LA(3);

                    if ( (synpred203()) ) {
                        alt137=2;
                    }
                    else if ( (true) ) {
                        alt137=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("595:4: ( '<' '<' | '>' '>' '>' | '>' '>' )", 137, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("595:4: ( '<' '<' | '>' '>' '>' | '>' '>' )", 137, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("595:4: ( '<' '<' | '>' '>' '>' | '>' '>' )", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // ./src/spec.g3:595:5: '<' '<'
                    {
                    match(input,31,FOLLOW_31_in_shiftOp3288); if (failed) return retval;
                    match(input,31,FOLLOW_31_in_shiftOp3290); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:595:15: '>' '>' '>'
                    {
                    match(input,33,FOLLOW_33_in_shiftOp3294); if (failed) return retval;
                    match(input,33,FOLLOW_33_in_shiftOp3296); if (failed) return retval;
                    match(input,33,FOLLOW_33_in_shiftOp3298); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // ./src/spec.g3:595:29: '>' '>'
                    {
                    match(input,33,FOLLOW_33_in_shiftOp3302); if (failed) return retval;
                    match(input,33,FOLLOW_33_in_shiftOp3304); if (failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 117, shiftOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end shiftOp

    public static class additiveExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start additiveExpression
    // ./src/spec.g3:599:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);
        int additiveExpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 118) ) { return retval; }
            // ./src/spec.g3:600:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // ./src/spec.g3:600:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3322);
            multiplicativeExpression();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:600:34: ( ( '+' | '-' ) multiplicativeExpression )*
            loop138:
            do {
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( ((LA138_0>=111 && LA138_0<=112)) ) {
                    alt138=1;
                }


                switch (alt138) {
            	case 1 :
            	    // ./src/spec.g3:600:36: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    if ( (input.LA(1)>=111 && input.LA(1)<=112) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpression3326);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3334);
            	    multiplicativeExpression();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop138;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 118, additiveExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end additiveExpression

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start multiplicativeExpression
    // ./src/spec.g3:603:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);
        int multiplicativeExpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 119) ) { return retval; }
            // ./src/spec.g3:604:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            // ./src/spec.g3:604:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression3353);
            unaryExpression();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:604:25: ( ( '*' | '/' | '%' ) unaryExpression )*
            loop139:
            do {
                int alt139=2;
                int LA139_0 = input.LA(1);

                if ( (LA139_0==28||(LA139_0>=113 && LA139_0<=114)) ) {
                    alt139=1;
                }


                switch (alt139) {
            	case 1 :
            	    // ./src/spec.g3:604:27: ( '*' | '/' | '%' ) unaryExpression
            	    {
            	    if ( input.LA(1)==28||(input.LA(1)>=113 && input.LA(1)<=114) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpression3357);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression3371);
            	    unaryExpression();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop139;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 119, multiplicativeExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end multiplicativeExpression

    public static class unaryExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start unaryExpression
    // ./src/spec.g3:607:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' primary | '--' primary | unaryExpressionNotPlusMinus );
    public final unaryExpression_return unaryExpression() throws RecognitionException {
        unaryExpression_return retval = new unaryExpression_return();
        retval.start = input.LT(1);
        int unaryExpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 120) ) { return retval; }
            // ./src/spec.g3:608:5: ( '+' unaryExpression | '-' unaryExpression | '++' primary | '--' primary | unaryExpressionNotPlusMinus )
            int alt140=5;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt140=1;
                }
                break;
            case 112:
                {
                alt140=2;
                }
                break;
            case 115:
                {
                alt140=3;
                }
                break;
            case 116:
                {
                alt140=4;
                }
                break;
            case Identifier:
            case FloatingPointLiteral:
            case CharacterLiteral:
            case StringLiteral:
            case HexLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case 31:
            case 43:
            case 48:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 72:
            case 74:
            case 75:
            case 76:
            case 117:
            case 118:
            case 119:
            case 120:
                {
                alt140=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("607:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' primary | '--' primary | unaryExpressionNotPlusMinus );", 140, 0, input);

                throw nvae;
            }

            switch (alt140) {
                case 1 :
                    // ./src/spec.g3:608:9: '+' unaryExpression
                    {
                    match(input,111,FOLLOW_111_in_unaryExpression3391); if (failed) return retval;
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression3393);
                    unaryExpression();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:609:7: '-' unaryExpression
                    {
                    match(input,112,FOLLOW_112_in_unaryExpression3401); if (failed) return retval;
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression3403);
                    unaryExpression();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 3 :
                    // ./src/spec.g3:610:9: '++' primary
                    {
                    match(input,115,FOLLOW_115_in_unaryExpression3413); if (failed) return retval;
                    pushFollow(FOLLOW_primary_in_unaryExpression3415);
                    primary();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 4 :
                    // ./src/spec.g3:611:9: '--' primary
                    {
                    match(input,116,FOLLOW_116_in_unaryExpression3425); if (failed) return retval;
                    pushFollow(FOLLOW_primary_in_unaryExpression3427);
                    primary();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 5 :
                    // ./src/spec.g3:612:9: unaryExpressionNotPlusMinus
                    {
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression3437);
                    unaryExpressionNotPlusMinus();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 120, unaryExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end unaryExpression

    public static class unaryExpressionNotPlusMinus_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start unaryExpressionNotPlusMinus
    // ./src/spec.g3:615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );
    public final unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
        unaryExpressionNotPlusMinus_return retval = new unaryExpressionNotPlusMinus_return();
        retval.start = input.LT(1);
        int unaryExpressionNotPlusMinus_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 121) ) { return retval; }
            // ./src/spec.g3:616:5: ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? )
            int alt143=4;
            switch ( input.LA(1) ) {
            case 117:
                {
                alt143=1;
                }
                break;
            case 118:
                {
                alt143=2;
                }
                break;
            case 43:
                {
                switch ( input.LA(2) ) {
                case 111:
                    {
                    int LA143_17 = input.LA(3);

                    if ( (synpred215()) ) {
                        alt143=3;
                    }
                    else if ( (true) ) {
                        alt143=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );", 143, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case 112:
                    {
                    int LA143_18 = input.LA(3);

                    if ( (synpred215()) ) {
                        alt143=3;
                    }
                    else if ( (true) ) {
                        alt143=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );", 143, 18, input);

                        throw nvae;
                    }
                    }
                    break;
                case 115:
                    {
                    int LA143_19 = input.LA(3);

                    if ( (synpred215()) ) {
                        alt143=3;
                    }
                    else if ( (true) ) {
                        alt143=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );", 143, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case 116:
                    {
                    int LA143_20 = input.LA(3);

                    if ( (synpred215()) ) {
                        alt143=3;
                    }
                    else if ( (true) ) {
                        alt143=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );", 143, 20, input);

                        throw nvae;
                    }
                    }
                    break;
                case 117:
                    {
                    int LA143_21 = input.LA(3);

                    if ( (synpred215()) ) {
                        alt143=3;
                    }
                    else if ( (true) ) {
                        alt143=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );", 143, 21, input);

                        throw nvae;
                    }
                    }
                    break;
                case 118:
                    {
                    int LA143_22 = input.LA(3);

                    if ( (synpred215()) ) {
                        alt143=3;
                    }
                    else if ( (true) ) {
                        alt143=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );", 143, 22, input);

                        throw nvae;
                    }
                    }
                    break;
                case 43:
                    {
                    int LA143_23 = input.LA(3);

                    if ( (synpred215()) ) {
                        alt143=3;
                    }
                    else if ( (true) ) {
                        alt143=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );", 143, 23, input);

                        throw nvae;
                    }
                    }
                    break;
                case 31:
                    {
                    int LA143_24 = input.LA(3);

                    if ( (synpred215()) ) {
                        alt143=3;
                    }
                    else if ( (true) ) {
                        alt143=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );", 143, 24, input);

                        throw nvae;
                    }
                    }
                    break;
                case 119:
                    {
                    int LA143_25 = input.LA(3);

                    if ( (synpred215()) ) {
                        alt143=3;
                    }
                    else if ( (true) ) {
                        alt143=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );", 143, 25, input);

                        throw nvae;
                    }
                    }
                    break;
                case 72:
                    {
                    int LA143_26 = input.LA(3);

                    if ( (synpred215()) ) {
                        alt143=3;
                    }
                    else if ( (true) ) {
                        alt143=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );", 143, 26, input);

                        throw nvae;
                    }
                    }
                    break;
                case HexLiteral:
                case OctalLiteral:
                case DecimalLiteral:
                    {
                    int LA143_27 = input.LA(3);

                    if ( (synpred215()) ) {
                        alt143=3;
                    }
                    else if ( (true) ) {
                        alt143=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );", 143, 27, input);

                        throw nvae;
                    }
                    }
                    break;
                case FloatingPointLiteral:
                    {
                    int LA143_28 = input.LA(3);

                    if ( (synpred215()) ) {
                        alt143=3;
                    }
                    else if ( (true) ) {
                        alt143=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );", 143, 28, input);

                        throw nvae;
                    }
                    }
                    break;
                case CharacterLiteral:
                    {
                    int LA143_29 = input.LA(3);

                    if ( (synpred215()) ) {
                        alt143=3;
                    }
                    else if ( (true) ) {
                        alt143=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );", 143, 29, input);

                        throw nvae;
                    }
                    }
                    break;
                case StringLiteral:
                    {
                    int LA143_30 = input.LA(3);

                    if ( (synpred215()) ) {
                        alt143=3;
                    }
                    else if ( (true) ) {
                        alt143=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );", 143, 30, input);

                        throw nvae;
                    }
                    }
                    break;
                case 75:
                case 76:
                    {
                    int LA143_31 = input.LA(3);

                    if ( (synpred215()) ) {
                        alt143=3;
                    }
                    else if ( (true) ) {
                        alt143=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );", 143, 31, input);

                        throw nvae;
                    }
                    }
                    break;
                case 74:
                    {
                    int LA143_32 = input.LA(3);

                    if ( (synpred215()) ) {
                        alt143=3;
                    }
                    else if ( (true) ) {
                        alt143=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );", 143, 32, input);

                        throw nvae;
                    }
                    }
                    break;
                case 120:
                    {
                    int LA143_33 = input.LA(3);

                    if ( (synpred215()) ) {
                        alt143=3;
                    }
                    else if ( (true) ) {
                        alt143=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );", 143, 33, input);

                        throw nvae;
                    }
                    }
                    break;
                case Identifier:
                    {
                    int LA143_34 = input.LA(3);

                    if ( (synpred215()) ) {
                        alt143=3;
                    }
                    else if ( (true) ) {
                        alt143=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );", 143, 34, input);

                        throw nvae;
                    }
                    }
                    break;
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                    {
                    int LA143_35 = input.LA(3);

                    if ( (synpred215()) ) {
                        alt143=3;
                    }
                    else if ( (true) ) {
                        alt143=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );", 143, 35, input);

                        throw nvae;
                    }
                    }
                    break;
                case 48:
                    {
                    int LA143_36 = input.LA(3);

                    if ( (synpred215()) ) {
                        alt143=3;
                    }
                    else if ( (true) ) {
                        alt143=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );", 143, 36, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );", 143, 3, input);

                    throw nvae;
                }

                }
                break;
            case Identifier:
            case FloatingPointLiteral:
            case CharacterLiteral:
            case StringLiteral:
            case HexLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case 31:
            case 48:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 72:
            case 74:
            case 75:
            case 76:
            case 119:
            case 120:
                {
                alt143=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("615:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );", 143, 0, input);

                throw nvae;
            }

            switch (alt143) {
                case 1 :
                    // ./src/spec.g3:616:9: '~' unaryExpression
                    {
                    match(input,117,FOLLOW_117_in_unaryExpressionNotPlusMinus3456); if (failed) return retval;
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus3458);
                    unaryExpression();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:617:8: '!' unaryExpression
                    {
                    match(input,118,FOLLOW_118_in_unaryExpressionNotPlusMinus3467); if (failed) return retval;
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus3469);
                    unaryExpression();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 3 :
                    // ./src/spec.g3:618:9: castExpression
                    {
                    pushFollow(FOLLOW_castExpression_in_unaryExpressionNotPlusMinus3479);
                    castExpression();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 4 :
                    // ./src/spec.g3:619:9: primary ( selector )* ( '++' | '--' )?
                    {
                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus3489);
                    primary();
                    _fsp--;
                    if (failed) return retval;
                    // ./src/spec.g3:619:17: ( selector )*
                    loop141:
                    do {
                        int alt141=2;
                        int LA141_0 = input.LA(1);

                        if ( (LA141_0==27||LA141_0==49) ) {
                            alt141=1;
                        }


                        switch (alt141) {
                    	case 1 :
                    	    // ./src/spec.g3:0:0: selector
                    	    {
                    	    pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus3491);
                    	    selector();
                    	    _fsp--;
                    	    if (failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop141;
                        }
                    } while (true);

                    // ./src/spec.g3:619:27: ( '++' | '--' )?
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( ((LA142_0>=115 && LA142_0<=116)) ) {
                        alt142=1;
                    }
                    switch (alt142) {
                        case 1 :
                            // ./src/spec.g3:
                            {
                            if ( (input.LA(1)>=115 && input.LA(1)<=116) ) {
                                input.consume();
                                errorRecovery=false;failed=false;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_unaryExpressionNotPlusMinus3494);    throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 121, unaryExpressionNotPlusMinus_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end unaryExpressionNotPlusMinus

    public static class castExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start castExpression
    // ./src/spec.g3:622:1: castExpression : ( '(' primitiveType ')' unaryExpression | '(' ( expression | type ) ')' unaryExpressionNotPlusMinus );
    public final castExpression_return castExpression() throws RecognitionException {
        castExpression_return retval = new castExpression_return();
        retval.start = input.LT(1);
        int castExpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 122) ) { return retval; }
            // ./src/spec.g3:623:5: ( '(' primitiveType ')' unaryExpression | '(' ( expression | type ) ')' unaryExpressionNotPlusMinus )
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==43) ) {
                int LA145_1 = input.LA(2);

                if ( (LA145_1==Identifier||(LA145_1>=FloatingPointLiteral && LA145_1<=DecimalLiteral)||LA145_1==31||LA145_1==43||LA145_1==48||LA145_1==72||(LA145_1>=74 && LA145_1<=76)||(LA145_1>=111 && LA145_1<=112)||(LA145_1>=115 && LA145_1<=120)) ) {
                    alt145=2;
                }
                else if ( ((LA145_1>=63 && LA145_1<=70)) ) {
                    int LA145_20 = input.LA(3);

                    if ( (synpred219()) ) {
                        alt145=1;
                    }
                    else if ( (true) ) {
                        alt145=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("622:1: castExpression : ( '(' primitiveType ')' unaryExpression | '(' ( expression | type ) ')' unaryExpressionNotPlusMinus );", 145, 20, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("622:1: castExpression : ( '(' primitiveType ')' unaryExpression | '(' ( expression | type ) ')' unaryExpressionNotPlusMinus );", 145, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("622:1: castExpression : ( '(' primitiveType ')' unaryExpression | '(' ( expression | type ) ')' unaryExpressionNotPlusMinus );", 145, 0, input);

                throw nvae;
            }
            switch (alt145) {
                case 1 :
                    // ./src/spec.g3:623:8: '(' primitiveType ')' unaryExpression
                    {
                    match(input,43,FOLLOW_43_in_castExpression3517); if (failed) return retval;
                    pushFollow(FOLLOW_primitiveType_in_castExpression3519);
                    primitiveType();
                    _fsp--;
                    if (failed) return retval;
                    match(input,44,FOLLOW_44_in_castExpression3521); if (failed) return retval;
                    pushFollow(FOLLOW_unaryExpression_in_castExpression3523);
                    unaryExpression();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:624:8: '(' ( expression | type ) ')' unaryExpressionNotPlusMinus
                    {
                    match(input,43,FOLLOW_43_in_castExpression3532); if (failed) return retval;
                    // ./src/spec.g3:624:12: ( expression | type )
                    int alt144=2;
                    switch ( input.LA(1) ) {
                    case FloatingPointLiteral:
                    case CharacterLiteral:
                    case StringLiteral:
                    case HexLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case 31:
                    case 43:
                    case 48:
                    case 72:
                    case 74:
                    case 75:
                    case 76:
                    case 111:
                    case 112:
                    case 115:
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                    case 120:
                        {
                        alt144=1;
                        }
                        break;
                    case Identifier:
                        {
                        int LA144_18 = input.LA(2);

                        if ( (synpred220()) ) {
                            alt144=1;
                        }
                        else if ( (true) ) {
                            alt144=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("624:12: ( expression | type )", 144, 18, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                        {
                        switch ( input.LA(2) ) {
                        case 49:
                            {
                            int LA144_48 = input.LA(3);

                            if ( (synpred220()) ) {
                                alt144=1;
                            }
                            else if ( (true) ) {
                                alt144=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("624:12: ( expression | type )", 144, 48, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 44:
                            {
                            alt144=2;
                            }
                            break;
                        case 27:
                            {
                            alt144=1;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("624:12: ( expression | type )", 144, 19, input);

                            throw nvae;
                        }

                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("624:12: ( expression | type )", 144, 0, input);

                        throw nvae;
                    }

                    switch (alt144) {
                        case 1 :
                            // ./src/spec.g3:624:13: expression
                            {
                            pushFollow(FOLLOW_expression_in_castExpression3535);
                            expression();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;
                        case 2 :
                            // ./src/spec.g3:624:26: type
                            {
                            pushFollow(FOLLOW_type_in_castExpression3539);
                            type();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }

                    match(input,44,FOLLOW_44_in_castExpression3542); if (failed) return retval;
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_castExpression3544);
                    unaryExpressionNotPlusMinus();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 122, castExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end castExpression

    public static class primary_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start primary
    // ./src/spec.g3:627:1: primary : ( parExpression | nonWildcardTypeArguments ( explicitGenericInvocationSuffix | 'this' arguments ) | 'this' ( arguments )? | 'super' superSuffix | literal | 'new' creator | Identifier ( '.' Identifier )* ( identifierSuffix )? | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' );
    public final primary_return primary() throws RecognitionException {
        primary_return retval = new primary_return();
        retval.start = input.LT(1);
        int primary_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 123) ) { return retval; }
            // ./src/spec.g3:628:5: ( parExpression | nonWildcardTypeArguments ( explicitGenericInvocationSuffix | 'this' arguments ) | 'this' ( arguments )? | 'super' superSuffix | literal | 'new' creator | Identifier ( '.' Identifier )* ( identifierSuffix )? | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' )
            int alt151=9;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt151=1;
                }
                break;
            case 31:
                {
                alt151=2;
                }
                break;
            case 119:
                {
                alt151=3;
                }
                break;
            case 72:
                {
                alt151=4;
                }
                break;
            case FloatingPointLiteral:
            case CharacterLiteral:
            case StringLiteral:
            case HexLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case 74:
            case 75:
            case 76:
                {
                alt151=5;
                }
                break;
            case 120:
                {
                alt151=6;
                }
                break;
            case Identifier:
                {
                alt151=7;
                }
                break;
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
                {
                alt151=8;
                }
                break;
            case 48:
                {
                alt151=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("627:1: primary : ( parExpression | nonWildcardTypeArguments ( explicitGenericInvocationSuffix | 'this' arguments ) | 'this' ( arguments )? | 'super' superSuffix | literal | 'new' creator | Identifier ( '.' Identifier )* ( identifierSuffix )? | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' );", 151, 0, input);

                throw nvae;
            }

            switch (alt151) {
                case 1 :
                    // ./src/spec.g3:628:7: parExpression
                    {
                    pushFollow(FOLLOW_parExpression_in_primary3561);
                    parExpression();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:629:9: nonWildcardTypeArguments ( explicitGenericInvocationSuffix | 'this' arguments )
                    {
                    pushFollow(FOLLOW_nonWildcardTypeArguments_in_primary3571);
                    nonWildcardTypeArguments();
                    _fsp--;
                    if (failed) return retval;
                    // ./src/spec.g3:630:9: ( explicitGenericInvocationSuffix | 'this' arguments )
                    int alt146=2;
                    int LA146_0 = input.LA(1);

                    if ( (LA146_0==Identifier||LA146_0==72) ) {
                        alt146=1;
                    }
                    else if ( (LA146_0==119) ) {
                        alt146=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("630:9: ( explicitGenericInvocationSuffix | 'this' arguments )", 146, 0, input);

                        throw nvae;
                    }
                    switch (alt146) {
                        case 1 :
                            // ./src/spec.g3:630:10: explicitGenericInvocationSuffix
                            {
                            pushFollow(FOLLOW_explicitGenericInvocationSuffix_in_primary3582);
                            explicitGenericInvocationSuffix();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;
                        case 2 :
                            // ./src/spec.g3:630:44: 'this' arguments
                            {
                            match(input,119,FOLLOW_119_in_primary3586); if (failed) return retval;
                            pushFollow(FOLLOW_arguments_in_primary3588);
                            arguments();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ./src/spec.g3:631:9: 'this' ( arguments )?
                    {
                    match(input,119,FOLLOW_119_in_primary3599); if (failed) return retval;
                    // ./src/spec.g3:631:16: ( arguments )?
                    int alt147=2;
                    int LA147_0 = input.LA(1);

                    if ( (LA147_0==43) ) {
                        alt147=1;
                    }
                    switch (alt147) {
                        case 1 :
                            // ./src/spec.g3:631:17: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_primary3602);
                            arguments();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // ./src/spec.g3:632:9: 'super' superSuffix
                    {
                    match(input,72,FOLLOW_72_in_primary3614); if (failed) return retval;
                    pushFollow(FOLLOW_superSuffix_in_primary3616);
                    superSuffix();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 5 :
                    // ./src/spec.g3:633:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primary3626);
                    literal();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 6 :
                    // ./src/spec.g3:634:9: 'new' creator
                    {
                    match(input,120,FOLLOW_120_in_primary3636); if (failed) return retval;
                    pushFollow(FOLLOW_creator_in_primary3638);
                    creator();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 7 :
                    // ./src/spec.g3:635:9: Identifier ( '.' Identifier )* ( identifierSuffix )?
                    {
                    match(input,Identifier,FOLLOW_Identifier_in_primary3648); if (failed) return retval;
                    // ./src/spec.g3:635:20: ( '.' Identifier )*
                    loop148:
                    do {
                        int alt148=2;
                        int LA148_0 = input.LA(1);

                        if ( (LA148_0==27) ) {
                            int LA148_3 = input.LA(2);

                            if ( (LA148_3==Identifier) ) {
                                int LA148_33 = input.LA(3);

                                if ( (synpred229()) ) {
                                    alt148=1;
                                }


                            }


                        }


                        switch (alt148) {
                    	case 1 :
                    	    // ./src/spec.g3:635:21: '.' Identifier
                    	    {
                    	    match(input,27,FOLLOW_27_in_primary3651); if (failed) return retval;
                    	    match(input,Identifier,FOLLOW_Identifier_in_primary3653); if (failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop148;
                        }
                    } while (true);

                    // ./src/spec.g3:635:38: ( identifierSuffix )?
                    int alt149=2;
                    switch ( input.LA(1) ) {
                        case 49:
                            {
                            switch ( input.LA(2) ) {
                                case 50:
                                    {
                                    alt149=1;
                                    }
                                    break;
                                case 111:
                                    {
                                    int LA149_34 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                                case 112:
                                    {
                                    int LA149_35 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                                case 115:
                                    {
                                    int LA149_36 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                                case 116:
                                    {
                                    int LA149_37 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                                case 117:
                                    {
                                    int LA149_38 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                                case 118:
                                    {
                                    int LA149_39 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                                case 43:
                                    {
                                    int LA149_40 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                                case 31:
                                    {
                                    int LA149_41 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                                case 119:
                                    {
                                    int LA149_42 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                                case 72:
                                    {
                                    int LA149_43 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                                case HexLiteral:
                                case OctalLiteral:
                                case DecimalLiteral:
                                    {
                                    int LA149_44 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                                case FloatingPointLiteral:
                                    {
                                    int LA149_45 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                                case CharacterLiteral:
                                    {
                                    int LA149_46 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                                case StringLiteral:
                                    {
                                    int LA149_47 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                                case 75:
                                case 76:
                                    {
                                    int LA149_48 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                                case 74:
                                    {
                                    int LA149_49 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                                case 120:
                                    {
                                    int LA149_50 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                                case Identifier:
                                    {
                                    int LA149_51 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                                case 63:
                                case 64:
                                case 65:
                                case 66:
                                case 67:
                                case 68:
                                case 69:
                                case 70:
                                    {
                                    int LA149_52 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                                case 48:
                                    {
                                    int LA149_53 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case 43:
                            {
                            alt149=1;
                            }
                            break;
                        case 27:
                            {
                            switch ( input.LA(2) ) {
                                case 120:
                                    {
                                    int LA149_54 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                                case 119:
                                    {
                                    int LA149_55 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                                case 72:
                                    {
                                    int LA149_56 = input.LA(3);

                                    if ( (synpred230()) ) {
                                        alt149=1;
                                    }
                                    }
                                    break;
                                case 31:
                                case 121:
                                    {
                                    alt149=1;
                                    }
                                    break;
                            }

                            }
                            break;
                    }

                    switch (alt149) {
                        case 1 :
                            // ./src/spec.g3:635:39: identifierSuffix
                            {
                            pushFollow(FOLLOW_identifierSuffix_in_primary3658);
                            identifierSuffix();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // ./src/spec.g3:636:9: primitiveType ( '[' ']' )* '.' 'class'
                    {
                    pushFollow(FOLLOW_primitiveType_in_primary3670);
                    primitiveType();
                    _fsp--;
                    if (failed) return retval;
                    // ./src/spec.g3:636:23: ( '[' ']' )*
                    loop150:
                    do {
                        int alt150=2;
                        int LA150_0 = input.LA(1);

                        if ( (LA150_0==49) ) {
                            alt150=1;
                        }


                        switch (alt150) {
                    	case 1 :
                    	    // ./src/spec.g3:636:24: '[' ']'
                    	    {
                    	    match(input,49,FOLLOW_49_in_primary3673); if (failed) return retval;
                    	    match(input,50,FOLLOW_50_in_primary3675); if (failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop150;
                        }
                    } while (true);

                    match(input,27,FOLLOW_27_in_primary3679); if (failed) return retval;
                    match(input,121,FOLLOW_121_in_primary3681); if (failed) return retval;

                    }
                    break;
                case 9 :
                    // ./src/spec.g3:637:9: 'void' '.' 'class'
                    {
                    match(input,48,FOLLOW_48_in_primary3691); if (failed) return retval;
                    match(input,27,FOLLOW_27_in_primary3693); if (failed) return retval;
                    match(input,121,FOLLOW_121_in_primary3695); if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 123, primary_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end primary

    public static class identifierSuffix_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start identifierSuffix
    // ./src/spec.g3:640:1: identifierSuffix : ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' explicitGenericInvocation | '.' 'this' | '.' 'super' arguments | '.' 'new' ( nonWildcardTypeArguments )? innerCreator );
    public final identifierSuffix_return identifierSuffix() throws RecognitionException {
        identifierSuffix_return retval = new identifierSuffix_return();
        retval.start = input.LT(1);
        int identifierSuffix_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 124) ) { return retval; }
            // ./src/spec.g3:641:2: ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' explicitGenericInvocation | '.' 'this' | '.' 'super' arguments | '.' 'new' ( nonWildcardTypeArguments )? innerCreator )
            int alt155=8;
            switch ( input.LA(1) ) {
            case 49:
                {
                int LA155_1 = input.LA(2);

                if ( (LA155_1==50) ) {
                    alt155=1;
                }
                else if ( (LA155_1==Identifier||(LA155_1>=FloatingPointLiteral && LA155_1<=DecimalLiteral)||LA155_1==31||LA155_1==43||LA155_1==48||(LA155_1>=63 && LA155_1<=70)||LA155_1==72||(LA155_1>=74 && LA155_1<=76)||(LA155_1>=111 && LA155_1<=112)||(LA155_1>=115 && LA155_1<=120)) ) {
                    alt155=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("640:1: identifierSuffix : ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' explicitGenericInvocation | '.' 'this' | '.' 'super' arguments | '.' 'new' ( nonWildcardTypeArguments )? innerCreator );", 155, 1, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                alt155=3;
                }
                break;
            case 27:
                {
                switch ( input.LA(2) ) {
                case 72:
                    {
                    alt155=7;
                    }
                    break;
                case 119:
                    {
                    alt155=6;
                    }
                    break;
                case 120:
                    {
                    alt155=8;
                    }
                    break;
                case 121:
                    {
                    alt155=4;
                    }
                    break;
                case 31:
                    {
                    alt155=5;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("640:1: identifierSuffix : ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' explicitGenericInvocation | '.' 'this' | '.' 'super' arguments | '.' 'new' ( nonWildcardTypeArguments )? innerCreator );", 155, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("640:1: identifierSuffix : ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' explicitGenericInvocation | '.' 'this' | '.' 'super' arguments | '.' 'new' ( nonWildcardTypeArguments )? innerCreator );", 155, 0, input);

                throw nvae;
            }

            switch (alt155) {
                case 1 :
                    // ./src/spec.g3:641:4: ( '[' ']' )+ '.' 'class'
                    {
                    // ./src/spec.g3:641:4: ( '[' ']' )+
                    int cnt152=0;
                    loop152:
                    do {
                        int alt152=2;
                        int LA152_0 = input.LA(1);

                        if ( (LA152_0==49) ) {
                            alt152=1;
                        }


                        switch (alt152) {
                    	case 1 :
                    	    // ./src/spec.g3:641:5: '[' ']'
                    	    {
                    	    match(input,49,FOLLOW_49_in_identifierSuffix3707); if (failed) return retval;
                    	    match(input,50,FOLLOW_50_in_identifierSuffix3709); if (failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt152 >= 1 ) break loop152;
                    	    if (backtracking>0) {failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(152, input);
                                throw eee;
                        }
                        cnt152++;
                    } while (true);

                    match(input,27,FOLLOW_27_in_identifierSuffix3713); if (failed) return retval;
                    match(input,121,FOLLOW_121_in_identifierSuffix3715); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:642:4: ( '[' expression ']' )+
                    {
                    // ./src/spec.g3:642:4: ( '[' expression ']' )+
                    int cnt153=0;
                    loop153:
                    do {
                        int alt153=2;
                        int LA153_0 = input.LA(1);

                        if ( (LA153_0==49) ) {
                            switch ( input.LA(2) ) {
                            case 111:
                                {
                                int LA153_32 = input.LA(3);

                                if ( (synpred236()) ) {
                                    alt153=1;
                                }


                                }
                                break;
                            case 112:
                                {
                                int LA153_33 = input.LA(3);

                                if ( (synpred236()) ) {
                                    alt153=1;
                                }


                                }
                                break;
                            case 115:
                                {
                                int LA153_34 = input.LA(3);

                                if ( (synpred236()) ) {
                                    alt153=1;
                                }


                                }
                                break;
                            case 116:
                                {
                                int LA153_35 = input.LA(3);

                                if ( (synpred236()) ) {
                                    alt153=1;
                                }


                                }
                                break;
                            case 117:
                                {
                                int LA153_36 = input.LA(3);

                                if ( (synpred236()) ) {
                                    alt153=1;
                                }


                                }
                                break;
                            case 118:
                                {
                                int LA153_37 = input.LA(3);

                                if ( (synpred236()) ) {
                                    alt153=1;
                                }


                                }
                                break;
                            case 43:
                                {
                                int LA153_38 = input.LA(3);

                                if ( (synpred236()) ) {
                                    alt153=1;
                                }


                                }
                                break;
                            case 31:
                                {
                                int LA153_39 = input.LA(3);

                                if ( (synpred236()) ) {
                                    alt153=1;
                                }


                                }
                                break;
                            case 119:
                                {
                                int LA153_40 = input.LA(3);

                                if ( (synpred236()) ) {
                                    alt153=1;
                                }


                                }
                                break;
                            case 72:
                                {
                                int LA153_41 = input.LA(3);

                                if ( (synpred236()) ) {
                                    alt153=1;
                                }


                                }
                                break;
                            case HexLiteral:
                            case OctalLiteral:
                            case DecimalLiteral:
                                {
                                int LA153_42 = input.LA(3);

                                if ( (synpred236()) ) {
                                    alt153=1;
                                }


                                }
                                break;
                            case FloatingPointLiteral:
                                {
                                int LA153_43 = input.LA(3);

                                if ( (synpred236()) ) {
                                    alt153=1;
                                }


                                }
                                break;
                            case CharacterLiteral:
                                {
                                int LA153_44 = input.LA(3);

                                if ( (synpred236()) ) {
                                    alt153=1;
                                }


                                }
                                break;
                            case StringLiteral:
                                {
                                int LA153_45 = input.LA(3);

                                if ( (synpred236()) ) {
                                    alt153=1;
                                }


                                }
                                break;
                            case 75:
                            case 76:
                                {
                                int LA153_46 = input.LA(3);

                                if ( (synpred236()) ) {
                                    alt153=1;
                                }


                                }
                                break;
                            case 74:
                                {
                                int LA153_47 = input.LA(3);

                                if ( (synpred236()) ) {
                                    alt153=1;
                                }


                                }
                                break;
                            case 120:
                                {
                                int LA153_48 = input.LA(3);

                                if ( (synpred236()) ) {
                                    alt153=1;
                                }


                                }
                                break;
                            case Identifier:
                                {
                                int LA153_49 = input.LA(3);

                                if ( (synpred236()) ) {
                                    alt153=1;
                                }


                                }
                                break;
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                                {
                                int LA153_50 = input.LA(3);

                                if ( (synpred236()) ) {
                                    alt153=1;
                                }


                                }
                                break;
                            case 48:
                                {
                                int LA153_51 = input.LA(3);

                                if ( (synpred236()) ) {
                                    alt153=1;
                                }


                                }
                                break;

                            }

                        }


                        switch (alt153) {
                    	case 1 :
                    	    // ./src/spec.g3:642:5: '[' expression ']'
                    	    {
                    	    match(input,49,FOLLOW_49_in_identifierSuffix3721); if (failed) return retval;
                    	    pushFollow(FOLLOW_expression_in_identifierSuffix3723);
                    	    expression();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    match(input,50,FOLLOW_50_in_identifierSuffix3725); if (failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt153 >= 1 ) break loop153;
                    	    if (backtracking>0) {failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(153, input);
                                throw eee;
                        }
                        cnt153++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // ./src/spec.g3:643:9: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_identifierSuffix3738);
                    arguments();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 4 :
                    // ./src/spec.g3:644:9: '.' 'class'
                    {
                    match(input,27,FOLLOW_27_in_identifierSuffix3748); if (failed) return retval;
                    match(input,121,FOLLOW_121_in_identifierSuffix3750); if (failed) return retval;

                    }
                    break;
                case 5 :
                    // ./src/spec.g3:645:9: '.' explicitGenericInvocation
                    {
                    match(input,27,FOLLOW_27_in_identifierSuffix3760); if (failed) return retval;
                    pushFollow(FOLLOW_explicitGenericInvocation_in_identifierSuffix3762);
                    explicitGenericInvocation();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 6 :
                    // ./src/spec.g3:646:9: '.' 'this'
                    {
                    match(input,27,FOLLOW_27_in_identifierSuffix3772); if (failed) return retval;
                    match(input,119,FOLLOW_119_in_identifierSuffix3774); if (failed) return retval;

                    }
                    break;
                case 7 :
                    // ./src/spec.g3:647:9: '.' 'super' arguments
                    {
                    match(input,27,FOLLOW_27_in_identifierSuffix3784); if (failed) return retval;
                    match(input,72,FOLLOW_72_in_identifierSuffix3786); if (failed) return retval;
                    pushFollow(FOLLOW_arguments_in_identifierSuffix3788);
                    arguments();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 8 :
                    // ./src/spec.g3:648:9: '.' 'new' ( nonWildcardTypeArguments )? innerCreator
                    {
                    match(input,27,FOLLOW_27_in_identifierSuffix3798); if (failed) return retval;
                    match(input,120,FOLLOW_120_in_identifierSuffix3800); if (failed) return retval;
                    // ./src/spec.g3:648:19: ( nonWildcardTypeArguments )?
                    int alt154=2;
                    int LA154_0 = input.LA(1);

                    if ( (LA154_0==31) ) {
                        alt154=1;
                    }
                    switch (alt154) {
                        case 1 :
                            // ./src/spec.g3:648:20: nonWildcardTypeArguments
                            {
                            pushFollow(FOLLOW_nonWildcardTypeArguments_in_identifierSuffix3803);
                            nonWildcardTypeArguments();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_innerCreator_in_identifierSuffix3807);
                    innerCreator();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 124, identifierSuffix_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end identifierSuffix

    public static class creator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start creator
    // ./src/spec.g3:651:1: creator : ( nonWildcardTypeArguments )? createdName ( arrayCreatorRest | classCreatorRest ) ;
    public final creator_return creator() throws RecognitionException {
        creator_return retval = new creator_return();
        retval.start = input.LT(1);
        int creator_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 125) ) { return retval; }
            // ./src/spec.g3:652:2: ( ( nonWildcardTypeArguments )? createdName ( arrayCreatorRest | classCreatorRest ) )
            // ./src/spec.g3:652:4: ( nonWildcardTypeArguments )? createdName ( arrayCreatorRest | classCreatorRest )
            {
            // ./src/spec.g3:652:4: ( nonWildcardTypeArguments )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==31) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // ./src/spec.g3:0:0: nonWildcardTypeArguments
                    {
                    pushFollow(FOLLOW_nonWildcardTypeArguments_in_creator3819);
                    nonWildcardTypeArguments();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_createdName_in_creator3822);
            createdName();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:653:9: ( arrayCreatorRest | classCreatorRest )
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==49) ) {
                alt157=1;
            }
            else if ( (LA157_0==43) ) {
                alt157=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("653:9: ( arrayCreatorRest | classCreatorRest )", 157, 0, input);

                throw nvae;
            }
            switch (alt157) {
                case 1 :
                    // ./src/spec.g3:653:10: arrayCreatorRest
                    {
                    pushFollow(FOLLOW_arrayCreatorRest_in_creator3833);
                    arrayCreatorRest();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:653:29: classCreatorRest
                    {
                    pushFollow(FOLLOW_classCreatorRest_in_creator3837);
                    classCreatorRest();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 125, creator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end creator

    public static class createdName_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start createdName
    // ./src/spec.g3:656:1: createdName : ( Identifier ( nonWildcardTypeArguments )? ( '.' Identifier ( nonWildcardTypeArguments )? )* | primitiveType );
    public final createdName_return createdName() throws RecognitionException {
        createdName_return retval = new createdName_return();
        retval.start = input.LT(1);
        int createdName_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 126) ) { return retval; }
            // ./src/spec.g3:657:2: ( Identifier ( nonWildcardTypeArguments )? ( '.' Identifier ( nonWildcardTypeArguments )? )* | primitiveType )
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==Identifier) ) {
                alt161=1;
            }
            else if ( ((LA161_0>=63 && LA161_0<=70)) ) {
                alt161=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("656:1: createdName : ( Identifier ( nonWildcardTypeArguments )? ( '.' Identifier ( nonWildcardTypeArguments )? )* | primitiveType );", 161, 0, input);

                throw nvae;
            }
            switch (alt161) {
                case 1 :
                    // ./src/spec.g3:657:4: Identifier ( nonWildcardTypeArguments )? ( '.' Identifier ( nonWildcardTypeArguments )? )*
                    {
                    match(input,Identifier,FOLLOW_Identifier_in_createdName3849); if (failed) return retval;
                    // ./src/spec.g3:657:15: ( nonWildcardTypeArguments )?
                    int alt158=2;
                    int LA158_0 = input.LA(1);

                    if ( (LA158_0==31) ) {
                        alt158=1;
                    }
                    switch (alt158) {
                        case 1 :
                            // ./src/spec.g3:0:0: nonWildcardTypeArguments
                            {
                            pushFollow(FOLLOW_nonWildcardTypeArguments_in_createdName3851);
                            nonWildcardTypeArguments();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }

                    // ./src/spec.g3:658:9: ( '.' Identifier ( nonWildcardTypeArguments )? )*
                    loop160:
                    do {
                        int alt160=2;
                        int LA160_0 = input.LA(1);

                        if ( (LA160_0==27) ) {
                            alt160=1;
                        }


                        switch (alt160) {
                    	case 1 :
                    	    // ./src/spec.g3:658:10: '.' Identifier ( nonWildcardTypeArguments )?
                    	    {
                    	    match(input,27,FOLLOW_27_in_createdName3863); if (failed) return retval;
                    	    match(input,Identifier,FOLLOW_Identifier_in_createdName3865); if (failed) return retval;
                    	    // ./src/spec.g3:658:25: ( nonWildcardTypeArguments )?
                    	    int alt159=2;
                    	    int LA159_0 = input.LA(1);

                    	    if ( (LA159_0==31) ) {
                    	        alt159=1;
                    	    }
                    	    switch (alt159) {
                    	        case 1 :
                    	            // ./src/spec.g3:0:0: nonWildcardTypeArguments
                    	            {
                    	            pushFollow(FOLLOW_nonWildcardTypeArguments_in_createdName3867);
                    	            nonWildcardTypeArguments();
                    	            _fsp--;
                    	            if (failed) return retval;

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop160;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ./src/spec.g3:659:7: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_createdName3878);
                    primitiveType();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 126, createdName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end createdName

    public static class innerCreator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start innerCreator
    // ./src/spec.g3:662:1: innerCreator : Identifier classCreatorRest ;
    public final innerCreator_return innerCreator() throws RecognitionException {
        innerCreator_return retval = new innerCreator_return();
        retval.start = input.LT(1);
        int innerCreator_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 127) ) { return retval; }
            // ./src/spec.g3:663:2: ( Identifier classCreatorRest )
            // ./src/spec.g3:663:4: Identifier classCreatorRest
            {
            match(input,Identifier,FOLLOW_Identifier_in_innerCreator3890); if (failed) return retval;
            pushFollow(FOLLOW_classCreatorRest_in_innerCreator3892);
            classCreatorRest();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 127, innerCreator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end innerCreator

    public static class arrayCreatorRest_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start arrayCreatorRest
    // ./src/spec.g3:666:1: arrayCreatorRest : '[' ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* ) ;
    public final arrayCreatorRest_return arrayCreatorRest() throws RecognitionException {
        arrayCreatorRest_return retval = new arrayCreatorRest_return();
        retval.start = input.LT(1);
        int arrayCreatorRest_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 128) ) { return retval; }
            // ./src/spec.g3:667:2: ( '[' ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* ) )
            // ./src/spec.g3:667:4: '[' ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* )
            {
            match(input,49,FOLLOW_49_in_arrayCreatorRest3903); if (failed) return retval;
            // ./src/spec.g3:668:9: ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* )
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==50) ) {
                alt165=1;
            }
            else if ( (LA165_0==Identifier||(LA165_0>=FloatingPointLiteral && LA165_0<=DecimalLiteral)||LA165_0==31||LA165_0==43||LA165_0==48||(LA165_0>=63 && LA165_0<=70)||LA165_0==72||(LA165_0>=74 && LA165_0<=76)||(LA165_0>=111 && LA165_0<=112)||(LA165_0>=115 && LA165_0<=120)) ) {
                alt165=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("668:9: ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* )", 165, 0, input);

                throw nvae;
            }
            switch (alt165) {
                case 1 :
                    // ./src/spec.g3:668:13: ']' ( '[' ']' )* arrayInitializer
                    {
                    match(input,50,FOLLOW_50_in_arrayCreatorRest3917); if (failed) return retval;
                    // ./src/spec.g3:668:17: ( '[' ']' )*
                    loop162:
                    do {
                        int alt162=2;
                        int LA162_0 = input.LA(1);

                        if ( (LA162_0==49) ) {
                            alt162=1;
                        }


                        switch (alt162) {
                    	case 1 :
                    	    // ./src/spec.g3:668:18: '[' ']'
                    	    {
                    	    match(input,49,FOLLOW_49_in_arrayCreatorRest3920); if (failed) return retval;
                    	    match(input,50,FOLLOW_50_in_arrayCreatorRest3922); if (failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop162;
                        }
                    } while (true);

                    pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest3926);
                    arrayInitializer();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:669:13: expression ']' ( '[' expression ']' )* ( '[' ']' )*
                    {
                    pushFollow(FOLLOW_expression_in_arrayCreatorRest3940);
                    expression();
                    _fsp--;
                    if (failed) return retval;
                    match(input,50,FOLLOW_50_in_arrayCreatorRest3942); if (failed) return retval;
                    // ./src/spec.g3:669:28: ( '[' expression ']' )*
                    loop163:
                    do {
                        int alt163=2;
                        int LA163_0 = input.LA(1);

                        if ( (LA163_0==49) ) {
                            switch ( input.LA(2) ) {
                            case 111:
                                {
                                int LA163_33 = input.LA(3);

                                if ( (synpred252()) ) {
                                    alt163=1;
                                }


                                }
                                break;
                            case 112:
                                {
                                int LA163_34 = input.LA(3);

                                if ( (synpred252()) ) {
                                    alt163=1;
                                }


                                }
                                break;
                            case 115:
                                {
                                int LA163_35 = input.LA(3);

                                if ( (synpred252()) ) {
                                    alt163=1;
                                }


                                }
                                break;
                            case 116:
                                {
                                int LA163_36 = input.LA(3);

                                if ( (synpred252()) ) {
                                    alt163=1;
                                }


                                }
                                break;
                            case 117:
                                {
                                int LA163_37 = input.LA(3);

                                if ( (synpred252()) ) {
                                    alt163=1;
                                }


                                }
                                break;
                            case 118:
                                {
                                int LA163_38 = input.LA(3);

                                if ( (synpred252()) ) {
                                    alt163=1;
                                }


                                }
                                break;
                            case 43:
                                {
                                int LA163_39 = input.LA(3);

                                if ( (synpred252()) ) {
                                    alt163=1;
                                }


                                }
                                break;
                            case 31:
                                {
                                int LA163_40 = input.LA(3);

                                if ( (synpred252()) ) {
                                    alt163=1;
                                }


                                }
                                break;
                            case 119:
                                {
                                int LA163_41 = input.LA(3);

                                if ( (synpred252()) ) {
                                    alt163=1;
                                }


                                }
                                break;
                            case 72:
                                {
                                int LA163_42 = input.LA(3);

                                if ( (synpred252()) ) {
                                    alt163=1;
                                }


                                }
                                break;
                            case HexLiteral:
                            case OctalLiteral:
                            case DecimalLiteral:
                                {
                                int LA163_43 = input.LA(3);

                                if ( (synpred252()) ) {
                                    alt163=1;
                                }


                                }
                                break;
                            case FloatingPointLiteral:
                                {
                                int LA163_44 = input.LA(3);

                                if ( (synpred252()) ) {
                                    alt163=1;
                                }


                                }
                                break;
                            case CharacterLiteral:
                                {
                                int LA163_45 = input.LA(3);

                                if ( (synpred252()) ) {
                                    alt163=1;
                                }


                                }
                                break;
                            case StringLiteral:
                                {
                                int LA163_46 = input.LA(3);

                                if ( (synpred252()) ) {
                                    alt163=1;
                                }


                                }
                                break;
                            case 75:
                            case 76:
                                {
                                int LA163_47 = input.LA(3);

                                if ( (synpred252()) ) {
                                    alt163=1;
                                }


                                }
                                break;
                            case 74:
                                {
                                int LA163_48 = input.LA(3);

                                if ( (synpred252()) ) {
                                    alt163=1;
                                }


                                }
                                break;
                            case 120:
                                {
                                int LA163_49 = input.LA(3);

                                if ( (synpred252()) ) {
                                    alt163=1;
                                }


                                }
                                break;
                            case Identifier:
                                {
                                int LA163_50 = input.LA(3);

                                if ( (synpred252()) ) {
                                    alt163=1;
                                }


                                }
                                break;
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                                {
                                int LA163_51 = input.LA(3);

                                if ( (synpred252()) ) {
                                    alt163=1;
                                }


                                }
                                break;
                            case 48:
                                {
                                int LA163_52 = input.LA(3);

                                if ( (synpred252()) ) {
                                    alt163=1;
                                }


                                }
                                break;

                            }

                        }


                        switch (alt163) {
                    	case 1 :
                    	    // ./src/spec.g3:669:29: '[' expression ']'
                    	    {
                    	    match(input,49,FOLLOW_49_in_arrayCreatorRest3945); if (failed) return retval;
                    	    pushFollow(FOLLOW_expression_in_arrayCreatorRest3947);
                    	    expression();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    match(input,50,FOLLOW_50_in_arrayCreatorRest3949); if (failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop163;
                        }
                    } while (true);

                    // ./src/spec.g3:669:50: ( '[' ']' )*
                    loop164:
                    do {
                        int alt164=2;
                        int LA164_0 = input.LA(1);

                        if ( (LA164_0==49) ) {
                            int LA164_30 = input.LA(2);

                            if ( (LA164_30==50) ) {
                                alt164=1;
                            }


                        }


                        switch (alt164) {
                    	case 1 :
                    	    // ./src/spec.g3:669:51: '[' ']'
                    	    {
                    	    match(input,49,FOLLOW_49_in_arrayCreatorRest3954); if (failed) return retval;
                    	    match(input,50,FOLLOW_50_in_arrayCreatorRest3956); if (failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop164;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 128, arrayCreatorRest_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end arrayCreatorRest

    public static class classCreatorRest_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start classCreatorRest
    // ./src/spec.g3:673:1: classCreatorRest : arguments ( classBody )? ;
    public final classCreatorRest_return classCreatorRest() throws RecognitionException {
        classCreatorRest_return retval = new classCreatorRest_return();
        retval.start = input.LT(1);
        int classCreatorRest_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 129) ) { return retval; }
            // ./src/spec.g3:674:2: ( arguments ( classBody )? )
            // ./src/spec.g3:674:4: arguments ( classBody )?
            {
            pushFollow(FOLLOW_arguments_in_classCreatorRest3979);
            arguments();
            _fsp--;
            if (failed) return retval;
            // ./src/spec.g3:674:14: ( classBody )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==40) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // ./src/spec.g3:0:0: classBody
                    {
                    pushFollow(FOLLOW_classBody_in_classCreatorRest3981);
                    classBody();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 129, classCreatorRest_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end classCreatorRest

    public static class explicitGenericInvocation_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start explicitGenericInvocation
    // ./src/spec.g3:677:1: explicitGenericInvocation : nonWildcardTypeArguments explicitGenericInvocationSuffix ;
    public final explicitGenericInvocation_return explicitGenericInvocation() throws RecognitionException {
        explicitGenericInvocation_return retval = new explicitGenericInvocation_return();
        retval.start = input.LT(1);
        int explicitGenericInvocation_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 130) ) { return retval; }
            // ./src/spec.g3:678:2: ( nonWildcardTypeArguments explicitGenericInvocationSuffix )
            // ./src/spec.g3:678:4: nonWildcardTypeArguments explicitGenericInvocationSuffix
            {
            pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitGenericInvocation3994);
            nonWildcardTypeArguments();
            _fsp--;
            if (failed) return retval;
            pushFollow(FOLLOW_explicitGenericInvocationSuffix_in_explicitGenericInvocation3996);
            explicitGenericInvocationSuffix();
            _fsp--;
            if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 130, explicitGenericInvocation_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end explicitGenericInvocation

    public static class nonWildcardTypeArguments_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start nonWildcardTypeArguments
    // ./src/spec.g3:681:1: nonWildcardTypeArguments : '<' typeList '>' ;
    public final nonWildcardTypeArguments_return nonWildcardTypeArguments() throws RecognitionException {
        nonWildcardTypeArguments_return retval = new nonWildcardTypeArguments_return();
        retval.start = input.LT(1);
        int nonWildcardTypeArguments_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 131) ) { return retval; }
            // ./src/spec.g3:682:2: ( '<' typeList '>' )
            // ./src/spec.g3:682:4: '<' typeList '>'
            {
            match(input,31,FOLLOW_31_in_nonWildcardTypeArguments4008); if (failed) return retval;
            pushFollow(FOLLOW_typeList_in_nonWildcardTypeArguments4010);
            typeList();
            _fsp--;
            if (failed) return retval;
            match(input,33,FOLLOW_33_in_nonWildcardTypeArguments4012); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 131, nonWildcardTypeArguments_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end nonWildcardTypeArguments

    public static class explicitGenericInvocationSuffix_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start explicitGenericInvocationSuffix
    // ./src/spec.g3:685:1: explicitGenericInvocationSuffix : ( 'super' superSuffix | Identifier arguments );
    public final explicitGenericInvocationSuffix_return explicitGenericInvocationSuffix() throws RecognitionException {
        explicitGenericInvocationSuffix_return retval = new explicitGenericInvocationSuffix_return();
        retval.start = input.LT(1);
        int explicitGenericInvocationSuffix_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 132) ) { return retval; }
            // ./src/spec.g3:686:2: ( 'super' superSuffix | Identifier arguments )
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==72) ) {
                alt167=1;
            }
            else if ( (LA167_0==Identifier) ) {
                alt167=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("685:1: explicitGenericInvocationSuffix : ( 'super' superSuffix | Identifier arguments );", 167, 0, input);

                throw nvae;
            }
            switch (alt167) {
                case 1 :
                    // ./src/spec.g3:686:4: 'super' superSuffix
                    {
                    match(input,72,FOLLOW_72_in_explicitGenericInvocationSuffix4024); if (failed) return retval;
                    pushFollow(FOLLOW_superSuffix_in_explicitGenericInvocationSuffix4026);
                    superSuffix();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:687:6: Identifier arguments
                    {
                    match(input,Identifier,FOLLOW_Identifier_in_explicitGenericInvocationSuffix4033); if (failed) return retval;
                    pushFollow(FOLLOW_arguments_in_explicitGenericInvocationSuffix4035);
                    arguments();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 132, explicitGenericInvocationSuffix_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end explicitGenericInvocationSuffix

    public static class selector_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start selector
    // ./src/spec.g3:690:1: selector : ( '.' Identifier ( arguments )? | '.' 'this' | '.' 'super' superSuffix | '.' 'new' ( nonWildcardTypeArguments )? innerCreator | '[' expression ']' );
    public final selector_return selector() throws RecognitionException {
        selector_return retval = new selector_return();
        retval.start = input.LT(1);
        int selector_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 133) ) { return retval; }
            // ./src/spec.g3:691:2: ( '.' Identifier ( arguments )? | '.' 'this' | '.' 'super' superSuffix | '.' 'new' ( nonWildcardTypeArguments )? innerCreator | '[' expression ']' )
            int alt170=5;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==27) ) {
                switch ( input.LA(2) ) {
                case 120:
                    {
                    alt170=4;
                    }
                    break;
                case 119:
                    {
                    alt170=2;
                    }
                    break;
                case Identifier:
                    {
                    alt170=1;
                    }
                    break;
                case 72:
                    {
                    alt170=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("690:1: selector : ( '.' Identifier ( arguments )? | '.' 'this' | '.' 'super' superSuffix | '.' 'new' ( nonWildcardTypeArguments )? innerCreator | '[' expression ']' );", 170, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA170_0==49) ) {
                alt170=5;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("690:1: selector : ( '.' Identifier ( arguments )? | '.' 'this' | '.' 'super' superSuffix | '.' 'new' ( nonWildcardTypeArguments )? innerCreator | '[' expression ']' );", 170, 0, input);

                throw nvae;
            }
            switch (alt170) {
                case 1 :
                    // ./src/spec.g3:691:4: '.' Identifier ( arguments )?
                    {
                    match(input,27,FOLLOW_27_in_selector4047); if (failed) return retval;
                    match(input,Identifier,FOLLOW_Identifier_in_selector4049); if (failed) return retval;
                    // ./src/spec.g3:691:19: ( arguments )?
                    int alt168=2;
                    int LA168_0 = input.LA(1);

                    if ( (LA168_0==43) ) {
                        alt168=1;
                    }
                    switch (alt168) {
                        case 1 :
                            // ./src/spec.g3:691:20: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_selector4052);
                            arguments();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ./src/spec.g3:692:6: '.' 'this'
                    {
                    match(input,27,FOLLOW_27_in_selector4061); if (failed) return retval;
                    match(input,119,FOLLOW_119_in_selector4063); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // ./src/spec.g3:693:6: '.' 'super' superSuffix
                    {
                    match(input,27,FOLLOW_27_in_selector4070); if (failed) return retval;
                    match(input,72,FOLLOW_72_in_selector4072); if (failed) return retval;
                    pushFollow(FOLLOW_superSuffix_in_selector4074);
                    superSuffix();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 4 :
                    // ./src/spec.g3:694:6: '.' 'new' ( nonWildcardTypeArguments )? innerCreator
                    {
                    match(input,27,FOLLOW_27_in_selector4081); if (failed) return retval;
                    match(input,120,FOLLOW_120_in_selector4083); if (failed) return retval;
                    // ./src/spec.g3:694:16: ( nonWildcardTypeArguments )?
                    int alt169=2;
                    int LA169_0 = input.LA(1);

                    if ( (LA169_0==31) ) {
                        alt169=1;
                    }
                    switch (alt169) {
                        case 1 :
                            // ./src/spec.g3:694:17: nonWildcardTypeArguments
                            {
                            pushFollow(FOLLOW_nonWildcardTypeArguments_in_selector4086);
                            nonWildcardTypeArguments();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_innerCreator_in_selector4090);
                    innerCreator();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 5 :
                    // ./src/spec.g3:695:6: '[' expression ']'
                    {
                    match(input,49,FOLLOW_49_in_selector4097); if (failed) return retval;
                    pushFollow(FOLLOW_expression_in_selector4099);
                    expression();
                    _fsp--;
                    if (failed) return retval;
                    match(input,50,FOLLOW_50_in_selector4101); if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 133, selector_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end selector

    public static class superSuffix_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start superSuffix
    // ./src/spec.g3:698:1: superSuffix : ( arguments | '.' Identifier ( arguments )? );
    public final superSuffix_return superSuffix() throws RecognitionException {
        superSuffix_return retval = new superSuffix_return();
        retval.start = input.LT(1);
        int superSuffix_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 134) ) { return retval; }
            // ./src/spec.g3:699:2: ( arguments | '.' Identifier ( arguments )? )
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==43) ) {
                alt172=1;
            }
            else if ( (LA172_0==27) ) {
                alt172=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("698:1: superSuffix : ( arguments | '.' Identifier ( arguments )? );", 172, 0, input);

                throw nvae;
            }
            switch (alt172) {
                case 1 :
                    // ./src/spec.g3:699:4: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_superSuffix4113);
                    arguments();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:700:6: '.' Identifier ( arguments )?
                    {
                    match(input,27,FOLLOW_27_in_superSuffix4120); if (failed) return retval;
                    match(input,Identifier,FOLLOW_Identifier_in_superSuffix4122); if (failed) return retval;
                    // ./src/spec.g3:700:21: ( arguments )?
                    int alt171=2;
                    int LA171_0 = input.LA(1);

                    if ( (LA171_0==43) ) {
                        alt171=1;
                    }
                    switch (alt171) {
                        case 1 :
                            // ./src/spec.g3:700:22: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_superSuffix4125);
                            arguments();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 134, superSuffix_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end superSuffix

    public static class arguments_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start arguments
    // ./src/spec.g3:703:1: arguments : '(' ( expressionList )? ')' ;
    public final arguments_return arguments() throws RecognitionException {
        arguments_return retval = new arguments_return();
        retval.start = input.LT(1);
        int arguments_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 135) ) { return retval; }
            // ./src/spec.g3:704:2: ( '(' ( expressionList )? ')' )
            // ./src/spec.g3:704:4: '(' ( expressionList )? ')'
            {
            match(input,43,FOLLOW_43_in_arguments4141); if (failed) return retval;
            // ./src/spec.g3:704:8: ( expressionList )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==Identifier||(LA173_0>=FloatingPointLiteral && LA173_0<=DecimalLiteral)||LA173_0==31||LA173_0==43||LA173_0==48||(LA173_0>=63 && LA173_0<=70)||LA173_0==72||(LA173_0>=74 && LA173_0<=76)||(LA173_0>=111 && LA173_0<=112)||(LA173_0>=115 && LA173_0<=120)) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // ./src/spec.g3:0:0: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_arguments4143);
                    expressionList();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            match(input,44,FOLLOW_44_in_arguments4146); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 135, arguments_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end arguments

    // $ANTLR start synpred77
    public final void synpred77_fragment() throws RecognitionException {   
        // ./src/spec.g3:264:16: ( '.' Identifier )
        // ./src/spec.g3:264:16: '.' Identifier
        {
        match(input,27,FOLLOW_27_in_synpred771357); if (failed) return ;
        match(input,Identifier,FOLLOW_Identifier_in_synpred771359); if (failed) return ;

        }
    }
    // $ANTLR end synpred77

    // $ANTLR start synpred125
    public final void synpred125_fragment() throws RecognitionException {   
        // ./src/spec.g3:390:6: ( interfaceDeclaration )
        // ./src/spec.g3:390:6: interfaceDeclaration
        {
        pushFollow(FOLLOW_interfaceDeclaration_in_synpred1252049);
        interfaceDeclaration();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred125

    // $ANTLR start synpred131
    public final void synpred131_fragment() throws RecognitionException {   
        // ./src/spec.g3:427:4: ( localVariableDeclaration )
        // ./src/spec.g3:427:4: localVariableDeclaration
        {
        pushFollow(FOLLOW_localVariableDeclaration_in_synpred1312192);
        localVariableDeclaration();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred131

    // $ANTLR start synpred137
    public final void synpred137_fragment() throws RecognitionException {   
        // ./src/spec.g3:439:37: ( 'else' statement )
        // ./src/spec.g3:439:37: 'else' statement
        {
        match(input,83,FOLLOW_83_in_synpred1372279); if (failed) return ;
        pushFollow(FOLLOW_statement_in_synpred1372281);
        statement();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred137

    // $ANTLR start synpred142
    public final void synpred142_fragment() throws RecognitionException {   
        // ./src/spec.g3:444:9: ( catches 'finally' block )
        // ./src/spec.g3:444:9: catches 'finally' block
        {
        pushFollow(FOLLOW_catches_in_synpred1422347);
        catches();
        _fsp--;
        if (failed) return ;
        match(input,88,FOLLOW_88_in_synpred1422349); if (failed) return ;
        pushFollow(FOLLOW_block_in_synpred1422351);
        block();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred142

    // $ANTLR start synpred143
    public final void synpred143_fragment() throws RecognitionException {   
        // ./src/spec.g3:445:9: ( catches )
        // ./src/spec.g3:445:9: catches
        {
        pushFollow(FOLLOW_catches_in_synpred1432361);
        catches();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred143

    // $ANTLR start synpred160
    public final void synpred160_fragment() throws RecognitionException {   
        // ./src/spec.g3:480:4: ( 'case' constantExpression ':' )
        // ./src/spec.g3:480:4: 'case' constantExpression ':'
        {
        match(input,95,FOLLOW_95_in_synpred1602586); if (failed) return ;
        pushFollow(FOLLOW_constantExpression_in_synpred1602588);
        constantExpression();
        _fsp--;
        if (failed) return ;
        match(input,46,FOLLOW_46_in_synpred1602590); if (failed) return ;

        }
    }
    // $ANTLR end synpred160

    // $ANTLR start synpred161
    public final void synpred161_fragment() throws RecognitionException {   
        // ./src/spec.g3:481:6: ( 'case' enumConstantName ':' )
        // ./src/spec.g3:481:6: 'case' enumConstantName ':'
        {
        match(input,95,FOLLOW_95_in_synpred1612597); if (failed) return ;
        pushFollow(FOLLOW_enumConstantName_in_synpred1612599);
        enumConstantName();
        _fsp--;
        if (failed) return ;
        match(input,46,FOLLOW_46_in_synpred1612601); if (failed) return ;

        }
    }
    // $ANTLR end synpred161

    // $ANTLR start synpred163
    public final void synpred163_fragment() throws RecognitionException {   
        // ./src/spec.g3:490:4: ( forVarControl )
        // ./src/spec.g3:490:4: forVarControl
        {
        pushFollow(FOLLOW_forVarControl_in_synpred1632638);
        forVarControl();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred163

    // $ANTLR start synpred168
    public final void synpred168_fragment() throws RecognitionException {   
        // ./src/spec.g3:495:4: ( ( 'final' )? type variableDeclarators )
        // ./src/spec.g3:495:4: ( 'final' )? type variableDeclarators
        {
        // ./src/spec.g3:495:4: ( 'final' )?
        int alt194=2;
        int LA194_0 = input.LA(1);

        if ( (LA194_0==57) ) {
            alt194=1;
        }
        switch (alt194) {
            case 1 :
                // ./src/spec.g3:0:0: 'final'
                {
                match(input,57,FOLLOW_57_in_synpred1682667); if (failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_type_in_synpred1682670);
        type();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_variableDeclarators_in_synpred1682672);
        variableDeclarators();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred168

    // $ANTLR start synpred176
    public final void synpred176_fragment() throws RecognitionException {   
        // ./src/spec.g3:531:27: ( assignmentOperator expression )
        // ./src/spec.g3:531:27: assignmentOperator expression
        {
        pushFollow(FOLLOW_assignmentOperator_in_synpred1762839);
        assignmentOperator();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_expression_in_synpred1762841);
        expression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred176

    // $ANTLR start synpred187
    public final void synpred187_fragment() throws RecognitionException {   
        // ./src/spec.g3:545:9: ( '>' '>' '=' )
        // ./src/spec.g3:545:9: '>' '>' '='
        {
        match(input,33,FOLLOW_33_in_synpred1872959); if (failed) return ;
        match(input,33,FOLLOW_33_in_synpred1872961); if (failed) return ;
        match(input,52,FOLLOW_52_in_synpred1872963); if (failed) return ;

        }
    }
    // $ANTLR end synpred187

    // $ANTLR start synpred197
    public final void synpred197_fragment() throws RecognitionException {   
        // ./src/spec.g3:582:27: ( relationalOp shiftExpression )
        // ./src/spec.g3:582:27: relationalOp shiftExpression
        {
        pushFollow(FOLLOW_relationalOp_in_synpred1973207);
        relationalOp();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_shiftExpression_in_synpred1973209);
        shiftExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred197

    // $ANTLR start synpred201
    public final void synpred201_fragment() throws RecognitionException {   
        // ./src/spec.g3:590:30: ( shiftOp additiveExpression )
        // ./src/spec.g3:590:30: shiftOp additiveExpression
        {
        pushFollow(FOLLOW_shiftOp_in_synpred2013262);
        shiftOp();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_additiveExpression_in_synpred2013264);
        additiveExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred201

    // $ANTLR start synpred203
    public final void synpred203_fragment() throws RecognitionException {   
        // ./src/spec.g3:595:15: ( '>' '>' '>' )
        // ./src/spec.g3:595:15: '>' '>' '>'
        {
        match(input,33,FOLLOW_33_in_synpred2033294); if (failed) return ;
        match(input,33,FOLLOW_33_in_synpred2033296); if (failed) return ;
        match(input,33,FOLLOW_33_in_synpred2033298); if (failed) return ;

        }
    }
    // $ANTLR end synpred203

    // $ANTLR start synpred215
    public final void synpred215_fragment() throws RecognitionException {   
        // ./src/spec.g3:618:9: ( castExpression )
        // ./src/spec.g3:618:9: castExpression
        {
        pushFollow(FOLLOW_castExpression_in_synpred2153479);
        castExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred215

    // $ANTLR start synpred219
    public final void synpred219_fragment() throws RecognitionException {   
        // ./src/spec.g3:623:8: ( '(' primitiveType ')' unaryExpression )
        // ./src/spec.g3:623:8: '(' primitiveType ')' unaryExpression
        {
        match(input,43,FOLLOW_43_in_synpred2193517); if (failed) return ;
        pushFollow(FOLLOW_primitiveType_in_synpred2193519);
        primitiveType();
        _fsp--;
        if (failed) return ;
        match(input,44,FOLLOW_44_in_synpred2193521); if (failed) return ;
        pushFollow(FOLLOW_unaryExpression_in_synpred2193523);
        unaryExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred219

    // $ANTLR start synpred220
    public final void synpred220_fragment() throws RecognitionException {   
        // ./src/spec.g3:624:13: ( expression )
        // ./src/spec.g3:624:13: expression
        {
        pushFollow(FOLLOW_expression_in_synpred2203535);
        expression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred220

    // $ANTLR start synpred229
    public final void synpred229_fragment() throws RecognitionException {   
        // ./src/spec.g3:635:21: ( '.' Identifier )
        // ./src/spec.g3:635:21: '.' Identifier
        {
        match(input,27,FOLLOW_27_in_synpred2293651); if (failed) return ;
        match(input,Identifier,FOLLOW_Identifier_in_synpred2293653); if (failed) return ;

        }
    }
    // $ANTLR end synpred229

    // $ANTLR start synpred230
    public final void synpred230_fragment() throws RecognitionException {   
        // ./src/spec.g3:635:39: ( identifierSuffix )
        // ./src/spec.g3:635:39: identifierSuffix
        {
        pushFollow(FOLLOW_identifierSuffix_in_synpred2303658);
        identifierSuffix();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred230

    // $ANTLR start synpred236
    public final void synpred236_fragment() throws RecognitionException {   
        // ./src/spec.g3:642:5: ( '[' expression ']' )
        // ./src/spec.g3:642:5: '[' expression ']'
        {
        match(input,49,FOLLOW_49_in_synpred2363721); if (failed) return ;
        pushFollow(FOLLOW_expression_in_synpred2363723);
        expression();
        _fsp--;
        if (failed) return ;
        match(input,50,FOLLOW_50_in_synpred2363725); if (failed) return ;

        }
    }
    // $ANTLR end synpred236

    // $ANTLR start synpred252
    public final void synpred252_fragment() throws RecognitionException {   
        // ./src/spec.g3:669:29: ( '[' expression ']' )
        // ./src/spec.g3:669:29: '[' expression ']'
        {
        match(input,49,FOLLOW_49_in_synpred2523945); if (failed) return ;
        pushFollow(FOLLOW_expression_in_synpred2523947);
        expression();
        _fsp--;
        if (failed) return ;
        match(input,50,FOLLOW_50_in_synpred2523949); if (failed) return ;

        }
    }
    // $ANTLR end synpred252

    public final boolean synpred137() {
        backtracking++;
        int start = input.mark();
        try {
            synpred137_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred125() {
        backtracking++;
        int start = input.mark();
        try {
            synpred125_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred229() {
        backtracking++;
        int start = input.mark();
        try {
            synpred229_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred219() {
        backtracking++;
        int start = input.mark();
        try {
            synpred219_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred77() {
        backtracking++;
        int start = input.mark();
        try {
            synpred77_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred131() {
        backtracking++;
        int start = input.mark();
        try {
            synpred131_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred142() {
        backtracking++;
        int start = input.mark();
        try {
            synpred142_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred143() {
        backtracking++;
        int start = input.mark();
        try {
            synpred143_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred203() {
        backtracking++;
        int start = input.mark();
        try {
            synpred203_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred230() {
        backtracking++;
        int start = input.mark();
        try {
            synpred230_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred163() {
        backtracking++;
        int start = input.mark();
        try {
            synpred163_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred161() {
        backtracking++;
        int start = input.mark();
        try {
            synpred161_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred187() {
        backtracking++;
        int start = input.mark();
        try {
            synpred187_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred252() {
        backtracking++;
        int start = input.mark();
        try {
            synpred252_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred160() {
        backtracking++;
        int start = input.mark();
        try {
            synpred160_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred201() {
        backtracking++;
        int start = input.mark();
        try {
            synpred201_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred176() {
        backtracking++;
        int start = input.mark();
        try {
            synpred176_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred215() {
        backtracking++;
        int start = input.mark();
        try {
            synpred215_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred197() {
        backtracking++;
        int start = input.mark();
        try {
            synpred197_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred236() {
        backtracking++;
        int start = input.mark();
        try {
            synpred236_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred168() {
        backtracking++;
        int start = input.mark();
        try {
            synpred168_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred220() {
        backtracking++;
        int start = input.mark();
        try {
            synpred220_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_packageDeclaration_in_specUnit50 = new BitSet(new long[]{0x7FE0008066000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_importDeclaration_in_specUnit61 = new BitSet(new long[]{0x7FE0008066000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_typeDeclaration_in_specUnit72 = new BitSet(new long[]{0x7FE0008064000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_24_in_packageDeclaration84 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_qualifiedName_in_packageDeclaration86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_importDeclaration99 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_26_in_importDeclaration101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_importDeclaration104 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_importDeclaration107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_importDeclaration109 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_importDeclaration114 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_importDeclaration116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_typeDeclaration140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_classOrInterfaceDeclaration152 = new BitSet(new long[]{0x7FE0008044000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_classDeclaration_in_classOrInterfaceDeclaration156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDeclaration_in_classOrInterfaceDeclaration160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalClassDeclaration_in_classDeclaration173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_normalClassDeclaration185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_normalClassDeclaration187 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_classBody_in_normalClassDeclaration189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_typeParameters201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_typeParameter_in_typeParameters203 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_typeParameters206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_typeParameter_in_typeParameters208 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_33_in_typeParameters212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_typeParameter223 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_typeParameter226 = new BitSet(new long[]{0x8000000000000010L,0x000000000000007FL});
    public static final BitSet FOLLOW_bound_in_typeParameter228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_bound243 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_bound246 = new BitSet(new long[]{0x8000000000000010L,0x000000000000007FL});
    public static final BitSet FOLLOW_type_in_bound248 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ENUM_in_enumDeclaration261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_enumDeclaration263 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_36_in_enumDeclaration266 = new BitSet(new long[]{0x8000000000000010L,0x000000000000007FL});
    public static final BitSet FOLLOW_typeList_in_enumDeclaration268 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_enumBody_in_enumDeclaration272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_enumBody284 = new BitSet(new long[]{0x0000004120000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_enumConstants_in_enumBody286 = new BitSet(new long[]{0x0000004120000000L});
    public static final BitSet FOLLOW_32_in_enumBody289 = new BitSet(new long[]{0x0000004020000000L});
    public static final BitSet FOLLOW_enumBodyDeclarations_in_enumBody292 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_enumBody295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumConstant_in_enumConstants306 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_enumConstants309 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_enumConstant_in_enumConstants311 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_annotations_in_enumConstant325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_enumConstant328 = new BitSet(new long[]{0x0000090000000002L});
    public static final BitSet FOLLOW_arguments_in_enumConstant331 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_classBody_in_enumConstant336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_enumBodyDeclarations350 = new BitSet(new long[]{0x7FE0A40024000002L,0x0000000000012000L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_enumBodyDeclarations353 = new BitSet(new long[]{0x7FE0A40024000002L,0x0000000000012000L});
    public static final BitSet FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationTypeDeclaration_in_interfaceDeclaration373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_normalInterfaceDeclaration385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_normalInterfaceDeclaration387 = new BitSet(new long[]{0x0000002480000000L});
    public static final BitSet FOLLOW_typeParameters_in_normalInterfaceDeclaration389 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_34_in_normalInterfaceDeclaration393 = new BitSet(new long[]{0x8000000000000010L,0x000000000000007FL});
    public static final BitSet FOLLOW_typeList_in_normalInterfaceDeclaration395 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_interfaceBody_in_normalInterfaceDeclaration399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList411 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_typeList414 = new BitSet(new long[]{0x8000000000000010L,0x000000000000007FL});
    public static final BitSet FOLLOW_type_in_typeList416 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_40_in_classBody430 = new BitSet(new long[]{0x7FE0A60024000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_classBody432 = new BitSet(new long[]{0x7FE0A60024000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_41_in_classBody435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_interfaceBody447 = new BitSet(new long[]{0xFFE100C0E4000010L,0x000000000000207FL});
    public static final BitSet FOLLOW_interfaceBodyDeclaration_in_interfaceBody449 = new BitSet(new long[]{0xFFE100C0E4000010L,0x000000000000207FL});
    public static final BitSet FOLLOW_38_in_interfaceBody452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_classBodyDeclaration463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_classBodyDeclaration468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_block_in_classBodyDeclaration471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_classBodyDeclaration476 = new BitSet(new long[]{0x7FE0A40004000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_memberDecl_in_classBodyDeclaration479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beforeDeclaration_in_memberDecl500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_afterDeclaration_in_memberDecl505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specDeclaration_in_memberDecl510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_beforeDeclaration523 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_beforeDeclaration525 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_symbolList_in_beforeDeclaration527 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_beforeDeclaration529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_adviceBody_in_beforeDeclaration531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_afterDeclaration543 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_afterDeclaration545 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_symbolList_in_afterDeclaration547 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_afterDeclaration549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_adviceBody_in_afterDeclaration551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbol_in_symbolList563 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_symbolList566 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_symbol_in_symbolList568 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_46_in_symbol583 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_symbol585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_specDeclaration598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_specDeclaration600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_specBody_in_specDeclaration602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParameters_in_genericMethodOrConstructorDecl614 = new BitSet(new long[]{0x8001000000000010L,0x000000000000007FL});
    public static final BitSet FOLLOW_genericMethodOrConstructorRest_in_genericMethodOrConstructorDecl616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_genericMethodOrConstructorRest629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_48_in_genericMethodOrConstructorRest633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_genericMethodOrConstructorRest636 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_methodDeclaratorRest_in_genericMethodOrConstructorRest638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_genericMethodOrConstructorRest643 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_constructorDeclaratorRest_in_genericMethodOrConstructorRest645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_methodDeclaration656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_methodDeclaration658 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_methodDeclaratorRest_in_methodDeclaration660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_fieldDeclaration671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclarators_in_fieldDeclaration673 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_fieldDeclaration675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_interfaceBodyDeclaration688 = new BitSet(new long[]{0xFFE10080C4000010L,0x000000000000207FL});
    public static final BitSet FOLLOW_interfaceMemberDecl_in_interfaceBodyDeclaration691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_interfaceBodyDeclaration698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceMethodOrFieldDecl_in_interfaceMemberDecl709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceGenericMethodDecl_in_interfaceMemberDecl716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_interfaceMemberDecl726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_interfaceMemberDecl728 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_voidInterfaceMethodDeclaratorRest_in_interfaceMemberDecl730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDeclaration_in_interfaceMemberDecl740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_interfaceMemberDecl750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_interfaceMethodOrFieldDecl762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_interfaceMethodOrFieldDecl764 = new BitSet(new long[]{0x0012080000000000L});
    public static final BitSet FOLLOW_interfaceMethodOrFieldRest_in_interfaceMethodOrFieldDecl766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantDeclaratorsRest_in_interfaceMethodOrFieldRest778 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_interfaceMethodOrFieldRest780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceMethodDeclaratorRest_in_interfaceMethodOrFieldRest785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaratorRest797 = new BitSet(new long[]{0x000A000020000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_49_in_methodDeclaratorRest800 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_methodDeclaratorRest802 = new BitSet(new long[]{0x000A000020000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_51_in_methodDeclaratorRest815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_qualifiedNameList_in_methodDeclaratorRest817 = new BitSet(new long[]{0x0000000020000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_methodBody_in_methodDeclaratorRest833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_methodDeclaratorRest847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_voidMethodDeclaratorRest869 = new BitSet(new long[]{0x0008000020000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_51_in_voidMethodDeclaratorRest872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_qualifiedNameList_in_voidMethodDeclaratorRest874 = new BitSet(new long[]{0x0000000020000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_methodBody_in_voidMethodDeclaratorRest890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_voidMethodDeclaratorRest904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_interfaceMethodDeclaratorRest926 = new BitSet(new long[]{0x000A000020000000L});
    public static final BitSet FOLLOW_49_in_interfaceMethodDeclaratorRest929 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_interfaceMethodDeclaratorRest931 = new BitSet(new long[]{0x000A000020000000L});
    public static final BitSet FOLLOW_51_in_interfaceMethodDeclaratorRest936 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_qualifiedNameList_in_interfaceMethodDeclaratorRest938 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_interfaceMethodDeclaratorRest942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParameters_in_interfaceGenericMethodDecl954 = new BitSet(new long[]{0x8001000000000010L,0x000000000000007FL});
    public static final BitSet FOLLOW_type_in_interfaceGenericMethodDecl957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_48_in_interfaceGenericMethodDecl961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_interfaceGenericMethodDecl964 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_interfaceMethodDeclaratorRest_in_interfaceGenericMethodDecl974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_voidInterfaceMethodDeclaratorRest986 = new BitSet(new long[]{0x0008000020000000L});
    public static final BitSet FOLLOW_51_in_voidInterfaceMethodDeclaratorRest989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_qualifiedNameList_in_voidInterfaceMethodDeclaratorRest991 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_voidInterfaceMethodDeclaratorRest995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_constructorDeclaratorRest1007 = new BitSet(new long[]{0x0008000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_51_in_constructorDeclaratorRest1010 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_qualifiedNameList_in_constructorDeclaratorRest1012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_methodBody_in_constructorDeclaratorRest1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_constantDeclarator1027 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_constantDeclaratorRest_in_constantDeclarator1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1041 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_variableDeclarators1044 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1046 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_Identifier_in_variableDeclarator1059 = new BitSet(new long[]{0x0012000000000002L});
    public static final BitSet FOLLOW_variableDeclaratorRest_in_variableDeclarator1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_variableDeclaratorRest1074 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_variableDeclaratorRest1076 = new BitSet(new long[]{0x0012000000000002L});
    public static final BitSet FOLLOW_52_in_variableDeclaratorRest1081 = new BitSet(new long[]{0x8001082080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclaratorRest1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_variableDeclaratorRest1090 = new BitSet(new long[]{0x8001082080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclaratorRest1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantDeclaratorRest_in_constantDeclaratorsRest1112 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_constantDeclaratorsRest1115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_constantDeclarator_in_constantDeclaratorsRest1117 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_49_in_constantDeclaratorRest1134 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_constantDeclaratorRest1136 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_52_in_constantDeclaratorRest1140 = new BitSet(new long[]{0x8001082080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_variableInitializer_in_constantDeclaratorRest1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_variableDeclaratorId1154 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_variableDeclaratorId1157 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_variableDeclaratorId1159 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_arrayInitializer1194 = new BitSet(new long[]{0x8001086080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer1197 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_32_in_arrayInitializer1200 = new BitSet(new long[]{0x8001082080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer1202 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_32_in_arrayInitializer1207 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_arrayInitializer1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_modifier1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_modifier1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_modifier1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_modifier1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_modifier1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_modifier1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_modifier1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_modifier1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_modifier1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_modifier1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_modifier1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_modifier1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_packageOrTypeName1354 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_packageOrTypeName1357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_packageOrTypeName1359 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_Identifier_in_enumConstantName1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_typeName1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_packageOrTypeName_in_typeName1403 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_typeName1405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_typeName1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_type1418 = new BitSet(new long[]{0x0002000088000002L});
    public static final BitSet FOLLOW_typeArguments_in_type1421 = new BitSet(new long[]{0x0002000008000002L});
    public static final BitSet FOLLOW_27_in_type1426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_type1428 = new BitSet(new long[]{0x0002000088000002L});
    public static final BitSet FOLLOW_typeArguments_in_type1431 = new BitSet(new long[]{0x0002000008000002L});
    public static final BitSet FOLLOW_49_in_type1439 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_type1441 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type1448 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_type1451 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_type1453 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_variableModifier1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_variableModifier1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_typeArguments1562 = new BitSet(new long[]{0x8000000000000010L,0x00000000000000FFL});
    public static final BitSet FOLLOW_typeArgument_in_typeArguments1564 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_typeArguments1567 = new BitSet(new long[]{0x8000000000000010L,0x00000000000000FFL});
    public static final BitSet FOLLOW_typeArgument_in_typeArguments1569 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_33_in_typeArguments1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeArgument1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_typeArgument1590 = new BitSet(new long[]{0x0000000400000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_set_in_typeArgument1593 = new BitSet(new long[]{0x8000000000000010L,0x000000000000007FL});
    public static final BitSet FOLLOW_type_in_typeArgument1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList1615 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_qualifiedNameList1618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList1620 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_43_in_formalParameters1634 = new BitSet(new long[]{0x8200100000000010L,0x000000000000207FL});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters1636 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_formalParameters1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_formalParameterDecls1651 = new BitSet(new long[]{0x8000000000000010L,0x000000000000207FL});
    public static final BitSet FOLLOW_annotations_in_formalParameterDecls1654 = new BitSet(new long[]{0x8000000000000010L,0x000000000000007FL});
    public static final BitSet FOLLOW_type_in_formalParameterDecls1657 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000200L});
    public static final BitSet FOLLOW_formalParameterDeclsRest_in_formalParameterDecls1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest1672 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_formalParameterDeclsRest1675 = new BitSet(new long[]{0x8200000000000010L,0x000000000000207FL});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDeclsRest1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_formalParameterDeclsRest1686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_methodBody1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedName1711 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_qualifiedName1714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedName1716 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_integerLiteral_in_literal1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_literal1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharacterLiteral_in_literal1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_literal1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_integerLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_annotations1864 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_annotation1876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_typeName_in_annotation1878 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_annotation1881 = new BitSet(new long[]{0x8001082080000FD0L,0x01F9800000003D7FL});
    public static final BitSet FOLLOW_Identifier_in_annotation1884 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_annotation1886 = new BitSet(new long[]{0x8001082080000FD0L,0x01F9800000003D7FL});
    public static final BitSet FOLLOW_elementValue_in_annotation1890 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_annotation1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_elementValue1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_elementValue1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementValueArrayInitializer_in_elementValue1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_elementValueArrayInitializer1932 = new BitSet(new long[]{0x8001086180000FD0L,0x01F9800000003D7FL});
    public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer1935 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_32_in_elementValueArrayInitializer1940 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_elementValueArrayInitializer1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_annotationTypeDeclaration1956 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_annotationTypeDeclaration1958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_annotationTypeDeclaration1960 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_annotationTypeBody_in_annotationTypeDeclaration1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_annotationTypeBody1974 = new BitSet(new long[]{0xFFE000C044000030L,0x000000000000207FL});
    public static final BitSet FOLLOW_annotationTypeElementDeclarations_in_annotationTypeBody1977 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_annotationTypeBody1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationTypeElementDeclaration_in_annotationTypeElementDeclarations1994 = new BitSet(new long[]{0xFFE0008044000032L,0x000000000000207FL});
    public static final BitSet FOLLOW_annotationTypeElementDeclaration_in_annotationTypeElementDeclarations1998 = new BitSet(new long[]{0xFFE0008044000032L,0x000000000000207FL});
    public static final BitSet FOLLOW_modifier_in_annotationTypeElementDeclaration2013 = new BitSet(new long[]{0xFFE0008044000030L,0x000000000000207FL});
    public static final BitSet FOLLOW_annotationTypeElementRest_in_annotationTypeElementDeclaration2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_annotationTypeElementRest2029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_annotationTypeElementRest2031 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_annotationMethodOrConstantRest_in_annotationTypeElementRest2033 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_annotationTypeElementRest2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_annotationTypeElementRest2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDeclaration_in_annotationTypeElementRest2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDeclaration_in_annotationTypeElementRest2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationTypeDeclaration_in_annotationTypeElementRest2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationMethodRest_in_annotationMethodOrConstantRest2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationConstantRest_in_annotationMethodOrConstantRest2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_annotationMethodRest2095 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_annotationMethodRest2097 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_defaultValue_in_annotationMethodRest2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarators_in_annotationConstantRest2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_defaultValue2132 = new BitSet(new long[]{0x8001082080000FD0L,0x01F9800000003D7FL});
    public static final BitSet FOLLOW_elementValue_in_defaultValue2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_adviceBody2148 = new BitSet(new long[]{0xFFE10A80E4000FD0L,0x01F980003EF73D7FL});
    public static final BitSet FOLLOW_blockStatement_in_adviceBody2150 = new BitSet(new long[]{0xFFE10A80E4000FD0L,0x01F980003EF73D7FL});
    public static final BitSet FOLLOW_41_in_adviceBody2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_specBody2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_block2175 = new BitSet(new long[]{0xFFE10A80E4000FD0L,0x01F980003EF73D7FL});
    public static final BitSet FOLLOW_blockStatement_in_block2177 = new BitSet(new long[]{0xFFE10A80E4000FD0L,0x01F980003EF73D7FL});
    public static final BitSet FOLLOW_41_in_block2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_blockStatement2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_blockStatement2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_localVariableDeclaration2225 = new BitSet(new long[]{0x8000000000000010L,0x000000000000007FL});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration2229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclarators_in_localVariableDeclaration2231 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_localVariableDeclaration2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_statement2253 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_expression_in_statement2255 = new BitSet(new long[]{0x0000400020000000L});
    public static final BitSet FOLLOW_46_in_statement2258 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_expression_in_statement2260 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_statement2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_statement2272 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_parExpression_in_statement2274 = new BitSet(new long[]{0x88010800A0000FD0L,0x01F980003EF71D7FL});
    public static final BitSet FOLLOW_statement_in_statement2276 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_statement2279 = new BitSet(new long[]{0x88010800A0000FD0L,0x01F980003EF71D7FL});
    public static final BitSet FOLLOW_statement_in_statement2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_statement2291 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_statement2293 = new BitSet(new long[]{0x82010800A0000FD0L,0x01F9800000003D7FL});
    public static final BitSet FOLLOW_forControl_in_statement2295 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_statement2297 = new BitSet(new long[]{0x88010800A0000FD0L,0x01F980003EF71D7FL});
    public static final BitSet FOLLOW_statement_in_statement2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_statement2307 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_parExpression_in_statement2309 = new BitSet(new long[]{0x88010800A0000FD0L,0x01F980003EF71D7FL});
    public static final BitSet FOLLOW_statement_in_statement2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_statement2319 = new BitSet(new long[]{0x88010800A0000FD0L,0x01F980003EF71D7FL});
    public static final BitSet FOLLOW_statement_in_statement2321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_statement2323 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_parExpression_in_statement2325 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_statement2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_statement2335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_block_in_statement2337 = new BitSet(new long[]{0x0000000000000000L,0x0000000041000000L});
    public static final BitSet FOLLOW_catches_in_statement2347 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_statement2349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_block_in_statement2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catches_in_statement2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_statement2371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_block_in_statement2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_statement2389 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_parExpression_in_statement2391 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_statement2393 = new BitSet(new long[]{0x0000004000000000L,0x0000000080004000L});
    public static final BitSet FOLLOW_switchBlockStatementGroups_in_statement2395 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_statement2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_statement2405 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_parExpression_in_statement2407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_block_in_statement2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_statement2417 = new BitSet(new long[]{0x80010800A0000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_expression_in_statement2419 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_statement2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_statement2430 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_expression_in_statement2432 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_statement2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_statement2442 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_Identifier_in_statement2444 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_statement2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_statement2455 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_Identifier_in_statement2457 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_statement2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_statement2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementExpression_in_statement2476 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_statement2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_statement2486 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_statement2488 = new BitSet(new long[]{0x88010800A0000FD0L,0x01F980003EF71D7FL});
    public static final BitSet FOLLOW_statement_in_statement2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchClause_in_catches2502 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_catchClause_in_catches2505 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_catchClause2519 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_catchClause2521 = new BitSet(new long[]{0x8200000000000010L,0x000000000000207FL});
    public static final BitSet FOLLOW_formalParameter_in_catchClause2523 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_catchClause2525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_block_in_catchClause2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifier_in_formalParameter2538 = new BitSet(new long[]{0x8200000000000010L,0x000000000000207FL});
    public static final BitSet FOLLOW_type_in_formalParameter2541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameter2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups2557 = new BitSet(new long[]{0x0000000000000002L,0x0000000080004000L});
    public static final BitSet FOLLOW_switchLabel_in_switchBlockStatementGroup2571 = new BitSet(new long[]{0xFFE10880E4000FD2L,0x01F980003EF73D7FL});
    public static final BitSet FOLLOW_blockStatement_in_switchBlockStatementGroup2573 = new BitSet(new long[]{0xFFE10880E4000FD2L,0x01F980003EF73D7FL});
    public static final BitSet FOLLOW_95_in_switchLabel2586 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_constantExpression_in_switchLabel2588 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_switchLabel2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_switchLabel2597 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_enumConstantName_in_switchLabel2599 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_switchLabel2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_switchLabel2608 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_switchLabel2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_moreStatementExpressions2623 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_statementExpression_in_moreStatementExpressions2625 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_forVarControl_in_forControl2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInit_in_forControl2645 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_forControl2648 = new BitSet(new long[]{0x80010800A0000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_expression_in_forControl2650 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_forControl2653 = new BitSet(new long[]{0x8001080080000FD2L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_forUpdate_in_forControl2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_forInit2667 = new BitSet(new long[]{0x8000000000000010L,0x000000000000007FL});
    public static final BitSet FOLLOW_type_in_forInit2670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclarators_in_forInit2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_forVarControl2694 = new BitSet(new long[]{0x8000000000000010L,0x000000000000207FL});
    public static final BitSet FOLLOW_annotation_in_forVarControl2698 = new BitSet(new long[]{0x8000000000000010L,0x000000000000007FL});
    public static final BitSet FOLLOW_type_in_forVarControl2702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_forVarControl2704 = new BitSet(new long[]{0x0012400120000000L});
    public static final BitSet FOLLOW_forVarControlRest_in_forVarControl2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaratorRest_in_forVarControlRest2717 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_32_in_forVarControlRest2720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclarator_in_forVarControlRest2722 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_29_in_forVarControlRest2726 = new BitSet(new long[]{0x8001480080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_expression_in_forVarControlRest2728 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_forVarControlRest2731 = new BitSet(new long[]{0x8001080080000FD2L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_forUpdate_in_forVarControlRest2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_forVarControlRest2744 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_expression_in_forVarControlRest2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forUpdate2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_parExpression2770 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_expression_in_parExpression2772 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_parExpression2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList2791 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_expressionList2794 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_expression_in_expressionList2796 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_expression_in_statementExpression2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_constantExpression2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_expression2836 = new BitSet(new long[]{0x0010000280000002L,0x000000FF00000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression2839 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_expression_in_expression2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_assignmentOperator2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_assignmentOperator2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_assignmentOperator2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_assignmentOperator2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_assignmentOperator2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_assignmentOperator2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_assignmentOperator2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_assignmentOperator2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_assignmentOperator2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_assignmentOperator2945 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_assignmentOperator2947 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_assignmentOperator2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_assignmentOperator2959 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_assignmentOperator2961 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_assignmentOperator2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_assignmentOperator2973 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_assignmentOperator2975 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_assignmentOperator2977 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_assignmentOperator2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression2995 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_conditionalExpression2999 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_expression_in_conditionalExpression3001 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_conditionalExpression3003 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_expression_in_conditionalExpression3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression3024 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_conditionalOrExpression3028 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression3030 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression3049 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_conditionalAndExpression3053 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression3055 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression3074 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_inclusiveOrExpression3078 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression3080 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression3099 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_exclusiveOrExpression3103 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression3105 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression3124 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_andExpression3128 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression3130 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression3149 = new BitSet(new long[]{0x0000000000000002L,0x0000300000000000L});
    public static final BitSet FOLLOW_set_in_equalityExpression3153 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression3161 = new BitSet(new long[]{0x0000000000000002L,0x0000300000000000L});
    public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression3180 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_instanceOfExpression3183 = new BitSet(new long[]{0x8000000000000010L,0x000000000000007FL});
    public static final BitSet FOLLOW_type_in_instanceOfExpression3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression3203 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_relationalOp_in_relationalExpression3207 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression3209 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_31_in_relationalOp3225 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_relationalOp3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_relationalOp3231 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_relationalOp3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_relationalOp3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_relationalOp3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression3258 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_shiftOp_in_shiftExpression3262 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression3264 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_31_in_shiftOp3288 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_shiftOp3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_shiftOp3294 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_shiftOp3296 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_shiftOp3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_shiftOp3302 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_shiftOp3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3322 = new BitSet(new long[]{0x0000000000000002L,0x0001800000000000L});
    public static final BitSet FOLLOW_set_in_additiveExpression3326 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3334 = new BitSet(new long[]{0x0000000000000002L,0x0001800000000000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression3353 = new BitSet(new long[]{0x0000000010000002L,0x0006000000000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression3357 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression3371 = new BitSet(new long[]{0x0000000010000002L,0x0006000000000000L});
    public static final BitSet FOLLOW_111_in_unaryExpression3391 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_unaryExpression3401 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_unaryExpression3413 = new BitSet(new long[]{0x8001080080000FD0L,0x0180000000001D7FL});
    public static final BitSet FOLLOW_primary_in_unaryExpression3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_unaryExpression3425 = new BitSet(new long[]{0x8001080080000FD0L,0x0180000000001D7FL});
    public static final BitSet FOLLOW_primary_in_unaryExpression3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_unaryExpressionNotPlusMinus3456 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_unaryExpressionNotPlusMinus3467 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpression_in_unaryExpressionNotPlusMinus3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus3489 = new BitSet(new long[]{0x0002000008000002L,0x0018000000000000L});
    public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus3491 = new BitSet(new long[]{0x0002000008000002L,0x0018000000000000L});
    public static final BitSet FOLLOW_set_in_unaryExpressionNotPlusMinus3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_castExpression3517 = new BitSet(new long[]{0x8000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_primitiveType_in_castExpression3519 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_castExpression3521 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_unaryExpression_in_castExpression3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_castExpression3532 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_expression_in_castExpression3535 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_type_in_castExpression3539 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_castExpression3542 = new BitSet(new long[]{0x8001080080000FD0L,0x01E0000000001D7FL});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_castExpression3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_primary3571 = new BitSet(new long[]{0x0000000000000010L,0x0080000000000100L});
    public static final BitSet FOLLOW_explicitGenericInvocationSuffix_in_primary3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_primary3586 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_arguments_in_primary3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_primary3599 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_arguments_in_primary3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_primary3614 = new BitSet(new long[]{0x0000080008000000L});
    public static final BitSet FOLLOW_superSuffix_in_primary3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_primary3636 = new BitSet(new long[]{0x8000000080000010L,0x000000000000007FL});
    public static final BitSet FOLLOW_creator_in_primary3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_primary3648 = new BitSet(new long[]{0x0002080008000002L});
    public static final BitSet FOLLOW_27_in_primary3651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_primary3653 = new BitSet(new long[]{0x0002080008000002L});
    public static final BitSet FOLLOW_identifierSuffix_in_primary3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_primary3670 = new BitSet(new long[]{0x0002000008000000L});
    public static final BitSet FOLLOW_49_in_primary3673 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_primary3675 = new BitSet(new long[]{0x0002000008000000L});
    public static final BitSet FOLLOW_27_in_primary3679 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_primary3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_primary3691 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_primary3693 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_primary3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_identifierSuffix3707 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_identifierSuffix3709 = new BitSet(new long[]{0x0002000008000000L});
    public static final BitSet FOLLOW_27_in_identifierSuffix3713 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_identifierSuffix3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_identifierSuffix3721 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_expression_in_identifierSuffix3723 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_identifierSuffix3725 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_arguments_in_identifierSuffix3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_identifierSuffix3748 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_identifierSuffix3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_identifierSuffix3760 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_explicitGenericInvocation_in_identifierSuffix3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_identifierSuffix3772 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_identifierSuffix3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_identifierSuffix3784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_identifierSuffix3786 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_arguments_in_identifierSuffix3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_identifierSuffix3798 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_identifierSuffix3800 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_identifierSuffix3803 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_innerCreator_in_identifierSuffix3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_creator3819 = new BitSet(new long[]{0x8000000000000010L,0x000000000000007FL});
    public static final BitSet FOLLOW_createdName_in_creator3822 = new BitSet(new long[]{0x0002080000000000L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_creator3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_createdName3849 = new BitSet(new long[]{0x0000000088000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_createdName3851 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_createdName3863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_createdName3865 = new BitSet(new long[]{0x0000000088000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_createdName3867 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_innerCreator3890 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_classCreatorRest_in_innerCreator3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_arrayCreatorRest3903 = new BitSet(new long[]{0x8005080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_50_in_arrayCreatorRest3917 = new BitSet(new long[]{0x0002002000000000L});
    public static final BitSet FOLLOW_49_in_arrayCreatorRest3920 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_arrayCreatorRest3922 = new BitSet(new long[]{0x0002002000000000L});
    public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest3940 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_arrayCreatorRest3942 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_arrayCreatorRest3945 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest3947 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_arrayCreatorRest3949 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_arrayCreatorRest3954 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_arrayCreatorRest3956 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest3979 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_classBody_in_classCreatorRest3981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitGenericInvocation3994 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000100L});
    public static final BitSet FOLLOW_explicitGenericInvocationSuffix_in_explicitGenericInvocation3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_nonWildcardTypeArguments4008 = new BitSet(new long[]{0x8000000000000010L,0x000000000000007FL});
    public static final BitSet FOLLOW_typeList_in_nonWildcardTypeArguments4010 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_nonWildcardTypeArguments4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_explicitGenericInvocationSuffix4024 = new BitSet(new long[]{0x0000080008000000L});
    public static final BitSet FOLLOW_superSuffix_in_explicitGenericInvocationSuffix4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_explicitGenericInvocationSuffix4033 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_arguments_in_explicitGenericInvocationSuffix4035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_selector4047 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_selector4049 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_arguments_in_selector4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_selector4061 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_selector4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_selector4070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_selector4072 = new BitSet(new long[]{0x0000080008000000L});
    public static final BitSet FOLLOW_superSuffix_in_selector4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_selector4081 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_selector4083 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_selector4086 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_innerCreator_in_selector4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_selector4097 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_expression_in_selector4099 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_selector4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_superSuffix4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_superSuffix4120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_superSuffix4122 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_arguments_in_superSuffix4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_arguments4141 = new BitSet(new long[]{0x8001180080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_expressionList_in_arguments4143 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_arguments4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred771357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_synpred771359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDeclaration_in_synpred1252049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_synpred1312192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_synpred1372279 = new BitSet(new long[]{0x88010800A0000FD0L,0x01F980003EF71D7FL});
    public static final BitSet FOLLOW_statement_in_synpred1372281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catches_in_synpred1422347 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_synpred1422349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_block_in_synpred1422351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catches_in_synpred1432361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_synpred1602586 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_constantExpression_in_synpred1602588 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_synpred1602590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_synpred1612597 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_enumConstantName_in_synpred1612599 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_synpred1612601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forVarControl_in_synpred1632638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_synpred1682667 = new BitSet(new long[]{0x8000000000000010L,0x000000000000007FL});
    public static final BitSet FOLLOW_type_in_synpred1682670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclarators_in_synpred1682672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentOperator_in_synpred1762839 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_expression_in_synpred1762841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred1872959 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_synpred1872961 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred1872963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalOp_in_synpred1973207 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_shiftExpression_in_synpred1973209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftOp_in_synpred2013262 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_additiveExpression_in_synpred2013264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred2033294 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_synpred2033296 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_synpred2033298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpression_in_synpred2153479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred2193517 = new BitSet(new long[]{0x8000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_primitiveType_in_synpred2193519 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_synpred2193521 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_unaryExpression_in_synpred2193523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred2203535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred2293651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_synpred2293653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierSuffix_in_synpred2303658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred2363721 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_expression_in_synpred2363723 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_synpred2363725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred2523945 = new BitSet(new long[]{0x8001080080000FD0L,0x01F9800000001D7FL});
    public static final BitSet FOLLOW_expression_in_synpred2523947 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_synpred2523949 = new BitSet(new long[]{0x0000000000000002L});

}