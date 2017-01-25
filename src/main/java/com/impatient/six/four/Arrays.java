package com.impatient.six.four;

import java.util.function.Predicate;

/**
 * Created by bobby on 1/24/2017.
 */
public class Arrays {
    public static <T> void printAll(T[] elements, Predicate<? super T> filter) {
        for (T e : elements)
            if (filter.test(e))
                System.out.println(e.toString());
    }
}
