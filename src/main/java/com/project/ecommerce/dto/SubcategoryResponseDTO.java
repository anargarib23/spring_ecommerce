package com.project.ecommerce.dto;

import java.util.List;

import com.project.ecommerce.model.Product;

public class SubcategoryResponseDTO {
	
	private Long id;
	private List<Product> products;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	

}
