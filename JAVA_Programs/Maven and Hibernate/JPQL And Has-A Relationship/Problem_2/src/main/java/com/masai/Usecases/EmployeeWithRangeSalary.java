package com.masai.Usecases;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Exceptions.EmployeeException;

import java.util.Scanner;

public class EmployeeWithRangeSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter StartSalary");
        int startSalary = sc.nextInt();
        System.out.println("Enter EndSalary");
        int endSalary = sc.nextInt();

        EmployeeDao dao = new EmployeeDaoImpl();

        try {
            System.out.println(dao.getAllEmployeeWithRangeSalary(startSalary,endSalary));
        } catch (EmployeeException e) {
            e.printStackTrace();
        }
    }
}
