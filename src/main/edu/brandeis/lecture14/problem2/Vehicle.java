package edu.brandeis.lecture14.problem2;

public class Vehicle {
    protected double fuelAmount;
    protected double fuelCapacity;

    public Vehicle(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void refuel(double amount) {
        fuelAmount += amount;
        if(fuelAmount > fuelCapacity) {
            fuelAmount = fuelCapacity;
        }
    }

    public int getRange() {
        return (int)Math.round(fuelAmount / getFuelForDistance(1));
    }

    public boolean drive(int distance) {
        double fuelRequired = getFuelForDistance(distance);
        if(fuelRequired > fuelAmount) {
            return false;
        }

        fuelAmount -= fuelRequired;
        return true;
    }

    protected double getFuelForDistance(int distance) {
        return distance;
    }
}
