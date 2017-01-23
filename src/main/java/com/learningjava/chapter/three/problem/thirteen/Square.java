package com.learningjava.chapter.three.problem.thirteen;

/**
 * Created by bobby on 1/22/2017.
 */
public class Square extends Shape {
    private int side;

    public Square(int a) {
        side = a;
    }

    public double area() {
        return side * side;

    }
    // other declarations
}
