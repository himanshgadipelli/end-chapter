package com.learningjava.chapter.four.six;

/**
 * Created by bobby on 1/23/2017.
 */
public class Circle {
    // define Point as an inner class within Circle Class
    class Point{
        private int xPos;
        private int yPos;
        public Point(int x, int y){
            xPos = x;
            yPos = y;
        }
        // the inner class is like any other class - you can override methods here
        public String toString(){
            return "("+ xPos + "," + yPos +")";
        }
    }
    private Point center;
    private int radius;
    public Circle(int x, int y, int r){
        center = this.new Point(x,y)
                radius = r;
    }
    public String toString(){
        return "mid point = " + center + "and radius = " + radius;
    }

    public static void main(String [] args){
        System.out.println(new Circle(10,10,20));
    }

}
