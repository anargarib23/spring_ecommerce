package com.project.ecommerce.service;

import java.util.List;

import com.project.ecommerce.model.Product;

public interface ProductService {
	Product getById(long id);
	List<Product> getAll();
	Product delete(long id);
	Product update(long id, Product product);
	Product add(Product product);
 }
