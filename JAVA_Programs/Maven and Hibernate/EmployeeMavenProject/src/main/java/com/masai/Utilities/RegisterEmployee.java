package com.masai.Utilities;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Entities.Employee;
import com.masai.Exceptions.EmployeeException;

public class RegisterEmployee {
    public static void main(String[] args) throws EmployeeException {
        EmployeeDao dao = new EmployeeDaoImpl();

        Employee empdetails = new Employee();

        empdetails.setName("Rajendra");
        empdetails.setAddress("Maharashtra");
        empdetails.setSalary(80000);

        System.out.println(dao.registerEmployee(empdetails));


    }
}
