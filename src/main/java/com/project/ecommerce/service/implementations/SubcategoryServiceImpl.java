package com.project.ecommerce.service.implementations;

import java.util.List;

import com.project.ecommerce.model.Subcategory;
import com.project.ecommerce.repository.SubcategoryRepository;
import com.project.ecommerce.service.SubcategoryService;

public class SubcategoryServiceImpl implements SubcategoryService{
	
	private SubcategoryRepository subcategoryRepository;

	@Override
	public Subcategory getById(long id) {
		return subcategoryRepository.findById(id).orElse(null);
	}

	@Override
	public List<Subcategory> getAll() {
		return subcategoryRepository.findAll();
	}

	@Override
	public void delete(long id) {
		subcategoryRepository.deleteById(id);
		
	}

	@Override
	public void update(long id, Subcategory subcategory) {
		Subcategory subcategoryReference = getById(id);
		
		subcategoryReference.setName(subcategory.getName());
		subcategoryReference.setProducts(subcategory.getProducts());
		
		subcategoryRepository.save(subcategoryReference);
		
	}

	@Override
	public void add(Subcategory subcategory) {
		subcategoryRepository.save(subcategory);
	}

}
