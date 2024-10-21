package edu.brandeis.lecture13.bikes;

public class BikeMain {
    public static void main(String[] args) {
        Bicycle b = new Bicycle(1, 2, 3);

        // Q1:  What happens when we instantiate the MountainBike (i.e. what lines of code run)?
        MountainBike mb = new MountainBike(2, 3, 4, 5);

        // Q2: What happens when we ask the bicycle to speed up?  The mountain bike?
        b.speedUp(10);
        mb.speedUp(15);

        // Q3: What happens when we ask the bicycle to set height?  The mountain bike?
        b.setHeight(10);
        mb.setHeight(6);
    }
}