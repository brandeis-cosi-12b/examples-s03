package edu.brandeis.lecture13.ver4;

public class Marketer extends Employee {
    
    public Marketer(int years) {
        super(years);
    }
    
    // overrides getSalary from Employee class
    public double getSalary() {
        return super.getSalary() + 10000;
    }

    public void advertise() {
        System.out.println("Act now while supplies last!");
    }

}
