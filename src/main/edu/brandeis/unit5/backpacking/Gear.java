package edu.brandeis.unit5.backpacking;

public abstract class Gear {

    public abstract int getEmptyWeight();
    public abstract int getTrailWeight();
    
    public int countGrams() {
        return getEmptyWeight() + getTrailWeight();
    }

    public static void main(String[] args) {
        Stove st = new Stove();
        System.out.println("Stove grams: " + st.countGrams());

        SleepingBag sb = new SleepingBag();
        System.out.println("Sleeping bag grams: " + sb.countGrams());   

        Spork sp = new Spork();
        System.out.println("Spork grams: " + sp.countGrams());

        Tent t = new Tent();
        System.out.println("Tent grams: " + t.countGrams());
    }
}
