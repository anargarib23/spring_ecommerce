package com.project.ecommerce.mapper;

import java.util.List;

import com.project.ecommerce.dto.ImageRequestDTO;
import com.project.ecommerce.dto.ImageResponseDTO;
import com.project.ecommerce.model.Image;

//@Mapper(componentModel = "spring")
public interface ImageMapper {
//	ImageMapper INSTANCE = Mappers.getMapper(ImageMapper.class);
	
	ImageResponseDTO toImageResponseDTO(Image image);
	List<ImageResponseDTO> toImageResponseDTOlist(List<Image> images);
	
	Image toImage(ImageRequestDTO imageRequestDTO);
}
