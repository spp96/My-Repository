package com.masai.Usecases;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Exceptions.EmployeeException;

import java.util.Scanner;

public class GetEmployeeSalaryById {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        int empid = sc.nextInt();
        EmployeeDao dao = new EmployeeDaoImpl();

        try {

            System.out.println(dao.getEmployeeSalaryById(empid));
        } catch (EmployeeException e) {
            e.printStackTrace();
        }
    }
}
