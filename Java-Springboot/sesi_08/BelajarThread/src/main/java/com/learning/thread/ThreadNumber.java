package com.learning.thread;

public class ThreadNumber extends Thread {

    private final NumberGenerator ng;

    public ThreadNumber(NumberGenerator ng) {
        this.ng = ng;
    }

    @Override
    public void run() {
        callGenerator();
    }

    private void callGenerator() {
        synchronized (ng) {
            for (int i = 0; i < 2; i++) {
                System.out.println(getName() + " " + ng.randomNumber());
            }
        }
    }
}
