package edu.brandeis.lecture4;

import java.io.*;     // for File
import java.util.*;   // for Scanner

/**
 * This class demonstrates creating a File object, and reading a single word from it
 * with a Scanner.
 */
public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/lecture4/read_file_data.txt"));
        String text = input.next();
        System.out.println(text);
        input.close();
    }
}
