package com.masai.Dao;

import com.masai.Entities.Employee;
import com.masai.Exceptions.EmployeeException;
import com.masai.Utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public List<Employee> getAllEmployees() throws EmployeeException {
        EntityManager em = EMUtil.provideConnection();

        String jpql = "from Employee";

        Query query = em.createQuery(jpql);

        List<Employee> emplist = query.getResultList();
        em.close();
        return emplist;
    }

    @Override
    public List<Employee> getEmployeesByAddress(String address) throws EmployeeException {

        List<Employee> empList = null;



        EntityManager em = EMUtil.provideConnection();

            String jpql = "from Employee where address=:add";

            TypedQuery<Employee> emp = em.createQuery(jpql,Employee.class);
            emp.setParameter("add",address);
            empList = emp.getResultList();
        em.close();
        return empList;
    }

    @Override
    public List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary) throws EmployeeException {

        List<Employee> empList =null;
        EntityManager em = EMUtil.provideConnection();

            String jpql = "from Employee where salary between ?1 and ?2";

            TypedQuery <Employee> emp = em.createQuery(jpql,Employee.class);

            emp.setParameter(1,startSalary);
            emp.setParameter(2,endSalary);

            empList = emp.getResultList();
        em.close();
        return empList;
    }

    @Override
    public Object[] getEmployeeNameAndSalary(int empId) throws EmployeeException {

        EntityManager em = EMUtil.provideConnection();

        String jpql = "select name, salary from Employee where empId=:eid";

        TypedQuery<Object[]> tq= em.createQuery(jpql, Object[].class);

        tq.setParameter("eid",empId);

        Object[] result= tq.getSingleResult();
        em.close();
        return result;
    }

    @Override
    public int getEmployeeSalaryById(int empId) throws EmployeeException {
        EntityManager em = EMUtil.provideConnection();

        String jpql = "from Employee where empId=:eid";
        TypedQuery <Employee> emp =em.createQuery(jpql, Employee.class);

        emp.setParameter("eid",empId);
        Employee result = emp.getSingleResult();

        em.close();
        return result.getSalary();
    }
}
