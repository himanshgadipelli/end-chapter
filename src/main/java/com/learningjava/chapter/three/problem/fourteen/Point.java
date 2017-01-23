package com.learningjava.chapter.three.problem.fourteen;

/**
 * Created by bobby on 1/22/2017.
 */
public class Point {
    private int xPos, yPos;

    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public String toString() {
        return "The point is " + xPos + " " + yPos;
    }

    public static void main(String[] args) {
        // Passing a point object to println automatically invokes the toString method
        System.out.println(new Point(10, 20));
    }
}
