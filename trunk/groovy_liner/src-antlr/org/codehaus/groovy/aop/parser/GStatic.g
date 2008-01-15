grammar GStatic;

options {k=2; backtrack=true; memoize=true;}

@parser::header {
package org.codehaus.groovy.aop.parser;

import org.codehaus.groovy.aop.parser.codedom.*;
import org.objectweb.asm.Type;
}

@lexer::header {
package org.codehaus.groovy.aop.parser;
}

compilationUnit returns [GStatic gstatic]
@init   	{ gstatic = new GStatic(); }
	:		( i=  importDecl  { gstatic.addImport(i);}       )* 
	    	( ab= aspectBlock { gstatic.addAspectBlock(ab);} )*
	;
	
importDecl returns [String stmt]
	:	'import' i= importStmt ';' {
	    		stmt = $i.text;
		}
	;

importStmt
	:	Identifier ('.' Identifier)* ('.' '*')?
	;	

aspectBlock returns [AspectBlock ab]
@init 		{ ab = new AspectBlock(); }
	:	s='static'? classNamePattern? '#' methodPattern m=methodSig? blockBody 	{
			if(s!=null) ab.setStatic(true);
			ab.addClassNamePattern($classNamePattern.text);
			ab.addMethodPattern($methodPattern.text);
			ab.setWhereSignature(m);			
		}
	;
	
blockBody returns [List<ReplaceStmt> replaceStmts]
@init 		{ replaceStmts = new List<ReplaceStmt>(); }
	:	'{' 
			( r= replaceRule { replaceStmts.add(r); } )* 
		'}'
	;
	
replaceRule returns [ReplaceStmt r]
@init 		{ r = new ReplaceStmt(); }
	:  	m=methodCall '->' re=replaceStmt { 
	   		r.setMethodCall(m);
	   		r.setReplaceStmt(re);
	   	}
	;	
	
methodCall returns [MethodCall m]
	:	'static'? classNamePattern? '#' methodPattern methodSig? {
			
		}
	;
	
methodSig returns [List<Type> types]
	:	'(' typeList? ')'		
	;
	
typeList returns [List<Type> types]
@init		{  types = new ArrayList<Type>(); }
	:	e=typeName {types.add(e);} ( ',' e=typeName {types.add(e);} )*
	;
	
typeName returns [Type type]
	:	a=primitiveOrFull ArrayMask
		{
			System.out.println($a.text);
			System.out.println($ArrayMask.text);
			if($ArrayMask != null) {
				
			}
			// type = Type.getDescription($a.text);
		}
	;
	
primitiveOrFull
	: (primitiveType | className)
	;	
	
ArrayMask
	:	('[' ']')*
	;
	
primitiveType
	:	'int' | 'long' | 'short' | 'byte' | 'float' | 'double' | 'char' | 'boolean'
	;

replaceStmt
	:	className '#' methodName replaceSig ';'
	;
	
replaceSig
	:	'(' varList? ')'
	;

varList
	:	var (',' var)*
	;
	
var :	typeCast? '#' ( JavaIDDigit | ('[' JavaIDDigit ']'))
	;

typeCast
	: '(' className ')'
	;
	
className
	:	Identifier ('.' Identifier)*
	;
	
methodName
	:	Identifier
	;
	
classNamePattern
	:	Identifier_Pattern ('.' Identifier_Pattern)*
	;
	
methodPattern
	:	Identifier_Pattern
	;
	
Identifier_Pattern 
    :   (Letter | '*' | '+' ) (Letter| '*' | '+' | JavaIDDigit)*
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
       '\u0100'..'\u1fff' |
       '\u3040'..'\u318f' |
       '\u3300'..'\u337f' |
       '\u3400'..'\u3d2d' |
       '\u4e00'..'\u9fff' |
       '\uf900'..'\ufaff'
    ;

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

WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
    ;

COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;	
