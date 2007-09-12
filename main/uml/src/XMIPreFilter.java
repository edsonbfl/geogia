
import java.io.ByteArrayInputStream;
import java.io.File;
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

	private static final String XSLT_FILENAME = "xslt/pre-filter.xsl";

	public void transform(File xmlFile) throws TransformerException {

		//File xsltFile = new File(XSLT_FILENAME);

		Source xmlSource = new StreamSource(xmlFile);
		Source xsltSource = new StreamSource(this.getClass().getResourceAsStream(XSLT_FILENAME));		
		Result result = new StreamResult(
				new File("result-" + xmlFile.getName())
		);
		

		// create an instance of TransformerFactory
		TransformerFactory transFact = TransformerFactory.newInstance();
		Transformer trans = transFact.newTransformer(xsltSource);
		trans.transform(xmlSource, result);
	}
	
	public InputStream transform1(InputStream in) throws TransformerException, IOException {
		Source xmlSource = new StreamSource(in);
		Source xsltSource = new StreamSource(this.getClass().getResourceAsStream(XSLT_FILENAME));
		StringWriter sw = new StringWriter();
		Result result = new StreamResult(sw);
		
		// create an instance of TransformerFactory
		TransformerFactory transFact = TransformerFactory.newInstance();
		Transformer trans = transFact.newTransformer(xsltSource);
		trans.transform(xmlSource, result);
		sw.close();
		return new ByteArrayInputStream(sw.toString().getBytes());
	}
	
	public static void main(String[] args) throws TransformerException {
		if (args.length != 1) {
			System.err.println("Usage : XMIPreFilter <orginal-xmi-file>");
			System.exit(0);
		}
		
		String xmiFile = args[0];

		System.out.println("Running XMIPreFilter transformation ...");
		new File("result.xmi").delete();
		XMIPreFilter importer = new XMIPreFilter();
		importer.transform(new File(xmiFile));
		System.out.println("transformation OK");
	}
}