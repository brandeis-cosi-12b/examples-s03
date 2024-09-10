package edu.brandeis.lecture6;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        boolean didswap = true;
        
        while (didswap) {
            didswap = false;
            
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    int tmp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = tmp;	
                    didswap = true;
                }
            }
        }
    }
 
    public static void main(String[] args) {
        int[] nums = {5, 1, 4, 2, 8};
        bubbleSort(nums);
        System.out.println("Sorted array is: " + Arrays.toString(nums));
    }
}
