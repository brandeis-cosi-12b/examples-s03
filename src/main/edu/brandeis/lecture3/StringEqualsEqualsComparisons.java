package edu.brandeis.lecture3;

import java.util.Scanner;

/**
 * This class demonstrates what happens when Strings are compared with ==
 */
public class StringEqualsEqualsComparisons {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.println("Guess the secret word ");
      String guess = console.next();

      if (guess == "cosi") {
         // Note: this code is incorrect. This will never print!
         System.out.println("You got it!");
      } else {
         System.out.println("Sorry, try again.");
      }

      console.close();
   }
}
