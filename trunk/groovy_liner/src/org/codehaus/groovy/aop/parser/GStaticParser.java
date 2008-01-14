package org.codehaus.groovy.aop.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.codehaus.groovy.aop.parser.codedom.AspectBlock;
import org.codehaus.groovy.aop.parser.codedom.GStatic;
import org.codehaus.groovy.aop.parser.codedom.MethodCall;
import org.codehaus.groovy.aop.parser.codedom.ReplaceStmt;
import org.hyperform.parser.Parser;
import org.hyperform.parser.ParserHelper;
import org.objectweb.asm.Type;

public class GStaticParser extends Parser {

	private GStatic gstatic;
	private ClassTypeResolver resolver;
	private String[] defaultImports = {"groovy.lang.*"};
	
	public GStaticParser(String filename) throws Exception {
		super(filename);
		this.gstatic = new GStatic();
		this.resolver = new ClassTypeResolver(new ArrayList<String>(Arrays.asList(defaultImports)));
	}
	
	public GStatic compilationUnit() throws Exception {
		importDecl();
		aspectBlocks();
		return this.gstatic;
	}
	
	private void aspectBlocks() throws Exception {
		while(LA_where()) { aspectBlock(); }
	}

	private void aspectBlock() throws Exception {
		AspectBlock a = new AspectBlock();
		if($q("static")){ a.setStatic(true); }
		a.setWherePattern(where());
		a.setWhereSignature(whereSig()); $('{');
		  a.setReplceStmt(replaceStmts());
		$('}');
		gstatic.addAspectBlock(a);
	}

	private String where() throws Exception {
		cleanUp();
		StringBuffer sb = new StringBuffer();
		int ch = cb.LA(1);
		if(Character.isJavaIdentifierStart(ch) || ch == '*') {			
			cb.consume();
			sb.append((char)ch);
			ch = cb.LA(1);
			while(Character.isJavaIdentifierPart(ch) || ch == '*' || ch=='.' || ch=='#') {
				cb.consume();
				sb.append((char)ch);				
				ch = cb.LA(1);
			}
			return sb.toString();
		} else {
			throw new Exception("Where pattern is expected");
		}
	}	
	
	private Type[] whereSig() throws Exception {
		Type[] result = null; 
		if($q('(')){ result = typeList(); $(')'); }
		return result;
	}

	private Type[] typeList() throws Exception {
		List<Type> t = new ArrayList<Type>();
		t.add(typeName()); while($q(',')) { t.add(typeName()); }
		return t.toArray(new Type[t.size()]);
	}

	private Type typeName() throws Exception {
		String name = identifier();
		Class<?> c = resolver.resolveType(name);
		name = Type.getDescriptor(c);
		if($q('[')) {$(']'); name = '[' + name;}
		return Type.getType(name);
	}

	private ReplaceStmt[] replaceStmts() throws Exception {
		List<ReplaceStmt> r = new ArrayList<ReplaceStmt>();
		while(LA_methodPattern()) {
			ReplaceStmt re = new ReplaceStmt();
			re.setMethodCall(methodCall()); $("->"); re.setReplaceCall(replaceCall()); $(';');
			r.add(re);
		}
		return r.toArray(new ReplaceStmt[r.size()]);
	}

	private boolean LA_methodPattern() throws Exception {
		cleanUp();
		return Character.isJavaIdentifierStart(cb.LA(1)) && Character.isJavaIdentifierPart(cb.LA(2));
	}

	// TODO: how to have a propper method pattern
	// static methodName(Type[])
	private MethodCall methodCall() throws Exception {
		MethodCall c = new MethodCall();
		if($q("static")){ c.setStatic(true); }
		// TODO add package recognition here
		// c.setPackage(packagePattern());
		c.setName(identifier());
		c.setArgTypes(methodSig());
		return c;
	}
	
	private Type[] methodSig() throws Exception {
		Type[] result = null; 
		if($q('(')){ result = typeList(); $(')'); }
		return result;
	}

	private String identifier() throws Exception {
		cleanUp();
		StringBuffer sb = new StringBuffer();		
		int ch = cb.LA(1);
		if(Character.isJavaIdentifierStart(ch)) {
			cb.consume();
			sb.append((char)ch);			
			ch = cb.LA(1);
			while(Character.isJavaIdentifierPart(ch)) {
				cb.consume();
				sb.append((char)ch);				
				ch = cb.LA(1);				
			}
			return sb.toString();
		} else {
			throw new Exception("identifier is expected"); 
		}
	}

	private String replaceCall() throws Exception {
		cleanUp();
		StringBuffer sb = new StringBuffer();		
		int ch = cb.LA(1);
		if(Character.isJavaIdentifierStart(ch)) {
			cb.consume();
			sb.append((char)ch);			
			ch = cb.LA(1);
			while(ch != ';') {
				cb.consume();
				sb.append((char)ch);				
				ch = cb.LA(1);				
			}
			// System.out.println("replace pattern: " + sb.toString());
			return sb.toString();
		} else {
			throw new Exception("replace pattern is expected"); 
		}		
	}

	private boolean LA_where() throws Exception {
		cleanUp();
		int ch = cb.LA(1);
		if(Character.isJavaIdentifierStart(ch) || ch == '*') {
			return true;
		} else {
			return false;
		}
	}

	private void importDecl() throws Exception {
		while($q("import")) { importStmt(); $(';'); }
	}

	private void importStmt() throws Exception {
		StringBuffer sb = new StringBuffer();
		cleanUp();
		int ch = cb.LA(1);
		if(Character.isJavaIdentifierStart(ch)==false) {
			throw new Exception("Identifier expected");
		}
		sb.append((char)ch);
		cb.consume();
		ch = cb.LA(1);
		while(Character.isJavaIdentifierPart((char)ch) || ch=='.' || ch=='*') {
			sb.append((char)ch);
			cb.consume();
			ch = cb.LA(1);
		}
		gstatic.addImport(sb.toString());
		resolver.addImport(sb.toString());
		cleanUp();
	}	
	
	@Override
	protected void cleanUp() throws Exception {
		do {
			ParserHelper.consumeWhiteSpace(cb);
			ParserHelper.consumeLineComment(cb);
			ParserHelper.consumeComment(cb);
		} while (ParserHelper.hasWhiteSpace(cb) || ParserHelper.hasComment(cb));
	}

	public ClassTypeResolver getResolver() {
		return resolver;
	}

}
