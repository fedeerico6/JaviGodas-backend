package com.peluqueria.javigodas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.peluqueria.javigodas.models.Turn;

@Repository
public interface TurnRepository extends JpaRepository<Turn, Integer>{

}
