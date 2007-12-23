package org.codehaus.qdg;

import org.codehaus.groovy.qdg.Closure;
import org.codehaus.qdg.runtime.DefaultMethods;

/*
 * class TestGen_002 {
 *     def a = {
 *     		1000000.times {
 *     			println it
 *     		}		
 *     } 
 * }
 * */

public class TestGen_002 {
	
	public Closure a = new Closure(this, "a__0");
	
	private Object a__0(Object... args) {
		Closure a$a = new Closure(this, "a$a__0");
		DefaultMethods.times(1000000, a$a);
		return null;
	}
	
	private Object a$a__0(Object... args) {
		// Thread.dumpStack();
		System.out.println(args[0]);
		return null;
	}

}
