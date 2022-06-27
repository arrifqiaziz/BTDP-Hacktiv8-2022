package com.learning.sax;

import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;

public class TestSaxParser {

	@Test
	public void parseUser() throws ParserConfigurationException {
		UsersParser parser = new UsersParser();
		List<User> lines = parser.parseUsers();
		lines.forEach(System.out::println);
	}
}
