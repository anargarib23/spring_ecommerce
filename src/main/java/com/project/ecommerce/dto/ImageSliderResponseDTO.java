package com.project.ecommerce.dto;

import java.util.List;

import com.project.ecommerce.model.Image;

public class ImageSliderResponseDTO {
	private Long id;
	private List<Image> images;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Image> getImages() {
		return images;
	}
	public void setImages(List<Image> images) {
		this.images = images;
	}
	
	
}
