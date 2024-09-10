package edu.brandeis.lecture6;

/**
 * This class demonstrates a simple linear search over an array of integers.
 */
public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {17, 1, 0, 12, 1, 48};
        
        int indexOfTwelve = linearSearch(arr, 12);
        System.out.println("Found 12 at index: " + indexOfTwelve);

        int indexOfOne = linearSearch(arr, 1);
        System.out.println("Found 1 at index: " + indexOfOne);

        int indexOfFive = linearSearch(arr, 5);
        System.out.println("Found 5 at index: " + indexOfFive);

    }
}
