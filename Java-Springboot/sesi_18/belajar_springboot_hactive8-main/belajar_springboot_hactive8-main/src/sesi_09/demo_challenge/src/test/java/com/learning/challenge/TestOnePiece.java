package com.learning.challenge;

import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;

import com.learning.challenge.OnePiece;
import com.learning.challenge.OnePieceParser;


public class TestOnePiece {
	
	@Test
	public void parseOnePiece() throws ParserConfigurationException {
		// TODO Auto-generated method stub
		OnePieceParser parser = new OnePieceParser();
		List<OnePiece> lines = parser.parseUsers();
		lines.forEach(System.out::println);
	}
}
