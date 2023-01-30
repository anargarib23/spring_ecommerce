package com.project.ecommerce.controller;
//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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralController {
	
	@GetMapping("/")
	public String index() {
		return "<i><h1> Gönül bağım viran, ah, ömrüm ziyan... </h1></i>";
	}
}
