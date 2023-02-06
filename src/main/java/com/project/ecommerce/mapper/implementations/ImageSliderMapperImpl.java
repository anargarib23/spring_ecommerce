package com.project.ecommerce.mapper.implementations;

import java.util.LinkedList;
import java.util.List;

import com.project.ecommerce.dto.ImageSliderRequestDTO;
import com.project.ecommerce.dto.ImageSliderResponseDTO;
import com.project.ecommerce.mapper.ImageSliderMapper;
import com.project.ecommerce.model.ImageSlider;

public class ImageSliderMapperImpl implements ImageSliderMapper{

	@Override
	public ImageSliderResponseDTO toImageSliderResponseDTO(ImageSlider imageSlider) {
		ImageSliderResponseDTO imageSliderResponseDTO = new ImageSliderResponseDTO();
		imageSliderResponseDTO.setId(imageSlider.getId());
		imageSliderResponseDTO.setImages(imageSlider.getImages());
		return imageSliderResponseDTO;
	}

	@Override
	public List<ImageSliderResponseDTO> toImageSliderResponseDTOlist(List<ImageSlider> imageSliders) {
		List<ImageSliderResponseDTO> imageSliderResponseDTOlist = new LinkedList<>();
		
		for(ImageSlider imageSlider : imageSliders) {
			ImageSliderResponseDTO imageSliderResponseDTO = toImageSliderResponseDTO(imageSlider);
			imageSliderResponseDTOlist.add(imageSliderResponseDTO);
		}
		return imageSliderResponseDTOlist;
	}

	@Override
	public ImageSlider toImageSlider(ImageSliderRequestDTO imageSliderRequestDTO) {
		ImageSlider imageSlider = new ImageSlider();
		imageSlider.setImages(imageSliderRequestDTO.getImages());
		return imageSlider;
	}

}
