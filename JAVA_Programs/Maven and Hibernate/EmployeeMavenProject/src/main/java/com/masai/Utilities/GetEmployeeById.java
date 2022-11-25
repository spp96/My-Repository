package com.masai.Utilities;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Exceptions.EmployeeException;

public class GetEmployeeById {
    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDaoImpl();

        try {
            System.out.println(dao.getEmployeeById(3));
        } catch (EmployeeException e) {
            e = new EmployeeException("Employee Not Found");
        }
    }
}
