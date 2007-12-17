package org.geogia.xmi;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XMIPreFilter {

	private static final String XSLT_FILENAME = "/xslt/pre-filter.xsl";
	
	public InputStream transform(InputStream in) throws TransformerException, IOException {
		Source xmlSource = new StreamSource(in);
		Source xsltSource = new StreamSource(this.getClass().getResourceAsStream(XSLT_FILENAME));
		StringWriter sw = new StringWriter();
		Result result = new StreamResult(sw);
		
		TransformerFactory transFact = TransformerFactory.newInstance();
		Transformer trans = transFact.newTransformer(xsltSource);
		trans.transform(xmlSource, result);
		sw.close();
		return new ByteArrayInputStream(sw.toString().getBytes());
	}
	
}
