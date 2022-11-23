package com.masai.Question_1.Dao;

import com.masai.Question_1.Dao.Entities.Product;

public interface ProductDao {
	public String AddProducts(Product pro);
	public Product getProductById(int proId);
}
  