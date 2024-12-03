package edu.brandeis.lecture23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ProcessWords {
    public static final int OCCURRENCES = 2000;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input1 = new Scanner(new File("resources/lecture23/dracula.txt"));
        
        Map<String, Integer> counts = getCountMap(input1);
        
        report1(counts);
        report2(counts);
        report3(counts);
        report4(counts);

    }
    
    public static Map<String, Integer> getCountMap(Scanner in) {	
        Map<String, Integer> wCountMap = new TreeMap<String, Integer>();
        int count = 0;
        while (in.hasNext()) {
            String word = in.next().toLowerCase();
            if (wCountMap.containsKey(word)) {
                // seen this word before; increment count
                count = wCountMap.get(word);
                wCountMap.put(word, count + 1);
            } else {
                // never seen this word before
                wCountMap.put(word, 1);
            }
        }
        return wCountMap;
    }
    
    // Unsorted
    public static void report1(Map<String, Integer> counts) {
        System.out.println("Report 1:");
        for (String word : counts.keySet()) {
            int count = counts.get(word);
            if (count > OCCURRENCES) {
                System.out.println(word + " occurs " + count + " times.");
            }
        }
    }

    // Do it ourselves
    public static void report2(Map<String, Integer> counts) {
        System.out.println("Report 2:");
        Map<Integer, Set<String>> byCounts = new HashMap<>();
        for(String key : counts.keySet()) {
            int count = counts.get(key);
            if(count > OCCURRENCES) {
                if(!byCounts.containsKey(count)) {
                    byCounts.put(count, new TreeSet<String>());
                }
                byCounts.get(count).add(key);
            }
        }

        List<Integer> countList = new ArrayList<Integer>(byCounts.keySet());
        Collections.sort(countList);
        for(int i = countList.size()-1; i >= 0; i--) {
            if(countList.get(i) <= OCCURRENCES) {
                break;
            }

            for(String word : byCounts.get(countList.get(i))) {
                System.out.println(word + " occurs " + countList.get(i) + " times.");
            }
        }
    }

    // Let Collections do it for us, using Map.Entry tools
    // This solution is outside the scope of what we've covered in class
    public static void report3(Map<String, Integer> counts) {
        System.out.println("Report 3:");

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : counts.entrySet()) {
            if(entry.getValue() > OCCURRENCES) {
                entryList.add(entry);
            }
        }

        Collections.sort(entryList, Collections.reverseOrder(Map.Entry.comparingByValue()));

        for(Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
    }

    // Use the advanced "stream" interface for Collections
    // This solution is WAY outside the scope of what we've covered in class
    public static void report4(Map<String, Integer> counts) {
        System.out.println("Report 4:");
        counts.entrySet().stream()
                .filter(entry -> entry.getValue() > OCCURRENCES)
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(entry -> System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times."));
    }
}
