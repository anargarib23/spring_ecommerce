package com.project.ecommerce.service;

import java.util.List;

import com.project.ecommerce.model.Image;

public interface ImageService {
	Image getById(long id);
	List<Image> getAll();
	Image delete(long id);
	Image update(long id, Image image);
	Image add(Image image);
}
