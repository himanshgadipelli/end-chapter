package com.impatient.seven;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bobby on 1/24/2017.
 */
public class Test {
    public static void main(String[] args) {
        Map<String, Integer> h = new HashMap<>();
        h.put("a", null);
        System.out.println(h.keySet());
        h.compute("a", (k, v) -> null);
        System.out.println(h.keySet());
    }
}
