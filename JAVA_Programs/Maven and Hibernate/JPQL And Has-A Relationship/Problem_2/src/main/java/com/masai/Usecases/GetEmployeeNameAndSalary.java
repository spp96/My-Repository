package com.masai.Usecases;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Exceptions.EmployeeException;

import java.util.Scanner;

public class GetEmployeeNameAndSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        int empid = sc.nextInt();
        EmployeeDao dao = new EmployeeDaoImpl();

        try {
            Object [] obj = dao.getEmployeeNameAndSalary(empid);
            for (Object result : obj) {
                System.out.println(result);
            }
        } catch (EmployeeException e) {
            e.printStackTrace();
        }
    }
}
