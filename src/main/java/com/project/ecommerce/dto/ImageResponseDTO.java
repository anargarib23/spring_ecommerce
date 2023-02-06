package com.project.ecommerce.dto;

import java.util.Date;

import lombok.Builder;

@Builder
public class ImageResponseDTO {
	
	private Long id;
	private String source;
	private String name;
	private Date creatioDate;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatioDate() {
		return creatioDate;
	}

	public void setCreatioDate(Date creatioDate) {
		this.creatioDate = creatioDate;
	}
	
	
	
}
