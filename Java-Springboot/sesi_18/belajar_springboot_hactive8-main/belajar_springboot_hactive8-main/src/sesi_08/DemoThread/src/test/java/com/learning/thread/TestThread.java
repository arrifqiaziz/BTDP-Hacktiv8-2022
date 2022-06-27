package sesi_08.DemoThread.src.test.java.com.learning.thread;

import org.junit.Test;

import sesi_08.DemoThread.src.main.java.com.learning.thread.NumberGenerator;
import sesi_08.DemoThread.src.main.java.com.learning.thread.ThreadHello;
import sesi_08.DemoThread.src.main.java.com.learning.thread.ThreadNumber;
import sesi_08.DemoThread.src.main.java.com.learning.thread.ThreadWorld;

public class TestThread {

	@Test
	public void testThreadHello() {
		System.out.println("----------");
		for (int i = 0; i < 10; i++) {
			ThreadHello instance = new ThreadHello(String.valueOf(i));
			Thread t = new Thread(instance);
			t.start();
		}
	}

	@Test
	public void testThreadWorld() {
		System.out.println("----------");
		for (int i = 0; i < 10; i++) {
			int tes = i + i;
			ThreadWorld instance = new ThreadWorld(String.valueOf(tes));
			Thread t = new Thread(instance);
			t.start();
		}
	}

	@Test
	public void testThreadNumber() {
		System.out.println("----------");
		NumberGenerator generator = new NumberGenerator(1000, 2000);
		for (int i = 0; i < 3; i++) {
			new ThreadNumber(generator).start();
		}
	}
}
