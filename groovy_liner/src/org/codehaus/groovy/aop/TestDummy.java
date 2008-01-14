package org.codehaus.groovy.aop;

import groovy.lang.Closure;

import org.codehaus.groovy.runtime.DefaultGroovyMethods;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.aop.Test$_main_closure1;

public class TestDummy {

	public static void main(String[] args) throws Throwable {
		Class c = TestDummy.class;
		Integer i = new Integer(1);
		Object[] param = new Object[]{new Test$_main_closure1(c, c)};
		DefaultGroovyMethods.times(i, (Closure)param[0]);
		//ScriptBytecodeAdapter.invokeMethodN(c, i, "times", param);
		//DefaultGroovyMethods.times(i, closure);
	}
	
}
