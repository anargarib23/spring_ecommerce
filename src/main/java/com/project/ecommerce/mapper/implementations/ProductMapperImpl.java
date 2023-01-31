package com.project.ecommerce.mapper.implementations;

import java.util.LinkedList;
import java.util.List;

import com.project.ecommerce.dto.ProductRequestDTO;
import com.project.ecommerce.dto.ProductResponseDTO;
import com.project.ecommerce.mapper.ProductMapper;
import com.project.ecommerce.model.Product;

public class ProductMapperImpl implements ProductMapper{

	@Override
	public ProductResponseDTO toProductResponseDTO(Product product) {
		ProductResponseDTO productResponseDTO = new ProductResponseDTO();
		productResponseDTO.setId(product.getId());
		productResponseDTO.setName(product.getName());
		productResponseDTO.setPrice(product.getPrice());
		productResponseDTO.setImages(product.getImages());
		productResponseDTO.setSpecifications(product.getSpecifications());
		return productResponseDTO;
	}

	@Override
	public List<ProductResponseDTO> toProductResponseDTOlist(List<Product> products) {
		List<ProductResponseDTO> productResponseDTOlist = new LinkedList<ProductResponseDTO>();
		
		for(Product product : products) {
			ProductResponseDTO productResponseDTO = toProductResponseDTO(product);
			productResponseDTOlist.add(productResponseDTO);
		}
		
		return productResponseDTOlist;
	}

	@Override
	public Product toProduct(ProductRequestDTO productRequestDTO) {
		Product product = new Product();
		product.setName(productRequestDTO.getName());
		product.setPrice(productRequestDTO.getPrice());
		product.setImages(productRequestDTO.getImages());
		product.setSpecifications(productRequestDTO.getSpecification());
		return product;
	}

}
