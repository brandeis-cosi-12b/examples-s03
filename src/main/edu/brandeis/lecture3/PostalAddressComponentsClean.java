package edu.brandeis.lecture3;

import java.util.*;
public class PostalAddressComponentsClean {	
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Type your full postal address");
    int numberComponent = console.nextInt();
    String streetComponent = console.nextLine().strip();
    String cityComponent = console.next();
    String stateComponent = console.next();
    int zipComponent = console.nextInt();
    System.out.println("You live at:");
    System.out.println("Number " + numberComponent + " on " + streetComponent);
    System.out.println("In the city of " + cityComponent + ", " + stateComponent + ".");
    System.out.printf("Your zip code is %05d\n", zipComponent);
    console.close();
  }
}

