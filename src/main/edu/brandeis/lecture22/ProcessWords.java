package edu.brandeis.lecture22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProcessWords {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input1 = new Scanner(new File("resources/lecture19/test1.txt"));
        Scanner input2 = new Scanner(new File("resources/lecture19/test2.txt"));

        Set<String> list1 = getWords(input1);
        Set<String> list2 = getWords(input2);
        Set<String> overlap = getOverlap(list1, list2);
        reportResults(list1, list2, overlap);
    }

    public static Set<String> getWords(Scanner input) {
        // read all words and sort
        input.useDelimiter("[^a-zA-Z’]+");
        Set<String> words = new HashSet<String>();
        while (input.hasNext()) {
            String next = input.next().toLowerCase();
            words.add(next);
        }
        return words;
    }

    public static Set<String> getOverlap(Set<String> list1, Set<String> list2) {
        Set<String> overlap = new HashSet<>(list1);
        overlap.retainAll(list2);
        return overlap;
    }

    public static void reportResults(Set<String> list1,
    Set<String> list2, Set<String> overlap) {
        System.out.println("file #1 words = " + list1.size());
        System.out.println("file #2 words = " + list2.size());
        System.out.println("common words  = " + overlap.size());

        double percent1 = 100.0 * overlap.size() / list1.size();
        double percent2 = 100.0 * overlap.size() / list2.size();
        System.out.println("% of file 1 in overlap = " + percent1);
        System.out.println("% of file 2 in overlap = " + percent2);
    }

}
