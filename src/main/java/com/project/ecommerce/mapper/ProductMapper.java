package com.project.ecommerce.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


import com.project.ecommerce.dto.ProductRequestDTO;
import com.project.ecommerce.dto.ProductResponseDTO;
import com.project.ecommerce.model.Product;

@Mapper
public interface ProductMapper {
	ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
	
	ProductResponseDTO toProductResponseDTO(Product product);
	List<ProductResponseDTO> toProductResponseDTOlist(List<Product> products);
	
	Product toProduct(ProductRequestDTO productRequestDTO);
}
