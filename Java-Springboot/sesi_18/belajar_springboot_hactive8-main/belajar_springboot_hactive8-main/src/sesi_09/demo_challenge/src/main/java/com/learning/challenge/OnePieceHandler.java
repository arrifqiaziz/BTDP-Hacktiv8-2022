package com.learning.challenge;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class OnePieceHandler extends DefaultHandler{
	private List<OnePiece> users = new ArrayList<>();
	private OnePiece user;
	
	private boolean bfn = false;
	private boolean bln = false;
	
	@Override
	public void startElement(String url, String localName, String qName, Attributes attributes) throws SAXException {
		
		if("user".equals(qName)) {
			user = new OnePiece();
			int id = Integer.valueOf(attributes.getValue("id"));
			user.setId(id);
		}
		
		switch(qName) {
		case "firstname":
			bfn = true;
			break;
		case "lastname":
			bln = true;
			break;
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if (bfn) {
			user.setFirstName(new String(ch, start, length));
			bfn = false;
		}
		if (bln) {
			user.setLastName(new String(ch, start, length));
			bln = false;
		}
	}
	
	@Override
	public void endElement(String url, String localName, String qName) throws SAXException {
		
		if("user".equals(qName)) {
			users.add(user);
		}
	}
	
	public List<OnePiece> getUsers() {
		return users;
	} 	
	
}

