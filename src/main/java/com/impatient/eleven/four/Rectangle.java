package com.impatient.eleven.four;

/**
 * Created by bobby on 1/28/2017.

@ToString
public class Rectangle {
    @ToString(includeName = false)
    private Point topLeft;
    @ToString
    private int width;
    @ToString
    private int height;

    public Rectangle(Point topLeft, int width, int height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }
}
*/