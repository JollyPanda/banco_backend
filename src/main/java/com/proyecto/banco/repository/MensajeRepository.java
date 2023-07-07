package com.proyecto.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.banco.model.Mensaje;

public interface MensajeRepository extends JpaRepository<Mensaje, Long> {
}