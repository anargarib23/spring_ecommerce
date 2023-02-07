package com.project.ecommerce.dto;

import java.util.List;

import com.project.ecommerce.model.Subcategory;

public class CategoryRequestDTO {
	
	private String name;
	private List<Subcategory> subcategories;

	public List<Subcategory> getSubcategories() {
		return subcategories;
	}

	public void setSubcategories(List<Subcategory> subcategories) {
		this.subcategories = subcategories;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
