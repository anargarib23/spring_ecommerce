package com.project.ecommerce.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.ecommerce.model.Specification;
import com.project.ecommerce.repository.SpecificationRepository;
import com.project.ecommerce.service.SpecificationService;

public class SpecificationServiceImpl implements SpecificationService{
	
	@Autowired
	private SpecificationRepository specificationRepository;

	@Override
	public Specification getById(long id) {
		return specificationRepository.findById(id).orElse(null);
	}

	@Override
	public List<Specification> getAll() {
		return specificationRepository.findAll();
	}

	@Override
	public void delete(long id) {
		specificationRepository.deleteById(id);
	}

	@Override
	public void update(long id, Specification specification) {
		Specification specificationReference = getById(id);
		
		specificationReference.setName(specification.getName());
		specificationReference.setContent(specification.getContent());
		
		specificationRepository.save(specificationReference);
	}

	@Override
	public void add(Specification specification) {
		specificationRepository.save(specification);
	}

}
