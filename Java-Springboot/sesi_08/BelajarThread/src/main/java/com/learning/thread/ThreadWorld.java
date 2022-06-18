package com.learning.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadWorld extends Thread {

    @Override
    public void run() {
        System.out.println(getName() + " : World");
        try {
            Thread.sleep(250);
        } catch (InterruptedException ex) {
            // TODO: handle exception
            Logger.getLogger(ThreadHello.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
