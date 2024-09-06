package edu.brandeis.lecture3;

import java.util.*;
public class PostalAddress {	
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Type your full postal address");
    String streetComponent = console.nextLine();
    String cityStateZipComponent = console.nextLine();
    System.out.println("Your address is:");
    System.out.println(streetComponent);
    System.out.println(cityStateZipComponent);
    console.close();
  }
}

