package com.stackroute.oops;

public class Bike extends AbstractManufacturer implements Vehicle {
    public Bike(String name, String modelName, String type) {
        this.name = name;
        this.modelName = modelName;
        this.type = type;
    }

    @Override
    public int maxSpeed(String type) {
        if (type.equalsIgnoreCase("cruiser")) {
            return 170;
        } else if (type.equalsIgnoreCase("sports")) {
            return 300;
        } else {
            return -1;
        }
    }
    

    @Override
    public String getManufacturerInformation() {
        return "Bike{Manufacturer Name:" + getName() + ",Model Name:" + getModelName() + ",Type:" + getType() + "}";
    }

    // Setter method
    public void setType(String type) {
        this.type = type;
    }
}
