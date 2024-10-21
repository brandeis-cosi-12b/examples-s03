package edu.brandeis.lecture13.ver2;

public class LegalSecretary extends Secretary {
    // overrides getSalary from Employee
    public double getSalary() {
        return super.getSalary() + 5000;
    }

    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }
    
       
}
