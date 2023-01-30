package com.project.ecommerce.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.project.ecommerce.dto.CategoryRequestDTO;
import com.project.ecommerce.dto.CategoryResponseDTO;
import com.project.ecommerce.model.Category;

@Mapper
public interface CategoryMapper {
	CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);
	
	CategoryResponseDTO toCategoryResponseDTO(Category category);
	List<CategoryResponseDTO> toCategoryResponseDTOlist(List<Category> categories);
	
	Category toCategory(CategoryRequestDTO categoryRequestDTO);
}
