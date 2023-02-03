package com.project.ecommerce.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.ecommerce.model.Product;
import com.project.ecommerce.repository.ProductRepository;
import com.project.ecommerce.service.ProductService;

public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product getById(long id) {
		return productRepository.findById(id).orElse(null);
	}

	@Override
	public List<Product> getAll() {
		return productRepository.findAll();
	}

	@Override
	public void delete(long id) {
		productRepository.deleteById(id);
	}

	@Override
	public void update(long id, Product product) {
		Product productReference = getById(id);
		
		productReference.setImages(product.getImages());
		productReference.setName(product.getName());
		productReference.setPrice(product.getPrice());
		productReference.setSpecifications(product.getSpecifications());
		
		productRepository.save(productReference);
	}

	@Override
	public void add(Product product) {
		productRepository.save(product);
	}

}
