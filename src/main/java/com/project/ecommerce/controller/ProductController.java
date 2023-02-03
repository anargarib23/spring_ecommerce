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

import com.project.ecommerce.dto.ProductRequestDTO;
import com.project.ecommerce.dto.ProductResponseDTO;
import com.project.ecommerce.mapper.ProductMapper;
import com.project.ecommerce.model.Product;
import com.project.ecommerce.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductMapper productMapper;
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/{id}")
	public ProductResponseDTO getProduct(@PathVariable Long id) {
		Product product = productService.getById(id);
		return productMapper.toProductResponseDTO(product);
	}
	
	@GetMapping
	public List<ProductResponseDTO> getAllProducts(){
		List<Product> products = productService.getAll();		
		return productMapper.toProductResponseDTOlist(products);
		
	}
	
	@PostMapping
	public ResponseEntity<Void> addProduct(@RequestBody ProductRequestDTO request) {
		Product product = productMapper.toProduct(request);
		productService.add(product);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> updateProduct(@RequestBody ProductRequestDTO request, @PathVariable Long id){
		Product product = productMapper.toProduct(request);
		productService.update(id, product);
		return ResponseEntity.ok().build();
	}
	
}
