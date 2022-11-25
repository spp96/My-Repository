package com.masai.Usecases;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Entities.Employee;
import com.masai.Exceptions.EmployeeException;

import java.util.List;
import java.util.Scanner;

public class GetEmployeeAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Address");
        String address = sc.next();

        EmployeeDao dao = new EmployeeDaoImpl();
        try {
            List<Employee> empList = dao.getEmployeesByAddress(address);
            empList.forEach(s-> System.out.println(s));
        } catch (EmployeeException e) {
            e = new EmployeeException("Employee Address Not Found");
        }

    }
}
