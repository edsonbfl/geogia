package org.codehaus.groovy.aop;

import groovy.lang.Closure;

public class DefaultMethods {
	
    public static void times(Number self, Closure closure) {
        for (int i = 0, size = self.intValue(); i < size; i++) {
        	((org.codehaus.groovy.aop.Test$_main_closure1)closure).doCall(new Integer(i));
            if (closure.getDirective() == Closure.DONE) {
                break;
            }
        }
    }

}
