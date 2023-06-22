package com.stackroute.oops;

import java.util.Objects;

public class Address {

    private String area;
    private String city;

    public Address() {
        //default constructor
    }

    public Address(String area, String city) {
        this.area = area;
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(getArea(), address.getArea()) &&
                Objects.equals(getCity(), address.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getArea(), getCity());
    }
}

