package edu.brandeis.lecture13.bikes;

public class MountainBike extends Bicycle {
    // the MountainBike subclass adds one field
    public int shockStiffness;
    
    // the MountainBike subclass has one constructor
    public MountainBike(
            int shockStiffness,
            int startSpeed,
            int startGear) {
        super(startSpeed, startGear);
        this.shockStiffness = shockStiffness;
    }   
    
    // the MountainBike subclass adds one method
    public void setShockStiffness(int newValue) {
        shockStiffness = newValue;
    }

    // the MountainBike subclass overrides one method from Bicycle
    public void applyBrake(int decrement) {
        applyBrake();
    }

    // the MountainBike subclass also *overloads* the applyBrake function
    public void applyBrake() {
        speed = 0;
    }
}
