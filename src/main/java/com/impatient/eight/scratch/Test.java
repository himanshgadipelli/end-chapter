package com.impatient.eight.scratch;

import java.util.stream.Stream;

/**
 * Created by bobby on 1/25/2017.
 */
public class Test {
    private static int prev;

    public static void main(String[] args) {
        Stream<Integer> values = Stream.of(1, 2, 2, 3, 3, 3, 4, 2);
        values = values.filter(x -> {
            boolean r = prev != x;
            prev = x;
            return r;
        });
        values.forEach(System.out::println);
    }
}
