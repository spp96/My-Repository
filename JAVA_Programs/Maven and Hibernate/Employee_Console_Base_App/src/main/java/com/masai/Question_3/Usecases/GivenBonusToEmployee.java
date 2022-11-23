package com.masai.Question_3.Usecases;

import java.util.Scanner;

import com.masai.Question_3.Dao.EmployeeDao;
import com.masai.Question_3.Dao.EmployeeImpl;

public class GivenBonusToEmployee {

	public static void givenBonustoemp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id:");
		int id = sc.nextInt();
		System.out.println("Enter Bonus Amount:");
		int bonus = sc.nextInt();
		EmployeeDao edao = new EmployeeImpl();
	    String message = edao.giveBonusToEmployee(id, bonus);
		System.out.println(message);
	}
}
