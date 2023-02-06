package com.project.ecommerce.mapper.implementations;

import java.util.LinkedList;
import java.util.List;

import com.project.ecommerce.dto.ImageRequestDTO;
import com.project.ecommerce.dto.ImageResponseDTO;
import com.project.ecommerce.mapper.ImageMapper;
import com.project.ecommerce.model.Image;

public class ImageMapperImpl implements ImageMapper{

	@Override
	public ImageResponseDTO toImageResponseDTO(Image image) {
		ImageResponseDTO imageResponseDTO = new ImageResponseDTO();
		imageResponseDTO.setId(image.getId());
		imageResponseDTO.setSource(image.getSource());
		imageResponseDTO.setName(image.getName());
		imageResponseDTO.setUploadDate(image.getUploadDate());
		return imageResponseDTO;
	}

	@Override
	public List<ImageResponseDTO> toImageResponseDTOlist(List<Image> images) {
		List<ImageResponseDTO> imageResponseDTOlist = new LinkedList<ImageResponseDTO>();
		
		for(Image image : images) {
			ImageResponseDTO imageResponseDTO = toImageResponseDTO(image);
			imageResponseDTOlist.add(imageResponseDTO);
		}
		
		return imageResponseDTOlist;
	}

	@Override
	public Image toImage(ImageRequestDTO imageRequestDTO) {
		Image image = new Image();
		image.setSource(imageRequestDTO.getSource());
		image.setName(imageRequestDTO.getName());
		image.setUploadDate(imageRequestDTO.getUploadDate());
		
		return image;
	}

}
