package org.codehaus.groovy.aop.asm.tests;

import org.codehaus.groovy.aop.asm.ReplaceCall;
import org.codehaus.groovy.aop.asm.ReplaceCall.Arg;
import org.codehaus.groovy.aop.parser.ClassTypeResolver;

import junit.framework.TestCase;

public class ReplaceCallTests extends TestCase {
	
	public void testParse() {
		ClassTypeResolver c = new ClassTypeResolver(new String[]{"groovy.lang.*","org.codehaus.groovy.runtime.*"});
		final String s = "org.codehaus.groovy.runtime.DefaultGroovyMethods#times((Number)$1, (Closure)$[0]);";
		ReplaceCall r = new ReplaceCall(c, s);
		assertEquals("org/codehaus/groovy/runtime/DefaultGroovyMethods", r.getReceiver());
		assertEquals("times", r.getName());
		assertEquals("(Ljava/lang/Number;Lgroovy/lang/Closure;)V", r.getDesc());
		assertEquals(2, r.getArgs().size());
		assertEquals(1, r.getWrappedArgs());	
		
		Arg a0 = r.getArgs().get(0);		
		assertEquals(1, a0.getIndex());
		assertEquals("Number", a0.getTypeCast());		
		assertEquals(false, a0.isWrapped());		
		
		Arg a1 = r.getArgs().get(1);
		assertEquals(0, a1.getIndex());
		assertEquals("Closure", a1.getTypeCast());
		assertEquals(true, a1.isWrapped());		
	}
	
	public void testParse2() {
		ClassTypeResolver c = new ClassTypeResolver(new String[]{"groovy.lang.*","org.codehaus.groovy.runtime.*"});
		final String s = "java.lang.System#currentTimeMillis();";
		ReplaceCall r = new ReplaceCall(c, s);
		assertEquals("java/lang/System", r.getReceiver());
		assertEquals("currentTimeMillis", r.getName());
		assertEquals("()J", r.getDesc());
		assertEquals(0, r.getArgs().size());
		assertEquals(0, r.getWrappedArgs());	
	}
	
	public void testParse_with_Resolver() {
		ClassTypeResolver c = new ClassTypeResolver(new String[]{"groovy.lang.*","org.codehaus.groovy.runtime.*"});
		final String s = "DefaultGroovyMethods#times((Number)$1, (Closure)$[0]);";
		ReplaceCall r = new ReplaceCall(c, s);
		assertEquals("org/codehaus/groovy/runtime/DefaultGroovyMethods", r.getReceiver());
		assertEquals("times", r.getName());
		assertEquals("(Ljava/lang/Number;Lgroovy/lang/Closure;)V", r.getDesc());
		assertEquals(2, r.getArgs().size());
		assertEquals(1, r.getWrappedArgs());	
		
		Arg a0 = r.getArgs().get(0);		
		assertEquals(1, a0.getIndex());
		assertEquals("Number", a0.getTypeCast());		
		assertEquals(false, a0.isWrapped());		
		
		Arg a1 = r.getArgs().get(1);
		assertEquals(0, a1.getIndex());
		assertEquals("Closure", a1.getTypeCast());
		assertEquals(true, a1.isWrapped());		
	}
	
	public void testParse_with_Resolver_2() {
		ClassTypeResolver c = new ClassTypeResolver(new String[]{"groovy.lang.*","org.codehaus.groovy.runtime.*"});
		final String s = "System#currentTimeMillis();";
		ReplaceCall r = new ReplaceCall(c, s);
		assertEquals("java/lang/System", r.getReceiver());
		assertEquals("currentTimeMillis", r.getName());
		assertEquals("()J", r.getDesc());
		assertEquals(0, r.getArgs().size());
		assertEquals(0, r.getWrappedArgs());	
	}	
	
}
