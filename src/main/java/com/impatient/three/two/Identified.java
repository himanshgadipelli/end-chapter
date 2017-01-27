package com.impatient.three.two;

/**
 * Created by bobby on 1/25/2017.
 */
public interface Identified {
    default int getId(){
        return Math.abs(hashCode());
    }
}
