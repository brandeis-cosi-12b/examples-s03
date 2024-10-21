package edu.brandeis.lecture13.ver3;

public class Employee {
    int years;

    public Employee(int years) {
        this.years = years;
    }

    public int getHours() {
        return 40;
    }
    
    public double getSalary() {
        return 50000.0;
    }
    
    public int getVacationDays() {
        return 10;
    }

    public String getVacationForm() {
        return "yellow";
    }
}
