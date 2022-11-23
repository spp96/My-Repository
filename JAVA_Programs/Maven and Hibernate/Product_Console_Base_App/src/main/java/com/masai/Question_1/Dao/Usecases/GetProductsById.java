package com.masai.Question_1.Dao.Usecases;

import java.util.Scanner;

import com.masai.Question_1.Dao.ProductDao;
import com.masai.Question_1.Dao.ProductsImpl;
import com.masai.Question_1.Dao.Entities.Product;

public class GetProductsById {
	public static void getProduct() {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID");
		int pid = sc.nextInt();
		
		ProductDao prodao = new ProductsImpl();
		prodao.getProductById(pid);
	}

}
