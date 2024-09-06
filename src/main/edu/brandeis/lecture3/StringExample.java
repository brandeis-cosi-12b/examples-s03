package edu.brandeis.lecture3;

public class StringExample {
   public static void main(String[] args) {
      String s1 = "hello";
      String s2 = "class";
      String s3 = "soon we'll have the first quiz!";
      
      System.out.println(s1 + " " + s2 + " " + s3);
      System.out.println();
      
      //Use of the method length()
      String s4 = s1 + " " + s2 + " " + s3;
      int strLen = s4.length();
      System.out.println("The length of the string s4 is: " + strLen);
      System.out.println();
      
      //Use of the method charAt(index)
      char ch = s4.charAt (3);
      System.out.println("The character in string s4 at location 3 is: " + ch);
      System.out.println();
      
      //Use of the method toUpperCase()
      String newString = s4.toUpperCase();
      System.out.println(newString);
   }
}
