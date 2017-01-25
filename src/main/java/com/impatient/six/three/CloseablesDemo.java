package com.impatient.six.three;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by bobby on 1/24/2017.
 */
public class CloseablesDemo {
    public static void main(String[] args) throws Exception {
        PrintStream p1 = new PrintStream("/tmp/1");
        PrintStream p2 = new PrintStream("/tmp/2");
        ArrayList<PrintStream> ps = new ArrayList<>();
        ps.add(p1);
        ps.add(p2);
        Closeables.closeAll(ps);
    }
}
