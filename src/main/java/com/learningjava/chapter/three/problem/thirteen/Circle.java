package com.learningjava.chapter.three.problem.thirteen;

/**
 * Created by bobby on 1/22/2017.
 */
class Circle extends Shape {
    private int radius;

    public Circle(int r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
    // Other declarations

}
