package edu.brandeis.lecture4;

import java.io.*;               // for File
import java.util.*;             // for Scanner

/**
 * This class demonstrates that token-based processing often doesn't work well
 * if the input is line-based. 
 * This is an incorrect, buggy solution.
 */
public class HoursWorkedToken {
  public static void main(String[] args) throws FileNotFoundException {
     Scanner input = new Scanner(new File("resources/lecture4/hours.txt"));

     while (input.hasNext()) {
        // process one person
        int id = input.nextInt();
        String name = input.next();
        double totalHours = 0.0;
        int days = 0;

        while (input.hasNextDouble()) {
           totalHours += input.nextDouble();
           days++;
        }

        System.out.println(name + " (ID#" + id + ") worked " + totalHours + " hours (" + (totalHours / days) + " hours/day)");
     }
     input.close();
  }
}
