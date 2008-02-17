package org.tspec;

import org.codehaus.groovy.runtime.MetaClassHelper;
import org.codehaus.groovy.runtime.metaclass.ClosureMetaMethod;
import org.codehaus.groovy.runtime.metaclass.MetaClassRegistryImpl;
import org.tspec.closure.ScenarioClosure;
import org.tspec.closure.SubjectClosure;
import org.tspec.dom.Story;
import org.tspec.runtime.ShouldObject;

import groovy.lang.Binding;
import groovy.lang.Closure;
import groovy.lang.ExpandoMetaClass;
import groovy.lang.ExpandoMetaClassCreationHandle;
import groovy.lang.GroovySystem;
import groovy.lang.MetaBeanProperty;
import groovy.lang.MetaClass;
import groovy.lang.MetaClassImpl;
import groovy.lang.MetaClassRegistry;
import groovy.lang.MetaMethod;


public class ThaiSpecBinding extends Binding {

	public ThaiSpecBinding() {
		super();
		init();
	}

	private void init() {
		Story root = new Story();
		setVariable("เรื่อง", new SubjectClosure(root));		
		setVariable("อธิบาย", new ScenarioClosure(root));
		
		ExpandoMetaClassCreationHandle.enable();
		MetaClassRegistry mr = GroovySystem.getMetaClassRegistry();
		ExpandoMetaClass mc = (ExpandoMetaClass)mr.getMetaClass(Object.class);
		Closure c = new Closure(null){
			public ShouldObject doCall() {
				return new ShouldObject(this.getDelegate()); 				
			}
		};
		mc.setProperty("getShould", c);			
	}

}
