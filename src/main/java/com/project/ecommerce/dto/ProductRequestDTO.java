package com.project.ecommerce.dto;

import java.util.List;

import com.project.ecommerce.model.Image;
import com.project.ecommerce.model.Specification;

public class ProductRequestDTO {
	private String name;
	private Double price;
	private List<Image> images;
	private List<Specification> specification;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public List<Image> getImages() {
		return images;
	}
	public void setImages(List<Image> images) {
		this.images = images;
	}
	public List<Specification> getSpecification() {
		return specification;
	}
	public void setSpecification(List<Specification> specification) {
		this.specification = specification;
	}
	
	
}