package Questino_5.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Questino_5.Entities.Employee;
import Questino_5.Exceptions.EmployeeException;

public class EmployeeImpl implements EmployeeDao {

	@Override
	public String registerEmployee(Employee employee) throws EmployeeException {
		// TODO Auto-generated method stub
		
		String message = "Not Inserted.....";
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empUnit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		System.out.println("Employee Inserted Successfully..");
		em.close();
		return message;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
	Employee message = null;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empUnit");
		EntityManager em = emf.createEntityManager();
		
		Employee emp = em.find(Employee.class, empId);
		
		if(emp !=null) {
			System.out.println(emp);
		} else {
			System.out.println("Employee Not Found..");
			
		}
		em.close();
		return message;
	}

}
