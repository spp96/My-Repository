package Questino_5.Usecases;

import java.util.Scanner;

import Questino_5.Dao.EmployeeDao;
import Questino_5.Dao.EmployeeImpl;
import Questino_5.Entities.Employee;
import Questino_5.Exceptions.EmployeeException;

public class InsertEmployee {
	
	public static void main(String[] args) throws EmployeeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		String name = sc.next();
		System.out.println("Enter Employee Gender:");
		String gender = sc.next();
		System.out.println("Enter Employee Address:");
		String address = sc.next();
		System.out.println("Enter Employee Salary:");
		int salary = sc.nextInt();
		
		EmployeeDao edao = new EmployeeImpl();
		Employee employee = new Employee(name,gender,address, salary);
		edao.registerEmployee(employee);
	}

}
