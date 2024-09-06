package edu.brandeis.lecture3;

import java.util.*;
public class RetirementCountdown {	
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("How old are you? ");
    int age = console.nextInt();
    int years = 65 - age;
    System.out.println(years + " years to retirement!");
    console.close();
  }
}
