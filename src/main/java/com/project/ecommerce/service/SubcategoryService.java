package com.project.ecommerce.service;

import java.util.List;

import com.project.ecommerce.model.Subcategory;

public interface SubcategoryService {
	Subcategory getById(long id);
	List<Subcategory> getAll();
	void delete(long id);
	void update(long id, Subcategory subcategory);
	void add(Subcategory subcategory);
}
