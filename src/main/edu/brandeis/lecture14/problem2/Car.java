package edu.brandeis.lecture14.problem2;

public class Car extends GasVehicle {
    private int passengerCapacity;
    private int passengers;

    public Car(int passengerCapacity, int mpg) {
        super(mpg, 30);
        this.passengerCapacity = passengerCapacity;
    }

    public boolean addPassenger() {
        if(passengers >= passengerCapacity) {
            return false;
        }
        passengers++;
        return true;
    }
}
