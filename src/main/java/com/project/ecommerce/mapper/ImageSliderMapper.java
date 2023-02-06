package com.project.ecommerce.mapper;

import java.util.List;

import com.project.ecommerce.dto.ImageSliderRequestDTO;
import com.project.ecommerce.dto.ImageSliderResponseDTO;
import com.project.ecommerce.model.ImageSlider;

public interface ImageSliderMapper {
	
	ImageSliderResponseDTO toImageSliderResponseDTO(ImageSlider imageSlider);
	List<ImageSliderResponseDTO> toImageSliderResponseDTOlist(List<ImageSlider> imageSliders);
	
	ImageSlider toImageSlider(ImageSliderRequestDTO imageSliderRequestDTO);
}
