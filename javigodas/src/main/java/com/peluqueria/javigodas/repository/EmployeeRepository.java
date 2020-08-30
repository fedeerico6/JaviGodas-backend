package com.peluqueria.javigodas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.peluqueria.javigodas.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
