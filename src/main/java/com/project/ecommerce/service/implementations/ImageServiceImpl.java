package com.project.ecommerce.service.implementations;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.project.ecommerce.model.Image;
import com.project.ecommerce.repository.ImageRepository;
import com.project.ecommerce.service.ImageService;

public class ImageServiceImpl implements ImageService{
	
	@Autowired
	private ImageRepository imageRepository;
	
	private final Path root = Paths.get("src/main/resources/image");

	@Override
	public Image getById(long id) {
		return imageRepository.findById(id).orElse(null);
	}

	@Override
	public List<Image> getAll() {
		return imageRepository.findAll();
	}

	@Override
	public void delete(long id) {
		Image image = getById(id);
		Path file = root.resolve(image.getName());
		System.out.println(file.toString());
		try {
//			Files.delete(file);
//			imageRepository.deleteById(id);		
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());		
		}
	}

	@Override
	public void add(MultipartFile file) {
		try {
			Files.copy(file.getInputStream(), root.resolve(file.getOriginalFilename()));
		} catch(FileAlreadyExistsException e) {
			throw new RuntimeException("File with the same name already exists.");
			
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
		
		Image image = new Image();
		
		image.setName(file.getOriginalFilename());
		image.setUploadDate(new Date());
		image.setSource(root.toAbsolutePath().toString() + "/" + file.getOriginalFilename());
		imageRepository.save(image);
	}

}
