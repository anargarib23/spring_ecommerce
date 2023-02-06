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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ecommerce.dto.SubcategoryRequestDTO;
import com.project.ecommerce.dto.SubcategoryResponseDTO;
import com.project.ecommerce.mapper.SubcategoryMapper;
import com.project.ecommerce.model.Subcategory;
import com.project.ecommerce.service.SubcategoryService;

@RestController
@RequestMapping("/subcategory")
public class SubcategoryController {
	@Autowired
	private SubcategoryMapper subcategoryMapper;
	
	@Autowired
	private SubcategoryService subcategoryService;
	
	@GetMapping("/{id}")
	public SubcategoryResponseDTO getSubcategory(@PathVariable Long id) {
		Subcategory subcategory = subcategoryService.getById(id);
		return subcategoryMapper.toSubcategoryResponseDTO(subcategory);
	}
	
	@GetMapping
	public List<SubcategoryResponseDTO> getAllSubcategories(){
		List<Subcategory> subcategories = subcategoryService.getAll();		
		return subcategoryMapper.toSubcategoryResponseDTOlist(subcategories);
		
	}
	
	@PostMapping
	public ResponseEntity<Void> addSubcategory(@RequestBody SubcategoryRequestDTO request) {
		Subcategory subcategory = subcategoryMapper.toSubcategory(request);
		subcategoryService.add(subcategory);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> updateSubcategory(@RequestBody SubcategoryRequestDTO request, @PathVariable Long id){
		Subcategory subcategory = subcategoryMapper.toSubcategory(request);
		subcategoryService.update(id, subcategory);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteSubcategory(@PathVariable Long id){
		subcategoryService.delete(id);
		return ResponseEntity.ok().build();
	}
}
