package edu.brandeis.lecture4;

import java.io.*;               // for File
import java.util.*;             // for Scanner

/**
 * This class demonstrates using a hybrid token/line based processing method
 * to process file-based data about how many hours employees have worked. 
 */
public class HoursWorkedFileOutput {
        public static void main(String[] args) throws FileNotFoundException {
            Scanner input = new Scanner(new File("resources/lecture4/hours.txt"));
            PrintStream out = new PrintStream(new File("hours_out.txt"));

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
                out.printf("%s (ID#%d) worked %.1f hours (%.2f hours/day)\n", name, id, sum, average);
                lineScan.close();
            }
            out.close();
            input.close();
        }
    }
    
