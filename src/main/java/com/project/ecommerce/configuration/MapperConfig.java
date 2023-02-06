package com.project.ecommerce.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.project.ecommerce.mapper.CategoryMapper;
import com.project.ecommerce.mapper.ImageMapper;
import com.project.ecommerce.mapper.ImageSliderMapper;
import com.project.ecommerce.mapper.ProductMapper;
import com.project.ecommerce.mapper.SpecificationMapper;
import com.project.ecommerce.mapper.SubcategoryMapper;
import com.project.ecommerce.mapper.implementations.CategoryMapperImpl;
import com.project.ecommerce.mapper.implementations.ImageMapperImpl;
import com.project.ecommerce.mapper.implementations.ImageSliderMapperImpl;
import com.project.ecommerce.mapper.implementations.ProductMapperImpl;
import com.project.ecommerce.mapper.implementations.SpecificationMapperImpl;
import com.project.ecommerce.mapper.implementations.SubcategoryMapperImpl;

@Configuration
public class MapperConfig {
	
	@Bean
	CategoryMapper categoryMapper() {
		return new CategoryMapperImpl();
	}
	
	@Bean
	SubcategoryMapper subcategoryMapper() {
		return new SubcategoryMapperImpl();
	}
	
	@Bean
	ProductMapper productMapper() {
		return new ProductMapperImpl();
	}
	
	@Bean
	ImageMapper imageMapper() {
		return new ImageMapperImpl();
	}
	
	@Bean
	ImageSliderMapper imageSliderMapper() {
		return new ImageSliderMapperImpl();
	}
	
	@Bean
	SpecificationMapper specificationMapper() {
		return new SpecificationMapperImpl();
	}
 }
