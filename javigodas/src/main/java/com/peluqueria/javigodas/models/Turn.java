package com.peluqueria.javigodas.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Turn {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable = false)
	private String status;
	
	@Column(nullable = false)
	private LocalDate date;
	
	@ManyToOne
	private Consumer consumer;
	
	@ManyToOne
	private Employee employee;
	
	@ManyToOne 
	private Product product;
}
