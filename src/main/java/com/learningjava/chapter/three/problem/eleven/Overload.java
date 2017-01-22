package com.learningjava.chapter.three.problem.eleven;

/**
 * Created by bobby on 1/22/2017.
 */
public class Overload {
    public static void aMethod(long val1, int val2, int i) {
        System.out.println("long, int");
    }

    public static void aMethod(int val1, long val2, String s) {
        System.out.println("int, long");
    }

    public static void main(String[] args) {
        aMethod(9, 10, "i");
        aMethod(9, 10, 1);

    }
}
