package edu.brandeis.lecture5;

/** 
 * This class demonstrates a method for comparing method for Arrays element-by-element.
 */
public class ComparingArraysBetter {
    public static void main(String[] args) {
	    int[] A = {126, 167, 95};
        int[] B = {126, 167, 95};

        if (A.length != B.length) {
            System.out.println("Not equal! (length of arrays does not match)");
            return;
        }

        for(int i = 0; i < A.length; i++) {
            if(A[i] != B[i]) {
                System.out.println("Not equal! (index " + i + ")");
                return;
            }
        }
        System.out.println("Equal!");
    }

}
