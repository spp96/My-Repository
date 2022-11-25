package com.masai.Entities;

import javax.persistence.*;
import java.util.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empID;
    private String name;
    private String gender;
    private int salary;

    @Embedded
    @ElementCollection
    @JoinTable(name = "Address",joinColumns = @JoinColumn(name="empID"))
    private Set<Address> address = new HashSet();


    public Employee() {
    }

    public Employee(String name, String gender, int salary) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Set<Address> getEmpAddress() {
        return address;
    }

    public void setEmpAddress(Set<Address> empAddress) {
        this.address = empAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", empAddress=" + address +
                '}';
    }
}
