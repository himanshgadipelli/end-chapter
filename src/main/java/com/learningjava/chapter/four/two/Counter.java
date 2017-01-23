package com.learningjava.chapter.four.two;

/**
 * Created by bobby on 1/23/2017.
 */
public class Counter {
    private int count;

    public Counter() {
        count++;
    }

    public void printCount() {
        System.out.println("Number of instances created so far is: " + count);
    }

    public static void main(String[] args) {
        Counter anInstance = new Counter();
        anInstance.printCount();
        Counter anotherInstance = new Counter();
        anotherInstance.printCount();
    }
}
