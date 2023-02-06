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

import com.project.ecommerce.dto.SpecificationRequestDTO;
import com.project.ecommerce.dto.SpecificationResponseDTO;

import com.project.ecommerce.mapper.SpecificationMapper;

import com.project.ecommerce.model.Specification;

import com.project.ecommerce.service.SpecificationService;

@RestController
@RequestMapping("/specification")
public class SpecificationController {
	
	@Autowired
	private SpecificationService specificationService;
	
	@Autowired
	private SpecificationMapper specificationMapper;
	
	@GetMapping("/{id}")
	public SpecificationResponseDTO getSpecification(@PathVariable Long id) {
		Specification specification = specificationService.getById(id);
		return specificationMapper.toSpecificationResponseDTO(specification);
	}
	
	@GetMapping
	public List<SpecificationResponseDTO> getAllSpecifications(){
		List<Specification> specifications = specificationService.getAll();		
		return specificationMapper.toSpecificationResponseDTOlist(specifications);
		
	}
	
	@PostMapping
	public ResponseEntity<Void> addSpecification(@RequestBody SpecificationRequestDTO request) {
		Specification specification = specificationMapper.toSpecification(request);
		specificationService.add(specification);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> updateSpecification(@RequestBody SpecificationRequestDTO request, @PathVariable Long id){
		Specification specification = specificationMapper.toSpecification(request);
		specificationService.update(id, specification);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteSpecification(@PathVariable Long id){
		specificationService.delete(id);
		return ResponseEntity.ok().build();
	}
}
