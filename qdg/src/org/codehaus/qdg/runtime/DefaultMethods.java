package org.codehaus.qdg.runtime;

import org.codehaus.groovy.qdg.Closure;
import org.codehaus.qdg.runtime.annotations.Default;

@Default
public class DefaultMethods {

	// syntax allows:
	// 1. times(10, c)
	// 2. 10.times(c)
	// 3. 10.times { }
	@Default
	public static void times(int num, Closure closure) {
		for(int i=0;i<num;i++) {
			closure.call(i);
		}
	}
	
	// syntax allows:
	// 1. println(obj)
	// 2. obj.println
	@Default
	public static void println(Object obj) {
		System.out.println(obj);
	}
	
	@Default
	public static void println(String s) {
		System.out.println(s);
	}

}
