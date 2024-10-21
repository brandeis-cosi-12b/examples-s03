package edu.brandeis.lecture14.problem2;

public class VehicleMain {
    
    public static void main(String[] args) {
        Vehicle fourPassengerCar = new Car(4, 40);
        Vehicle electric = new ElectricVehicle(100);
        Vehicle pickupTruck = new Truck(1000);
        
        fourPassengerCar.refuel(30);
        electric.refuel(5);
        pickupTruck.refuel(50);

        tryDrive(fourPassengerCar, 1100);
        tryDrive(fourPassengerCar, 800);

        tryDrive(electric, 2500);
        tryDrive(electric, 2000);

        tryDrive(pickupTruck, 750);
        ((Truck)pickupTruck).addLoad(900);
        pickupTruck.refuel(50);
        tryDrive(pickupTruck, 750);
    }
    
    public static void tryDrive(Vehicle vehicle, int units) {
        System.out.println(vehicle + " range before driving: " + vehicle.getRange());
        boolean couldDrive = vehicle.drive(units);
        if(couldDrive) {
            System.out.println(vehicle + " drove " + units + " units");
        } else {
            System.out.println(vehicle + " couldn't drive " + units + " units");
        }
        System.out.println(vehicle + " range after driving: " + vehicle.getRange());
        System.out.println();
    }
}
