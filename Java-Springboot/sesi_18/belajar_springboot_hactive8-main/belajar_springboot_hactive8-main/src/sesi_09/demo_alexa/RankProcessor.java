package sesi_09.demo_alexa;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class RankProcessor {
	
	public static int displayRank(URLConnection conn) throws IOException, ParserConfigurationException, SAXException {
 	    
		InputStream is = DataProcessor.getData(conn); // get data from url
 	   
 	    Document doc = DomProcessor.parseDom(is); // parse data
 	    
 	    NodeList nodeList = getNodeList(doc); // get document node
 	    
 	    return getRanking(nodeList);
	}
	
	public static NodeList getNodeList(Document doc) {
		Element element = doc.getDocumentElement(); // ambil child node
		NodeList nodeList = element.getElementsByTagName("POPULARITY"); //ambil node dalam POPULARITY
		
		return nodeList;
	}
	
	public static int getRanking(NodeList nodeList) {
		if (nodeList.getLength() <= 0) {
			throw new IllegalArgumentException("Tidak ada node!");
		}

		Element elementAttribute = (Element) nodeList.item(0);
		String ranking = elementAttribute.getAttribute("TEXT");
		int result = ranking.isEmpty() ? 0 : Integer.parseInt(ranking);
		return result;
	}
}
