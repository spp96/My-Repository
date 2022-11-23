package dao;

import java.sql.Connection;

import java.util.List;

import model.Employee;

public interface EmployeeDao {
	
	
	public String insertEmployee(Employee emp);
	
	public int getSalaryByID(int eid);
	
	public List<Employee> getAllEmployee();
	
	public Employee getEmployeeByID(int eid);
	
	public List<Employee> getSalaryLessThanint();

}
