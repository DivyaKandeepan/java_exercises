package com.stackroute.oops;

// Car class
public class Car extends AbstractManufacturer implements Vehicle {
    public Car(String name, String modelName, String type) {
        this.setName(name);
        this.setModelName(modelName);
        this.setType(type);
    }

    @Override
    public int maxSpeed(String type) {
        if (type.equalsIgnoreCase("sedan")) {
            return 190;
        } else {
            return -1;
        }
    }

    @Override
    public String getManufacturerInformation() {
        return "Car{Manufacturer Name:" + getName() + ",Model Name:" + getModelName() + ",Type:" + getType() + "}";
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setType(String type) {
        this.type = type;
    }
}
