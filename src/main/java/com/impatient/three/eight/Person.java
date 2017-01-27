package com.impatient.three.eight;

/**
 * Created by bobby on 1/27/2017.
 */
public class Person {
    private String first;
    private String middle;
    private String last;
    //public Person[] presidents;

    public Person(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirstName() {
        return first;
    }

    public String getMiddleName() {
        return middle;
    }

    public String getLastName() {
        return last;
    }

    public String getName() {
        if (middle == null)
            return first + " " + last;
        else
            return first + " " + middle + " " + last;
    }

    public String toString() {
        return getName();
    }

    public Person[] getPresidents(){
        Person[] presidents = {
                new Person("George", "Washington"),
                new Person("John", "Adams"),
                new Person("Thomas", "Jefferson"),
                new Person("James", "Madison"),
                new Person("James", "Monroe"),
                new Person("John", "Quincy", "Adams"),
                new Person("Andrew", "Jackson"),
                new Person("Martin", "van Buren"),
                new Person("William", "Henry", "Harrison"),
                new Person("John", "Tyler"),
                new Person("James", "Knox", "Polk"),
                new Person("Zachary", "Taylor"),
                new Person("Millard", "Fillmore"),
                new Person("Franklin", "Pierce"),
                new Person("James", "Buchanan"),
                new Person("Abraham", "Lincoln"),
                new Person("Andrew", "Johnson"),
                new Person("Ulysses", "S.", "Grant"),
                new Person("Rutherford", "Birchard", "Hayes"),
                new Person("James", "Abram", "Garfield"),
                new Person("Grover", "Cleveland"),
                new Person("Benjamin", "Harrison"),
                new Person("Grover", "Cleveland"),
                new Person("William", "McKinley"),
                new Person("Theodore", "Roosevelt"),
                new Person("William", "Howard", "Taft"),
                new Person("Woodrow", "Wilson"),
                new Person("Warren", "Gamaliel", "Harding"),
                new Person("Calvin", "Coolidge"),
                new Person("Herbert", "Hoover"),
                new Person("Franklin", "Delano", "Roosevelt"),
                new Person("Harry", "S.", "Truman"),
                new Person("Dwight", "David", "Eisenhower"),
                new Person("John", "Fitzgerald", "Kennedy"),
                new Person("Lyndon", "Baines", "Johnson"),
                new Person("Richard", "Mulhouse", "Nixon"),
                new Person("Gerald", "Ford"),
                new Person("James", "Earl", "Carter"),
                new Person("Ronald", "Reagan"),
                new Person("George", "Herbert Walker", "Bush"),
                new Person("William", "Jefferson", "Clinton"),
                new Person("George", "Walker", "Bush"),
                new Person("Barack", "Hussein", "Obama")
        };
        return presidents;
    }
}
