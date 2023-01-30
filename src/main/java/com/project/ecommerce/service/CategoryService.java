package com.project.ecommerce.service;

import java.util.List;

import com.project.ecommerce.model.Category;

public interface CategoryService {
	Category getById(long id);
	List<Category> getAll();
	Category delete(long id);
	Category update(long id, Category category);
	Category add(Category category);
}
