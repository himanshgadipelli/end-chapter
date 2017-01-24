package com.learningjava.chapter.five.five;

/**
 * Created by bobby on 1/23/2017.
 */
public class Test {
    public static void main(String [] args){
        Circle circle = new Circle(10,10,20);
        System.out.println(circle);
        circle.setCanvas(new Canvas());
        circle.setRadius(30);
        circle.setShapeArchiver(new ShapeArchiver());
        circle.setRadius(50);
        System.out.println(circle);

    }
}
