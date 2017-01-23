package com.learningjava.chapter.three.problem.eighteen;

/**
 * Created by bobby on 1/22/2017.
 */
public class Point3D extends Point2D {
    private int zPos;

    public Point3D(int x, int y, int z){
        super(10,20);
        zPos = z;
    }
    public String toString(){
        return super.toString() + ", z = " +zPos;
    }
    public static void main(String []args){
        System.out.println(new Point3D(10,20,30));
    }
}
