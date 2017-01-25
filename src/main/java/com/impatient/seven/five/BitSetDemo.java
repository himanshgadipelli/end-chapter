package com.impatient.seven.five;

import java.util.BitSet;

/**
 * Created by bobby on 1/24/2017.
 */
public class BitSetDemo {
    public static void main(String[] args) {
        // This program demonstrates the Seive of Erathostenes for finding primes
        int n = 100000;
        BitSet primes = new BitSet(n + 1);
        for (int i = 2; i <= n; i++) {
            primes.set(i);
        }
        for (int i = 2; i * i <= n; i++) {
            if (primes.get(i)) {
                for (int k = 2 * i; k <= n; k += i)
                    primes.clear(k);
            }
        }
        System.out.println(primes);
    }
}
