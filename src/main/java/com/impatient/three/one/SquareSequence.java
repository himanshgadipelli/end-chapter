package com.impatient.three.one;

/**
 * Created by bobby on 1/25/2017.
 */
public class SquareSequence implements IntSequence {
    private int i;

    public boolean hasNext() {
        return true;
    }

    public int next() {
        i++;
        return i * i;
    }
}
