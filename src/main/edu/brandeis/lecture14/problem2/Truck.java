package edu.brandeis.lecture14.problem2;

public class Truck extends GasVehicle {
    private int loadCapacity;
    private int load;

    public Truck(int loadCapacity) {
        super(15, 50);
        this.loadCapacity = loadCapacity;
    }

    public boolean addLoad(int load) {
        if (this.load + load > loadCapacity) {
            return false;
        }
        this.load += load;
        return true;
    }

    protected double getFuelForDistance(int distance) {
        double loadMultiplier = 1 + (float)load / loadCapacity;
        return ((float)distance / mpg) * loadMultiplier;
    }
}
