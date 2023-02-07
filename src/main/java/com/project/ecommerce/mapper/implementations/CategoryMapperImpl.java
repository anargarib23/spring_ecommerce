package com.project.ecommerce.mapper.implementations;

import java.util.LinkedList;
import java.util.List;

import com.project.ecommerce.dto.CategoryRequestDTO;
import com.project.ecommerce.dto.CategoryResponseDTO;
import com.project.ecommerce.mapper.CategoryMapper;
import com.project.ecommerce.model.Category;

public class CategoryMapperImpl implements CategoryMapper {

	@Override
	public CategoryResponseDTO toCategoryResponseDTO(Category category) {
		CategoryResponseDTO categoryResponseDTO = new CategoryResponseDTO();
		categoryResponseDTO.setId(category.getId());
		categoryResponseDTO.setName(category.getName());
		categoryResponseDTO.setSubcategories(category.getSubcategories());
		return categoryResponseDTO;
	}

	@Override
	public List<CategoryResponseDTO> toCategoryResponseDTOlist(List<Category> categories) {
		List<CategoryResponseDTO> categoryResponseDTOlist = new LinkedList<>();
		
		for(Category category : categories) {
			CategoryResponseDTO categoryResponseDTO = toCategoryResponseDTO(category);
			categoryResponseDTOlist.add(categoryResponseDTO);
		}
		
		return categoryResponseDTOlist;
	}

	@Override
	public Category toCategory(CategoryRequestDTO categoryRequestDTO) {
		Category category = new Category();
		category.setName(categoryRequestDTO.getName());
		category.setSubcategories(categoryRequestDTO.getSubcategories());
		return category;
	}

}
