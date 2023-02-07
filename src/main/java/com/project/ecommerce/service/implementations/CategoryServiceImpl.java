package com.project.ecommerce.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.ecommerce.model.Category;
import com.project.ecommerce.repository.CategoryRepository;
import com.project.ecommerce.service.CategoryService;

public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category getById(long id) {
		return categoryRepository.findById(id).orElse(null);
	}

	@Override
	public List<Category> getAll() {
		return categoryRepository.findAll();
	}

	@Override
	public void delete(long id) {
		categoryRepository.deleteById(id);
		
	}

	@Override
	public void update(long id, Category category) {
		Category categoryReference = getById(id);
		
		categoryReference.setName(category.getName());
		categoryReference.setSubcategories(category.getSubcategories());
		
		categoryRepository.save(categoryReference);
		
	}

	@Override
	public void add(Category category) {
		categoryRepository.save(category);
	}
	
	
}
