package edu.brandeis.unit3.review.solution;

public class App {
    // Name and size should not be static - each App instance will have
    // a different value.
    private String name;
    // package-protected was not incorrect, but it's better style to 
    // make size private.
    private int size;

    public App(String name, int size) {
        // Must use this.name and this.size because the parameters
        // shadow the class fields.
        this.name = name;
        this.size = size;
    }
    
    // A private size field requires a getter
    public int getSize() {
        return size;
    }

    public String toString() {
        return name + " (size: " + size + ")";
    }

}
