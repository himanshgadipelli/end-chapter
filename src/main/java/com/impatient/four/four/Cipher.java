package com.impatient.four.four;

/**
 * Created by bobby on 1/30/2017.
 */
public interface Cipher {
    byte[] encrypt(byte[] source, byte[] key);
    byte[] decrypt(byte[] source, byte[] key);
    int strength();
}
