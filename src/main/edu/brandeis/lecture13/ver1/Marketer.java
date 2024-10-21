package edu.brandeis.lecture13.ver1;

public class Marketer extends Employee {
    // overrides getSalary from Employee class
    public double getSalary() {
        return 50000.0;
    }

    public void advertise() {
        System.out.println("Act now while supplies last!");
    }

}
