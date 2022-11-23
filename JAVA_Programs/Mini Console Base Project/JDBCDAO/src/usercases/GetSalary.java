package usercases;

import java.util.Scanner;

import dao.EmployeeDao;
import dao.EmployeeImpl;

public class GetSalary {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter EmployeeID :");
		
		int eid= sc.nextInt(); 
		
		EmployeeDao dao= new EmployeeImpl();
		
		int salary= dao.getSalaryByID(eid);
		
		if(salary>=0) 
			System.out.println("Salary is "+salary);
		
		else
			System.out.println("Employee Does not Exist ");

	}

}
