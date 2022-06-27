package sesi_09.demo_alexa;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;

public class DataProcessor {
	public static InputStream getData(URLConnection conn) throws IOException {
		
		// InputStream -> (stream of bytes) that reads from this connection
		InputStream is = conn.getInputStream();
		return is;
	}
}
