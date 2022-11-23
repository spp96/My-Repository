package com.masai.Question_3.Usecases;

import java.util.Scanner;

import com.masai.Question_3.Dao.EmployeeDao;
import com.masai.Question_3.Dao.EmployeeImpl;

public class RemoveEmployee {
	public static void deleteEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id:");
		int id = sc.nextInt();
		EmployeeDao edao = new EmployeeImpl();
		edao.deleteEmployee(id);
	}

}
