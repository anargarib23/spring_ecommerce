package com.project.ecommerce.service.implementations;

import java.util.List;

import com.project.ecommerce.model.Image;
import com.project.ecommerce.repository.ImageRepository;
import com.project.ecommerce.service.ImageService;

public class ImageServiceImpl implements ImageService{
	
	private ImageRepository imageRepository;

	@Override
	public Image getById(long id) {
		return imageRepository.findById(id).orElse(null);
	}

	@Override
	public List<Image> getAll() {
		return imageRepository.findAll();
	}

	@Override
	public void delete(long id) {
		imageRepository.deleteById(id);		
	}

	@Override
	public void update(long id, Image image) {
		Image imageReference = getById(id);
		
		imageReference.setSource(image.getSource());
		
		imageRepository.save(imageReference);
		
	}

	@Override
	public void add(Image image) {
		imageRepository.save(image);
		
	}

}
