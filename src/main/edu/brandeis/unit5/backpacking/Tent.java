package edu.brandeis.unit5.backpacking;

public class Tent extends SleepingGear {
    public int countGrams() {
        return super.getTrailWeight() + getEmptyWeight();
    }

    public int getEmptyWeight() {
        return 100;
    }
}
