package org.codehaus.groovy.aop.parser.codedom;

import java.util.ArrayList;
import java.util.List;


public class GStatic {

	private List<String> importList = new ArrayList<String>();
	private List<AspectBlock> aspectBlocks = new ArrayList<AspectBlock>();

	public void addImport(String importStmt) {
		importList.add(importStmt);		
	}
	
	public List<String> getImports() {
		return this.importList;
	}

	public List<AspectBlock> getAspectBlocks() {
		return this.aspectBlocks;
	}

	public void addAspectBlock(AspectBlock a) {
		aspectBlocks.add(a);		
	}
	
	
}
