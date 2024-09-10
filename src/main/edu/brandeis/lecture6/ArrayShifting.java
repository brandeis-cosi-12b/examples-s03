package edu.brandeis.lecture6;

import java.util.Arrays;

public class ArrayShifting {
    public static void shiftRight(int[] nums) {
        for(int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = 0;
    }

    public static void main(String[] args) {
        int[] nums = {15, 8, 19, 2, 5, 8, 11, 18, 7, 16};
        shiftRight(nums);
        System.out.println("Array after shifting: " + Arrays.toString(nums));
    }
}
