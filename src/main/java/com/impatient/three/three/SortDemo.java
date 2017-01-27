package com.impatient.three.three;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by bobby on 1/25/2017.
 */
public class SortDemo {
    public static void main(String[] args) {
        String[] friends = {"Peter", "Paul", "Mary"};
        Arrays.sort(friends, new LengthComparator()); // friends is now ["mary", "Paul", "Peter"]
        System.out.println(Arrays.toString(friends));
    }
}

class LengthComparator implements Comparator<String> {
    public int compare(String first, String second) {
        return first.length() - second.length();
    }
}