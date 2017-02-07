package com.impatient.four.one;

/**
 * Created by bobby on 1/29/2017.
 */
public abstract class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }
    public final String getName(){
        return name;
    }

    public abstract int getId();
}
