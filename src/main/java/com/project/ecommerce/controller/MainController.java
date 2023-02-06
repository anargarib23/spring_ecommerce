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
import com.project.ecommerce.dto.ProductRequestDTO;
import com.project.ecommerce.dto.ProductResponseDTO;
import com.project.ecommerce.dto.SpecificationRequestDTO;
import com.project.ecommerce.dto.SpecificationResponseDTO;
import com.project.ecommerce.dto.SubcategoryRequestDTO;
import com.project.ecommerce.dto.SubcategoryResponseDTO;
import com.project.ecommerce.mapper.CategoryMapper;
import com.project.ecommerce.mapper.ProductMapper;
import com.project.ecommerce.mapper.SpecificationMapper;
import com.project.ecommerce.mapper.SubcategoryMapper;
import com.project.ecommerce.model.Category;
import com.project.ecommerce.model.Product;
import com.project.ecommerce.model.Specification;
import com.project.ecommerce.model.Subcategory;
import com.project.ecommerce.service.CategoryService;
import com.project.ecommerce.service.ProductService;
import com.project.ecommerce.service.SpecificationService;
import com.project.ecommerce.service.SubcategoryService;

@RestController
public class MainController {	
	
	/* Mappers */
	
	@Autowired
	private CategoryMapper categoryMapper;
	@Autowired
	private SubcategoryMapper subcategoryMapper;
	@Autowired
	private ProductMapper productMapper;
	@Autowired
	private SpecificationMapper specificationMapper;
	
	/* Services */
	
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private SubcategoryService subcategoryService;
	@Autowired
	private ProductService productService;
	@Autowired
	private SpecificationService specificationService;
	
	@GetMapping("category/{id}")
	public CategoryResponseDTO getCategory(@PathVariable Long id) {
		Category category = categoryService.getById(id);
		return categoryMapper.toCategoryResponseDTO(category);
	}
	
	@GetMapping("category/all")
	public List<CategoryResponseDTO> getAllCategories(){
		List<Category> categories = categoryService.getAll();		
		return categoryMapper.toCategoryResponseDTOlist(categories);
		
	}
	
	@PostMapping("category/add")
	public ResponseEntity<Void> addCategory(@RequestBody CategoryRequestDTO request) {
		Category category = categoryMapper.toCategory(request);
		categoryService.add(category);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("category/update/{id}")
	public ResponseEntity<Void> updateCategory(@RequestBody CategoryRequestDTO request, @PathVariable Long id){
		Category category = categoryMapper.toCategory(request);
		categoryService.update(id, category);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("category/delete/{id}")
	public ResponseEntity<Void> deleteCategory(@PathVariable Long id){
		categoryService.delete(id);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("subcategory/{id}")
	public SubcategoryResponseDTO getSubcategory(@PathVariable Long id) {
		Subcategory subcategory = subcategoryService.getById(id);
		return subcategoryMapper.toSubcategoryResponseDTO(subcategory);
	}
	
	@GetMapping("subcategory/all")
	public List<SubcategoryResponseDTO> getAllSubcategories(){
		List<Subcategory> subcategories = subcategoryService.getAll();		
		return subcategoryMapper.toSubcategoryResponseDTOlist(subcategories);
		
	}
	
	@PostMapping("subcategory/add")
	public ResponseEntity<Void> addSubcategory(@RequestBody SubcategoryRequestDTO request) {
		Subcategory subcategory = subcategoryMapper.toSubcategory(request);
		subcategoryService.add(subcategory);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("subcategory/update/{id}")
	public ResponseEntity<Void> updateSubcategory(@RequestBody SubcategoryRequestDTO request, @PathVariable Long id){
		Subcategory subcategory = subcategoryMapper.toSubcategory(request);
		subcategoryService.update(id, subcategory);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("subcategory/delete/{id}")
	public ResponseEntity<Void> deleteSubcategory(@PathVariable Long id){
		subcategoryService.delete(id);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("product/{id}")
	public ProductResponseDTO getProduct(@PathVariable Long id) {
		Product product = productService.getById(id);
		return productMapper.toProductResponseDTO(product);
	}
	
	@GetMapping("product/all")
	public List<ProductResponseDTO> getAllProducts(){
		List<Product> products = productService.getAll();		
		return productMapper.toProductResponseDTOlist(products);
		
	}
	
	@PostMapping("product/add")
	public ResponseEntity<Void> addProduct(@RequestBody ProductRequestDTO request) {
		Product product = productMapper.toProduct(request);
		productService.add(product);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("product/update/{id}")
	public ResponseEntity<Void> updateProduct(@RequestBody ProductRequestDTO request, @PathVariable Long id){
		Product product = productMapper.toProduct(request);
		productService.update(id, product);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("product/delete/{id}")
	public ResponseEntity<Void> deleteProduct(@PathVariable Long id){
		productService.delete(id);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("specification/{id}")
	public SpecificationResponseDTO getSpecification(@PathVariable Long id) {
		Specification specification = specificationService.getById(id);
		return specificationMapper.toSpecificationResponseDTO(specification);
	}
	
	@GetMapping("specification/all")
	public List<SpecificationResponseDTO> getAllSpecifications(){
		List<Specification> specifications = specificationService.getAll();		
		return specificationMapper.toSpecificationResponseDTOlist(specifications);
		
	}
	
	@PostMapping("specification/add")
	public ResponseEntity<Void> addSpecification(@RequestBody SpecificationRequestDTO request) {
		Specification specification = specificationMapper.toSpecification(request);
		specificationService.add(specification);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("specification/update/{id}")
	public ResponseEntity<Void> updateSpecification(@RequestBody SpecificationRequestDTO request, @PathVariable Long id){
		Specification specification = specificationMapper.toSpecification(request);
		specificationService.update(id, specification);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("specification/delete/{id}")
	public ResponseEntity<Void> deleteSpecification(@PathVariable Long id){
		specificationService.delete(id);
		return ResponseEntity.ok().build();
	}
}
