package edu.brandeis.lecture15.fruits;

public class Banana extends Fruit { 
    public Banana(String color, boolean seasonal) { 
        super(color, seasonal); 	
    } 
    
    public void prepare() { 
        System.out.println("Peel the Banana"); 
    }

    public String toString() {
        return "Banana";
    }
}
