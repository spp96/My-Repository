package Question_4;

import java.util.*;
public class Demo {
	public static void main(String[] args) {
		List<Product> products =new ArrayList<>();
		
		products.add(new Product(115,"Shoes",8,400));
		products.add(new Product(224,"Oneplue Bullets Z",4,3000));
		products.add(new Product(26,"Sony LED TV",2,45000));
		products.add(new Product(36,"Hp Laptop",8,80000));
		products.add(new Product(12,"Smsung Galaxy M30",11,1100));
		
		Collections.sort(products,(p1,p2)->p1.getPrice()<p2.getPrice()? +1:-1);
		
		for(Product products_names:products) {
			System.out.println(products_names);
		}
	}

}
