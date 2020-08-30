package com.peluqueria.javigodas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.peluqueria.javigodas.models.Product;
import com.peluqueria.javigodas.models.Turn;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
