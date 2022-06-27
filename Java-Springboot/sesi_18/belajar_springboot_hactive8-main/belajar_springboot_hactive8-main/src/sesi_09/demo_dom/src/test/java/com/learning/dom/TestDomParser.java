package com.learning.dom;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class TestDomParser {

	@Test
	public void testDomParser() throws SAXException, IOException, ParserConfigurationException {
		ParseKnownXMLStructure.domProcessing();
	}
	
	public void testGetElements() throws SAXException, IOException, ParserConfigurationException {
		Document document = ParseKnownXMLStructure.domProcessing();
		NodeList elements = ParseKnownXMLStructure.getDocumentElements(document);
		System.out.println(elements);
	}
	
	@Test
	public void testDisplayData() throws SAXException, IOException, ParserConfigurationException {
		Document document = ParseKnownXMLStructure.domProcessing();
		NodeList elements = ParseKnownXMLStructure.getDocumentElements(document);
		ParseKnownXMLStructure.displayData(elements);
	}
}
