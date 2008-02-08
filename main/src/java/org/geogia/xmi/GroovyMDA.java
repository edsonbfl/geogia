package org.geogia.xmi;
/*
 * Copyright 2003-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;

import java.net.URL;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Collection;
import javax.jmi.model.ModelElement;
import javax.jmi.model.ModelPackage;
import javax.jmi.reflect.RefPackage;

import org.netbeans.api.mdr.MDRManager;
import org.netbeans.api.mdr.MDRepository;
import org.netbeans.api.xmi.XMIReaderFactory;

/**
 * The main class for the GroovyMDA tool
 *
 * @version $Revision: 3 $
 * @author        <a href="mailto:craig2600@gmail.com">Craig MacKay</a>
 * @author        <a href="mailto:chanwit@gmail.com">Chanwit Kaewkasi</a>
 * @created July 18, 2007
 */
public class GroovyMDA {

    private MDRepository repository;
    private ModelElement metaModelElement;
    private Map context;
    private GroovyObject modelProcessor;

    /**
     * The main method for the GroovyMDA class
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("usage: java -jar groovymda.jar modelPath [outputDirectroy] [scriptUrl]");
            System.exit(-1);
        }
        Map context = new Hashtable();
        context.put("modelPath", args[0]);
        if (args.length > 1) {
            context.put("outputDirectory", args[1]);
        }
        if (args.length > 2) {
            context.put("scriptUrl", args[2]);
        }
        new GroovyMDA().processModel(context);
    }


    /**
     * Main processing method for the GroovyMDA object
     *
     * @param context Description of the Parameter
     */
    public void processModel(Map context) {
        this.context = context;
        try {
            initialize();
            loadModel();
            runScript();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                destory();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
    }


    /**
     * Initializes the MDR
     *
     * @throws Exception Description of the Exception
     */
    public void initialize() throws Exception {
        System.setProperty(
                "org.netbeans.mdr.storagemodel.StorageFactoryClassName",
                "org.netbeans.mdr.persistence.memoryimpl.StorageFactoryImpl");

        repository = MDRManager.getDefault().getDefaultRepository();
        repository.beginTrans(true);

        String metaModelName = getClass().getResource("/org/omg/uml/resources/01-02-15_Diff.xml").toExternalForm();
        RefPackage metaModelExtent = repository.getExtent(metaModelName);
        if (metaModelExtent == null) {
            metaModelExtent = (ModelPackage) repository.createExtent(metaModelName);
        }

        metaModelElement = findModelElement("UML", (ModelPackage) metaModelExtent);
        if (metaModelElement == null) {
            XMIReaderFactory.getDefault().createXMIReader().read(metaModelName, metaModelExtent);
            metaModelElement = findModelElement("UML", (ModelPackage) metaModelExtent);
        }

        ClassLoader parent = getClass().getClassLoader();
        GroovyClassLoader loader = new GroovyClassLoader(parent);
        Class modelProcessorClass = Class.forName("GroovyModelProcessor");
        if (context.containsKey("scriptUrl")) {
            // if specified use the scrupt url as the model processor
            modelProcessorClass = loader.parseClass(new URL((String) context.get("scriptUrl")).openStream());
        }
        modelProcessor = (GroovyObject) modelProcessorClass.newInstance();
    }


    /**
     * Loads the model
     *
     * @param context Description of the Parameter
     * @throws Exception Description of the Exception
     */
    public void loadModel() throws Exception {
        URL modelUrl = new URL((String) context.get("modelPath"));
        String modelName = modelUrl.toExternalForm();
        InputStream in = (InputStream) modelProcessor.invokeMethod("preProcessXMI", modelUrl.openStream());
        RefPackage modelExtent = repository.getExtent("MODEL");
        if (modelExtent != null) {
            modelExtent.refDelete();
        }
        modelExtent = repository.createExtent("MODEL", metaModelElement);
        XMIReaderFactory.getDefault().createXMIReader().read(in, modelName, modelExtent);
        context.put("model", modelExtent);
    }


    /**
     * Runs the groovy script
     *
     * @param context Description of the Parameter
     * @throws Exception Description of the Exception
     */
    public void runScript() throws Exception {
        modelProcessor.invokeMethod("process", context);
    }


    /**
     * Cleans up the MDR
     *
     * @throws Exception Description of the Exception
     */
    public void destory() throws Exception {
        if (repository != null) {
            repository.endTrans(true);
        }
    }


    /**
     * Helper method for finding a model element by name in a given package
     *
     * @param name         Description of the Parameter
     * @param modelPackage Description of the Parameter
     * @return Description of the Return Value
     */
    private ModelElement findModelElement(String name, ModelPackage modelPackage) {
        ModelElement modelElement = null;
        for (Iterator i = modelPackage.getMofPackage().refAllOfClass().iterator(); i.hasNext();) {
            modelElement = (ModelElement) i.next();
            if (modelElement.getName().equals(name)) {
                return modelElement;
            }
        }
        return null;
    }

}
