package org.codehaus.qdg.tests;

import org.codehaus.groovy.qdg.classgen.QdgClassGen;

import junit.framework.TestCase;

public class GenerationTests extends TestCase {
	
    public void testGenerateTestClosure() {
        QdgClassGen q = new QdgClassGen("tests/TestClosure_01.groovy");
        q.generate("output");
     }	

}
