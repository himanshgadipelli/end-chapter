package com.impatient.four.three;

/**
 * Created by bobby on 1/30/2017.
 */
public enum Modifier {
    PUBLIC, PRIVATE, PROTECTED, STATIC, FINAL, ABSTRACT;
    private int mask;

    static {
        int maskBit = 1;
        for(Modifier m : Modifier.values()){
            m.mask = maskBit;
            maskBit *=2;
        }
    }

    public int getMask(){
        return mask;
    }
}
