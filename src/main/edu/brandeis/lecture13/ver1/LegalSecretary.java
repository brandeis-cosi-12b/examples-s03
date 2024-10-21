package edu.brandeis.lecture13.ver1;

public class LegalSecretary extends Secretary {
    // overrides getSalary from Employee
    public double getSalary() {
        return 45000.0;
    }

    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }
    
       
}
