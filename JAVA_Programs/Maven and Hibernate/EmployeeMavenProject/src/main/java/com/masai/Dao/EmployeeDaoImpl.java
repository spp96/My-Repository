package com.masai.Dao;

import com.masai.EMUtil.EMFUtillity;
import com.masai.Entities.Employee;
import com.masai.Exceptions.EmployeeException;

import javax.persistence.EntityManager;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public Employee registerEmployee(Employee employee) throws EmployeeException {

        Employee emp = null;

        EntityManager em = EMFUtillity.provideConnection();

        em.getTransaction().begin();
        em.persist(employee);
        emp = em.find(Employee.class, employee.getEmpid());
        em.getTransaction().commit();
        em.close();
        return emp;
    }

    @Override
    public Employee getEmployeeById(int empId) throws EmployeeException {

        Employee emp = null;
        EntityManager em = EMFUtillity.provideConnection();
        em.close();
        return em.find(Employee.class, empId);

    }

    @Override
    public Employee deleteEmployeeById(int empId) throws EmployeeException {
        Employee emp = null;
        EntityManager em = EMFUtillity.provideConnection();
        emp = em.find(Employee.class, empId);
        em.getTransaction().begin();
        em.remove(emp);
        em.getTransaction().commit();

        em.close();
        return emp;
    }

    @Override
    public Employee updateEmployee(Employee employee) throws EmployeeException {
        EntityManager em = EMFUtillity.provideConnection();

        Employee emp = em.find(Employee.class, employee.getEmpid());
        em.getTransaction().begin();
        em.merge(employee);
        em.getTransaction().commit();
        return null;
    }
}
