package usercases;

import java.util.Scanner;

import dao.EmployeeDao;
import dao.EmployeeImpl;
import model.Employee;

public class InsertEmployee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter EmployeeID");
		int eid=sc.nextInt();
		
		System.out.println("Enter Name");
		String name=sc.next();

		System.out.println("Enter Address");
		String address=sc.next();

		System.out.println("Enter Salary");
		int salary=sc.nextInt();

		EmployeeDao dao= new EmployeeImpl();
		
		Employee emp = new Employee(eid, name, address, salary);
		String result= dao.insertEmployee(emp);
		System.out.println(result);
		
	}

}
