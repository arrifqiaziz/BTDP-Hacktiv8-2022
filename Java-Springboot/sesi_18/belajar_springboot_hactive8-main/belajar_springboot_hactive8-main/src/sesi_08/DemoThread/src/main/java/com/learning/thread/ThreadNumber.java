package sesi_08.DemoThread.src.main.java.com.learning.thread;

public class ThreadNumber extends Thread {

	private final NumberGenerator ng;

	public ThreadNumber(NumberGenerator ng) {
		this.ng = ng;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		callGenerator();
	}

	private void callGenerator() {
		// TODO Auto-generated method stub
		synchronized (ng) {
			for (int i = 0; i < 3; i++) {
				System.out.println(ThreadNumber.class.getName() + "-" + i + " " + ng.randomNumber());
			}
		}
	}

}
