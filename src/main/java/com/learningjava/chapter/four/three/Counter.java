package com.learningjava.chapter.four.three;

/**
 * Created by bobby on 1/23/2017.
 */
public class Counter {
    private static int count;

    public Counter() {
        count++;
    }

    public static void printCount() {
        System.out.println("Number of instances created so far = " + count);
    }

    public static void main(String[] args) {
        Counter anInstance = new Counter();
        Counter.printCount();
        Counter anotherInstance = new Counter();
        Counter.printCount();
    }
}
