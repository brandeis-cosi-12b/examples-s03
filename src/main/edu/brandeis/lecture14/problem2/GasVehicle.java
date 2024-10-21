package edu.brandeis.lecture14.problem2;

public class GasVehicle extends Vehicle {
    protected int mpg;

    public GasVehicle(int mpg, int gasCapacity) {
        super(gasCapacity);
        this.mpg = mpg;
    }

    protected double getFuelForDistance(int distance) {
        return (float)distance / mpg;
    }
}
