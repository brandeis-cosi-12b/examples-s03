package edu.brandeis.lecture3;

import java.util.Scanner;

/**
 * This class demonstrates the correct way to compare Strings - using the .equals() method.
 */
public class StringDotEqualsComparisons {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.println("Guess the secret word ");
      String guess = console.next();

      if (guess.equals("cosi")) {
         System.out.println("You got it!");
      } else {
         System.out.println("Sorry, try again.");
      }
      console.close();
   }
}
