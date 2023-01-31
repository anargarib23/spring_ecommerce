package com.project.ecommerce.dto;

import lombok.Builder;

@Builder
public class ImageResponseDTO {
	
	private Long id;
	private String source;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
