package com.project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.ecommerce.model.Specification;

public interface SpecificationRepository extends JpaRepository<Specification, Long> {

}
