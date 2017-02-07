package com.impatient.four.three;

/**
 * Created by bobby on 1/30/2017.
 */
public enum Size {
    SMALL("S"), MEDIUM("M"),

    LARGE("L"), EXTRA_LARGE("XL");

    private String abbreviation;

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
