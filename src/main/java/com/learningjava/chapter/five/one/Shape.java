package com.learningjava.chapter.five.one;

/**
 * Created by bobby on 1/23/2017.
 */
public abstract class Shape {
    abstract double area();
    private Shape parentShape;
    public void setParentShape(Shape shape){
        parentShape = shape;
    }
    public Shape getParentShape(){
        return parentShape;
    }
}
