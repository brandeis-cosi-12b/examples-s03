package edu.brandeis.lecture13.ver3;

public class Secretary extends Employee {
    public Secretary() {
        super(0);
    }    

    public void takeDictation(String text) {
        System.out.println("Taking dictation of text: " + text);
    }
}
