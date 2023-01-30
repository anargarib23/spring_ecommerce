package com.project.ecommerce.service;

import java.util.List;

import com.project.ecommerce.model.Specification;

public interface SpecificationService {
	Specification getById(long id);
	List<Specification> getAll();
	void delete(long id);
	void update(long id, Specification specification);
	void add(Specification specification);
}
