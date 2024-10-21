package edu.brandeis.lecture13.ver4;

public class LegalSecretary extends Secretary {
    
    public LegalSecretary(int years){
        super(years);
    }
    
    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }
    
    public double getSalary() {
        return super.getSalary()+5000.0;  // $45,000.00 / year
    }
}
