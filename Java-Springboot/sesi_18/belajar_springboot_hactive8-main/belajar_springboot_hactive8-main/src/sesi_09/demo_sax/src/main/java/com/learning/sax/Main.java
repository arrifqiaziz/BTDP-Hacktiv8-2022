package com.learning.sax;

import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

public class Main {

	public static void main(String[] args) throws ParserConfigurationException {
		// TODO Auto-generated method stub
		UsersParser parser = new UsersParser();
		List<User> lines = parser.parseUsers();
		lines.forEach(System.out::println);
	}
}
