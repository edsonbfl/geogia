package org.codehaus.groovy.aop.parser.tests;

import java.util.List;
import java.util.regex.Pattern;

import org.codehaus.groovy.aop.parser.GStaticParser;
import org.codehaus.groovy.aop.parser.codedom.AspectBlock;
import org.codehaus.groovy.aop.parser.codedom.GStatic;

import junit.framework.TestCase;

public class GStaticParserTests extends TestCase {

	public void testParse1() throws Exception {
		GStaticParser g = new GStaticParser("src/DefaultImports.gstatic");
		g.compilationUnit();
	}

	public void testParse2() throws Exception {
		GStaticParser g = new GStaticParser("src/DefaultImports_Where.gstatic");
		g.compilationUnit();
	}

	public void testParse3() throws Exception {
		GStaticParser g = new GStaticParser("src/Default.gstatic");
		g.compilationUnit();
	}

	public void testParseToDOM_1() throws Exception {

		GStaticParser g = new GStaticParser("src/Default.gstatic");
		GStatic gs = g.compilationUnit();
		
		List<String> i = gs.getImports();
		assertEquals("org.codehaus.groovy.runtime.*", i.get(0));

		List<AspectBlock> ab = gs.getAspectBlocks();
		assertEquals("*Controller$_*", ab.get(0).getWhereClassPattern());
		assertEquals("doCall", ab.get(0).getWhereMethodPattern());
		assertEquals(false, ab.get(0).isStatic());
		assertEquals(1, ab.get(0).getWhereSignature().length);
		assertEquals("(Ljava/lang/Object;)", ab.get(0).getWhereDesc());
		assertEquals(1, ab.get(0).getReplaceStmts().length);

		assertEquals("main", ab.get(1).getWhereMethodPattern());
		assertEquals(true, ab.get(1).isStatic());
		assertEquals(1, ab.get(1).getWhereSignature().length);
		assertEquals("([Ljava/lang/String;)", ab.get(1).getWhereDesc());
		assertEquals(4, ab.get(1).getReplaceStmts().length);

		assertEquals("$_main_closure1", ab.get(2).getWhereClassPattern());
		assertEquals("doCall", ab.get(2).getWhereMethodPattern());
		assertEquals(false, ab.get(2).isStatic());
		assertEquals(1, ab.get(2).getWhereSignature().length);
		assertEquals("(Ljava/lang/Object;)", ab.get(2).getWhereDesc());
		assertEquals(1, ab.get(2).getReplaceStmts().length);

	}
	
	public void testClassNameMatcher() throws Exception {
		//"*Controller$_*#doCall"
		Pattern p;
		p = Pattern.compile(".*Controller");
		assertTrue(p.matcher("AController").matches());
		p = Pattern.compile(".*Controller\\$_.*");
		assertTrue(p.matcher("AController$_main_closure1").matches());
		String str = "+Controller$_*";
		String pstr = str.replace("+", ".+").replace("*", ".*").replace("$", "\\$");
		p = Pattern.compile(pstr);
		assertTrue(p.matcher("AController$_main_closure1").matches());		
		assertTrue(p.matcher("AaaaController$_main_closure1").matches());		
		assertFalse(p.matcher("AController$").matches());		
		assertFalse(p.matcher("Controller$_").matches());		
		assertTrue(p.matcher("_Controller$_abcd").matches());		
//		p = Pattern.compile(".*Controller");
//		assertTrue(p.matcher("AController").matches());
	}

}
