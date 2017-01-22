package com.learningjava.chapter.three.problem.two;

/**
 * Created by bobby on 1/22/2017.
 */
public class Circle extends Shape{
    private int radius; //private field
    public void area(){
        // Access to private field radius inside the class
        System.out.println("Area: " +3.14*radius*radius);
    }
}
