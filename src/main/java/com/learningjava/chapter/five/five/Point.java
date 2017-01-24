package com.learningjava.chapter.five.five;

/**
 * Created by bobby on 1/23/2017.
 */
class Point {
    private int xPos;
    private int yPos;
    public Point(int x, int y){
        xPos = x;
        yPos = y;
    }
    public String toString(){
        return "(" + xPos + "," + yPos + ")";
    }
}
