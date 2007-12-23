package org.codehaus.qdg;

import org.codehaus.groovy.qdg.Closure;

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
	
	public Closure a = new Closure(this, "a$body");

	private Object a$body(Object... args) {
		System.out.println(args[0]);
		System.out.println("a_body");
		return null;
	}
	
}
