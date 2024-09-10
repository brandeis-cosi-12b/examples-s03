package edu.brandeis.lecture6;

import java.util.Arrays;

/**
 * This class attempts to shift the values in an array to the right by 1.
 * This is an incorrect solution.
 */
public class ArrayShiftingLeftToRight {
    public static void shiftRight(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1];
        }
    }

    public static void main(String[] args) {
        int[] nums = {15, 8, 19, 2, 5, 8, 11, 18, 7, 16};
        shiftRight(nums);
        System.out.println("Array after shifting: " + Arrays.toString(nums));
    }
}
