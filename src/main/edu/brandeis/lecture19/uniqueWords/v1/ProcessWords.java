package edu.brandeis.lecture19.uniqueWords.v1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProcessWords {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input1 = new Scanner(new File("resources/lecture19/test1.txt"));
        Scanner input2 = new Scanner(new File("resources/lecture19/test2.txt"));
        ArrayList<String> list1 = getWords(input1);
        ArrayList<String> list2 = getWords(input2);
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
    }

    public static ArrayList<String> getWords(Scanner input) {
        ArrayList<String> words = new ArrayList<String>();
        while (input.hasNext()) {
            String next = input.next().toLowerCase();
            if (!words.contains(next)) {
                words.add(next);
            }
        }
        return words;
    }
}