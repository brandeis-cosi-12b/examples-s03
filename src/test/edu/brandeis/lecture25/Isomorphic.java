package edu.brandeis.lecture25;

import java.util.HashMap;

public class Isomorphic {
    public static boolean areIsomorphic(String s1, String s2) {
        return encodePattern(s1).equals(encodePattern(s2));
    }

    private static String encodePattern(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        StringBuilder pattern = new StringBuilder();
        char next = 'a';

        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, next++);
            }
            pattern.append(map.get(c));
        }

        return pattern.toString();
    }

    public static boolean areIsomorphic2(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> reverseMap = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char char1 = s1.charAt(i);
            char char2 = s2.charAt(i);

            if (map.containsKey(char1)) {
=                if (map.get(char1) != char2) {
                    return false;
                }
            } else {
                if (reverseMap.containsKey(char2) && reverseMap.get(char2) != char1) {
                    return false;
                }

                map.put(char1, char2);
                reverseMap.put(char2, char1);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(areIsomorphic("egg", "add"));    // Output: true
        System.out.println(areIsomorphic("foo", "bar"));    // Output: false
        System.out.println(areIsomorphic("paper", "title"));// Output: true
        System.out.println(areIsomorphic("abcdefghijk", "abcdefghijba")); // Output: false
    }
}    
