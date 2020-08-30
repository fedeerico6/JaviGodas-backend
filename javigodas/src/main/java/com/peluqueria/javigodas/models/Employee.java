package com.peluqueria.javigodas.models;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Employee extends User {

	@Column(nullable = false)
	private String type;
	
	
}
