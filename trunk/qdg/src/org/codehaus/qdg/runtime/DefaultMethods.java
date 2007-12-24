package org.codehaus.qdg.runtime;

import org.codehaus.groovy.qdg.Closure;

public class DefaultMethods {

	public static void times(int num, Closure closure) {
		for(int i=0;i<num;i++) {
			closure.call(i);
		}
	}
	
	public static void println(Object obj) {
		System.out.println(obj);
	}

}
