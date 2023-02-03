package com.project.ecommerce.mapper;

import java.util.List;

import com.project.ecommerce.dto.ImageRequestDTO;
import com.project.ecommerce.dto.ImageResponseDTO;
import com.project.ecommerce.model.Image;

public interface ImageSliderMapper {
//	ImageMapper INSTANCE = Mappers.getMapper(ImageMapper.class);
	
	ImageSliderResponseDTO toImageSliderResponseDTO(ImageSlider imageSlider);
	List<ImageSliderResponseDTO> toImageSliderResponseDTOlist(List<ImageSlider> imageSliders);
	
	ImageSlider toImageSlider(ImageSliderRequestDTO imageSliderRequestDTO);
}
