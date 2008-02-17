package org.tspec.runtime;

public class ShouldObject {

	private Object object;

	public ShouldObject(Object o) {
		this.object = o;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!this.object.equals(obj)) {
			for(StackTraceElement ste: Thread.currentThread().getStackTrace()) {
				if(ste.getFileName().lastIndexOf("Story.groovy")!=-1) {
					ErrorListener.v().addError(
						ste.getFileName()+":"+ste.getLineNumber() + " / "
						+ this.object + " should be " + obj
					);
					break;
				}				
			}
			return false;
		} else {
			return true;
		}
	}	

}
