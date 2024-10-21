package edu.brandeis.lecture13.ver2;

public class Marketer extends Employee {
    // overrides getSalary from Employee class
    public double getSalary() {
        return super.getSalary() + 10000;
    }

    public void advertise() {
        System.out.println("Act now while supplies last!");
    }

}
