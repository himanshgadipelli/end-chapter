package com.impatient.seven.six;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by bobby on 1/24/2017.
 */
public class RangeDemo {
    public static void main(String[] args) {
        List<String> sentence = Arrays.asList("A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal, Panama!".split("[ ,]+"));
        List<String> nextFive = sentence.subList(5, 10);
        System.out.println(nextFive);

        TreeSet<String> words = new TreeSet<>(sentence);
        words.add("zebra");
        SortedSet<String> nAndBeyond = words.tailSet("p");
        System.out.println(nAndBeyond);
    }
}
