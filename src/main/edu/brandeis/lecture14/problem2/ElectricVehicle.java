package edu.brandeis.lecture14.problem2;

public class ElectricVehicle extends Vehicle {
    private int chargeRate; 

    /*
     * @param chargeRate The number of fuel units replenished per hour of charging
     */

    public ElectricVehicle(int chargeRate) {
        super(1000);
        this.chargeRate = chargeRate; // units / hour
    }

    /*
     * @param amount The number of hours the car charges for
     */
    public void refuel(double amount) {
        fuelAmount += amount * chargeRate;
        if(fuelAmount > fuelCapacity) {
            fuelAmount = fuelCapacity;
        }
    }

    protected double getFuelForDistance(int distance) {
        return (float)distance / 10;
    }
}
