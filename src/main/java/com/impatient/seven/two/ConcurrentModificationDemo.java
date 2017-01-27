package com.impatient.seven.two;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by bobby on 1/24/2017.
 */
public class ConcurrentModificationDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("Peter");
        coll.add("Paul");
        coll.add("Mary");
        System.out.println(coll);
        Iterator<String> iter1 = coll.iterator();
        Iterator<String> iter2 = coll.iterator();
        iter1.next();
        iter1.remove();
        System.out.println(coll);
        iter1.next();
        System.out.println(coll);
    }
}
