package com.project.ecommerce.service;

import java.util.List;

import com.project.ecommerce.model.ImageSlider;

public interface ImageSliderService {
	ImageSlider getById(Long id);
	List<ImageSlider> getAll();
	void delete(Long id);
	void add(ImageSlider imageSlider);
}
