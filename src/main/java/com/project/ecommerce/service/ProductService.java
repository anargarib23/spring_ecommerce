package com.project.ecommerce.service;

import java.util.List;

import com.project.ecommerce.model.Product;

public interface ProductService {
	Product getById(long id);
	List<Product> getAll();
	void delete(long id);
	void update(long id, Product product);
	void add(Product product);
 }
