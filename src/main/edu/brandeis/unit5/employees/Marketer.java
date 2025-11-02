package edu.brandeis.unit5.employees;

public class Marketer extends Employee {
    public Marketer(int years) {
        super(years);
    }
    
    public double getSalary() {
        return super.getSalary() + 10000.0;
    }

    public void advertise() {
        System.out.println("Buy my book!");
    }
}
