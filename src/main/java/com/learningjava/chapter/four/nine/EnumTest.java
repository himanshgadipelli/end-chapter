package com.learningjava.chapter.four.nine;

/**
 * Created by bobby on 1/23/2017.
 */
enum PrinterType {
    DOTMATRIX, INKJET, LASER
}

public class EnumTest {
    PrinterType printerType;

    public EnumTest(PrinterType pType) {
        printerType = pType;
    }

    public void feature() {
        //switch based on the printer type passed in the costructor
        switch (printerType) {
            case DOTMATRIX:
                System.out.println("Dot-matrix printers are economical and almost obsolete");
                break;
            case INKJET:
                System.out.println("Inkjet printers provide decent quality prints");
                break;
            case LASER:
                System.out.println("Laser printers provide best quality prints");
                break;
        }
    }

    public static void main(String[] args) {
        EnumTest enumTest = new EnumTest(PrinterType.LASER);
        enumTest.feature();
    }
}
