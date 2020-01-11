package com.dao;

import java.util.List;

import com.model.Product;

public interface ProductDao {

	public boolean addProduct(Product product);
	public List<Product> listProducts();
}
