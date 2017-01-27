package com.impatient.six.three;

import java.util.ArrayList;

/**
 * Created by bobby on 1/24/2017.
 */
public class Closeables {
    public static <T extends AutoCloseable> void closeAll(ArrayList<T> elems) throws Exception{
        for(T elem : elems) elem.close();
    }
}
