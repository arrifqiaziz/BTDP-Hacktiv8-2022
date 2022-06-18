package com.learning.thread;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadHello implements Runnable{

    private final String name;

    public ThreadHello(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " : Hello");
        try {
            Thread.sleep(250);
        } catch (InterruptedException ex) {
            // TODO: handle exception
            Logger.getLogger(ThreadHello.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
