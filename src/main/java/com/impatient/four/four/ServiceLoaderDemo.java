package com.impatient.four.four;

import java.io.UnsupportedEncodingException;
import java.util.ServiceLoader;

/**
 * Created by bobby on 1/30/2017.
 */
public class ServiceLoaderDemo {
    public static ServiceLoader<Cipher> cipherLoader = ServiceLoader.load(Cipher.class);

    public static void main(String[] args) throws UnsupportedEncodingException {
        Cipher ciph = getCipher(1);
        String message = "Meet me at the toga party.";
        byte[] bytes = ciph.encrypt(message.getBytes(), new byte[] { 3 });
        String encrypted = new String(bytes, "UTF-8");
        System.out.println(encrypted);

    }
    public static Cipher getCipher(int minStrength){
        for(Cipher cipher : cipherLoader) // .rm Implicitly calls iterator
            if(cipher.strength() >= minStrength)
                return cipher;
        return null;
    }
}
