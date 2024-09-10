package edu.brandeis.lecture6;

public class MostFrequentDigit {
    public static int[] countDigits(int num) {
        int[] counts = new int[10];
        int digit = 0;
        while (num > 0) {
            digit = num % 10;  // pluck off a digit and tally it
            counts[digit]++;
            num = num / 10;
        }  
        return counts;
    }
    public static int findMaxValueIndex(int[] nums) {
        // find the most frequently occurring digit
        int bestIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[bestIndex]) {
                bestIndex = i;
            }
        }   
        return bestIndex;
    }
    
    public static int mostFrequentDigit(int n) {
        int[] counts = countDigits(n);
        int mostFrequent = findMaxValueIndex(counts);
        return mostFrequent;
    }

    public static void main(String[] args) {
        int n = 669260267;
        System.out.println("The most frequent digit in '" + n + "' is: " + mostFrequentDigit(n));

        n = 57135203;
        System.out.println("The most frequent digit in '" + n + "' is: " + mostFrequentDigit(n));
    }
}
