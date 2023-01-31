package com.project.ecommerce.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.project.ecommerce.mapper.ImageMapper;
import com.project.ecommerce.mapper.implementations.ImageMapperImpl;
import com.project.ecommerce.service.ImageService;
import com.project.ecommerce.service.implementations.ImageServiceImpl;

@Configuration
public class Config {
	@Bean
	public ImageService imageService() {
		return new ImageServiceImpl();
	}

    @Bean
    public ImageMapperImpl imageMapper() {
        return new ImageMapperImpl();
    }
}
