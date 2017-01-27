package com.impatient.three.four;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by bobby on 1/25/2017.
 */
public class LambdaDemo {
    public static void main(String[] args) {
        String[] friends = {"Peter", "Paul", "Mary"};
        Arrays.sort(friends, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(friends));
        ArrayList<String> enemies = new ArrayList<>(Arrays.asList("malfoy", "Crabbe", "Goyle", null));
        enemies.removeIf(e -> e == null);
        System.out.println(enemies);
    }

}
