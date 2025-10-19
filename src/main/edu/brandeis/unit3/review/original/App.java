package edu.brandeis.unit3.review.original;

public class App {
    private static String name;
    static int size;

    public App(String name, int size) {
        name = name;
        size = size;
    }

    public String toString() {
        return name + " (size: " + size + ")";
    }

}
