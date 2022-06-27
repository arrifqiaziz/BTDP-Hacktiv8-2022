package sesi_09.demo_alexa;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomProcessor {
				
		public static DocumentBuilder createDomBuilder() throws ParserConfigurationException {
			
			final DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			
			dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
			
			DocumentBuilder dBuilder = dbf.newDocumentBuilder();  // DocumentBuilder -> API untuk DOM document
			
			return dBuilder;
		}
			
		public static Document parseDom(InputStream is) throws SAXException, IOException, ParserConfigurationException{	
			
			DocumentBuilder dBuilder = createDomBuilder();
			Document doc = dBuilder.parse(is);
			
			return doc;
		}
}
