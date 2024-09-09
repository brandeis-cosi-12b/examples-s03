package edu.brandeis.lecture4;

import java.io.*;    // for File
import java.util.*;  // for Scanner

/**
 * This class demonstrates how to process a file containing temperature on successive days.
 * It prints the change in temperate between each pair of consecutive days.
 */
public class Temperatures {
  public static void main(String[] args) throws FileNotFoundException {
     Scanner input = new Scanner(new File("resources/lecture4/weather.txt"));
     double prev = input.nextDouble();   

     while (input.hasNextDouble()) {
        double next = input.nextDouble();
        System.out.println(prev + " to " + next + ", change = " + (next - prev));
        // Use this line instead to format floats more nicely:
        //System.out.printf("%.1f to %.1f, change = %.1f\n", prev, next, (next - prev));
        prev = next;
     }

     input.close();
  }
}
