package edu.brandeis.lecture6;

import java.util.Arrays;

/**
 * This class demonstrates how to reverse an array in-place.
 */
public class ReverseArray {
    public static void reverse(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
             int temp = numbers[i];
             numbers[i] = numbers[numbers.length - 1 - i];
             numbers[numbers.length - 1 - i] = temp;    
        }
     }

     public static void main(String[] args) {
        int[] a = {3, 6, 9, 12};
        reverse(a);
        System.out.println("a reversed is: " + Arrays.toString(a));

        int[] b = {3, 6, 9, 12, 15};
        reverse(b);
        System.out.println("b reversed is: " + Arrays.toString(b));

        int[] c = {10};
        reverse(c);
        System.out.println("a reversed is: " + Arrays.toString(c));

        int[] d = {};
        reverse(d);
        System.out.println("a reversed is: " + Arrays.toString(d));
     }
     
}
