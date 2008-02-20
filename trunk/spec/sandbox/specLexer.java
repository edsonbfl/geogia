// $ANTLR 3.0.1 ./src/spec.g3 2007-12-16 06:33:13

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class specLexer extends Lexer {
    public static final int T114=114;
    public static final int T115=115;
    public static final int T116=116;
    public static final int T117=117;
    public static final int T118=118;
    public static final int T119=119;
    public static final int FloatTypeSuffix=16;
    public static final int OctalLiteral=11;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T120=120;
    public static final int T122=122;
    public static final int Identifier=5;
    public static final int T121=121;
    public static final int T124=124;
    public static final int T123=123;
    public static final int T127=127;
    public static final int T125=125;
    public static final int T126=126;
    public static final int EOL=4;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int COMMENT=23;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int LINE_COMMENT=24;
    public static final int IntegerTypeSuffix=14;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T100=100;
    public static final int T43=43;
    public static final int T42=42;
    public static final int T102=102;
    public static final int T41=41;
    public static final int T101=101;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int T44=44;
    public static final int T109=109;
    public static final int T107=107;
    public static final int T108=108;
    public static final int T105=105;
    public static final int WS=22;
    public static final int T106=106;
    public static final int T103=103;
    public static final int T104=104;
    public static final int T50=50;
    public static final int FloatingPointLiteral=7;
    public static final int JavaIDDigit=21;
    public static final int T59=59;
    public static final int T113=113;
    public static final int T52=52;
    public static final int T112=112;
    public static final int T51=51;
    public static final int T111=111;
    public static final int T54=54;
    public static final int T110=110;
    public static final int EscapeSequence=17;
    public static final int Letter=20;
    public static final int T53=53;
    public static final int T56=56;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int T74=74;
    public static final int T79=79;
    public static final int T77=77;
    public static final int T78=78;
    public static final int CharacterLiteral=8;
    public static final int Exponent=15;
    public static final int HexDigit=13;
    public static final int T72=72;
    public static final int T71=71;
    public static final int T70=70;
    public static final int T62=62;
    public static final int T63=63;
    public static final int T64=64;
    public static final int T65=65;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int T61=61;
    public static final int T60=60;
    public static final int HexLiteral=10;
    public static final int T99=99;
    public static final int T97=97;
    public static final int T98=98;
    public static final int T95=95;
    public static final int T96=96;
    public static final int T94=94;
    public static final int Tokens=128;
    public static final int T93=93;
    public static final int DecimalLiteral=12;
    public static final int T92=92;
    public static final int T91=91;
    public static final int T90=90;
    public static final int StringLiteral=9;
    public static final int T88=88;
    public static final int T89=89;
    public static final int T84=84;
    public static final int ENUM=6;
    public static final int T85=85;
    public static final int T86=86;
    public static final int T87=87;
    public static final int UnicodeEscape=18;
    public static final int T81=81;
    public static final int T80=80;
    public static final int T83=83;
    public static final int OctalEscape=19;
    public static final int T82=82;
    
    protected boolean enumIsKeyword = false;

    public specLexer() {;} 
    public specLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "./src/spec.g3"; }

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ./src/spec.g3:6:5: ( '\\u0e41\\u0e1e\\u0e47\\u0e04\\u0e40\\u0e01\\u0e08' )
            // ./src/spec.g3:6:7: '\\u0e41\\u0e1e\\u0e47\\u0e04\\u0e40\\u0e01\\u0e08'
            {
            match("\u0e41\u0e1e\u0e47\u0e04\u0e40\u0e01\u0e08"); 


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
            // ./src/spec.g3:7:5: ( ';' )
            // ./src/spec.g3:7:7: ';'
            {
            match(';'); 

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
            // ./src/spec.g3:8:5: ( '\\u0e19\\u0e33\\u0e40\\u0e02\\u0e49\\u0e32' )
            // ./src/spec.g3:8:7: '\\u0e19\\u0e33\\u0e40\\u0e02\\u0e49\\u0e32'
            {
            match("\u0e19\u0e33\u0e40\u0e02\u0e49\u0e32"); 


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
            // ./src/spec.g3:9:5: ( 'static' )
            // ./src/spec.g3:9:7: 'static'
            {
            match("static"); 


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
            // ./src/spec.g3:10:5: ( '.' )
            // ./src/spec.g3:10:7: '.'
            {
            match('.'); 

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
            // ./src/spec.g3:11:5: ( '*' )
            // ./src/spec.g3:11:7: '*'
            {
            match('*'); 

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
            // ./src/spec.g3:12:5: ( '\\u0e2d\\u0e18\\u0e34\\u0e1a\\u0e32\\u0e22' )
            // ./src/spec.g3:12:7: '\\u0e2d\\u0e18\\u0e34\\u0e1a\\u0e32\\u0e22'
            {
            match("\u0e2d\u0e18\u0e34\u0e1a\u0e32\u0e22"); 


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
            // ./src/spec.g3:13:5: ( '<' )
            // ./src/spec.g3:13:7: '<'
            {
            match('<'); 

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
            // ./src/spec.g3:14:5: ( ',' )
            // ./src/spec.g3:14:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ./src/spec.g3:15:5: ( '>' )
            // ./src/spec.g3:15:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ./src/spec.g3:16:5: ( 'extends' )
            // ./src/spec.g3:16:7: 'extends'
            {
            match("extends"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ./src/spec.g3:17:5: ( '&' )
            // ./src/spec.g3:17:7: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ./src/spec.g3:18:5: ( 'implements' )
            // ./src/spec.g3:18:7: 'implements'
            {
            match("implements"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ./src/spec.g3:19:5: ( '{' )
            // ./src/spec.g3:19:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ./src/spec.g3:20:5: ( '}' )
            // ./src/spec.g3:20:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ./src/spec.g3:21:5: ( 'interface' )
            // ./src/spec.g3:21:7: 'interface'
            {
            match("interface"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ./src/spec.g3:22:5: ( '\\u0e14\\u0e31\\u0e07\\u0e19\\u0e35\\u0e49' )
            // ./src/spec.g3:22:7: '\\u0e14\\u0e31\\u0e07\\u0e19\\u0e35\\u0e49'
            {
            match("\u0e14\u0e31\u0e07\u0e19\u0e35\u0e49"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ./src/spec.g3:23:5: ( '\\u0e08\\u0e1a' )
            // ./src/spec.g3:23:7: '\\u0e08\\u0e1a'
            {
            match("\u0e08\u0e1a"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ./src/spec.g3:24:5: ( '\\u0e01\\u0e48\\u0e2d\\u0e19' )
            // ./src/spec.g3:24:7: '\\u0e01\\u0e48\\u0e2d\\u0e19'
            {
            match("\u0e01\u0e48\u0e2d\u0e19"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ./src/spec.g3:25:5: ( '(' )
            // ./src/spec.g3:25:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ./src/spec.g3:26:5: ( ')' )
            // ./src/spec.g3:26:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ./src/spec.g3:27:5: ( '\\u0e2b\\u0e25\\u0e31\\u0e07' )
            // ./src/spec.g3:27:7: '\\u0e2b\\u0e25\\u0e31\\u0e07'
            {
            match("\u0e2b\u0e25\u0e31\u0e07"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ./src/spec.g3:28:5: ( ':' )
            // ./src/spec.g3:28:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ./src/spec.g3:29:5: ( '\\u0e01\\u0e33\\u0e2b\\u0e19\\u0e14\\u0e43\\u0e2b\\u0e49' )
            // ./src/spec.g3:29:7: '\\u0e01\\u0e33\\u0e2b\\u0e19\\u0e14\\u0e43\\u0e2b\\u0e49'
            {
            match("\u0e01\u0e33\u0e2b\u0e19\u0e14\u0e43\u0e2b\u0e49"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ./src/spec.g3:30:5: ( 'void' )
            // ./src/spec.g3:30:7: 'void'
            {
            match("void"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ./src/spec.g3:31:5: ( '[' )
            // ./src/spec.g3:31:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ./src/spec.g3:32:5: ( ']' )
            // ./src/spec.g3:32:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ./src/spec.g3:33:5: ( 'throws' )
            // ./src/spec.g3:33:7: 'throws'
            {
            match("throws"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ./src/spec.g3:34:5: ( '=' )
            // ./src/spec.g3:34:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ./src/spec.g3:35:5: ( 'public' )
            // ./src/spec.g3:35:7: 'public'
            {
            match("public"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ./src/spec.g3:36:5: ( 'protected' )
            // ./src/spec.g3:36:7: 'protected'
            {
            match("protected"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ./src/spec.g3:37:5: ( 'private' )
            // ./src/spec.g3:37:7: 'private'
            {
            match("private"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ./src/spec.g3:38:5: ( 'abstract' )
            // ./src/spec.g3:38:7: 'abstract'
            {
            match("abstract"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ./src/spec.g3:39:5: ( 'final' )
            // ./src/spec.g3:39:7: 'final'
            {
            match("final"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ./src/spec.g3:40:5: ( 'native' )
            // ./src/spec.g3:40:7: 'native'
            {
            match("native"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ./src/spec.g3:41:5: ( 'synchronized' )
            // ./src/spec.g3:41:7: 'synchronized'
            {
            match("synchronized"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ./src/spec.g3:42:5: ( 'transient' )
            // ./src/spec.g3:42:7: 'transient'
            {
            match("transient"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // ./src/spec.g3:43:5: ( 'volatile' )
            // ./src/spec.g3:43:7: 'volatile'
            {
            match("volatile"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // ./src/spec.g3:44:5: ( 'strictfp' )
            // ./src/spec.g3:44:7: 'strictfp'
            {
            match("strictfp"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // ./src/spec.g3:45:5: ( 'boolean' )
            // ./src/spec.g3:45:7: 'boolean'
            {
            match("boolean"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // ./src/spec.g3:46:5: ( 'char' )
            // ./src/spec.g3:46:7: 'char'
            {
            match("char"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // ./src/spec.g3:47:5: ( 'byte' )
            // ./src/spec.g3:47:7: 'byte'
            {
            match("byte"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // ./src/spec.g3:48:5: ( 'short' )
            // ./src/spec.g3:48:7: 'short'
            {
            match("short"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // ./src/spec.g3:49:5: ( 'int' )
            // ./src/spec.g3:49:7: 'int'
            {
            match("int"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // ./src/spec.g3:50:5: ( 'long' )
            // ./src/spec.g3:50:7: 'long'
            {
            match("long"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // ./src/spec.g3:51:5: ( 'float' )
            // ./src/spec.g3:51:7: 'float'
            {
            match("float"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // ./src/spec.g3:52:5: ( 'double' )
            // ./src/spec.g3:52:7: 'double'
            {
            match("double"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // ./src/spec.g3:53:5: ( '?' )
            // ./src/spec.g3:53:7: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // ./src/spec.g3:54:5: ( 'super' )
            // ./src/spec.g3:54:7: 'super'
            {
            match("super"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // ./src/spec.g3:55:5: ( '...' )
            // ./src/spec.g3:55:7: '...'
            {
            match("..."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // ./src/spec.g3:56:5: ( 'null' )
            // ./src/spec.g3:56:7: 'null'
            {
            match("null"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // ./src/spec.g3:57:5: ( '\\u0e27\\u0e48\\u0e32\\u0e07' )
            // ./src/spec.g3:57:7: '\\u0e27\\u0e48\\u0e32\\u0e07'
            {
            match("\u0e27\u0e48\u0e32\u0e07"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // ./src/spec.g3:58:5: ( 'true' )
            // ./src/spec.g3:58:7: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // ./src/spec.g3:59:5: ( 'false' )
            // ./src/spec.g3:59:7: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // ./src/spec.g3:60:5: ( '\\u0e08\\u0e23\\u0e34\\u0e07' )
            // ./src/spec.g3:60:7: '\\u0e08\\u0e23\\u0e34\\u0e07'
            {
            match("\u0e08\u0e23\u0e34\u0e07"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public final void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // ./src/spec.g3:61:5: ( '\\u0e40\\u0e17\\u0e47\\u0e08' )
            // ./src/spec.g3:61:7: '\\u0e40\\u0e17\\u0e47\\u0e08'
            {
            match("\u0e40\u0e17\u0e47\u0e08"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start T81
    public final void mT81() throws RecognitionException {
        try {
            int _type = T81;
            // ./src/spec.g3:62:5: ( '@' )
            // ./src/spec.g3:62:7: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start T82
    public final void mT82() throws RecognitionException {
        try {
            int _type = T82;
            // ./src/spec.g3:63:5: ( 'default' )
            // ./src/spec.g3:63:7: 'default'
            {
            match("default"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T82

    // $ANTLR start T83
    public final void mT83() throws RecognitionException {
        try {
            int _type = T83;
            // ./src/spec.g3:64:5: ( '\\u0e43\\u0e2b\\u0e49\\u0e17\\u0e33' )
            // ./src/spec.g3:64:7: '\\u0e43\\u0e2b\\u0e49\\u0e17\\u0e33'
            {
            match("\u0e43\u0e2b\u0e49\u0e17\u0e33"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T83

    // $ANTLR start T84
    public final void mT84() throws RecognitionException {
        try {
            int _type = T84;
            // ./src/spec.g3:65:5: ( '\\u0e42\\u0e14\\u0e22' )
            // ./src/spec.g3:65:7: '\\u0e42\\u0e14\\u0e22'
            {
            match("\u0e42\u0e14\u0e22"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T84

    // $ANTLR start T85
    public final void mT85() throws RecognitionException {
        try {
            int _type = T85;
            // ./src/spec.g3:66:5: ( 'assert' )
            // ./src/spec.g3:66:7: 'assert'
            {
            match("assert"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T85

    // $ANTLR start T86
    public final void mT86() throws RecognitionException {
        try {
            int _type = T86;
            // ./src/spec.g3:67:5: ( 'if' )
            // ./src/spec.g3:67:7: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T86

    // $ANTLR start T87
    public final void mT87() throws RecognitionException {
        try {
            int _type = T87;
            // ./src/spec.g3:68:5: ( 'else' )
            // ./src/spec.g3:68:7: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T87

    // $ANTLR start T88
    public final void mT88() throws RecognitionException {
        try {
            int _type = T88;
            // ./src/spec.g3:69:5: ( 'for' )
            // ./src/spec.g3:69:7: 'for'
            {
            match("for"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T88

    // $ANTLR start T89
    public final void mT89() throws RecognitionException {
        try {
            int _type = T89;
            // ./src/spec.g3:70:5: ( 'while' )
            // ./src/spec.g3:70:7: 'while'
            {
            match("while"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T89

    // $ANTLR start T90
    public final void mT90() throws RecognitionException {
        try {
            int _type = T90;
            // ./src/spec.g3:71:5: ( 'do' )
            // ./src/spec.g3:71:7: 'do'
            {
            match("do"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T90

    // $ANTLR start T91
    public final void mT91() throws RecognitionException {
        try {
            int _type = T91;
            // ./src/spec.g3:72:5: ( 'try' )
            // ./src/spec.g3:72:7: 'try'
            {
            match("try"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T91

    // $ANTLR start T92
    public final void mT92() throws RecognitionException {
        try {
            int _type = T92;
            // ./src/spec.g3:73:5: ( 'finally' )
            // ./src/spec.g3:73:7: 'finally'
            {
            match("finally"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T92

    // $ANTLR start T93
    public final void mT93() throws RecognitionException {
        try {
            int _type = T93;
            // ./src/spec.g3:74:5: ( 'switch' )
            // ./src/spec.g3:74:7: 'switch'
            {
            match("switch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T93

    // $ANTLR start T94
    public final void mT94() throws RecognitionException {
        try {
            int _type = T94;
            // ./src/spec.g3:75:5: ( 'return' )
            // ./src/spec.g3:75:7: 'return'
            {
            match("return"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T94

    // $ANTLR start T95
    public final void mT95() throws RecognitionException {
        try {
            int _type = T95;
            // ./src/spec.g3:76:5: ( 'throw' )
            // ./src/spec.g3:76:7: 'throw'
            {
            match("throw"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T95

    // $ANTLR start T96
    public final void mT96() throws RecognitionException {
        try {
            int _type = T96;
            // ./src/spec.g3:77:5: ( 'break' )
            // ./src/spec.g3:77:7: 'break'
            {
            match("break"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T96

    // $ANTLR start T97
    public final void mT97() throws RecognitionException {
        try {
            int _type = T97;
            // ./src/spec.g3:78:5: ( 'continue' )
            // ./src/spec.g3:78:7: 'continue'
            {
            match("continue"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T97

    // $ANTLR start T98
    public final void mT98() throws RecognitionException {
        try {
            int _type = T98;
            // ./src/spec.g3:79:5: ( 'catch' )
            // ./src/spec.g3:79:7: 'catch'
            {
            match("catch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T98

    // $ANTLR start T99
    public final void mT99() throws RecognitionException {
        try {
            int _type = T99;
            // ./src/spec.g3:80:5: ( 'case' )
            // ./src/spec.g3:80:7: 'case'
            {
            match("case"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T99

    // $ANTLR start T100
    public final void mT100() throws RecognitionException {
        try {
            int _type = T100;
            // ./src/spec.g3:81:6: ( '+=' )
            // ./src/spec.g3:81:8: '+='
            {
            match("+="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T100

    // $ANTLR start T101
    public final void mT101() throws RecognitionException {
        try {
            int _type = T101;
            // ./src/spec.g3:82:6: ( '-=' )
            // ./src/spec.g3:82:8: '-='
            {
            match("-="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T101

    // $ANTLR start T102
    public final void mT102() throws RecognitionException {
        try {
            int _type = T102;
            // ./src/spec.g3:83:6: ( '*=' )
            // ./src/spec.g3:83:8: '*='
            {
            match("*="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T102

    // $ANTLR start T103
    public final void mT103() throws RecognitionException {
        try {
            int _type = T103;
            // ./src/spec.g3:84:6: ( '/=' )
            // ./src/spec.g3:84:8: '/='
            {
            match("/="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T103

    // $ANTLR start T104
    public final void mT104() throws RecognitionException {
        try {
            int _type = T104;
            // ./src/spec.g3:85:6: ( '&=' )
            // ./src/spec.g3:85:8: '&='
            {
            match("&="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T104

    // $ANTLR start T105
    public final void mT105() throws RecognitionException {
        try {
            int _type = T105;
            // ./src/spec.g3:86:6: ( '|=' )
            // ./src/spec.g3:86:8: '|='
            {
            match("|="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T105

    // $ANTLR start T106
    public final void mT106() throws RecognitionException {
        try {
            int _type = T106;
            // ./src/spec.g3:87:6: ( '^=' )
            // ./src/spec.g3:87:8: '^='
            {
            match("^="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T106

    // $ANTLR start T107
    public final void mT107() throws RecognitionException {
        try {
            int _type = T107;
            // ./src/spec.g3:88:6: ( '%=' )
            // ./src/spec.g3:88:8: '%='
            {
            match("%="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T107

    // $ANTLR start T108
    public final void mT108() throws RecognitionException {
        try {
            int _type = T108;
            // ./src/spec.g3:89:6: ( '||' )
            // ./src/spec.g3:89:8: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T108

    // $ANTLR start T109
    public final void mT109() throws RecognitionException {
        try {
            int _type = T109;
            // ./src/spec.g3:90:6: ( '&&' )
            // ./src/spec.g3:90:8: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T109

    // $ANTLR start T110
    public final void mT110() throws RecognitionException {
        try {
            int _type = T110;
            // ./src/spec.g3:91:6: ( '|' )
            // ./src/spec.g3:91:8: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T110

    // $ANTLR start T111
    public final void mT111() throws RecognitionException {
        try {
            int _type = T111;
            // ./src/spec.g3:92:6: ( '^' )
            // ./src/spec.g3:92:8: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T111

    // $ANTLR start T112
    public final void mT112() throws RecognitionException {
        try {
            int _type = T112;
            // ./src/spec.g3:93:6: ( '\\u0e04\\u0e27\\u0e23' )
            // ./src/spec.g3:93:8: '\\u0e04\\u0e27\\u0e23'
            {
            match("\u0e04\u0e27\u0e23"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T112

    // $ANTLR start T113
    public final void mT113() throws RecognitionException {
        try {
            int _type = T113;
            // ./src/spec.g3:94:6: ( '==' )
            // ./src/spec.g3:94:8: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T113

    // $ANTLR start T114
    public final void mT114() throws RecognitionException {
        try {
            int _type = T114;
            // ./src/spec.g3:95:6: ( '!=' )
            // ./src/spec.g3:95:8: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T114

    // $ANTLR start T115
    public final void mT115() throws RecognitionException {
        try {
            int _type = T115;
            // ./src/spec.g3:96:6: ( 'instanceof' )
            // ./src/spec.g3:96:8: 'instanceof'
            {
            match("instanceof"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T115

    // $ANTLR start T116
    public final void mT116() throws RecognitionException {
        try {
            int _type = T116;
            // ./src/spec.g3:97:6: ( '+' )
            // ./src/spec.g3:97:8: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T116

    // $ANTLR start T117
    public final void mT117() throws RecognitionException {
        try {
            int _type = T117;
            // ./src/spec.g3:98:6: ( '-' )
            // ./src/spec.g3:98:8: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T117

    // $ANTLR start T118
    public final void mT118() throws RecognitionException {
        try {
            int _type = T118;
            // ./src/spec.g3:99:6: ( '/' )
            // ./src/spec.g3:99:8: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T118

    // $ANTLR start T119
    public final void mT119() throws RecognitionException {
        try {
            int _type = T119;
            // ./src/spec.g3:100:6: ( '%' )
            // ./src/spec.g3:100:8: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T119

    // $ANTLR start T120
    public final void mT120() throws RecognitionException {
        try {
            int _type = T120;
            // ./src/spec.g3:101:6: ( '++' )
            // ./src/spec.g3:101:8: '++'
            {
            match("++"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T120

    // $ANTLR start T121
    public final void mT121() throws RecognitionException {
        try {
            int _type = T121;
            // ./src/spec.g3:102:6: ( '--' )
            // ./src/spec.g3:102:8: '--'
            {
            match("--"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T121

    // $ANTLR start T122
    public final void mT122() throws RecognitionException {
        try {
            int _type = T122;
            // ./src/spec.g3:103:6: ( '~' )
            // ./src/spec.g3:103:8: '~'
            {
            match('~'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T122

    // $ANTLR start T123
    public final void mT123() throws RecognitionException {
        try {
            int _type = T123;
            // ./src/spec.g3:104:6: ( '!' )
            // ./src/spec.g3:104:8: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T123

    // $ANTLR start T124
    public final void mT124() throws RecognitionException {
        try {
            int _type = T124;
            // ./src/spec.g3:105:6: ( 'this' )
            // ./src/spec.g3:105:8: 'this'
            {
            match("this"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T124

    // $ANTLR start T125
    public final void mT125() throws RecognitionException {
        try {
            int _type = T125;
            // ./src/spec.g3:106:6: ( '\\u0e2a\\u0e23\\u0e49\\u0e32\\u0e07' )
            // ./src/spec.g3:106:8: '\\u0e2a\\u0e23\\u0e49\\u0e32\\u0e07'
            {
            match("\u0e2a\u0e23\u0e49\u0e32\u0e07"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T125

    // $ANTLR start T126
    public final void mT126() throws RecognitionException {
        try {
            int _type = T126;
            // ./src/spec.g3:107:6: ( 'class' )
            // ./src/spec.g3:107:8: 'class'
            {
            match("class"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T126

    // $ANTLR start T127
    public final void mT127() throws RecognitionException {
        try {
            int _type = T127;
            // ./src/spec.g3:108:6: ( 'new' )
            // ./src/spec.g3:108:8: 'new'
            {
            match("new"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T127

    // $ANTLR start HexLiteral
    public final void mHexLiteral() throws RecognitionException {
        try {
            int _type = HexLiteral;
            // ./src/spec.g3:749:12: ( '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )? )
            // ./src/spec.g3:749:14: '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )?
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ./src/spec.g3:749:28: ( HexDigit )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ./src/spec.g3:749:28: HexDigit
            	    {
            	    mHexDigit(); 

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

            // ./src/spec.g3:749:38: ( IntegerTypeSuffix )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='.'||LA2_0=='L'||LA2_0=='l') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ./src/spec.g3:749:38: IntegerTypeSuffix
                    {
                    mIntegerTypeSuffix(); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end HexLiteral

    // $ANTLR start DecimalLiteral
    public final void mDecimalLiteral() throws RecognitionException {
        try {
            int _type = DecimalLiteral;
            // ./src/spec.g3:751:16: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )? )
            // ./src/spec.g3:751:18: ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )?
            {
            // ./src/spec.g3:751:18: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='0') ) {
                alt4=1;
            }
            else if ( ((LA4_0>='1' && LA4_0<='9')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("751:18: ( '0' | '1' .. '9' ( '0' .. '9' )* )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ./src/spec.g3:751:19: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:751:25: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ./src/spec.g3:751:34: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ./src/spec.g3:751:34: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // ./src/spec.g3:751:45: ( IntegerTypeSuffix )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='.'||LA5_0=='L'||LA5_0=='l') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ./src/spec.g3:751:45: IntegerTypeSuffix
                    {
                    mIntegerTypeSuffix(); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DecimalLiteral

    // $ANTLR start OctalLiteral
    public final void mOctalLiteral() throws RecognitionException {
        try {
            int _type = OctalLiteral;
            // ./src/spec.g3:753:14: ( '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )? )
            // ./src/spec.g3:753:16: '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )?
            {
            match('0'); 
            // ./src/spec.g3:753:20: ( '0' .. '7' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='7')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ./src/spec.g3:753:21: '0' .. '7'
            	    {
            	    matchRange('0','7'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // ./src/spec.g3:753:32: ( IntegerTypeSuffix )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.'||LA7_0=='L'||LA7_0=='l') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ./src/spec.g3:753:32: IntegerTypeSuffix
                    {
                    mIntegerTypeSuffix(); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OctalLiteral

    // $ANTLR start HexDigit
    public final void mHexDigit() throws RecognitionException {
        try {
            // ./src/spec.g3:756:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ./src/spec.g3:756:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end HexDigit

    // $ANTLR start IntegerTypeSuffix
    public final void mIntegerTypeSuffix() throws RecognitionException {
        try {
            // ./src/spec.g3:759:19: ( ( 'l' | 'L' | ( '.' Identifier ) ) )
            // ./src/spec.g3:759:21: ( 'l' | 'L' | ( '.' Identifier ) )
            {
            // ./src/spec.g3:759:21: ( 'l' | 'L' | ( '.' Identifier ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 'l':
                {
                alt8=1;
                }
                break;
            case 'L':
                {
                alt8=2;
                }
                break;
            case '.':
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("759:21: ( 'l' | 'L' | ( '.' Identifier ) )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ./src/spec.g3:759:22: 'l'
                    {
                    match('l'); 

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:759:26: 'L'
                    {
                    match('L'); 

                    }
                    break;
                case 3 :
                    // ./src/spec.g3:759:30: ( '.' Identifier )
                    {
                    // ./src/spec.g3:759:30: ( '.' Identifier )
                    // ./src/spec.g3:759:31: '.' Identifier
                    {
                    match('.'); 
                    mIdentifier(); 

                    }


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end IntegerTypeSuffix

    // $ANTLR start FloatingPointLiteral
    public final void mFloatingPointLiteral() throws RecognitionException {
        try {
            int _type = FloatingPointLiteral;
            // ./src/spec.g3:762:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ ( Exponent )? FloatTypeSuffix )
            int alt20=4;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ./src/spec.g3:762:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )?
                    {
                    // ./src/spec.g3:762:9: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ./src/spec.g3:762:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    match('.'); 
                    // ./src/spec.g3:762:25: ( '0' .. '9' )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ./src/spec.g3:762:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // ./src/spec.g3:762:37: ( Exponent )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ./src/spec.g3:762:37: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }

                    // ./src/spec.g3:762:47: ( FloatTypeSuffix )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='D'||LA12_0=='F'||LA12_0=='d'||LA12_0=='f') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ./src/spec.g3:762:47: FloatTypeSuffix
                            {
                            mFloatTypeSuffix(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ./src/spec.g3:763:9: '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )?
                    {
                    match('.'); 
                    // ./src/spec.g3:763:13: ( '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ./src/spec.g3:763:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    // ./src/spec.g3:763:25: ( Exponent )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='E'||LA14_0=='e') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ./src/spec.g3:763:25: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }

                    // ./src/spec.g3:763:35: ( FloatTypeSuffix )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='D'||LA15_0=='F'||LA15_0=='d'||LA15_0=='f') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ./src/spec.g3:763:35: FloatTypeSuffix
                            {
                            mFloatTypeSuffix(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ./src/spec.g3:764:9: ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )?
                    {
                    // ./src/spec.g3:764:9: ( '0' .. '9' )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ./src/spec.g3:764:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    mExponent(); 
                    // ./src/spec.g3:764:30: ( FloatTypeSuffix )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='D'||LA17_0=='F'||LA17_0=='d'||LA17_0=='f') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ./src/spec.g3:764:30: FloatTypeSuffix
                            {
                            mFloatTypeSuffix(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // ./src/spec.g3:765:9: ( '0' .. '9' )+ ( Exponent )? FloatTypeSuffix
                    {
                    // ./src/spec.g3:765:9: ( '0' .. '9' )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ./src/spec.g3:765:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    // ./src/spec.g3:765:21: ( Exponent )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='E'||LA19_0=='e') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ./src/spec.g3:765:21: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }

                    mFloatTypeSuffix(); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FloatingPointLiteral

    // $ANTLR start Exponent
    public final void mExponent() throws RecognitionException {
        try {
            // ./src/spec.g3:769:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // ./src/spec.g3:769:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ./src/spec.g3:769:22: ( '+' | '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='+'||LA21_0=='-') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ./src/spec.g3:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }

            // ./src/spec.g3:769:33: ( '0' .. '9' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ./src/spec.g3:769:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end Exponent

    // $ANTLR start FloatTypeSuffix
    public final void mFloatTypeSuffix() throws RecognitionException {
        try {
            // ./src/spec.g3:772:17: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // ./src/spec.g3:772:19: ( 'f' | 'F' | 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end FloatTypeSuffix

    // $ANTLR start CharacterLiteral
    public final void mCharacterLiteral() throws RecognitionException {
        try {
            int _type = CharacterLiteral;
            // ./src/spec.g3:775:5: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // ./src/spec.g3:775:9: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // ./src/spec.g3:775:14: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\\') ) {
                alt23=1;
            }
            else if ( ((LA23_0>='\u0000' && LA23_0<='&')||(LA23_0>='(' && LA23_0<='[')||(LA23_0>=']' && LA23_0<='\uFFFE')) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("775:14: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ./src/spec.g3:775:16: EscapeSequence
                    {
                    mEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // ./src/spec.g3:775:33: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }

            match('\''); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CharacterLiteral

    // $ANTLR start StringLiteral
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            // ./src/spec.g3:779:5: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' )
            // ./src/spec.g3:779:8: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // ./src/spec.g3:779:12: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='\\') ) {
                    alt24=1;
                }
                else if ( ((LA24_0>='\u0000' && LA24_0<='!')||(LA24_0>='#' && LA24_0<='[')||(LA24_0>=']' && LA24_0<='\uFFFE')) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // ./src/spec.g3:779:14: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // ./src/spec.g3:779:31: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
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
            	    break loop24;
                }
            } while (true);

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end StringLiteral

    // $ANTLR start EscapeSequence
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // ./src/spec.g3:784:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\\') ) {
                switch ( input.LA(2) ) {
                case 'u':
                    {
                    alt25=2;
                    }
                    break;
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt25=1;
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
                    alt25=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("782:1: fragment EscapeSequence : ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape );", 25, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("782:1: fragment EscapeSequence : ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape );", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ./src/spec.g3:784:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;
                case 2 :
                    // ./src/spec.g3:785:9: UnicodeEscape
                    {
                    mUnicodeEscape(); 

                    }
                    break;
                case 3 :
                    // ./src/spec.g3:786:9: OctalEscape
                    {
                    mOctalEscape(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end EscapeSequence

    // $ANTLR start OctalEscape
    public final void mOctalEscape() throws RecognitionException {
        try {
            // ./src/spec.g3:791:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\\') ) {
                int LA26_1 = input.LA(2);

                if ( ((LA26_1>='0' && LA26_1<='3')) ) {
                    int LA26_2 = input.LA(3);

                    if ( ((LA26_2>='0' && LA26_2<='7')) ) {
                        int LA26_4 = input.LA(4);

                        if ( ((LA26_4>='0' && LA26_4<='7')) ) {
                            alt26=1;
                        }
                        else {
                            alt26=2;}
                    }
                    else {
                        alt26=3;}
                }
                else if ( ((LA26_1>='4' && LA26_1<='7')) ) {
                    int LA26_3 = input.LA(3);

                    if ( ((LA26_3>='0' && LA26_3<='7')) ) {
                        alt26=2;
                    }
                    else {
                        alt26=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("789:1: fragment OctalEscape : ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) );", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("789:1: fragment OctalEscape : ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) );", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ./src/spec.g3:791:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ./src/spec.g3:791:14: ( '0' .. '3' )
                    // ./src/spec.g3:791:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // ./src/spec.g3:791:25: ( '0' .. '7' )
                    // ./src/spec.g3:791:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // ./src/spec.g3:791:36: ( '0' .. '7' )
                    // ./src/spec.g3:791:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // ./src/spec.g3:792:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ./src/spec.g3:792:14: ( '0' .. '7' )
                    // ./src/spec.g3:792:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // ./src/spec.g3:792:25: ( '0' .. '7' )
                    // ./src/spec.g3:792:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // ./src/spec.g3:793:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ./src/spec.g3:793:14: ( '0' .. '7' )
                    // ./src/spec.g3:793:15: '0' .. '7'
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
    // $ANTLR end OctalEscape

    // $ANTLR start UnicodeEscape
    public final void mUnicodeEscape() throws RecognitionException {
        try {
            // ./src/spec.g3:798:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // ./src/spec.g3:798:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('\\'); 
            match('u'); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end UnicodeEscape

    // $ANTLR start ENUM
    public final void mENUM() throws RecognitionException {
        try {
            int _type = ENUM;
            // ./src/spec.g3:801:5: ( 'enum' )
            // ./src/spec.g3:801:7: 'enum'
            {
            match("enum"); 

            if ( !enumIsKeyword ) _type=Identifier;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ENUM

    // $ANTLR start Identifier
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            // ./src/spec.g3:805:5: ( Letter ( Letter | JavaIDDigit )* )
            // ./src/spec.g3:805:9: Letter ( Letter | JavaIDDigit )*
            {
            mLetter(); 
            // ./src/spec.g3:805:16: ( Letter | JavaIDDigit )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0=='$'||(LA27_0>='0' && LA27_0<='9')||(LA27_0>='A' && LA27_0<='Z')||LA27_0=='_'||(LA27_0>='a' && LA27_0<='z')||(LA27_0>='\u00C0' && LA27_0<='\u00D6')||(LA27_0>='\u00D8' && LA27_0<='\u00F6')||(LA27_0>='\u00F8' && LA27_0<='\u1FFF')||(LA27_0>='\u3040' && LA27_0<='\u318F')||(LA27_0>='\u3300' && LA27_0<='\u337F')||(LA27_0>='\u3400' && LA27_0<='\u3D2D')||(LA27_0>='\u4E00' && LA27_0<='\u9FFF')||(LA27_0>='\uF900' && LA27_0<='\uFAFF')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ./src/spec.g3:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u3040' && input.LA(1)<='\u318F')||(input.LA(1)>='\u3300' && input.LA(1)<='\u337F')||(input.LA(1)>='\u3400' && input.LA(1)<='\u3D2D')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FFF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFAFF') ) {
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
            	    break loop27;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Identifier

    // $ANTLR start Letter
    public final void mLetter() throws RecognitionException {
        try {
            // ./src/spec.g3:817:5: ( '\\u0024' | '\\u0041' .. '\\u005a' | '\\u005f' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' )
            // ./src/spec.g3:
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u3040' && input.LA(1)<='\u318F')||(input.LA(1)>='\u3300' && input.LA(1)<='\u337F')||(input.LA(1)>='\u3400' && input.LA(1)<='\u3D2D')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FFF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFAFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end Letter

    // $ANTLR start JavaIDDigit
    public final void mJavaIDDigit() throws RecognitionException {
        try {
            // ./src/spec.g3:834:5: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06f0' .. '\\u06f9' | '\\u0966' .. '\\u096f' | '\\u09e6' .. '\\u09ef' | '\\u0a66' .. '\\u0a6f' | '\\u0ae6' .. '\\u0aef' | '\\u0b66' .. '\\u0b6f' | '\\u0be7' .. '\\u0bef' | '\\u0c66' .. '\\u0c6f' | '\\u0ce6' .. '\\u0cef' | '\\u0d66' .. '\\u0d6f' | '\\u0e50' .. '\\u0e59' | '\\u0ed0' .. '\\u0ed9' | '\\u1040' .. '\\u1049' )
            // ./src/spec.g3:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='\u0660' && input.LA(1)<='\u0669')||(input.LA(1)>='\u06F0' && input.LA(1)<='\u06F9')||(input.LA(1)>='\u0966' && input.LA(1)<='\u096F')||(input.LA(1)>='\u09E6' && input.LA(1)<='\u09EF')||(input.LA(1)>='\u0A66' && input.LA(1)<='\u0A6F')||(input.LA(1)>='\u0AE6' && input.LA(1)<='\u0AEF')||(input.LA(1)>='\u0B66' && input.LA(1)<='\u0B6F')||(input.LA(1)>='\u0BE7' && input.LA(1)<='\u0BEF')||(input.LA(1)>='\u0C66' && input.LA(1)<='\u0C6F')||(input.LA(1)>='\u0CE6' && input.LA(1)<='\u0CEF')||(input.LA(1)>='\u0D66' && input.LA(1)<='\u0D6F')||(input.LA(1)>='\u0E50' && input.LA(1)<='\u0E59')||(input.LA(1)>='\u0ED0' && input.LA(1)<='\u0ED9')||(input.LA(1)>='\u1040' && input.LA(1)<='\u1049') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end JavaIDDigit

    // $ANTLR start EOL
    public final void mEOL() throws RecognitionException {
        try {
            int _type = EOL;
            // ./src/spec.g3:851:5: ( ( '\\r' | '\\n' ) )
            // ./src/spec.g3:851:8: ( '\\r' | '\\n' )
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EOL

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // ./src/spec.g3:853:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // ./src/spec.g3:853:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            channel=HIDDEN;

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
            // ./src/spec.g3:857:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ./src/spec.g3:857:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ./src/spec.g3:857:14: ( options {greedy=false; } : . )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0=='*') ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1=='/') ) {
                        alt28=2;
                    }
                    else if ( ((LA28_1>='\u0000' && LA28_1<='.')||(LA28_1>='0' && LA28_1<='\uFFFE')) ) {
                        alt28=1;
                    }


                }
                else if ( ((LA28_0>='\u0000' && LA28_0<=')')||(LA28_0>='+' && LA28_0<='\uFFFE')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ./src/spec.g3:857:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            match("*/"); 

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    // $ANTLR start LINE_COMMENT
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            // ./src/spec.g3:861:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // ./src/spec.g3:861:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // ./src/spec.g3:861:12: (~ ( '\\n' | '\\r' ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>='\u0000' && LA29_0<='\t')||(LA29_0>='\u000B' && LA29_0<='\f')||(LA29_0>='\u000E' && LA29_0<='\uFFFE')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ./src/spec.g3:861:12: ~ ( '\\n' | '\\r' )
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
            	    break loop29;
                }
            } while (true);

            // ./src/spec.g3:861:26: ( '\\r' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\r') ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ./src/spec.g3:861:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LINE_COMMENT

    public void mTokens() throws RecognitionException {
        // ./src/spec.g3:1:8: ( T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | T104 | T105 | T106 | T107 | T108 | T109 | T110 | T111 | T112 | T113 | T114 | T115 | T116 | T117 | T118 | T119 | T120 | T121 | T122 | T123 | T124 | T125 | T126 | T127 | HexLiteral | DecimalLiteral | OctalLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | ENUM | Identifier | EOL | WS | COMMENT | LINE_COMMENT )
        int alt31=115;
        alt31 = dfa31.predict(input);
        switch (alt31) {
            case 1 :
                // ./src/spec.g3:1:10: T25
                {
                mT25(); 

                }
                break;
            case 2 :
                // ./src/spec.g3:1:14: T26
                {
                mT26(); 

                }
                break;
            case 3 :
                // ./src/spec.g3:1:18: T27
                {
                mT27(); 

                }
                break;
            case 4 :
                // ./src/spec.g3:1:22: T28
                {
                mT28(); 

                }
                break;
            case 5 :
                // ./src/spec.g3:1:26: T29
                {
                mT29(); 

                }
                break;
            case 6 :
                // ./src/spec.g3:1:30: T30
                {
                mT30(); 

                }
                break;
            case 7 :
                // ./src/spec.g3:1:34: T31
                {
                mT31(); 

                }
                break;
            case 8 :
                // ./src/spec.g3:1:38: T32
                {
                mT32(); 

                }
                break;
            case 9 :
                // ./src/spec.g3:1:42: T33
                {
                mT33(); 

                }
                break;
            case 10 :
                // ./src/spec.g3:1:46: T34
                {
                mT34(); 

                }
                break;
            case 11 :
                // ./src/spec.g3:1:50: T35
                {
                mT35(); 

                }
                break;
            case 12 :
                // ./src/spec.g3:1:54: T36
                {
                mT36(); 

                }
                break;
            case 13 :
                // ./src/spec.g3:1:58: T37
                {
                mT37(); 

                }
                break;
            case 14 :
                // ./src/spec.g3:1:62: T38
                {
                mT38(); 

                }
                break;
            case 15 :
                // ./src/spec.g3:1:66: T39
                {
                mT39(); 

                }
                break;
            case 16 :
                // ./src/spec.g3:1:70: T40
                {
                mT40(); 

                }
                break;
            case 17 :
                // ./src/spec.g3:1:74: T41
                {
                mT41(); 

                }
                break;
            case 18 :
                // ./src/spec.g3:1:78: T42
                {
                mT42(); 

                }
                break;
            case 19 :
                // ./src/spec.g3:1:82: T43
                {
                mT43(); 

                }
                break;
            case 20 :
                // ./src/spec.g3:1:86: T44
                {
                mT44(); 

                }
                break;
            case 21 :
                // ./src/spec.g3:1:90: T45
                {
                mT45(); 

                }
                break;
            case 22 :
                // ./src/spec.g3:1:94: T46
                {
                mT46(); 

                }
                break;
            case 23 :
                // ./src/spec.g3:1:98: T47
                {
                mT47(); 

                }
                break;
            case 24 :
                // ./src/spec.g3:1:102: T48
                {
                mT48(); 

                }
                break;
            case 25 :
                // ./src/spec.g3:1:106: T49
                {
                mT49(); 

                }
                break;
            case 26 :
                // ./src/spec.g3:1:110: T50
                {
                mT50(); 

                }
                break;
            case 27 :
                // ./src/spec.g3:1:114: T51
                {
                mT51(); 

                }
                break;
            case 28 :
                // ./src/spec.g3:1:118: T52
                {
                mT52(); 

                }
                break;
            case 29 :
                // ./src/spec.g3:1:122: T53
                {
                mT53(); 

                }
                break;
            case 30 :
                // ./src/spec.g3:1:126: T54
                {
                mT54(); 

                }
                break;
            case 31 :
                // ./src/spec.g3:1:130: T55
                {
                mT55(); 

                }
                break;
            case 32 :
                // ./src/spec.g3:1:134: T56
                {
                mT56(); 

                }
                break;
            case 33 :
                // ./src/spec.g3:1:138: T57
                {
                mT57(); 

                }
                break;
            case 34 :
                // ./src/spec.g3:1:142: T58
                {
                mT58(); 

                }
                break;
            case 35 :
                // ./src/spec.g3:1:146: T59
                {
                mT59(); 

                }
                break;
            case 36 :
                // ./src/spec.g3:1:150: T60
                {
                mT60(); 

                }
                break;
            case 37 :
                // ./src/spec.g3:1:154: T61
                {
                mT61(); 

                }
                break;
            case 38 :
                // ./src/spec.g3:1:158: T62
                {
                mT62(); 

                }
                break;
            case 39 :
                // ./src/spec.g3:1:162: T63
                {
                mT63(); 

                }
                break;
            case 40 :
                // ./src/spec.g3:1:166: T64
                {
                mT64(); 

                }
                break;
            case 41 :
                // ./src/spec.g3:1:170: T65
                {
                mT65(); 

                }
                break;
            case 42 :
                // ./src/spec.g3:1:174: T66
                {
                mT66(); 

                }
                break;
            case 43 :
                // ./src/spec.g3:1:178: T67
                {
                mT67(); 

                }
                break;
            case 44 :
                // ./src/spec.g3:1:182: T68
                {
                mT68(); 

                }
                break;
            case 45 :
                // ./src/spec.g3:1:186: T69
                {
                mT69(); 

                }
                break;
            case 46 :
                // ./src/spec.g3:1:190: T70
                {
                mT70(); 

                }
                break;
            case 47 :
                // ./src/spec.g3:1:194: T71
                {
                mT71(); 

                }
                break;
            case 48 :
                // ./src/spec.g3:1:198: T72
                {
                mT72(); 

                }
                break;
            case 49 :
                // ./src/spec.g3:1:202: T73
                {
                mT73(); 

                }
                break;
            case 50 :
                // ./src/spec.g3:1:206: T74
                {
                mT74(); 

                }
                break;
            case 51 :
                // ./src/spec.g3:1:210: T75
                {
                mT75(); 

                }
                break;
            case 52 :
                // ./src/spec.g3:1:214: T76
                {
                mT76(); 

                }
                break;
            case 53 :
                // ./src/spec.g3:1:218: T77
                {
                mT77(); 

                }
                break;
            case 54 :
                // ./src/spec.g3:1:222: T78
                {
                mT78(); 

                }
                break;
            case 55 :
                // ./src/spec.g3:1:226: T79
                {
                mT79(); 

                }
                break;
            case 56 :
                // ./src/spec.g3:1:230: T80
                {
                mT80(); 

                }
                break;
            case 57 :
                // ./src/spec.g3:1:234: T81
                {
                mT81(); 

                }
                break;
            case 58 :
                // ./src/spec.g3:1:238: T82
                {
                mT82(); 

                }
                break;
            case 59 :
                // ./src/spec.g3:1:242: T83
                {
                mT83(); 

                }
                break;
            case 60 :
                // ./src/spec.g3:1:246: T84
                {
                mT84(); 

                }
                break;
            case 61 :
                // ./src/spec.g3:1:250: T85
                {
                mT85(); 

                }
                break;
            case 62 :
                // ./src/spec.g3:1:254: T86
                {
                mT86(); 

                }
                break;
            case 63 :
                // ./src/spec.g3:1:258: T87
                {
                mT87(); 

                }
                break;
            case 64 :
                // ./src/spec.g3:1:262: T88
                {
                mT88(); 

                }
                break;
            case 65 :
                // ./src/spec.g3:1:266: T89
                {
                mT89(); 

                }
                break;
            case 66 :
                // ./src/spec.g3:1:270: T90
                {
                mT90(); 

                }
                break;
            case 67 :
                // ./src/spec.g3:1:274: T91
                {
                mT91(); 

                }
                break;
            case 68 :
                // ./src/spec.g3:1:278: T92
                {
                mT92(); 

                }
                break;
            case 69 :
                // ./src/spec.g3:1:282: T93
                {
                mT93(); 

                }
                break;
            case 70 :
                // ./src/spec.g3:1:286: T94
                {
                mT94(); 

                }
                break;
            case 71 :
                // ./src/spec.g3:1:290: T95
                {
                mT95(); 

                }
                break;
            case 72 :
                // ./src/spec.g3:1:294: T96
                {
                mT96(); 

                }
                break;
            case 73 :
                // ./src/spec.g3:1:298: T97
                {
                mT97(); 

                }
                break;
            case 74 :
                // ./src/spec.g3:1:302: T98
                {
                mT98(); 

                }
                break;
            case 75 :
                // ./src/spec.g3:1:306: T99
                {
                mT99(); 

                }
                break;
            case 76 :
                // ./src/spec.g3:1:310: T100
                {
                mT100(); 

                }
                break;
            case 77 :
                // ./src/spec.g3:1:315: T101
                {
                mT101(); 

                }
                break;
            case 78 :
                // ./src/spec.g3:1:320: T102
                {
                mT102(); 

                }
                break;
            case 79 :
                // ./src/spec.g3:1:325: T103
                {
                mT103(); 

                }
                break;
            case 80 :
                // ./src/spec.g3:1:330: T104
                {
                mT104(); 

                }
                break;
            case 81 :
                // ./src/spec.g3:1:335: T105
                {
                mT105(); 

                }
                break;
            case 82 :
                // ./src/spec.g3:1:340: T106
                {
                mT106(); 

                }
                break;
            case 83 :
                // ./src/spec.g3:1:345: T107
                {
                mT107(); 

                }
                break;
            case 84 :
                // ./src/spec.g3:1:350: T108
                {
                mT108(); 

                }
                break;
            case 85 :
                // ./src/spec.g3:1:355: T109
                {
                mT109(); 

                }
                break;
            case 86 :
                // ./src/spec.g3:1:360: T110
                {
                mT110(); 

                }
                break;
            case 87 :
                // ./src/spec.g3:1:365: T111
                {
                mT111(); 

                }
                break;
            case 88 :
                // ./src/spec.g3:1:370: T112
                {
                mT112(); 

                }
                break;
            case 89 :
                // ./src/spec.g3:1:375: T113
                {
                mT113(); 

                }
                break;
            case 90 :
                // ./src/spec.g3:1:380: T114
                {
                mT114(); 

                }
                break;
            case 91 :
                // ./src/spec.g3:1:385: T115
                {
                mT115(); 

                }
                break;
            case 92 :
                // ./src/spec.g3:1:390: T116
                {
                mT116(); 

                }
                break;
            case 93 :
                // ./src/spec.g3:1:395: T117
                {
                mT117(); 

                }
                break;
            case 94 :
                // ./src/spec.g3:1:400: T118
                {
                mT118(); 

                }
                break;
            case 95 :
                // ./src/spec.g3:1:405: T119
                {
                mT119(); 

                }
                break;
            case 96 :
                // ./src/spec.g3:1:410: T120
                {
                mT120(); 

                }
                break;
            case 97 :
                // ./src/spec.g3:1:415: T121
                {
                mT121(); 

                }
                break;
            case 98 :
                // ./src/spec.g3:1:420: T122
                {
                mT122(); 

                }
                break;
            case 99 :
                // ./src/spec.g3:1:425: T123
                {
                mT123(); 

                }
                break;
            case 100 :
                // ./src/spec.g3:1:430: T124
                {
                mT124(); 

                }
                break;
            case 101 :
                // ./src/spec.g3:1:435: T125
                {
                mT125(); 

                }
                break;
            case 102 :
                // ./src/spec.g3:1:440: T126
                {
                mT126(); 

                }
                break;
            case 103 :
                // ./src/spec.g3:1:445: T127
                {
                mT127(); 

                }
                break;
            case 104 :
                // ./src/spec.g3:1:450: HexLiteral
                {
                mHexLiteral(); 

                }
                break;
            case 105 :
                // ./src/spec.g3:1:461: DecimalLiteral
                {
                mDecimalLiteral(); 

                }
                break;
            case 106 :
                // ./src/spec.g3:1:476: OctalLiteral
                {
                mOctalLiteral(); 

                }
                break;
            case 107 :
                // ./src/spec.g3:1:489: FloatingPointLiteral
                {
                mFloatingPointLiteral(); 

                }
                break;
            case 108 :
                // ./src/spec.g3:1:510: CharacterLiteral
                {
                mCharacterLiteral(); 

                }
                break;
            case 109 :
                // ./src/spec.g3:1:527: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 110 :
                // ./src/spec.g3:1:541: ENUM
                {
                mENUM(); 

                }
                break;
            case 111 :
                // ./src/spec.g3:1:546: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 112 :
                // ./src/spec.g3:1:557: EOL
                {
                mEOL(); 

                }
                break;
            case 113 :
                // ./src/spec.g3:1:561: WS
                {
                mWS(); 

                }
                break;
            case 114 :
                // ./src/spec.g3:1:564: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 115 :
                // ./src/spec.g3:1:572: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA20_eotS =
        "\7\uffff\1\10\2\uffff";
    static final String DFA20_eofS =
        "\12\uffff";
    static final String DFA20_minS =
        "\2\56\2\uffff\1\53\1\uffff\2\60\2\uffff";
    static final String DFA20_maxS =
        "\1\71\1\146\2\uffff\1\71\1\uffff\1\71\1\146\2\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\2\1\1\1\uffff\1\4\2\uffff\2\3";
    static final String DFA20_specialS =
        "\12\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\12\uffff\1\5\1\4\1\5\35\uffff\1\5\1\4\1\5",
            "",
            "",
            "\1\6\1\uffff\1\6\2\uffff\12\7",
            "",
            "\12\7",
            "\12\7\12\uffff\1\11\1\uffff\1\11\35\uffff\1\11\1\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "761:1: FloatingPointLiteral : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ ( Exponent )? FloatTypeSuffix );";
        }
    }
    static final String DFA31_eotS =
        "\1\uffff\1\72\1\uffff\2\72\1\105\1\110\1\72\3\uffff\1\72\1\117\1"+
        "\72\2\uffff\3\72\2\uffff\1\72\1\uffff\1\72\2\uffff\1\72\1\135\10"+
        "\72\1\uffff\2\72\1\uffff\4\72\1\173\1\176\1\u0082\1\u0085\1\u0087"+
        "\1\u0089\1\72\1\u008c\1\uffff\1\72\2\u008f\5\uffff\7\72\5\uffff"+
        "\4\72\3\uffff\2\72\1\u00a3\1\72\1\u00a5\7\72\2\uffff\23\72\1\u00c7"+
        "\7\72\21\uffff\1\72\2\uffff\1\72\2\uffff\1\106\1\u00d3\1\u008f\1"+
        "\uffff\14\72\1\u00e2\2\72\1\uffff\1\72\1\uffff\12\72\1\u00f0\10"+
        "\72\1\u00f9\1\u00fa\14\72\1\uffff\4\72\1\u010b\2\72\1\u010e\1\72"+
        "\1\u008f\2\uffff\1\106\12\72\1\u011d\1\u011e\1\72\1\uffff\3\72\1"+
        "\u0123\1\72\1\u0125\1\u0126\1\u0127\1\72\1\u0129\2\72\1\u012c\1"+
        "\uffff\10\72\2\uffff\1\72\1\u0136\2\72\1\u0139\2\72\1\u013c\1\72"+
        "\1\u013e\1\u013f\2\72\1\u0142\1\u0143\1\72\1\uffff\2\72\1\uffff"+
        "\1\72\1\u008f\1\u00d3\1\uffff\5\72\1\u014f\1\u0150\3\72\2\uffff"+
        "\4\72\1\uffff\1\72\3\uffff\1\72\1\uffff\1\u015b\1\72\1\uffff\5\72"+
        "\1\u0163\1\u0164\1\u0165\1\72\1\uffff\1\u0167\1\72\1\uffff\1\u0169"+
        "\1\u016a\1\uffff\1\72\2\uffff\2\72\2\uffff\1\u016e\1\u016f\1\72"+
        "\1\u0171\1\uffff\1\u00d3\1\72\1\u0174\1\72\1\u0176\1\72\2\uffff"+
        "\1\u0178\1\u0179\4\72\1\u017e\2\72\1\u0181\1\uffff\1\72\1\u0183"+
        "\3\72\1\u0187\1\72\3\uffff\1\u0189\1\uffff\1\72\2\uffff\1\72\1\u018c"+
        "\1\72\2\uffff\1\u018e\2\uffff\1\u018f\1\uffff\1\72\1\uffff\1\72"+
        "\2\uffff\1\u0192\3\72\1\uffff\2\72\1\uffff\1\72\1\uffff\1\u0199"+
        "\2\72\1\uffff\1\u019c\1\uffff\1\u019d\1\72\1\uffff\1\u019f\2\uffff"+
        "\1\u01a0\1\72\1\uffff\3\72\1\u01a5\1\u01a6\1\72\1\uffff\1\72\1\u01a9"+
        "\2\uffff\1\u01aa\2\uffff\1\72\1\u01ac\2\72\2\uffff\1\u01af\1\u01b0"+
        "\2\uffff\1\72\1\uffff\1\u01b2\1\u01b3\2\uffff\1\72\2\uffff\1\u01b5"+
        "\1\uffff";
    static final String DFA31_eofS =
        "\u01b6\uffff";
    static final String DFA31_minS =
        "\1\11\1\u0e1e\1\uffff\1\u0e33\1\150\1\56\1\75\1\u0e18\3\uffff\1"+
        "\154\1\46\1\146\2\uffff\1\u0e31\1\u0e1a\1\u0e33\2\uffff\1\u0e25"+
        "\1\uffff\1\157\2\uffff\1\150\1\75\1\162\1\142\2\141\1\157\1\141"+
        "\1\157\1\145\1\uffff\1\u0e48\1\u0e17\1\uffff\1\u0e2b\1\u0e14\1\150"+
        "\1\145\1\53\1\55\1\52\3\75\1\u0e27\1\75\1\uffff\1\u0e23\2\56\5\uffff"+
        "\1\u0e47\1\u0e40\1\141\1\156\1\160\1\157\1\151\5\uffff\1\u0e34\1"+
        "\164\1\165\1\163\3\uffff\1\163\1\160\1\44\1\u0e07\1\44\1\u0e34\1"+
        "\u0e2b\1\u0e2d\1\u0e31\2\151\1\141\2\uffff\1\142\1\151\2\163\1\156"+
        "\1\154\1\157\1\162\1\167\1\164\1\154\1\145\1\157\1\164\1\141\1\163"+
        "\1\156\1\141\1\156\1\44\1\146\1\u0e32\1\u0e47\1\u0e49\1\u0e22\1"+
        "\151\1\164\21\uffff\1\u0e23\2\uffff\1\u0e49\2\uffff\1\44\2\56\1"+
        "\uffff\1\u0e04\1\u0e02\1\151\1\164\1\143\1\145\1\162\1\164\1\u0e1a"+
        "\1\145\1\155\1\145\1\44\1\164\1\154\1\uffff\1\u0e19\1\uffff\1\u0e07"+
        "\2\u0e19\1\u0e07\1\144\1\141\1\163\1\157\1\156\1\145\1\44\1\154"+
        "\1\166\2\164\1\145\1\141\1\163\1\141\2\44\1\151\1\154\1\141\1\154"+
        "\1\145\1\163\1\143\1\145\1\164\1\162\1\147\1\142\1\uffff\1\141\1"+
        "\u0e07\1\u0e08\1\u0e17\1\44\1\154\1\165\1\44\1\u0e32\1\53\2\uffff"+
        "\1\44\1\u0e40\1\u0e49\1\143\1\151\1\150\1\162\1\164\1\143\1\u0e32"+
        "\1\156\2\44\1\162\1\uffff\1\141\1\145\1\u0e35\1\44\1\u0e14\3\44"+
        "\1\164\1\44\1\167\1\163\1\44\1\uffff\1\151\1\141\1\145\2\162\1\154"+
        "\1\145\1\164\2\uffff\1\166\1\44\1\153\1\145\1\44\1\163\1\150\1\44"+
        "\1\151\2\44\1\154\1\165\2\44\1\u0e33\1\uffff\1\145\1\162\1\uffff"+
        "\1\u0e07\1\60\1\53\1\uffff\1\u0e01\1\u0e32\1\164\1\143\1\162\2\44"+
        "\1\150\1\u0e22\1\144\2\uffff\1\146\1\156\1\155\1\u0e49\1\uffff\1"+
        "\u0e43\3\uffff\1\151\1\uffff\1\44\1\151\1\uffff\1\143\1\164\1\143"+
        "\1\141\1\164\3\44\1\145\1\uffff\1\44\1\141\1\uffff\2\44\1\uffff"+
        "\1\156\2\uffff\1\145\1\154\2\uffff\2\44\1\156\1\44\1\uffff\1\60"+
        "\1\u0e08\1\44\1\146\1\44\1\157\2\uffff\2\44\1\163\1\141\1\143\1"+
        "\145\1\44\1\u0e2b\1\154\1\44\1\uffff\1\145\1\44\1\145\1\164\1\143"+
        "\1\44\1\171\3\uffff\1\44\1\uffff\1\156\2\uffff\1\165\1\44\1\164"+
        "\2\uffff\1\44\2\uffff\1\44\1\uffff\1\160\1\uffff\1\156\2\uffff\1"+
        "\44\1\143\1\145\1\156\1\uffff\1\u0e49\1\145\1\uffff\1\156\1\uffff"+
        "\1\44\1\145\1\164\1\uffff\1\44\1\uffff\1\44\1\145\1\uffff\1\44\2"+
        "\uffff\1\44\1\151\1\uffff\1\145\1\157\1\164\2\44\1\164\1\uffff\1"+
        "\144\1\44\2\uffff\1\44\2\uffff\1\172\1\44\1\146\1\163\2\uffff\2"+
        "\44\2\uffff\1\145\1\uffff\2\44\2\uffff\1\144\2\uffff\1\44\1\uffff";
    static final String DFA31_maxS =
        "\1\ufaff\1\u0e1e\1\uffff\1\u0e33\1\171\1\71\1\75\1\u0e18\3\uffff"+
        "\1\170\1\75\1\156\2\uffff\1\u0e31\1\u0e23\1\u0e48\2\uffff\1\u0e25"+
        "\1\uffff\1\157\2\uffff\1\162\1\75\1\165\1\163\1\157\1\165\1\171"+
        "\3\157\1\uffff\1\u0e48\1\u0e17\1\uffff\1\u0e2b\1\u0e14\1\150\1\145"+
        "\3\75\1\174\2\75\1\u0e27\1\75\1\uffff\1\u0e23\1\170\1\146\5\uffff"+
        "\1\u0e47\1\u0e40\1\162\1\156\1\160\1\157\1\151\5\uffff\1\u0e34\1"+
        "\164\1\165\1\163\3\uffff\1\164\1\160\1\ufaff\1\u0e07\1\ufaff\1\u0e34"+
        "\1\u0e2b\1\u0e2d\1\u0e31\1\154\1\162\1\171\2\uffff\1\142\1\157\2"+
        "\163\1\156\1\154\1\157\1\162\1\167\1\164\1\154\1\145\1\157\1\164"+
        "\1\141\1\164\1\156\1\141\1\156\1\ufaff\1\146\1\u0e32\1\u0e47\1\u0e49"+
        "\1\u0e22\1\151\1\164\21\uffff\1\u0e23\2\uffff\1\u0e49\2\uffff\1"+
        "\ufaff\2\146\1\uffff\1\u0e04\1\u0e02\1\151\1\164\1\143\1\145\1\162"+
        "\1\164\1\u0e1a\1\145\1\155\1\145\1\ufaff\1\164\1\154\1\uffff\1\u0e19"+
        "\1\uffff\1\u0e07\2\u0e19\1\u0e07\1\144\1\141\1\163\1\157\1\156\1"+
        "\145\1\ufaff\1\154\1\166\2\164\1\145\1\141\1\163\1\141\2\ufaff\1"+
        "\151\1\154\1\141\1\154\1\145\1\163\1\143\1\145\1\164\1\162\1\147"+
        "\1\142\1\uffff\1\141\1\u0e07\1\u0e08\1\u0e17\1\ufaff\1\154\1\165"+
        "\1\ufaff\1\u0e32\1\71\2\uffff\1\ufaff\1\u0e40\1\u0e49\1\143\1\151"+
        "\1\150\1\162\1\164\1\143\1\u0e32\1\156\2\ufaff\1\162\1\uffff\1\141"+
        "\1\145\1\u0e35\1\ufaff\1\u0e14\3\ufaff\1\164\1\ufaff\1\167\1\163"+
        "\1\ufaff\1\uffff\1\151\1\141\1\145\2\162\1\154\1\145\1\164\2\uffff"+
        "\1\166\1\ufaff\1\153\1\145\1\ufaff\1\163\1\150\1\ufaff\1\151\2\ufaff"+
        "\1\154\1\165\2\ufaff\1\u0e33\1\uffff\1\145\1\162\1\uffff\1\u0e07"+
        "\1\146\1\71\1\uffff\1\u0e01\1\u0e32\1\164\1\143\1\162\2\ufaff\1"+
        "\150\1\u0e22\1\144\2\uffff\1\146\1\156\1\155\1\u0e49\1\uffff\1\u0e43"+
        "\3\uffff\1\151\1\uffff\1\ufaff\1\151\1\uffff\1\143\1\164\1\143\1"+
        "\141\1\164\3\ufaff\1\145\1\uffff\1\ufaff\1\141\1\uffff\2\ufaff\1"+
        "\uffff\1\156\2\uffff\1\145\1\154\2\uffff\2\ufaff\1\156\1\ufaff\1"+
        "\uffff\1\146\1\u0e08\1\ufaff\1\146\1\ufaff\1\157\2\uffff\2\ufaff"+
        "\1\163\1\141\1\143\1\145\1\ufaff\1\u0e2b\1\154\1\ufaff\1\uffff\1"+
        "\145\1\ufaff\1\145\1\164\1\143\1\ufaff\1\171\3\uffff\1\ufaff\1\uffff"+
        "\1\156\2\uffff\1\165\1\ufaff\1\164\2\uffff\1\ufaff\2\uffff\1\ufaff"+
        "\1\uffff\1\160\1\uffff\1\156\2\uffff\1\ufaff\1\143\1\145\1\156\1"+
        "\uffff\1\u0e49\1\145\1\uffff\1\156\1\uffff\1\ufaff\1\145\1\164\1"+
        "\uffff\1\ufaff\1\uffff\1\ufaff\1\145\1\uffff\1\ufaff\2\uffff\1\ufaff"+
        "\1\151\1\uffff\1\145\1\157\1\164\2\ufaff\1\164\1\uffff\1\144\1\ufaff"+
        "\2\uffff\1\ufaff\2\uffff\1\172\1\ufaff\1\146\1\163\2\uffff\2\ufaff"+
        "\2\uffff\1\145\1\uffff\2\ufaff\2\uffff\1\144\2\uffff\1\ufaff\1\uffff";
    static final String DFA31_acceptS =
        "\2\uffff\1\2\5\uffff\1\10\1\11\1\12\3\uffff\1\16\1\17\3\uffff\1"+
        "\24\1\25\1\uffff\1\27\1\uffff\1\32\1\33\12\uffff\1\60\2\uffff\1"+
        "\71\14\uffff\1\142\3\uffff\1\154\1\155\1\157\1\160\1\161\7\uffff"+
        "\1\62\1\5\1\153\1\116\1\6\4\uffff\1\125\1\120\1\14\14\uffff\1\131"+
        "\1\35\33\uffff\1\140\1\114\1\134\1\141\1\115\1\135\1\117\1\162\1"+
        "\163\1\136\1\124\1\121\1\126\1\122\1\127\1\123\1\137\1\uffff\1\132"+
        "\1\143\1\uffff\1\150\1\151\3\uffff\1\160\17\uffff\1\76\1\uffff\1"+
        "\22\41\uffff\1\102\12\uffff\1\151\1\152\16\uffff\1\54\15\uffff\1"+
        "\103\10\uffff\1\100\1\147\20\uffff\1\74\2\uffff\1\130\3\uffff\1"+
        "\152\12\uffff\1\156\1\77\4\uffff\1\67\1\uffff\1\23\1\26\1\31\1\uffff"+
        "\1\144\2\uffff\1\65\11\uffff\1\63\2\uffff\1\52\2\uffff\1\113\1\uffff"+
        "\1\51\1\55\2\uffff\1\64\1\70\4\uffff\1\151\6\uffff\1\61\1\53\12"+
        "\uffff\1\107\7\uffff\1\42\1\66\1\56\1\uffff\1\110\1\uffff\1\146"+
        "\1\112\3\uffff\1\73\1\101\1\uffff\1\145\1\152\1\uffff\1\3\1\uffff"+
        "\1\4\1\uffff\1\105\1\7\4\uffff\1\21\2\uffff\1\34\1\uffff\1\36\3"+
        "\uffff\1\75\1\uffff\1\43\2\uffff\1\57\1\uffff\1\106\1\1\2\uffff"+
        "\1\13\6\uffff\1\40\2\uffff\1\104\1\50\1\uffff\1\72\1\47\4\uffff"+
        "\1\30\1\46\2\uffff\1\41\1\111\1\uffff\1\20\2\uffff\1\45\1\37\1\uffff"+
        "\1\133\1\15\1\uffff\1\44";
    static final String DFA31_specialS =
        "\u01b6\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\74\1\73\1\uffff\1\74\1\73\22\uffff\1\74\1\63\1\71\1\uffff"+
            "\1\72\1\61\1\14\1\70\1\23\1\24\1\6\1\54\1\11\1\55\1\5\1\56\1"+
            "\66\11\67\1\26\1\2\1\10\1\33\1\12\1\44\1\47\32\72\1\30\1\uffff"+
            "\1\31\1\60\1\72\1\uffff\1\35\1\40\1\41\1\43\1\13\1\36\2\72\1"+
            "\15\2\72\1\42\1\72\1\37\1\72\1\34\1\72\1\53\1\4\1\32\1\72\1"+
            "\27\1\52\3\72\1\16\1\57\1\17\1\64\101\uffff\27\72\1\uffff\37"+
            "\72\1\uffff\u0d09\72\1\22\2\72\1\62\3\72\1\21\13\72\1\20\4\72"+
            "\1\3\15\72\1\45\2\72\1\65\1\25\1\72\1\7\22\72\1\46\1\1\1\51"+
            "\1\50\u11bc\72\u1040\uffff\u0150\72\u0170\uffff\u0080\72\u0080"+
            "\uffff\u092e\72\u10d2\uffff\u5200\72\u5900\uffff\u0200\72",
            "\1\75",
            "",
            "\1\76",
            "\1\102\13\uffff\1\77\1\101\1\uffff\1\103\1\uffff\1\100",
            "\1\104\1\uffff\12\106",
            "\1\107",
            "\1\111",
            "",
            "",
            "",
            "\1\114\1\uffff\1\113\11\uffff\1\112",
            "\1\115\26\uffff\1\116",
            "\1\122\6\uffff\1\121\1\120",
            "",
            "",
            "\1\123",
            "\1\124\10\uffff\1\125",
            "\1\126\24\uffff\1\127",
            "",
            "",
            "\1\130",
            "",
            "\1\131",
            "",
            "",
            "\1\132\11\uffff\1\133",
            "\1\134",
            "\1\137\2\uffff\1\136",
            "\1\140\20\uffff\1\141",
            "\1\143\7\uffff\1\142\2\uffff\1\144\2\uffff\1\145",
            "\1\147\3\uffff\1\146\17\uffff\1\150",
            "\1\152\2\uffff\1\151\6\uffff\1\153",
            "\1\155\6\uffff\1\157\3\uffff\1\154\2\uffff\1\156",
            "\1\160",
            "\1\162\11\uffff\1\161",
            "",
            "\1\163",
            "\1\164",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171\21\uffff\1\172",
            "\1\174\17\uffff\1\175",
            "\1\u0080\4\uffff\1\u0081\15\uffff\1\177",
            "\1\u0084\76\uffff\1\u0083",
            "\1\u0086",
            "\1\u0088",
            "\1\u008a",
            "\1\u008b",
            "",
            "\1\u008d",
            "\1\u0090\1\uffff\10\u0091\2\106\12\uffff\3\106\21\uffff\1\u008e"+
            "\13\uffff\3\106\21\uffff\1\u008e",
            "\1\u0090\1\uffff\12\u0092\12\uffff\3\106\35\uffff\3\106",
            "",
            "",
            "",
            "",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0097\20\uffff\1\u0096",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "",
            "",
            "",
            "",
            "",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "",
            "",
            "",
            "\1\u00a1\1\u00a0",
            "\1\u00a2",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u00a4",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa\2\uffff\1\u00ab",
            "\1\u00ac\10\uffff\1\u00ad",
            "\1\u00ae\23\uffff\1\u00af\3\uffff\1\u00b0",
            "",
            "",
            "\1\u00b1",
            "\1\u00b2\5\uffff\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c2\1\u00c1",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\24\72"+
            "\1\u00c6\5\72\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72"+
            "\u1040\uffff\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e"+
            "\72\u10d2\uffff\u5200\72\u5900\uffff\u0200\72",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00cf",
            "",
            "",
            "\1\u00d0",
            "",
            "",
            "\1\u008f\34\uffff\3\u008f\1\u00d2\1\u00d1\1\u00d2\24\u008f\4"+
            "\uffff\1\u008f\1\uffff\3\u008f\1\u00d2\1\u00d1\1\u00d2\24\u008f"+
            "\105\uffff\27\u008f\1\uffff\37\u008f\1\uffff\u1f08\u008f\u1040"+
            "\uffff\u0150\u008f\u0170\uffff\u0080\u008f\u0080\uffff\u092e"+
            "\u008f\u10d2\uffff\u5200\u008f\u5900\uffff\u0200\u008f",
            "\1\u00d4\1\uffff\10\u0091\2\106\12\uffff\3\106\35\uffff\3\106",
            "\1\u0090\1\uffff\12\u0092\12\uffff\3\106\35\uffff\3\106",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\4\72"+
            "\1\u00e1\25\72\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72"+
            "\u1040\uffff\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e"+
            "\72\u10d2\uffff\u5200\72\u5900\uffff\u0200\72",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u010c",
            "\1\u010d",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u010f",
            "\1\106\1\uffff\1\106\2\uffff\12\u0110",
            "",
            "",
            "\1\u00d3\34\uffff\3\u00d3\1\u0112\1\u0111\1\u0112\24\u00d3\4"+
            "\uffff\1\u00d3\1\uffff\3\u00d3\1\u0112\1\u0111\1\u0112\24\u00d3"+
            "\105\uffff\27\u00d3\1\uffff\37\u00d3\1\uffff\u1f08\u00d3\u1040"+
            "\uffff\u0150\u00d3\u0170\uffff\u0080\u00d3\u0080\uffff\u092e"+
            "\u00d3\u10d2\uffff\u5200\u00d3\u5900\uffff\u0200\u00d3",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u011f",
            "",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u0124",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u0128",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u012a",
            "\1\u012b",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "",
            "",
            "\1\u0135",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u0137",
            "\1\u0138",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u013a",
            "\1\u013b",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u013d",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u0140",
            "\1\u0141",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u0144",
            "",
            "\1\u0145",
            "\1\u0146",
            "",
            "\1\u0147",
            "\12\u0110\12\uffff\1\u0148\1\uffff\1\u0148\35\uffff\1\u0148"+
            "\1\uffff\1\u0148",
            "\1\106\1\uffff\1\106\2\uffff\12\u0149",
            "",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "",
            "",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "",
            "\1\u0158",
            "",
            "",
            "",
            "\1\u0159",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\22\72"+
            "\1\u015a\7\72\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72"+
            "\u1040\uffff\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e"+
            "\72\u10d2\uffff\u5200\72\u5900\uffff\u0200\72",
            "\1\u015c",
            "",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\13\72"+
            "\1\u0162\16\72\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72"+
            "\u1040\uffff\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e"+
            "\72\u10d2\uffff\u5200\72\u5900\uffff\u0200\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u0166",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u0168",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "",
            "\1\u016b",
            "",
            "",
            "\1\u016c",
            "\1\u016d",
            "",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u0170",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "",
            "\12\u0149\12\uffff\1\u0172\1\uffff\1\u0172\35\uffff\1\u0172"+
            "\1\uffff\1\u0172",
            "\1\u0173",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u0175",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u0177",
            "",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u017f",
            "\1\u0180",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "",
            "\1\u0182",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u0188",
            "",
            "",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "",
            "\1\u018a",
            "",
            "",
            "\1\u018b",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u018d",
            "",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "",
            "\1\u0190",
            "",
            "\1\u0191",
            "",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "",
            "\1\u0196",
            "\1\u0197",
            "",
            "\1\u0198",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u019a",
            "\1\u019b",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u019e",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u01a1",
            "",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u01a7",
            "",
            "\1\u01a8",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "",
            "",
            "\1\u01ab",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\u01ad",
            "\1\u01ae",
            "",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "",
            "",
            "\1\u01b1",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            "",
            "",
            "\1\u01b4",
            "",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"+
            "\105\uffff\27\72\1\uffff\37\72\1\uffff\u1f08\72\u1040\uffff"+
            "\u0150\72\u0170\uffff\u0080\72\u0080\uffff\u092e\72\u10d2\uffff"+
            "\u5200\72\u5900\uffff\u0200\72",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | T104 | T105 | T106 | T107 | T108 | T109 | T110 | T111 | T112 | T113 | T114 | T115 | T116 | T117 | T118 | T119 | T120 | T121 | T122 | T123 | T124 | T125 | T126 | T127 | HexLiteral | DecimalLiteral | OctalLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | ENUM | Identifier | EOL | WS | COMMENT | LINE_COMMENT );";
        }
    }
 

}