package edu.brandeis.unit5.backpacking;

public class Spork extends CookingGear {
    public int getEmptyWeight() {
        return super.getEmptyWeight() + 50;
    }
}
