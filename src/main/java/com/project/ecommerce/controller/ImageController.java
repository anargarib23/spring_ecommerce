package com.project.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.ecommerce.dto.ImageResponseDTO;
import com.project.ecommerce.mapper.ImageMapper;
import com.project.ecommerce.service.ImageService;
import com.project.ecommerce.service.implementations.ImageServiceImpl;

@RestController
public class ImageController {
	
	@Autowired
	private ImageService imageService;
	
	@GetMapping("/image/{id}")
	public String getImage(@PathVariable long id) {
		return "<img src="+ imageService.getById(id).getSource() + "/>";
	}
}
