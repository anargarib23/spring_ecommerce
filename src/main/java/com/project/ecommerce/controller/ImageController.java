package com.project.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.project.ecommerce.dto.ImageResponseDTO;
import com.project.ecommerce.dto.ImageSliderRequestDTO;
import com.project.ecommerce.dto.ImageSliderResponseDTO;
import com.project.ecommerce.mapper.ImageMapper;
import com.project.ecommerce.mapper.ImageSliderMapper;
import com.project.ecommerce.model.Image;
import com.project.ecommerce.model.ImageSlider;
import com.project.ecommerce.service.ImageService;
import com.project.ecommerce.service.ImageSliderService;

@RestController
public class ImageController {
	
	@Autowired
	private ImageMapper imageMapper;
	@Autowired
	private ImageSliderMapper imageSliderMapper;
	
	@Autowired
	private ImageService imageService;
	@Autowired
	private ImageSliderService imageSliderService;
	
	@GetMapping("image/{id}")
	private ImageResponseDTO getImage(@PathVariable Long id) {
		Image image = imageService.getById(id);
		return imageMapper.toImageResponseDTO(image);
	}
	
	@GetMapping("image/all")
	private List<ImageResponseDTO> getAllImages(){
		List<Image> images = imageService.getAll();
		return imageMapper.toImageResponseDTOlist(images);
	}
	
	@DeleteMapping("image/delete/{id}")
	public ResponseEntity<Void> deleteImage(@PathVariable Long id) {
		imageService.delete(id);
		return ResponseEntity.ok().build();
	}
	
	@PostMapping("image/add")
	public ResponseEntity<String> addImage(@RequestParam("file") MultipartFile file){
		try {
			imageService.add(file);
			return ResponseEntity.status(HttpStatus.OK).body("Image Added: " + file.getOriginalFilename());
		} catch(Exception e) {
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("Error occurred: " + e.getMessage());
		}	
		
	}
	
	@GetMapping("image-slider/{id}")
	public ImageSliderResponseDTO getImageSlider(@PathVariable Long id) {
		ImageSlider imageSlider = imageSliderService.getById(id);
		return imageSliderMapper.toImageSliderResponseDTO(imageSlider);
	}
	
	@GetMapping("image-slider/all")
	public List<ImageSliderResponseDTO> getAllImageSliders(){
		List<ImageSlider> imageSliders = imageSliderService.getAll();		
		return imageSliderMapper.toImageSliderResponseDTOlist(imageSliders);
		
	}
	
	@PostMapping("image-slider/add")
	public ResponseEntity<Void> addImageSlider(@RequestBody ImageSliderRequestDTO request) {
		ImageSlider imageSlider = imageSliderMapper.toImageSlider(request);
		imageSliderService.add(imageSlider);
		return ResponseEntity.ok().build();
	}
	
	
	@DeleteMapping("image-slider/delete")
	public ResponseEntity<Void> deleteImageSlider(@PathVariable Long id){
		imageSliderService.delete(id);
		return ResponseEntity.ok().build();
	}
	
	
}
