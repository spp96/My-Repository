package com.masai.Utilities;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Entities.Employee;
import com.masai.Exceptions.EmployeeException;

public class UpdateEmployee {
    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDaoImpl();
        Employee newEmp = new Employee();

        newEmp.setName("Sanket");
        newEmp.setAddress("TamilNadu");
        newEmp.setSalary(65000);

        try {
            System.out.println(dao.updateEmployee(newEmp));
        } catch (EmployeeException e) {
            e.printStackTrace();
        }

    }
}
