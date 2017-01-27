package com.impatient.three.three;

/**
 * Created by bobby on 1/25/2017.
 */
public class RunnableDemo {
    public static void main(String[] args) {
        Runnable task = new HelloTask();
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("Thread started");
    }
}

class HelloTask implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("Hello, World!");
    }
}