package com.project.ecommerce.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.project.ecommerce.service.CategoryService;
import com.project.ecommerce.service.ImageService;
import com.project.ecommerce.service.ImageSliderService;
import com.project.ecommerce.service.ProductService;
import com.project.ecommerce.service.SpecificationService;
import com.project.ecommerce.service.SubcategoryService;
import com.project.ecommerce.service.implementations.CategoryServiceImpl;
import com.project.ecommerce.service.implementations.ImageServiceImpl;
import com.project.ecommerce.service.implementations.ImageSliderServiceImpl;
import com.project.ecommerce.service.implementations.ProductServiceImpl;
import com.project.ecommerce.service.implementations.SpecificationServiceImpl;
import com.project.ecommerce.service.implementations.SubcategoryServiceImpl;

@Configuration
public class ServiceConfig {
	
	@Bean
	CategoryService categoryService() {
		return new CategoryServiceImpl();
	}
	
	@Bean
	SubcategoryService subcategoryService() {
		return new SubcategoryServiceImpl();
	}
	
	@Bean
	ImageService imageService() {
		return new ImageServiceImpl();
	}
	
	@Bean
	ImageSliderService imageSliderService() {
		return new ImageSliderServiceImpl();
	}
	
	@Bean
	SpecificationService specificationService() {
		return new SpecificationServiceImpl();
	}
	
	@Bean
	ProductService productService() {
		return new ProductServiceImpl();
	}
}
