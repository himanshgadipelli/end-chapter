package com.impatient.four.one;

/**
 * Created by bobby on 1/29/2017.
 */
public class StudentDemo {
    public static void main(String[] args){
        Person p = new Student("Fred", 1729);// Ok, a concrete subclass
        System.out.println(p.getName());
        Student s = (Student) p;
        System.out.println(s.getName());
        Named n = s;
        System.out.println(n.getName());
    }
}
