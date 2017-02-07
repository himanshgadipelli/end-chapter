package com.impatient.four.one;

/**
 * Created by bobby on 1/29/2017.
 */
public interface Named {
    default String getName(){
        return"";
    }
}
