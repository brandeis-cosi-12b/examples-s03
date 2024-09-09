package edu.brandeis.lecture4;

import java.io.*;    // for File
import java.util.*;  // for Scanner

/**
 * This class demonstrates how to process a file containing temperature on successive days.
 * It prints the change in temperate between each pair of consecutive days.
 * This version handles an input file that contains strings interspersed with temperatures
 * (by ignoring the strings).
 */
public class TemperaturesDirtyInput {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/lecture4/weather_dirty.txt"));
        double prev = input.nextDouble();   

        while (input.hasNext()) {
            if (input.hasNextDouble()) {
                double next = input.nextDouble();
                System.out.printf("%.1f to %.1f, change = %.1f\n", prev, next, (next - prev));
                prev = next;

            } else {
                input.next();  // throw away unwanted token
            }
        }
        input.close();
    }
}
