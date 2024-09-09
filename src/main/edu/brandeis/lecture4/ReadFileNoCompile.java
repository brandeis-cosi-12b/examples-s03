package edu.brandeis.lecture4;

import java.io.*;     // for File
import java.util.*;   // for Scanner

/**
 * This class demonstrates the need to either handle or declare checked exceptions.
 */
public class ReadFileNoCompile {
    public static void main(String[] args) {
        Scanner input = new Scanner(new File("data.txt"));
        String text = input.next();
        System.out.println(text);
        input.close();
    }
}
