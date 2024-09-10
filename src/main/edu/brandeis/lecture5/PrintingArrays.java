package edu.brandeis.lecture5;

import java.util.Arrays;

/** 
 * This class demonstrates the different methods for printing arrays
 */
public class PrintingArrays {
    public static void main(String[] args) {
	    int[] A = {126, 167, 95};

        System.out.println("1. Print \"A\" directly: " + A);

        System.out.print("2. Print \"A\" with a loop: ");
        for(int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("3. Print \"A\" with Arrays.toString(): " + Arrays.toString(A));
    }

}
