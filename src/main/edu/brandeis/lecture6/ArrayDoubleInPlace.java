package edu.brandeis.lecture5;

import java.util.Arrays;

/**
 * This class demonstrates how to double the values in an integer array "in
 * place" in a helper function. This relies on the fact that arrays are
 * passed by reference.
 */
public class ArrayDoubleInPlace {
    public static void doubleValues(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * 2;
        }
    }    

    public static void main(String[] args) {
        int[] nums = {27, 49, 1, -10};
        doubleValues(nums);
        System.out.println(Arrays.toString(nums));
    }
}
