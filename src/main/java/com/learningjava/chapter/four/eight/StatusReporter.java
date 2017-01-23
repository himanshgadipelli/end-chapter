package com.learningjava.chapter.four.eight;

/**
 * Created by bobby on 1/23/2017.
 */
class StatusReporter {
    static Shape.Color getDescriptiveColor(final Shape.Color color) {
        return new Shape.Color() {
            public String toString() {
                return "You selected a color with RGB values " + color;
            }
        };

    }

    public static void main(String[] args) {
        Shape.Color descriptiveColor = StatusReporter.getDescriptiveColor(new Shape.Color(0, 0, 0));
        System.out.println(descriptiveColor);
    }
}
