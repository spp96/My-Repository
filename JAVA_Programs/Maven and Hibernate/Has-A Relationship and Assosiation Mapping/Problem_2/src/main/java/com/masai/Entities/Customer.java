package com.masai.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    private int	cid;
    private String name;
    private String mobileNumber;
    private String email;
    @ElementCollection(fetch=FetchType.EAGER)
    @Embedded
//    @JoinTable(name="custaddress",joinColumns=@JoinColumn(name="cust_id"))
    List<Address> addresses = new ArrayList<>();

    public Customer() {
    }

    public Customer(int cid, String name, String mobileNumber, String email, List<Address> addresses) {
        this.cid = cid;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.addresses = addresses;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
