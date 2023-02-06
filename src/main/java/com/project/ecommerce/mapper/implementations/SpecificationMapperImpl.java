package com.project.ecommerce.mapper.implementations;

import java.util.LinkedList;
import java.util.List;

import com.project.ecommerce.dto.SpecificationRequestDTO;
import com.project.ecommerce.dto.SpecificationResponseDTO;
import com.project.ecommerce.mapper.SpecificationMapper;
import com.project.ecommerce.model.Specification;

public class SpecificationMapperImpl implements SpecificationMapper {

	@Override
	public SpecificationResponseDTO toSpecificationResponseDTO(Specification specification) {
		SpecificationResponseDTO specificationResponseDTO = new SpecificationResponseDTO();
		specificationResponseDTO.setId(specification.getId());
		specificationResponseDTO.setName(specification.getName());
		specificationResponseDTO.setContent(specification.getContent());
		return specificationResponseDTO;
	}

	@Override
	public List<SpecificationResponseDTO> toSpecificationResponseDTOlist(List<Specification> specifications) {
		List<SpecificationResponseDTO> specificationResponseDTOlist = new LinkedList<>();
		
		for(Specification specification : specifications) {
			SpecificationResponseDTO specificationResponseDTO = toSpecificationResponseDTO(specification);
			specificationResponseDTOlist.add(specificationResponseDTO);
		}
		return specificationResponseDTOlist;
	}

	@Override
	public Specification toSpecification(SpecificationRequestDTO specificationRequestDTO) {
		Specification specification = new Specification();
		specification.setName(specificationRequestDTO.getName());
		specification.setContent(specificationRequestDTO.getContent());
		return specification;
	}

}
