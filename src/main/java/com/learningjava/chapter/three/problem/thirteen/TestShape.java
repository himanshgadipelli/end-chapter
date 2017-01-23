package com.learningjava.chapter.three.problem.thirteen;

/**
 * Created by bobby on 1/22/2017.
 */
public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Circle(10);
        System.out.println(shape1.area());
        Shape shape2 = new Square(10);
        System.out.println(shape2.area());
    }
}
