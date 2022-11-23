package com.masai.Question_3.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.masai.Question_3.Entities.Employee;

public class EmployeeImpl implements EmployeeDao {

	@Override
	public void save(Employee emp) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empUnit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et  = em.getTransaction();
		et.begin();
		em.persist(emp);
		et.commit();
		em.close();
		System.out.println("Employee Saved SuccessFully..!");	
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		String message = null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empUnit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et  = em.getTransaction();
		  
		Employee employee = em.find(Employee.class, empId);
		if(employee!=null) {
			message = "Address: "+employee.getAddress();
		}else {
			message = "Record Not Found..!";
		}
		return message;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		String message = null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empUnit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et  = em.getTransaction();
		  
		Employee employee = em.find(Employee.class, empId);
		if(employee!=null) {
			em.getTransaction().begin();
			employee.setSalary(employee.getSalary()+bonus);
            em.getTransaction().commit();			
			message = "Bonus Added: "+bonus;
		}else {
			message = "Record Not Found..!";
		}
		return message;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		String message = null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empUnit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et  = em.getTransaction();
		  
		Employee employee = em.find(Employee.class, empId);
		if(employee!=null) {
			em.getTransaction().begin();
			em.remove(employee);
			em.getTransaction().commit();
			em.close();
			System.out.println("Employee Removed..!");
		}else {
			message = "Record Not Found..!";
		}
	
		return false;
	}



}