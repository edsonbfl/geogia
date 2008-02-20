lexer grammar spec;
@members {
protected boolean enumIsKeyword = false;
}

T25 : '\u0e41\u0e1e\u0e47\u0e04\u0e40\u0e01\u0e08' ;
T26 : ';' ;
T27 : '\u0e19\u0e33\u0e40\u0e02\u0e49\u0e32' ;
T28 : 'static' ;
T29 : '.' ;
T30 : '*' ;
T31 : '\u0e2d\u0e18\u0e34\u0e1a\u0e32\u0e22' ;
T32 : '<' ;
T33 : ',' ;
T34 : '>' ;
T35 : 'extends' ;
T36 : '&' ;
T37 : 'implements' ;
T38 : '{' ;
T39 : '}' ;
T40 : 'interface' ;
T41 : '\u0e14\u0e31\u0e07\u0e19\u0e35\u0e49' ;
T42 : '\u0e08\u0e1a' ;
T43 : '\u0e01\u0e48\u0e2d\u0e19' ;
T44 : '(' ;
T45 : ')' ;
T46 : '\u0e2b\u0e25\u0e31\u0e07' ;
T47 : ':' ;
T48 : '\u0e01\u0e33\u0e2b\u0e19\u0e14\u0e43\u0e2b\u0e49' ;
T49 : 'void' ;
T50 : '[' ;
T51 : ']' ;
T52 : 'throws' ;
T53 : '=' ;
T54 : 'public' ;
T55 : 'protected' ;
T56 : 'private' ;
T57 : 'abstract' ;
T58 : 'final' ;
T59 : 'native' ;
T60 : 'synchronized' ;
T61 : 'transient' ;
T62 : 'volatile' ;
T63 : 'strictfp' ;
T64 : 'boolean' ;
T65 : 'char' ;
T66 : 'byte' ;
T67 : 'short' ;
T68 : 'int' ;
T69 : 'long' ;
T70 : 'float' ;
T71 : 'double' ;
T72 : '?' ;
T73 : 'super' ;
T74 : '...' ;
T75 : 'null' ;
T76 : '\u0e27\u0e48\u0e32\u0e07' ;
T77 : 'true' ;
T78 : 'false' ;
T79 : '\u0e08\u0e23\u0e34\u0e07' ;
T80 : '\u0e40\u0e17\u0e47\u0e08' ;
T81 : '@' ;
T82 : 'default' ;
T83 : '\u0e43\u0e2b\u0e49\u0e17\u0e33' ;
T84 : '\u0e42\u0e14\u0e22' ;
T85 : 'assert' ;
T86 : 'if' ;
T87 : 'else' ;
T88 : 'for' ;
T89 : 'while' ;
T90 : 'do' ;
T91 : 'try' ;
T92 : 'finally' ;
T93 : 'switch' ;
T94 : 'return' ;
T95 : 'throw' ;
T96 : 'break' ;
T97 : 'continue' ;
T98 : 'catch' ;
T99 : 'case' ;
T100 : '+=' ;
T101 : '-=' ;
T102 : '*=' ;
T103 : '/=' ;
T104 : '&=' ;
T105 : '|=' ;
T106 : '^=' ;
T107 : '%=' ;
T108 : '||' ;
T109 : '&&' ;
T110 : '|' ;
T111 : '^' ;
T112 : '\u0e04\u0e27\u0e23' ;
T113 : '==' ;
T114 : '!=' ;
T115 : 'instanceof' ;
T116 : '+' ;
T117 : '-' ;
T118 : '/' ;
T119 : '%' ;
T120 : '++' ;
T121 : '--' ;
T122 : '~' ;
T123 : '!' ;
T124 : 'this' ;
T125 : '\u0e2a\u0e23\u0e49\u0e32\u0e07' ;
T126 : 'class' ;
T127 : 'new' ;

// $ANTLR src "./src/spec.g3" 749
HexLiteral : '0' ('x'|'X') HexDigit+ IntegerTypeSuffix? ;

// $ANTLR src "./src/spec.g3" 751
DecimalLiteral : ('0' | '1'..'9' '0'..'9'*) IntegerTypeSuffix?;

// $ANTLR src "./src/spec.g3" 753
OctalLiteral : '0' ('0'..'7')+ IntegerTypeSuffix?;

// $ANTLR src "./src/spec.g3" 755
fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;

// $ANTLR src "./src/spec.g3" 758
fragment
IntegerTypeSuffix : ('l'|'L'|('.'Identifier)) ;

// $ANTLR src "./src/spec.g3" 761
FloatingPointLiteral
    :   ('0'..'9')+ '.' ('0'..'9')* Exponent? FloatTypeSuffix?
    |   '.' ('0'..'9')+ Exponent? FloatTypeSuffix?
    |   ('0'..'9')+ Exponent FloatTypeSuffix?
    |   ('0'..'9')+ Exponent? FloatTypeSuffix
	;

// $ANTLR src "./src/spec.g3" 768
fragment
Exponent : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

// $ANTLR src "./src/spec.g3" 771
fragment
FloatTypeSuffix : ('f'|'F'|'d'|'D') ;

// $ANTLR src "./src/spec.g3" 774
CharacterLiteral
    :   '\'' ( EscapeSequence | ~('\''|'\\') ) '\''
    ;

// $ANTLR src "./src/spec.g3" 778
StringLiteral
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

// $ANTLR src "./src/spec.g3" 782
fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscape
    |   OctalEscape
    ;

// $ANTLR src "./src/spec.g3" 789
fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

// $ANTLR src "./src/spec.g3" 796
fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

// $ANTLR src "./src/spec.g3" 801
ENUM:	'enum' {if ( !enumIsKeyword ) $type=Identifier;}
	;
	
// $ANTLR src "./src/spec.g3" 804
Identifier 
    :   Letter (Letter|JavaIDDigit)*
    ;
    
// IdentifierWithSpace 
//    :   Letter (Letter|JavaIDDigit|' ')*
//    ;
    
// $ANTLR src "./src/spec.g3" 812
/**I found this char range in JavaCC's grammar, but Letter and Digit overlap.
   Still works, but...
 */
fragment
Letter
    :  '\u0024' |
       '\u0041'..'\u005a' |
       '\u005f' |
       '\u0061'..'\u007a' |
       '\u00c0'..'\u00d6' |
       '\u00d8'..'\u00f6' |
       '\u00f8'..'\u00ff' |
       '\u0100'..'\u1fff' |
       '\u3040'..'\u318f' |
       '\u3300'..'\u337f' |
       '\u3400'..'\u3d2d' |
       '\u4e00'..'\u9fff' |
       '\uf900'..'\ufaff'
    ;

// $ANTLR src "./src/spec.g3" 832
fragment
JavaIDDigit
    :  '\u0030'..'\u0039' |
       '\u0660'..'\u0669' |
       '\u06f0'..'\u06f9' |
       '\u0966'..'\u096f' |
       '\u09e6'..'\u09ef' |
       '\u0a66'..'\u0a6f' |
       '\u0ae6'..'\u0aef' |
       '\u0b66'..'\u0b6f' |
       '\u0be7'..'\u0bef' |
       '\u0c66'..'\u0c6f' |
       '\u0ce6'..'\u0cef' |
       '\u0d66'..'\u0d6f' |
       '\u0e50'..'\u0e59' |
       '\u0ed0'..'\u0ed9' |
       '\u1040'..'\u1049'
   ;

// $ANTLR src "./src/spec.g3" 851
EOL :  ('\r' | '\n') ;

// $ANTLR src "./src/spec.g3" 853
WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
    ;

// $ANTLR src "./src/spec.g3" 856
COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

// $ANTLR src "./src/spec.g3" 860
LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
