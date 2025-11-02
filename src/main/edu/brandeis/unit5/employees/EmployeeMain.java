package edu.brandeis.unit5.employees;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee(2);
        Secretary s = new Secretary(10);
        Lawyer l = new Lawyer(5);
        Marketer m = new Marketer(10);
        
        System.out.println("Employee hours worked: " + e.getHours());
        System.out.println("Employee salary: " + e.getSalary());

        System.out.println("Secretary hours worked: " + s.getHours());
        System.out.println("Secretary salary: " + s.getSalary());
        s.takeDictation("Important stuff");

        System.out.println("Lawyer vacation: " + l.getVacationDays());

        LegalSecretary ls = new LegalSecretary(5);
        System.out.println("LS salary: " + ls.getSalary());

        FormPrinter fp = new FormPrinter();
        fp.printForm(m);
        fp.printForm(l);

        Employee e2 = new Lawyer(10);
        System.out.println("Vacation form: " + e2.getVacationForm());       

        Employee e3 = new Marketer(5);
        System.out.println("Vacation form: " + e3.getVacationForm());
        Marketer m2 = (Marketer) e3;
        m2.advertise();

        Employee e4 = new Secretary(10);
        System.out.println("Vacation: " + e4.getVacationDays());
    }
}
