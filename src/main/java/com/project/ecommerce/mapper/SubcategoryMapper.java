package com.project.ecommerce.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.project.ecommerce.dto.SubcategoryRequestDTO;
import com.project.ecommerce.dto.SubcategoryResponseDTO;
import com.project.ecommerce.model.Subcategory;

@Mapper
public interface SubcategoryMapper {
	SubcategoryMapper INSTANCE = Mappers.getMapper(SubcategoryMapper.class);
	
	SubcategoryResponseDTO toSubcategoryResponseDTO(Subcategory subcategory);
	List<SubcategoryResponseDTO> toSubcategoryResponseDTOlist(List<Subcategory> subcategories);
	
	Subcategory toSubcategory(SubcategoryRequestDTO subcategoryRequestDTO);
}
