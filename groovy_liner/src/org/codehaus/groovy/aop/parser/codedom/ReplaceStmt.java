package org.codehaus.groovy.aop.parser.codedom;


public class ReplaceStmt {

	private MethodCall methodCall;
	private String replaceCall;

	public MethodCall getMethodCall() {
		return methodCall;
	}

	public String getReplaceCall() {
		return replaceCall;
	}

	public void setMethodCall(MethodCall methodCall) {
		this.methodCall = methodCall;	
	}

	public void setReplaceCall(String replacePattern) {
		this.replaceCall = replacePattern;		
	}

}
