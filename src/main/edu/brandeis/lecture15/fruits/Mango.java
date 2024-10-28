package edu.brandeis.lecture15.fruits;

public class Mango extends Fruit { 
   public Mango(String color, boolean seasonal) { 
      super(color, seasonal); 
   } 
   
   public void prepare() { 
      System.out.println("Cut the Mango"); 
   } 

   public String toString() {
      return "Mango";
   }
} 
