package com.learningjava.chapter.three.problem.twelve;

/**
 * Created by bobby on 1/22/2017.
 */
public class TestNumber {
    // Take an array of numbers and sum them up
    public static double sum(Number[] nums) {
        double sum = 0.0;
        for (Number num : nums) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create a number array
        Number[] nums = new Number[4];
        // Assign derived class objects
        nums[0] = new Byte((byte) 10);
        nums[1] = new Integer(10);
        nums[2] = new Float(10.0f);
        nums[3] = new Double(10.0f);
        // Pass the Number array to sum and print the result
        System.out.println("The sum of numbers is: " + sum(nums));
    }
}
