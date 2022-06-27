package com.learning.sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class UsersHandler extends DefaultHandler{
	private List<User> users = new ArrayList<>();
	private User user;
	
	private boolean bfn = false;
	private boolean bln = false;
	private boolean boc = false;
	
	@Override
	public void startElement(String url, String localName, String qName, Attributes attributes) throws SAXException {
		
		if("user".equals(qName)) {
			user = new User();
			int id = Integer.valueOf(attributes.getValue("id"));
			user.setId(id);
		}
		
		switch(qName) {
		case "name":
			bfn = true;
			break;
		case "gender":
			bln = true;
			break;
		case "role":
			boc = true;
			break;
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if (bfn) {
			user.setName(new String(ch, start, length));
			bfn = false;
		}
		if (bln) {
			user.setGender(new String(ch, start, length));
			bln = false;
		}
		if (boc) {
			user.setRole(new String(ch, start, length));
			boc = false;
		}
	}
	
	@Override
	public void endElement(String url, String localName, String qName) throws SAXException {
		
		if("user".equals(qName)) {
			users.add(user);
		}
	}
	
	public List<User> getUsers() {
		return users;
	} 	
	
}
