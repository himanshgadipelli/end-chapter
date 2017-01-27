package com.impatient.six.four;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Created by bobby on 1/24/2017.
 */
public class Employees {
    public static void printNames(ArrayList<? extends Employee> staff) {
        for (int i = 0; i < staff.size(); i++) {
            Employee e = staff.get(i);
            System.out.println((e.getName()));
        }
    }

    public static void printAll(Employee[] staff, Predicate<? super Employee> filter) {
        for (Employee e : staff)
            if (filter.test(e))
                System.out.println(e.getName());
    }
}
