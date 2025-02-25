package edu.brandeis.unit4;

import java.util.Arrays;

public class NumberAnalyzer {
    private int[] numbers;

    public NumberAnalyzer(int[] numbers) {
        this.numbers = numbers;
    }

    public double calculateMean() {
        if (numbers.length == 0) {
            return Double.NaN;
        }
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }


    public int calculateMedian() {
        int[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sortedNumbers);
        int middle = sortedNumbers.length / 2;
        if (sortedNumbers.length % 2 == 0) {
            return (sortedNumbers[middle - 1] + sortedNumbers[middle]) / 2;
        } else {
            return sortedNumbers[middle];
        }
    }

    public double calculateStdev() {
        double mean = calculateMean();
        double sum = 0;
        for (int num : numbers) {
            sum += Math.pow(num - mean, 2);
        }
        double variance = sum / numbers.length;
        return Math.sqrt(variance);
    }

    public int[] getEvenNumbers() {
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }
        int[] evenNumbers = new int[count];
        int index = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers[index++] = num;
            }
        }
        return evenNumbers;
    }
}
