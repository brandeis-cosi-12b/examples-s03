package edu.brandeis.lecture3;

import java.util.*;

/**
 * This class demonstrates using the 3 Scanner methods: next(), nextLine(), and nextInt() together
 * to read different types of inputs from the user.
 * 
 * Note: This method contains 2 small display bugs when printing the output.
 */
public class PostalAddressComponents {	
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Type your full postal address");

    int numberComponent = console.nextInt();
    String streetComponent = console.nextLine();
    String cityComponent = console.next();
    String stateComponent = console.next();
    int zipComponent = console.nextInt();

    System.out.println("You live at:");
    System.out.println("Number " + numberComponent + " on " + streetComponent);
    System.out.println("In the city of " + cityComponent + ", " + stateComponent + ".");
    System.out.println("Your zip code is " + zipComponent);

    console.close();
  }
}

