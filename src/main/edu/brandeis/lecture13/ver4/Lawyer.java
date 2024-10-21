package edu.brandeis.lecture13.ver4;

public class Lawyer extends Employee {
    
    public Lawyer(int years) {
        super(years);  // calls Employee constructor
    }
    
    // overrides getVacationForm from Employee class
    public String getVacationForm() {
        return "pink";
    }
    
    // overrides getVacationDays from Employee class
    public int getVacationDays() {
        return super.getVacationDays()+1; // 3 weeks vacation
    }
    
    public void sue() {
        System.out.println("I'll see you in court!");
    }
}

