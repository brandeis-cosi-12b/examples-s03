package edu.brandeis.unit5.employees;

public class Secretary extends Employee {

    public Secretary(int years) {
        super(years);
    }

    protected int getSeniorityBonus() {
        return 0;
    }
    
    // take everything from Employee and include it here
    public void takeDictation(String info) {
        System.out.println("Here's your really important info: " + info);
    }
}


