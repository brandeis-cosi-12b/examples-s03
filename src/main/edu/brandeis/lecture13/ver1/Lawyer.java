package edu.brandeis.lecture13.ver1;

public class Lawyer extends Employee {
    // overrides getVacationDays from Employee class
    public int getVacationDays() {
        return 15;
    }

    // overrides getVacationForm from Employee class
    public String getVacationForm() {
		return "pink";
	}

    public void sue() {
        System.out.println("See you in court!");
    }
}
