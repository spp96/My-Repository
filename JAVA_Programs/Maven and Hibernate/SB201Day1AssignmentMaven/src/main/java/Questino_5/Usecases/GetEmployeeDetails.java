package Questino_5.Usecases;

import java.util.Scanner;

import Questino_5.Dao.EmployeeDao;
import Questino_5.Dao.EmployeeImpl;
import Questino_5.Entities.Employee;
import Questino_5.Exceptions.EmployeeException;

public class GetEmployeeDetails {

	public static void main(String[] args) throws EmployeeException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID");
		int eid = sc.nextInt();
		
		EmployeeDao edao = new EmployeeImpl();
		edao.getEmployeeById(eid);
	}
}
