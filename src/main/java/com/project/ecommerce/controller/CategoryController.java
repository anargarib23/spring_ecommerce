package com.project.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.ecommerce.dto.CategoryRequestDTO;
import com.project.ecommerce.dto.CategoryResponseDTO;
import com.project.ecommerce.mapper.CategoryMapper;
import com.project.ecommerce.model.Category;
import com.project.ecommerce.service.CategoryService;


@RestController
public class CategoryController {
	@Autowired
	private CategoryMapper categoryMapper;
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/{id}")
	public CategoryResponseDTO getCategory(@PathVariable Long id) {
		Category category = categoryService.getById(id);
		return categoryMapper.toCategoryResponseDTO(category);
	}
	
	@GetMapping
	public List<CategoryResponseDTO> getAllCategories(){
		List<Category> categories = categoryService.getAll();		
		return categoryMapper.toCategoryResponseDTOlist(categories);
		
	}
	
	@PostMapping
	public ResponseEntity<Void> addCategory(@RequestBody CategoryRequestDTO request) {
		Category category = categoryMapper.toCategory(request);
		categoryService.add(category);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> updateCategory(@RequestBody CategoryRequestDTO request, @PathVariable Long id){
		Category category = categoryMapper.toCategory(request);
		categoryService.update(id, category);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCategory(@PathVariable Long id){
		categoryService.delete(id);
		return ResponseEntity.ok().build();
	}
}
