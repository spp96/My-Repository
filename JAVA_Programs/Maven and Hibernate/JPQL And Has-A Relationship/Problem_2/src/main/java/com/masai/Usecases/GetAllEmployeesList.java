package com.masai.Usecases;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Entities.Employee;
import com.masai.Exceptions.EmployeeException;

public class GetAllEmployeesList {
    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDaoImpl();

        try {
            System.out.println(dao.getAllEmployees());
            System.out.println("Successfully Done");
        } catch (EmployeeException e) {
            e.printStackTrace();
        }
    }
}
