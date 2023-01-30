package com.project.ecommerce.service;

import java.util.List;

import com.project.ecommerce.model.Category;

public interface CategoryService {
	Category getById(long id);
	List<Category> getAll();
	void delete(long id);
	void update(long id, Category category);
	void add(Category category);
}
