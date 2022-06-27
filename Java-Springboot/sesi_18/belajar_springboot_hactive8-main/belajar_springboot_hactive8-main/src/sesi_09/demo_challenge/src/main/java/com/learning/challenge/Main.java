package com.learning.challenge;

import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

public class Main {

	public static void main(String[] args) throws ParserConfigurationException {
		// TODO Auto-generated method stub
		OnePieceParser parser = new OnePieceParser();
		List<OnePiece> lines = parser.parseUsers();
		lines.forEach(System.out::println);
	}

}
