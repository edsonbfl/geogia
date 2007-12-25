package org.codehaus.qdg.tests;

import junit.framework.TestCase;
import org.codehaus.groovy.qdg.classgen.QdgClassGen;
import org.codehaus.qdg.Original_002;
import org.codehaus.qdg.TestGen_001;
import org.codehaus.qdg.TestGen_002;
import org.codehaus.qdg.TestGen_002_Inlined;

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
    	t.getA().call(1);
    }
    
    public void testCallingClosure_002() {
    	long s1 = System.currentTimeMillis();
    	TestGen_002 t = new TestGen_002();
    	t.a.call();
    	long s2 = System.currentTimeMillis()-s1;
    	System.out.println("time:" + s2);    
    	// 1,000,000 loops
    	// time:30974
    	// time:28661
    	// time:27730
    	// time:28090
    }
    
    public void testCallingOriginal_002() {
    	long s1 = System.currentTimeMillis();
    	Original_002 t = new Original_002();
    	t.a();
    	long s2 = System.currentTimeMillis()-s1;
    	System.out.println("time:" + s2);  
    	// 1,000,000 loops    	
    	// time:22883
    }
    
    public void testCallingInlined_002() {
    	long s1 = System.currentTimeMillis();
    	TestGen_002_Inlined t = new TestGen_002_Inlined();
    	t.a.call();
    	long s2 = System.currentTimeMillis()-s1;
    	System.out.println("time:" + s2);  
    	// 1,000,000 loops    	
    	// time:22643
    }    
    

}
