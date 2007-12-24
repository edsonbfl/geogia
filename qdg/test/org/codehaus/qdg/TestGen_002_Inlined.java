package org.codehaus.qdg;

import org.codehaus.groovy.qdg.Closure;
import org.codehaus.qdg.runtime.DefaultMethods;

/*
 * class TestGen_002 {
 *     def a = {
 *     		100.times {
 *     			println it
 *     		}		
 *     } 
 * }
 * */

public class TestGen_002_Inlined {
	
	public Closure a = new Closure(this, "a__0");
	
	private Object a__0(Object... args) {
		Closure a$a = new Closure(this, "a$a__0");
		// 0. check if this is an anonymous method
		// 1. created inlined_$class_$method(num of args-1)
		// 2. make a call, pass the new one with N-1 arguments
		// ORG: DefaultMethods.times(1000000, a$a);
		inlined_DefaultMethod_times(100);
		return null;
	}
	
	private void inlined_DefaultMethod_times(int num) {
		// 1. copy method content here
		// 2. keep the "num" variable
		for(int i=0;i<num;i++) {
			// inline calling closure with direct method call
			// ORG: closure.call(i);
			a$a__0(i);
		}		
	}

	private Object a$a__0(Object... args) {
		//Thread.dumpStack();
		System.out.println(args[0]);
		return null;
	}

}
