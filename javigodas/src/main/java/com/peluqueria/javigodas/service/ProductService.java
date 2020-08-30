package com.peluqueria.javigodas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peluqueria.javigodas.models.Product;
import com.peluqueria.javigodas.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public void save(Product p) {
		this.productRepository.save(p);
	}
	
	public List<Product> findAll() {
		return this.productRepository.findAll();
	}
}
