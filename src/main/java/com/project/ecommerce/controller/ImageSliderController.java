package com.project.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ecommerce.dto.ImageSliderRequestDTO;
import com.project.ecommerce.dto.ImageSliderResponseDTO;

import com.project.ecommerce.mapper.ImageSliderMapper;
import com.project.ecommerce.model.ImageSlider;

import com.project.ecommerce.service.ImageSliderService;

@RestController
@RequestMapping("/image-slider")
public class ImageSliderController {
	
	@Autowired
	private ImageSliderMapper imageSliderMapper;
	
	@Autowired
	private ImageSliderService imageSliderService;
	
	@GetMapping("/{id}")
	public ImageSliderResponseDTO getImageSlider(@PathVariable Long id) {
		ImageSlider imageSlider = imageSliderService.getById(id);
		return imageSliderMapper.toImageSliderResponseDTO(imageSlider);
	}
	
	@GetMapping
	public List<ImageSliderResponseDTO> getAllImageSliders(){
		List<ImageSlider> imageSliders = imageSliderService.getAll();		
		return imageSliderMapper.toImageSliderResponseDTOlist(imageSliders);
		
	}
	
	@PostMapping
	public ResponseEntity<Void> addImageSlider(@RequestBody ImageSliderRequestDTO request) {
		ImageSlider imageSlider = imageSliderMapper.toImageSlider(request);
		imageSliderService.add(imageSlider);
		return ResponseEntity.ok().build();
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteImageSlider(@PathVariable Long id){
		imageSliderService.delete(id);
		return ResponseEntity.ok().build();
	}
	

}
