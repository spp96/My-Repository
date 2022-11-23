package com.masai.Question_3.Dao;

import com.masai.Question_3.Entities.Employee;

public interface EmployeeDao {
	public void save(Employee emp);
	public String getAddressOfEmployee(int empId);
	public String giveBonusToEmployee(int empId, int bonus);
	public boolean deleteEmployee(int empId);
}
  