package com.project.ecommerce.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="image")
public class Image {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="source")
	private String source;
	
	@Column(name="name")
	private String name;
	
	@Column(name="creation_date")
	private Date creationDate;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name="slider_id")
	private ImageSlider imageSlider;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ImageSlider getImageSlider() {
		return imageSlider;
	}

	public void setImageSlider(ImageSlider imageSlider) {
		this.imageSlider = imageSlider;
	}

	@Override
	public String toString() {
		return "Image [id=" + id + ", source=" + source + ", name=" + name + ", creationDate=" + creationDate + "]";
	}


	
	
}
