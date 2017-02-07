package com.impatient.eleven.two;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

/**
 * Created by bobby on 1/28/2017.
 */


@Target({ElementType.TYPE, ElementType.METHOD})
@Repeatable(BugReports.class)
public @interface BugReport {
    boolean showStopper() default false;
    String assignedTo() default "";
    Class<?> testClass() default void.class;
    Status status() default Status.REPORTED;
    String[] reportedBy() default{};
    Reference ref() default @Reference(id=0);
    enum Status { REPORTED, CONFIRMED, ASSIGNED, FIXED, WONTFIX};
}

@Target({ElementType.TYPE, ElementType.METHOD})
@interface BugReports{
    BugReport[] value();
}
