package com.proyecto.banco.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.banco.model.Gestor;

public interface GestorRepository extends JpaRepository<Gestor, Long> {
	Optional<Gestor> findByCorreoAndPassword(String correo, String password);
}