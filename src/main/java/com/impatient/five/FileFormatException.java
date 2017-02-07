package com.impatient.five;

import java.io.IOException;

/**
 * Created by bobby on 2/7/2017.
 */
public class FileFormatException extends IOException{
    public FileFormatException(){}
    public FileFormatException(String message){
        super(message);
    }
}
