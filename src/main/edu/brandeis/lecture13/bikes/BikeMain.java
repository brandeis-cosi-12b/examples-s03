package edu.brandeis.lecture13.bikes;

public class BikeMain {
    public static void main(String[] args) {
        Bicycle b = new Bicycle(2, 3);

        // Q1:  What happens when we instantiate the MountainBike
        // (i.e. what lines of code run)?
        MountainBike mb = new MountainBike(2, 3, 4);

        // Q2: What happens when we ask the bicycle to speed up? 
        // The mountain bike?
        b.speedUp(10);
        mb.speedUp(15);

        // Q3: What happens when we ask the bicycle to apply the brake?
        // The mountain bike?
        b.applyBrake(10);
        mb.applyBrake(6);

        // Q4: What happens when we ask the bicycle to set a shock stiffness?
        // The mountain bike?
        b.setShockStiffness(5);
        mb.setShockStiffness(5);

        // Q4: What happens when we ask the bicycle to apply the brake with no argument?
        // The mountain bike?
        b.applyBrake();
        mb.applyBrake();
    }
}