package edu.brandeis.lecture13.ver4;

public class Secretary extends Employee {
    
    public Secretary(int years) {
        super(years);  // calls Employee constructor
        System.out.println("Creating a new Secretary.");
    }
    
    public int getSeniorityBonus(){
        return 0;
    }
    
    public void printYears() {
        System.out.println(years);        
    }
    
    public void takeDictation(String text) {
        System.out.println("Taking dictation of text: " + text);
    }
}
