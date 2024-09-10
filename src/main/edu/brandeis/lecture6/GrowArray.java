package edu.brandeis.lecture6;

import java.util.Arrays;

public class GrowArray {
    public static int[] growArray(int[] nums, int newSize) {
        int[] newNums = new int[newSize];
        for(int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
        }
        return newNums;
    }

    public static void main(String[] args) {
        int[] nums = {5, 18, 12, -1};
        int[] longerNums = growArray(nums, 10);
        System.out.println(
            "Growing the array: " 
            + Arrays.toString(nums) 
            + " to size 10 gives us: " 
            + Arrays.toString(longerNums)
            + " (length: " + longerNums.length + ")");
    }
}
