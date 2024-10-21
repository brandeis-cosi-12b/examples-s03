package edu.brandeis.lecture13.ver3;

public class Lawyer extends Employee {

    public Lawyer(int years) {
        super(years);
    }

    // overrides getVacationDays from Employee class
    public int getVacationDays() {
        return super.getVacationDays() + 5;
    }

    // overrides getVacationForm from Employee class
    public String getVacationForm() {
		return "pink";
	}

    public void sue() {
        System.out.println("See you in court!");
    }
}
