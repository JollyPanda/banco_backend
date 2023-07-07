package com.proyecto.banco.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.banco.model.Transferencia;

public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {
	List<Transferencia> findByOrdenanteId(Long id);
}