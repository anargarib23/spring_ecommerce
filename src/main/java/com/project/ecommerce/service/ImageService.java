package com.project.ecommerce.service;

import java.util.List;

import com.project.ecommerce.model.Image;

public interface ImageService {
	Image getById(long id);
	List<Image> getAll();
	void delete(long id);
	void add(Image image);
}
