package com.project.ecommerce.service;

import java.util.List;

import com.project.ecommerce.model.Specification;

public interface SpecificationService {
	Specification getById(long id);
	List<Specification> getAll();
	Specification delete(long id);
	Specification update(long id, Specification specification);
	Specification add(Specification specification);
}
