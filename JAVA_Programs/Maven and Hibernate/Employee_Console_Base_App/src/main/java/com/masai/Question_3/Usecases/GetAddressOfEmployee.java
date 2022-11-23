package com.masai.Question_3.Usecases;

import java.util.Scanner;

import com.masai.Question_3.Dao.EmployeeDao;
import com.masai.Question_3.Dao.EmployeeImpl;

public class GetAddressOfEmployee {
	public static void geAddressEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id:");
		int id = sc.nextInt();
		EmployeeDao edao = new EmployeeImpl();
        String message = edao.getAddressOfEmployee(id);
        System.out.println(message);
	}

}
