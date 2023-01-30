package com.project.ecommerce.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.project.ecommerce.dto.SpecificationRequestDTO;
import com.project.ecommerce.dto.SpecificationResponseDTO;
import com.project.ecommerce.model.Specification;

@Mapper
public interface SpecificationMapper {
	SpecificationMapper INSTANCE = Mappers.getMapper(SpecificationMapper.class);
	
	SpecificationResponseDTO toSpecificationResponseDTO(Specification specification);
	List<SpecificationResponseDTO> toSpecificationResponseDTOlist(List<Specification> specifications);
	
	Specification toSpecification(SpecificationRequestDTO specificationRequestDTO);
}
