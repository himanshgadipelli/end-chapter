package com.impatient.three.six;

import java.awt.*;

/**
 * Created by bobby on 1/27/2017.
 */
@FunctionalInterface
public interface PixelFunction {
    Color apply(int x, int y);
}
