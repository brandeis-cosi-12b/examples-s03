package edu.brandeis.lecture4;

import java.util.Scanner;

/**
 * A class demonstrating that not all exceptions need to be declared or caught.
 */
public class WhyNoThrows {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("What's your age again?");
        int age = console.nextInt();
        System.out.println("You don't look a day over " + (age - 10));
        console.close();
    }
}
