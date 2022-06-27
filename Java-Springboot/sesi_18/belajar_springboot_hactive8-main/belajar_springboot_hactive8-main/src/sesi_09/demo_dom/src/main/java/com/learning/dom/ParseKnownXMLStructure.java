package com.learning.dom;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ParseKnownXMLStructure {

	public static void displayData(NodeList nList) {
		System.out.println("====================");
		
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node node = nList.item(temp); // node at index ...
			System.out.println("");
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				System.out.println("Employee id : " + eElement.getAttribute("id"));
				System.out.println("Employee id : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
				System.out.println("Employee id : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
				System.out.println("Employee id : " + eElement.getElementsByTagName("location").item(0).getTextContent());
			}
		}
	}
	
	public static Document domProcessing() throws SAXException, IOException, ParserConfigurationException {
		// 1. Get builder
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
				
		// 2. Parse document
		Document document = builder.parse(new File("src/main/resources/employee.xml"));
				
		// 3. Normalize XML structure
		// child node == document element
		document.getDocumentElement().normalize();
		
		return document;
	}
	
	public static NodeList getDocumentElements(Document doc) {
		// getDocumentElement -> element dalam xml/html document
		Element root = doc.getDocumentElement();
		System.out.println(root.getNodeName());
				
		// Get all employees
		// -----------------
		// NodeList -> ordered collection of nodes
		// getElementsByTagName -> NodeList of all the Element in document order with a given tag name
		NodeList nList = doc.getElementsByTagName("employee");
		return nList;
	}
	
	public static void main (String[] args) throws SAXException, IOException, ParserConfigurationException {

		Document document = domProcessing();
		NodeList elements = getDocumentElements(document);
		displayData(elements);
		
	}

}
