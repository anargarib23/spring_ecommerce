package com.project.ecommerce.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.project.ecommerce.mapper.ImageMapper;
import com.project.ecommerce.mapper.ProductMapper;
import com.project.ecommerce.mapper.implementations.ImageMapperImpl;
import com.project.ecommerce.mapper.implementations.ProductMapperImpl;
import com.project.ecommerce.service.ImageService;
import com.project.ecommerce.service.ProductService;
import com.project.ecommerce.service.implementations.ImageServiceImpl;
import com.project.ecommerce.service.implementations.ProductServiceImpl;

@Configuration
public class Config {
	@Bean
	ImageService imageService() {
		return new ImageServiceImpl();
	}

    @Bean
    ImageMapperImpl imageMapper() {
        return new ImageMapperImpl();
    }
    
    @Bean
    ProductMapper productMapper() {
    	return new ProductMapperImpl();
    }
    
    @Bean
    ProductService productService() {
    	return new ProductServiceImpl();
    }
}
