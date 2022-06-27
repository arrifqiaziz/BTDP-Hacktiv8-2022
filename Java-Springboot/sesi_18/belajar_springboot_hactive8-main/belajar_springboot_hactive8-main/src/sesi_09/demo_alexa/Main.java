package sesi_09.demo_alexa;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URLConnection;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class Main {
	public static void main (String[] args) throws MalformedURLException, IOException, ParserConfigurationException, SAXException {
		URLConnection conn = UrlProcessor.processingUrl("bcafinance.co.id");
		int ranking = RankProcessor.displayRank(conn); 	    
 	    System.out.println("Ranking: " + ranking);
	}
}
