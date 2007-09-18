grammar spec;

specUnit 
	: importDecl*
	  'อธิบาย' Identifier 'ดังนี้' EOL
	   block*
	  'จบ' EOL?
	;
	
importDecl
	: 'นำเข้า' packageName EOL
	;

packageName
	: 
	;
	
block
	: beforeBlock
	| afterBlock
	| specBlock
	;
	
beforeBlock
	:
	;
	
afterBlock
	:
	;

// specify specName by
specBlock
	: 'กำหนดให้' SpecName 'โดย' EOL
	   specStmt*
	  'จบ' EOL	  
	;

SpecName
	:	Letter (Letter|JavaIDDigit|' ')*
	;

specStmt
	:
	;
	
Identifier 
    :   Letter (Letter|JavaIDDigit)*
    ;

fragment
Letter
    :  '\u0024' |
       '\u0041'..'\u005a' |
       '\u005f' |
       '\u0061'..'\u007a' |
       '\u00c0'..'\u00d6' |
       '\u00d8'..'\u00f6' |
       '\u00f8'..'\u00ff' |
       '\u0E01'..'\u0E5B'
    ;

fragment
JavaIDDigit
    :  '\u0030'..'\u0039' |
       '\u0ed0'..'\u0ed9'
   ;	
	
WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
    ;

EOL	: '\r'? '\n' {$channel=HIDDEN;}
	;

LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
