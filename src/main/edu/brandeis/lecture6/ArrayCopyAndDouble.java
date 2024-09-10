package edu.brandeis.lecture6;

import java.util.Arrays;

/**
 * This class demonstrates how to double the values in an integer array by creating
 * a new array with the doubled values, and returning it
 */
public class ArrayCopyAndDouble {
    public static int[] doubleValues(int[] a) {
        int[] newNums = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            newNums[i] = a[i] * 2;
        }
        return newNums;
    }    

    public static void main(String[] args) {
        int[] nums = {27, 49, 1, -10};
        int[] newNums = doubleValues(nums);
        System.out.println(Arrays.toString(newNums));
    }
}
