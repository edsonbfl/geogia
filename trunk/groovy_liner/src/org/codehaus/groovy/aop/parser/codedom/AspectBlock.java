package org.codehaus.groovy.aop.parser.codedom;

import org.objectweb.asm.Type;

public class AspectBlock {

	private boolean isStatic;
	private String wherePattern;
	private Type[] whereSignature;
	private ReplaceStmt[] replaceStmts;

	public void setStatic(boolean b) {
		this.isStatic = b;		
	}

	public boolean isStatic() {
		return isStatic;
	}

	public void setWherePattern(String where) {
		this.wherePattern = where;		
	}

	public void setWhereSignature(Type[] whereSig) {
		this.whereSignature = whereSig;		
	}

	public void setReplceStmt(ReplaceStmt[] replaceStmts) {
		this.replaceStmts = replaceStmts;		
	}

	public ReplaceStmt[] getReplaceStmts() {
		return replaceStmts;
	}

	public void setReplaceStmts(ReplaceStmt[] replaceStmts) {
		this.replaceStmts = replaceStmts;
	}

	public String getWhereClassPattern() {
		// detect #,
		// if not, return ""
		final int methodMark = wherePattern.indexOf('#');
		if(methodMark==-1) return "";
		else return wherePattern.substring(0, methodMark);
	}
	
	public String getWhereMethodPattern() {
		// detect #
		// split things after #
		final int methodMark = wherePattern.indexOf('#');
		if(methodMark==-1) return wherePattern;		
		else return wherePattern.substring(methodMark+1);
	}
	
	public String getWhereDescPattern() {
		return getWhereDesc() + "+";
	}
	

	public Type[] getWhereSignature() {
		return whereSignature;
	}
	
	public String getWhereDesc() {
		StringBuffer sb = new StringBuffer();
		sb.append('(');		
		for(Type t: whereSignature) {
			sb.append(t.getDescriptor());
		}
		sb.append(')');
		return sb.toString(); 
	}

}
