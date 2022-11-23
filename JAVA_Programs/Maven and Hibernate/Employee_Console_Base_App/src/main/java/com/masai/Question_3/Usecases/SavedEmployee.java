package com.masai.Question_3.Usecases;

import java.util.Scanner;

import com.masai.Question_3.Dao.EmployeeDao;
import com.masai.Question_3.Dao.EmployeeImpl;
import com.masai.Question_3.Entities.Employee;

public class SavedEmployee {
	public static void savenewemp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		String name = sc.next();
		System.out.println("Enter Employee Gender:");
		String egender = sc.next();
		System.out.println("Enter Employee Address:");
		String address = sc.next();
		System.out.println("Enter Employee Salary:");
		int salary = sc.nextInt();
		
		EmployeeDao edao = new EmployeeImpl();
		
		Employee employee = new Employee(name,egender,address, salary);
		edao.save(employee);
	}

}
