package com.learningjava.chapter.three.problem.nineteen;

/**
 * Created by bobby on 1/22/2017.
 */
public class DownCast {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        // upcast - its fine and will always succeed
        Object obj = i;
        // downcast - will it succeed? What will happen when it fails?
        String str = (String) obj;
    }
}
