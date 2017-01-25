package com.impatient.three.two;

/**
 * Created by bobby on 1/25/2017.
 */
public interface Person {
    String getName();

    default int getId() {
        return 0;
    }
}
