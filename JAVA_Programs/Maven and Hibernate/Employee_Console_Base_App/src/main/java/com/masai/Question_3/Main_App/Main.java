package com.masai.Question_3.Main_App;

import java.util.Scanner;

import com.masai.Question_3.Dao.EmployeeDao;
import com.masai.Question_3.Dao.EmployeeImpl;
import com.masai.Question_3.Entities.Employee;
import com.masai.Question_3.Usecases.GetAddressOfEmployee;
import com.masai.Question_3.Usecases.GivenBonusToEmployee;
import com.masai.Question_3.Usecases.RemoveEmployee;
import com.masai.Question_3.Usecases.SavedEmployee;

public class Main {
	public static void main(String[] args) {
		EmployeeDao edao = new EmployeeImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose below options..!");
		System.out.println("1.Save Employee");
		System.out.println("2.Get Address By Employee Id");
		System.out.println("3.Give Bonus To Employee");
		System.out.println("4.Remove Employee");
		int choice = sc.nextInt();
		
		
		switch (choice) {
		case 1:
			SavedEmployee.savenewemp();		
			break;
		case 2:
			GetAddressOfEmployee.geAddressEmp();
			
			break;
		case 3:
			GivenBonusToEmployee.givenBonustoemp();
			break;
		case 4:
			RemoveEmployee.deleteEmployee();
			break;
		default:
			System.out.println("Invalid Entry..!");
			break;
		}
		
				
		

	}


}
