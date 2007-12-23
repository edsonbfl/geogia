package org.codehaus.groovy.qdg;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class Closure {

	private Object target;
	private Method method;

	public Closure(Object target, String methodName) {
		this.target = target;
		try {
			method = target.getClass().getDeclaredMethod(methodName, new Class[]{Object[].class});
			 AccessController.doPrivileged(new PrivilegedAction<Object>(){
				@Override
				public Object run() {
					method.setAccessible(true);
					return null;
				}				 
			 });			
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}

	public Object call(Object... args) {
		try {
			return method.invoke(target, (Object)args);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
}
