package com.project.ecommerce.service;

import java.util.List;

import com.project.ecommerce.model.ImageSlider;

public interface ImageSliderService {
	ImageSlider getById(long id);
	List<ImageSlider> getAll();
	void delete(long id);
	void update(long id, ImageSlider imageSlider);
	void add(ImageSlider imageSlider);
}
