package com.masai.Question_1.Dao.Usecases;

import java.util.Scanner;

import com.masai.Question_1.Dao.ProductDao;
import com.masai.Question_1.Dao.ProductsImpl;
import com.masai.Question_1.Dao.Entities.Product;

public class AddProducts {
	public static void addpro(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product ID:");
		int pid = sc.nextInt();
		System.out.println("Enter Product Name:");
		String name = sc.next();
		System.out.println("Enter Product Quantity:");
		int pqty = sc.nextInt();
		System.out.println("Enter Product Price:");
		int pprice = sc.nextInt();
		
		ProductDao prodao = new ProductsImpl();
		Product products = new Product(pid,name,pqty,pprice);
		prodao.AddProducts(products);
	}
}
