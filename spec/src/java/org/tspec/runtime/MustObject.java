package org.tspec.runtime;

public class MustObject {

	private Object object;
	private boolean not=false;

	public MustObject(Object o) {
		this.object = o;
	}
	
	public MustObject(Object o, boolean b) {
		this.object = o;
		this.not = b;
	}

	@Override
	public boolean equals(Object obj) {
		if(this.not==true) {
			if(this.object.equals(obj)) {
				for(StackTraceElement ste: Thread.currentThread().getStackTrace()) {
					if(ste.getFileName()!=null && ste.getFileName().lastIndexOf("Story.groovy")!=-1) {
						ErrorListener.v().addError(
							ste.getFileName()+":"+ste.getLineNumber() + " / "
							+ this.object + " must not be " + obj
						);
						break;
					}				
				}
				return false;
			} else {
				return true;
			}						
		} else {
			if(!this.object.equals(obj)) {
				for(StackTraceElement ste: Thread.currentThread().getStackTrace()) {
					if(ste.getFileName()!=null && ste.getFileName().lastIndexOf("Story.groovy")!=-1) {
						ErrorListener.v().addError(
							ste.getFileName()+":"+ste.getLineNumber() + " / "
							+ this.object + " must be " + obj
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
	
	public MustObject getNot() {
		return new MustObject(this.object, true);
	}

}
