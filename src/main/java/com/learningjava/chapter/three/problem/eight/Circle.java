package com.learningjava.chapter.three.problem.eight;

/**
 * Created by bobby on 1/22/2017.
 */
public class Circle {
    private int xPos;
    private int yPos;
    private int radius;

    //Three overload constructors for circle
    public Circle(int x, int y, int r) {
        xPos = x;
        yPos = y;
        radius = r;
    }

    public Circle(int x, int y) {
        xPos = x;
        yPos = y;
        radius = 10; //Default radius
    }

    public Circle() {
        xPos = 20;
        yPos = 20;
        radius = 10;
    }

    public String toString() {
        return "Center = (" + xPos + " ," + yPos + ") and radius = " + radius;
    }

    public static void main(String[] s) {
        System.out.println(new Circle());
        System.out.println(new Circle(50, 100));
        System.out.println(new Circle(25, 50, 5));
    }
}
