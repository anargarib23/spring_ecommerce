package com.project.ecommerce.dto;

import java.util.List;

import com.project.ecommerce.model.Subcategory;

public class CategoryResponseDTO {
	
	private Long id;
	private String name;
	private List<Subcategory> subcategories;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
