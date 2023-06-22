package com.stackroute.oops;
public class VehicleService {
    public Car createCar(String name, String modelName, String type) {
        return new Car(name, modelName, type);
    }

    public Bike createBike(String name, String modelName, String type) {
        return new Bike(name, modelName, type);
    }

    public int compareMaxSpeed(Vehicle vehicle1, Vehicle vehicle2) {
        if (vehicle1.getType().equalsIgnoreCase("sports") && vehicle2.getType().equalsIgnoreCase("sports")) {
            int maxSpeed1 = vehicle1.maxSpeed(vehicle1.getType());
            int maxSpeed2 = vehicle2.maxSpeed(vehicle2.getType());
            return Math.max(maxSpeed1, maxSpeed2);
        } else {
            return -1;
        }
    }
}

