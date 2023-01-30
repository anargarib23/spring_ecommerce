package com.project.ecommerce.dto;

import java.util.List;

import com.project.ecommerce.model.Subcategory;

public class CategoryRequestDTO {
	private List<Subcategory> subcategories;

	public List<Subcategory> getSubcategories() {
		return subcategories;
	}

	public void setSubcategories(List<Subcategory> subcategories) {
		this.subcategories = subcategories;
	}
	
	
}
