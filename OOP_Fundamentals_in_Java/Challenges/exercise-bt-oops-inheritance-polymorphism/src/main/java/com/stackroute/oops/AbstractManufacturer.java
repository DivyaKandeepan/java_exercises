package com.stackroute.oops;

/*
Class is having 3 fields name, modelName and type.
Type varies for different vehicles.
eg. Car is of type sedan, sports...
Bike is of type cruiser, sports...
 */
 // Abstract class AbstractManufacturer
    public abstract class AbstractManufacturer {
    protected String name;
    protected String modelName;
    protected String type;

    // Getter methods
    public String getName() {
        return name;
    }

    public String getModelName() {
        return modelName;
    }

    public String getType() {
        return type;
    }

    // Abstract method
    public abstract String getManufacturerInformation();
}
