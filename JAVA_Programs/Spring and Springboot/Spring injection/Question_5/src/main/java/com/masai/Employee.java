package com.masai;

public class Employee {
    private int empId;
    private String empName;
    private String address;
    private int salary;

    public Employee(int empId, String empName, String address, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.address = address;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }


}
