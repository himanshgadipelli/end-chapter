package com.learningjava.chapter.five.one;

/**
 * Created by bobby on 1/23/2017.
 */
public class Rectangle extends Shape implements Rotatable {
    //Rectangle is a concrete class and "is-a" Shape; it can be rotated and hence implements Rotatable
    private int length, height;
    public Rectangle(int l, int h){
        length = l;
        height = h;
    }
    public double area(){
        return length*height;
    }
    @Override
    public void rotate(float degree){
        // implementing rotating functionality here
    }
    public static void main(String [] args){
        Rectangle rectangle = new Rectangle(10,5);
        rectangle.rotate(45);
    }
}
