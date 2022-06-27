package com.learning.challenge;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;

import org.xml.sax.SAXException;

public class OnePieceParser {
	
	public List<OnePiece> parseUsers() throws ParserConfigurationException {
		OnePieceHandler handler = new OnePieceHandler();
		String fileName = "src/main/resources/onepiece.xml";
		File xmlDocument = Paths.get(fileName).toFile();
		
		try {
			SAXParser parser = MyRunner.createSaxParser();
			parser.parse(xmlDocument, handler);
		} catch (SAXException | IOException ex) {
			Logger lgr = Logger.getLogger(MyRunner.class.getName());
			lgr.log(Level.SEVERE, ex.getMessage(), ex);
		}
		
		return handler.getUsers();
	}
}
