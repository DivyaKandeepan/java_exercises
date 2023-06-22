package com.stackroute.oops;

import java.util.List;

public class Traveller {
    private int id;
    private String travelType;
    private double price;
    private List<String> locations;

    public Traveller() {
        // Default constructor
    }

    public Traveller(int id) {
        this.id = id;
    }

    public Traveller(int id, String travelType) {
        this.id = id;
        this.travelType = travelType;
    }

    public Traveller(int id, String travelType, double price) {
        this.id = id;
        this.travelType = travelType;
        this.price = price;
    }

    public Traveller(int id, String travelType, double price, List<String> locations) {
        this.id = id;
        this.travelType = travelType;
        this.price = price;
        this.locations = locations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTravelType() {
        return travelType;
    }

    public void setTravelType(String travelType) {
        this.travelType = travelType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    public String getTravellerDetails() {
        StringBuilder builder = new StringBuilder();
        builder.append("Traveller{id=").append(id)
                .append(", price=").append(price)
                .append(", travelType='").append(travelType).append("'")
                .append(", locations=").append(locations).append("}");
        return builder.toString();
    }
}
