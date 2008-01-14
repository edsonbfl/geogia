package org.codehaus.groovy.aop.asm;

public class MatchInfo {

	private boolean success;
	private boolean hasArgs;
	private String name;
	private boolean isStatic;
	
	public MatchInfo(boolean success) {
		this.success = success;
	}

	public MatchInfo(boolean success, boolean hasArgs, boolean isStatic, String name) {
		this.success = success;
		this.hasArgs = hasArgs;
		this.isStatic = isStatic;
		this.name = name;
	}

	public boolean getSuccess() {
		return this.success;
	}
	
	public boolean hasArgs() {
		return this.hasArgs;
	}
	
	public boolean isStatic() {
		return this.isStatic;
	}

	public String getName() {
		return this.name;
	}

}
