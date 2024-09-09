package edu.brandeis.lecture3;

import java.util.*;

/**
 * This class demonstrates the usage of Scanner.next() to get a single word of input at a time from a user.
 */
public class FullName {	
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("What is your full name?");
    String first = console.next();
    String last = console.next();
    System.out.println("Your first name is \"" + first + "\" and your surname is \"" + last + "\"");
    console.close();
  }
}

