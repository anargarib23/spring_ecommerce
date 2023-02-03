package com.project.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ecommerce.dto.ImageRequestDTO;
import com.project.ecommerce.dto.ImageResponseDTO;
import com.project.ecommerce.mapper.ImageMapper;
import com.project.ecommerce.model.Image;
import com.project.ecommerce.service.ImageService;

@RestController
@RequestMapping("/image")
public class ImageController {
	
	@Autowired
	private ImageMapper imageMapper;
	
	@Autowired
	private ImageService imageService;
	
	@GetMapping("/{id}")
	private ImageResponseDTO getImage(@PathVariable Long id) {
		Image image = imageService.getById(id);
		return imageMapper.toImageResponseDTO(image);
	}
	
	@GetMapping
	private List<ImageResponseDTO> getAllImages(){
		List<Image> images = imageService.getAll();
		return imageMapper.toImageResponseDTOlist(images);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteImage(@PathVariable Long id) {
		imageService.delete(id);
		return ResponseEntity.ok().build();
	}
	
	@PostMapping
	public ResponseEntity<Void> addImage(@RequestBody ImageRequestDTO request){
		Image image = imageMapper.toImage(request);
		imageService.add(image);
		return ResponseEntity.ok().build();
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> updateImage(@RequestBody ImageRequestDTO request, @PathVariable Long id){
		Image image = imageMapper.toImage(request);
		imageService.update(id, image);
		return ResponseEntity.ok().build();
		
	}
}
