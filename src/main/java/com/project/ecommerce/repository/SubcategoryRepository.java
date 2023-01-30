package com.project.ecommerce.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.project.ecommerce.model.Subcategory;

public interface SubcategoryRepository extends JpaRepository<Subcategory, Long> {

}
