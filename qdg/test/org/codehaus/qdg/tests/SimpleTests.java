package org.codehaus.qdg.tests;

import junit.framework.TestCase;
import org.codehaus.groovy.qdg.classgen.QdgClassGen;
import org.codehaus.qdg.TestGen_001;

/**
 * 
 * User: chanwit
 * 
 */
public class SimpleTests extends TestCase {

    public void testSimple1() {
        QdgClassGen q = new QdgClassGen("tests/MyDomain.groovy");
        q.generate("output");        
    }

    public void testSimple2() {
        QdgClassGen q = new QdgClassGen("tests/pk/MyController.groovy");
        q.generate("output");
    }

    public void testProp() {
       QdgClassGen q = new QdgClassGen("tests/TestProp.groovy");
       q.generate("output");
    }

    public void testClosure() {
       QdgClassGen q = new QdgClassGen("tests/TestClosure.groovy");
       q.generate("output");
    }
    
    public void testCallingClosure() {
    	TestGen_001 t = new TestGen_001();
    	t.a.call(1);
    }

}
