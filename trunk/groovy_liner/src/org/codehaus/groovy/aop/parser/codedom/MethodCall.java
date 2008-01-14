package org.codehaus.groovy.aop.parser.codedom;

import org.objectweb.asm.Type;

public class MethodCall {

	private boolean isStatic;
	private String name;
	private Type[] argTypes;

	public Type[] getArgTypes() {
		return argTypes;
	}

	public void setStatic(boolean b) {
		this.isStatic = b;		
	}

	public boolean isStatic() {
		return isStatic;
	}

	public void setName(String name) {
		this.name = name;		
	}

	public String getName() {
		return name;
	}

	public void setArgTypes(Type[] methodSig) {
		this.argTypes = methodSig;		
	}

}
