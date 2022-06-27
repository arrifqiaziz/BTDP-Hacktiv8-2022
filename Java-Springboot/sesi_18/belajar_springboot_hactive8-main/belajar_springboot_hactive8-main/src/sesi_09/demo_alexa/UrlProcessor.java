package sesi_09.demo_alexa;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlProcessor {

	private static final String ALEXA_API = "https://data.alexa.com/data?cli=10&url=";
	
	public static URLConnection processingUrl (String domain) throws MalformedURLException, IOException {
		String url = ALEXA_API + domain;
		URLConnection conn = new URL(url).openConnection();
		return conn;
	}
}
