package edu.brandeis.lecture5;

/** 
 * This class demonstrates a naive comparison method for Arrays.
 * It has some critical shortcomings, see ComparingArraysBetter for a better example.
 */
public class ComparingArrays {
    public static void main(String[] args) {
	    int[] A = {126, 167, 95};
        int[] B = {126, 167, 95};

        for(int i = 0; i < A.length; i++) {
            if(A[i] != B[i]) {
                System.out.println("Not equal! (index " + i + ")");
                return;
            }
        }
        System.out.println("Equal!");
    }

}
