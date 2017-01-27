package com.impatient.three.two;

/**
 * Created by bobby on 1/25/2017.
 */
public interface IntSequence {
    default boolean hasNext(){return true;};
    int next();
}
