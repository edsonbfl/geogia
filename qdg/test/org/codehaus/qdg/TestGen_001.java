package org.codehaus.qdg;

import org.codehaus.groovy.qdg.Closure;
import org.codehaus.qdg.runtime.DefaultMethods;

/*
 * class TestGen_001 {
 *	  def a = {
 *      println it
 *      println 'a_body'
 *    } 
 * }
 * 
 * */

public class TestGen_001 {
	
	private Closure a = new Closure(this, "a__0");

	private Object a__0(Object... args) {
		DefaultMethods.println("test");
		//System.out.println(args[0]);
		//System.out.println("a_body");
		return null;
	}

	public Closure getA() {
		return a;
	}

	public void setA(Closure a) {
		this.a = a;
	}
	
}
