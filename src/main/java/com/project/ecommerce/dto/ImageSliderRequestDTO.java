package com.project.ecommerce.dto;

import java.util.List;

import com.project.ecommerce.model.Image;

public class ImageSliderRequestDTO {
	private List<Image> images;

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}
	
	
}
