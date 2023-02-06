package com.project.ecommerce.mapper.implementations;

import java.util.LinkedList;
import java.util.List;

import com.project.ecommerce.dto.SubcategoryRequestDTO;
import com.project.ecommerce.dto.SubcategoryResponseDTO;
import com.project.ecommerce.mapper.SubcategoryMapper;
import com.project.ecommerce.model.Subcategory;

public class SubcategoryMapperImpl implements SubcategoryMapper {
	
	@Override
	public SubcategoryResponseDTO toSubcategoryResponseDTO(Subcategory subcategory) {
		SubcategoryResponseDTO subcategoryResponseDTO = new SubcategoryResponseDTO();
		subcategoryResponseDTO.setId(subcategory.getId());
		subcategoryResponseDTO.setProducts(subcategory.getProducts());
		return subcategoryResponseDTO;
	}

	@Override
	public List<SubcategoryResponseDTO> toSubcategoryResponseDTOlist(List<Subcategory> subcategories) {
		List<SubcategoryResponseDTO> subcategoryResponseDTOlist = new LinkedList<SubcategoryResponseDTO>();
		
		for(Subcategory subcategory : subcategories) {
			SubcategoryResponseDTO subcategoryResponseDTO = toSubcategoryResponseDTO(subcategory);
			subcategoryResponseDTOlist.add(subcategoryResponseDTO);
		}
		
		return subcategoryResponseDTOlist;
	}

	@Override
	public Subcategory toSubcategory(SubcategoryRequestDTO subcategoryRequestDTO) {
		Subcategory subcategory = new Subcategory();
		subcategory.setProducts(subcategoryRequestDTO.getProducts());
		return subcategory;
	}
}
