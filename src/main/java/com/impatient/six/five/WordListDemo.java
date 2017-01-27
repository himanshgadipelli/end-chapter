package com.impatient.six.five;

import java.util.ArrayList;

/**
 * Created by bobby on 1/25/2017.
 */
public class WordListDemo {
    public static void main(String[] args) {
        WordList words = new WordList();
        ArrayList<String> strings = words;
        strings.add("Hello");
        strings.add("C++");
        System.out.println(words);
    }
}
