package edu.brandeis.unit5.employees;

public class Employee {
    private int years;

    public Employee(int years) {
        this.years = years;
    }

    public int getHours() {
        return 40;           // works 40 hours/week
    }
    
    public double getSalary() {
        return 50000.0;      // $40,000.00/year
    }
    
    protected int getSeniorityBonus() {
        return 2 * years;
    }

    public int getVacationDays() {
        return 10 + getSeniorityBonus();            // 2 weeks' paid vacation
    }

    public String getVacationForm() {
        return "yellow";     // use the yellow form
    }
}

