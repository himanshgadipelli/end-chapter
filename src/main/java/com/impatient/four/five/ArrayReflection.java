package com.impatient.four.five;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by bobby on 1/30/2017.
 */
public class ArrayReflection {
    public static Object[] badCopyOf(Object[] array, int newLength) {
        Object[] newArray = new Object[newLength];
        for (int i = 0; i < Math.min(array.length, newLength); i++)
            newArray[i] = array[i];
        return newArray;
    }

    public static Object goodCopyOf(Object array, int newLength) {
        Class<?> cl = array.getClass();
        if (!cl.isArray()) return null;
        Class<?> componentType = cl.getComponentType();
        int length = Array.getLength(array);
        Object newArray = Array.newInstance(componentType, newLength);
        for (int i = 0; i < Math.min(length, newLength); i++)
            Array.set(newArray, i, Array.get(array, i));
        return newArray;
    }

    public static void main(String[] args) {
        int[] primes = {2, 3, 5, 7, 11};
        primes = (int[]) goodCopyOf(primes, 10);
        System.out.println(Arrays.toString(primes));
    }
}
