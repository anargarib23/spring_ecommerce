package com.project.ecommerce.service;

import java.util.List;

import com.project.ecommerce.model.Subcategory;

public interface SubcategoryService {
	Subcategory getById(long id);
	List<Subcategory> getAll();
	Subcategory delete(long id);
	Subcategory update(long id, Subcategory subcategory);
	Subcategory add(Subcategory subcategory);
}
