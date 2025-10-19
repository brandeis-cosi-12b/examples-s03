package edu.brandeis.unit3.review.original;

public class SmartPhone {
    public static final int MAX_STORAGE = 100;
    public String owner;
    public int storage_used;

    public void SmartPhone(String owner) {
        owner = owner;
    }

    public static boolean install(App app) {
        if(storage_used > MAX_STORAGE) {
            return false;
        }
        storage_used += app.size;
        return true;
    }
}
