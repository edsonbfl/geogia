package org.codehaus.qdg.tests;

import junit.framework.TestCase;
import org.codehaus.groovy.qdg.classgen.QdgClassGen;

/**
 * Created by IntelliJ IDEA.
 * User: chanwit
 * Date: 23 ¸.¤. 2550
 * Time: 4:40:55
 * To change this template use File | Settings | File Templates.
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

}
