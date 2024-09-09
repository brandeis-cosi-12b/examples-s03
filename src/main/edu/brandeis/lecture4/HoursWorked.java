package edu.brandeis.lecture4;

import java.io.*;               // for File
import java.util.*;             // for Scanner

/**
 * This class demonstrates using a hybrid token/line based processing method
 * to process file-based data about how many hours employees have worked. 
 */
public class HoursWorked {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/lecture4/hours.txt"));

        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner lineScan = new Scanner(line);

            int id = lineScan.nextInt();          // e.g. 456
            String name = lineScan.next();        // e.g. "Eric"

            double sum = 0.0;
            int count = 0;
            while (lineScan.hasNextDouble()) {
                sum = sum + lineScan.nextDouble();
                count++;
            }			
            double average = sum / count;

            //System.out.println(name + " (ID#" + id + ") worked " + sum + " hours (" + average + " hours/day)");
            System.out.printf("%s (ID#%d) worked %.1f hours (%.2f hours/day)\n", name, id, sum, average);
            lineScan.close();
        }
        input.close();
    }
}
