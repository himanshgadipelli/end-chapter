package com.impatient.six.five;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by bobby on 1/24/2017.
 */
public class WordList extends ArrayList<String> {
    public boolean add(String e) {
        return isBadWord(e) ? false : super.add(e);
    }

    public String get(int i) {
        return super.get(i).toLowerCase();
    }

    public static boolean isBadWord(String s) {
        return Arrays.asList("sex", "drugs", "c++").contains(s.toLowerCase());
    }
}
