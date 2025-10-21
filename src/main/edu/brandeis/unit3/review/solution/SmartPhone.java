package edu.brandeis.unit3.review.solution;

public class SmartPhone {
    public static final int MAX_STORAGE = 100;
    // These fields should both be private, storage_used especially so
    // because setting it correctly requires bounds checking.
    private String owner;
    private int storage_used;

    // Constructors don't have a return type
    public SmartPhone(String owner) {
        // Must use this.owner due to shadowing
        this.owner = owner;
    }

    // install should be performed on an instance of a SmartPhone, so
    // this method should not be static
    public boolean install(App app) {
        // Must check for total size after install before actually
        // installing
        if(storage_used + app.getSize() > MAX_STORAGE) {
            return false;
        }
        // Must use app.getSize() now that App.size is private
        storage_used += app.getSize();
        return true;
    }

    // SmartPhone is printed out, so toString should be defined.
    public String toString() {
        return owner + "'s Phone (storage used: " + storage_used + ")";
    }
}
