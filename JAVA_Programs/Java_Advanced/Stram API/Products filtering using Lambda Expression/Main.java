package Question_1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Product>products= new ArrayList<>();;
		products.add(new Product(1, "Shirt", 300, 30));
		products.add(new Product(2, "Jeans", 1250, 24));
		products.add(new Product(3, "Kurta's", 450, 8));
		products.add(new Product(4, "Sherwani", 4000, 5));
		products.add(new Product(5, "T-Shirt", 550, 45));
		
		System.out.println("===========Product List==========>");
		System.out.println(products);
		System.out.println("===========Product List Ended==========>");
		
		System.out.println("=============Filter by Qty List==========>");
		List<Product>newProducts_list=products
				                             .stream()
				                             .filter(s -> s.getQuantity()>10)
				                             .collect(Collectors.toList());
		newProducts_list.forEach(s -> System.out.println(s));		
		System.out.println("===========Product List Ended==========>");
		
		System.out.println("===========Sorted by Price==========>");
		
		newProducts_list.sort((o1, o2) -> o1.getPrice() < o2.getPrice() ? 1: -1);
		newProducts_list.forEach(s -> System.out.println(s));
		System.out.println("===========Product List Ended==========>");
		
		System.out.println("===========Original Product List==============");
		
		products.forEach(t -> {
			
			System.out.println("Product Id:-"+t.getProductId());
			System.out.println("Product Name:-"+t.getProductName());
			System.out.println("Product Price:-"+t.getPrice());
			System.out.println("Product Quantity:-"+t.getQuantity());
			
		});
	
		System.out.println("===========Original Product List Ended==========>");
		System.out.println("NewProduct List Based On Filter Qty==========>");
		newProducts_list.forEach(t -> {
			
			System.out.println("Product Id:- "+t.getProductId());
			System.out.println("Product Name:- "+t.getProductName());
			System.out.println("Product Price:- "+t.getPrice());
			System.out.println("Product Quantity:-"+t.getQuantity());
		});
		System.out.println("===========NewProduct List Ended==========>");
		
	
	}


}
