package com.impatient.seven.three;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by bobby on 1/24/2017.
 */
public class setDemo {
    public static void main(String[] args) {
        Set<String> badWords = new HashSet<>();
        badWords.add("sex");
        badWords.add("drugs");
        badWords.add("c++");

        Scanner in = new Scanner(System.in);
        System.out.print("Please choose a username: ");
        String username = in.next();
        if (badWords.contains(username.toLowerCase()))
            System.out.println("Please choose a different username ");
        else
            System.out.println("Registered " + username + " since it wasn't one of " + badWords);

        TreeSet<String> countries = new TreeSet<>((u, v) ->
                u.equals(v) ? 0
                        : u.equals("USA") ? -1
                        : v.equals("USA") ? 1
                        : u.compareTo(v));

        countries.add("Bahrain");
        countries.add("Australia");
        countries.add("USA");
        countries.add("Canada");
        System.out.println(countries);
    }
}