package org.codehaus.qdg;

import org.codehaus.groovy.qdg.Closure;

public class TestGen_001 {
	
	public Closure a = new Closure(this, "a_body");
	
	private Object a_body(Object... args) {
		System.out.println(args[0]);
		System.out.println("a_body");
		return null;
	}

}
