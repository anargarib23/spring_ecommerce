package com.project.ecommerce.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.ecommerce.model.ImageSlider;
import com.project.ecommerce.repository.ImageSliderRepository;
import com.project.ecommerce.service.ImageSliderService;

public class ImageSliderServiceImpl implements ImageSliderService {
	
	@Autowired
	private ImageSliderRepository imageSliderRepository;

	@Override
	public ImageSlider getById(Long id) {
		return imageSliderRepository.findById(id).orElse(null);
	}

	@Override
	public List<ImageSlider> getAll() {
		return imageSliderRepository.findAll();
	}

	@Override
	public void add(ImageSlider imageSlider) {
		imageSliderRepository.save(imageSlider);
		
	}

	@Override
	public void delete(Long id) {
		imageSliderRepository.deleteById(id);
		
	}

}
