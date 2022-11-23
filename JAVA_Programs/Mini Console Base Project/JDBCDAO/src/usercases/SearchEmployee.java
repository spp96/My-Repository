package usercases;

import java.util.Scanner;

import dao.EmployeeDao;
import dao.EmployeeImpl;
import model.Employee;

public class SearchEmployee {
	
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        
        System.out.println("Enter EmployeeID :");
		
		int eid= sc.nextInt(); 
		
		EmployeeDao dao= new EmployeeImpl();
		
		Employee employee= dao.getEmployeeByID(eid);
		
		if (employee!=null)
			System.out.println(employee);
		else
			System.out.println("Does not found eid "+eid);
		
	}
}
