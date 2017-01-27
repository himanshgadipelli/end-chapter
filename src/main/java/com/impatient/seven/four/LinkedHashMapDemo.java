package com.impatient.seven.four;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by bobby on 1/24/2017.
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> weekdays = new HashMap<>();
        initialize(weekdays);
        System.out.println("HashMap       "+weekdays);

        weekdays = new TreeMap<>();
        initialize(weekdays);
        System.out.println("TreeMap       "+weekdays);

        weekdays = new LinkedHashMap<>();
        initialize(weekdays);
        System.out.println("LinkedHashMap " + weekdays);
    }

    public static void initialize(Map<String, Integer> weekdays) {
        weekdays.put("Monday", 1);
        weekdays.put("Tuesday", 2);
        weekdays.put("Wednesday", 3);
        weekdays.put("Thursday", 4);
        weekdays.put("Friday", 5);
        weekdays.put("Saturday", 6);
        weekdays.put("Sunday", 7);

    }
}
