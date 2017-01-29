package com.impatient.eleven.one;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by bobby on 1/28/2017.
 */

@Target({ElementType.TYPE_USE, ElementType.PARAMETER})
public @interface ReadOnly {

}
