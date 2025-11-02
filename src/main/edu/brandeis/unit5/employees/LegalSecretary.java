package edu.brandeis.unit5.employees;

public class LegalSecretary extends Secretary {
    
    LegalSecretary(int years){
        super(years);
    }

    public double getSalary() {
        return super.getSalary() + 5000.0;
    }

    public void prepareDoc() {
        System.out.println("Hey ChatGPT generate a brief for me");
    }
}
