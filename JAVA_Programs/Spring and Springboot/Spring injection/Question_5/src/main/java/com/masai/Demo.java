package com.masai;

import java.util.*;
public class Demo {
    private Map<Department, Employee> theMap;

    public void setTheMap(Map<Department, Employee> theMap) {
        this.theMap = theMap;
    }

    public void myInit(){
        System.out.println("inside myInit method");
    }
    public void cleanUp() {
        System.out.println("inside cleanUp method");
    }

    public void showDetails(){
        System.out.println("inside showDetails of Demo class");
        Set<Map.Entry<Department,Employee>> student = theMap.entrySet();

        student.forEach(res ->{

            System.out.println("Department :" +res.getKey() + "Employee :"+res.getValue());
        } );

        //print all the details of all the employees department-wise
    }
}
