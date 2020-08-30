package com.peluqueria.javigodas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peluqueria.javigodas.models.Product;
import com.peluqueria.javigodas.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public List<Product> findAll() {
		return this.productService.findAll(); 
	}
	
	@PostMapping
	public void save(@RequestBody Product p) {
		this.productService.save(p);
	}
	
}
