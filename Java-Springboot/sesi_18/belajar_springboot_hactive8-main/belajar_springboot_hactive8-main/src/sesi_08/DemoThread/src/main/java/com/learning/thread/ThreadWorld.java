package sesi_08.DemoThread.src.main.java.com.learning.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadWorld extends Thread {

	private final String name;

	public ThreadWorld(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name + ": Hello");
		try {
			Thread.sleep(250);
		} catch (InterruptedException ex) {
			Logger.getLogger(ThreadHello.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
