package com.learning.sax;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class MyRunner {

	public static SAXParser createSaxParser() throws ParserConfigurationException {
		SAXParser saxParser = null;

		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			saxParser = factory.newSAXParser();
		} catch (SAXException ex) {
			Logger lgr = Logger.getLogger(MyRunner.class.getName());
			lgr.log(Level.SEVERE, ex.getMessage(), ex);
		}

		return saxParser;
	}
}