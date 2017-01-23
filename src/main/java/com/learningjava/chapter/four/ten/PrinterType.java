package com.learningjava.chapter.four.ten;

/**
 * Created by bobby on 1/23/2017.
 */
public enum PrinterType {
    DOTMATRIX(5), INKJET(10), LASER(50);
    private int pagePrintCapacity;
    private PrinterType(int pagePrintCapacity){
        this.pagePrintCapacity = pagePrintCapacity;
    }
    public int getPrintPageCapacity(){
        return pagePrintCapacity;
    }
}
