package com.masai.Usecase;

import com.masai.Entities.Address;
import com.masai.Entities.Employee;
import com.masai.Utility.EMUtil;

import javax.persistence.EntityManager;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Employee Name");
        String name= sc.next();

        System.out.println("Enter Employee Gender");
        String gender= sc.next();

        System.out.println("Enter Employee Salary");
        int salary= sc.nextInt();

        System.out.println("Enter Employee State");
        String state= sc.next();

        System.out.println("Enter Employee City");
        String city= sc.next();

        System.out.println("Enter Employee Pin code");
        String pin = sc.next();

        System.out.println("Enter Employee Type");
        String type= sc.next();

        System.out.println("Enter Employee State_2");
        String state1= sc.next();

        System.out.println("Enter Employee City_2");
        String city1= sc.next();

        System.out.println("Enter Employee Pin code_2");
        String pin1 = sc.next();

        System.out.println("Enter Employee Type_2");
        String type1= sc.next();


        EntityManager em= EMUtil.provideConnection();

        Employee empDetails = new Employee(name,gender,salary);

        empDetails.getEmpAddress().add(new Address(state,city,pin,type));
        empDetails.getEmpAddress().add(new Address(state1,city1,pin1,type1));


        em.getTransaction().begin();
        em.persist(empDetails);
        em.getTransaction().commit();

        System.out.println("Done");

        em.close();

    }
}
