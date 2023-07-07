package com.proyecto.banco.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.banco.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}