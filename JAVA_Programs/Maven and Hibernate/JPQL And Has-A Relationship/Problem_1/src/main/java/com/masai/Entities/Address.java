package com.masai.Entities;

import java.util.Objects;

public class Address {
    private String state;
    private String city;
    private String pincode;
    private String type;

    public Address() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;
        return getState().equals(address.getState()) && getCity().equals(address.getCity()) && getPincode().equals(address.getPincode()) && getType().equals(address.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getState(), getCity(), getPincode(), getType());
    }

    public Address(String state, String city, String pincode, String type) {
        this.state = state;
        this.city = city;
        this.pincode = pincode;
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
