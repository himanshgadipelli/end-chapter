package com.impatient.eleven.four;

import javax.xml.ws.soap.MTOM;

/**
 * Created by bobby on 1/28/2017.
 */

@ToString(includeName = false)
public class Point {
    @ToString(includeName = false)
    private int x;
    @ToString(includeName = false)
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
