package com.masai.Question_1.Dao.Main_App;

import java.util.Scanner;

import com.masai.Question_1.Dao.Usecases.AddProducts;
import com.masai.Question_1.Dao.Usecases.GetProductsById;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose below options..!");
		System.out.println("1.Add Products");
		System.out.println("2.Get Product By Product Id");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			AddProducts.addpro();
			break;
		case 2:
			GetProductsById.getProduct();
			break;
		default:
			System.out.println("Invalid Entry..!");
			break;
		}
		
				
		

	}
}
