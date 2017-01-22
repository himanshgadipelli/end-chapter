package com.learningjava.chapter.three.problem.two;

/**
 * Created by bobby on 1/22/2017.
 */
public class Canvas {
    void getArea(){
        Circle circle = new Circle();
        circle.area(); // Call to public method area(), outside package
    }

}
