package com.masai.Dao;

import com.masai.Entities.Employee;
import com.masai.Utility.EMUtil;

import javax.persistence.TypedQuery;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public List<Employee> InsertEmployeeDetails() {

        TypedQuery<Employee> query = EMUtil.provideConnection().createQuery("from Employee", Employee.class);

        List<Employee> emp = query.getResultList();

        EMUtil.provideConnection().close();
        return emp;
    }
}
