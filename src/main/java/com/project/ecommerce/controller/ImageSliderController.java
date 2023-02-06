package com.project.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.ecommerce.service.ImageSliderService;

public class ImageSliderController {
	
	@Autowired
	private ImageSliderMapper imageSliderMapper;
	
	@Autowired
	private ImageSliderService imageSliderService;

}
