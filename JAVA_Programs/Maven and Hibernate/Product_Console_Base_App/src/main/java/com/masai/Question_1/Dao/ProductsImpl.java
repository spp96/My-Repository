package com.masai.Question_1.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.Question_1.Dao.Entities.Product;

public class ProductsImpl implements ProductDao {

	@Override
	public String AddProducts(Product pro) {
        String message = "Not Inserted.....";
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empUnit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(pro);
		em.getTransaction().commit();
		System.out.println("Product Added Successfully..");
		em.close();
		return message;
	}

	@Override
	public Product getProductById(int proId) {
       Product message = null;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empUnit");
		EntityManager em = emf.createEntityManager();
		
		Product emp = em.find(Product.class, proId);
		
		if(emp !=null) {
			System.out.println(emp);
		} else {
			System.out.println("Product Not Found..");
			
		}
		em.close();
		return message;
	}


}