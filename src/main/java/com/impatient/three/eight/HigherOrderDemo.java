package com.impatient.three.eight;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by bobby on 1/27/2017.
 */
public class HigherOrderDemo {
    public static Comparator<String> compareInDirection(int direction){
        return (x,y) -> direction*x.compareTo(y);
    }

    public static Comparator<String> reverse(Comparator<String> comp){
        return (x,y) -> -comp.compare(x,y);
    }

    public static void main(String[] args){
        String[] words = {"Mary","had","a","little","lamb"};
        Arrays.sort(words, compareInDirection(-1));
        System.out.println(Arrays.toString(words));
        Arrays.sort(words, reverse(String::compareToIgnoreCase));
        System.out.println(Arrays.toString(words));
    }
}
