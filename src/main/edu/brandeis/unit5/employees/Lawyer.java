package edu.brandeis.unit5.employees;

public class Lawyer extends Employee {

    public Lawyer(int years) {
        super(years);
        // additional lawyer stuff
    }

    public int getVacationDays() {
        return 15;
    }

    public String getVacationForm() {
        return "pink";
    }

    public void sue() {
        System.out.println("See you in court");
    }
}
