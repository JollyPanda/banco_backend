package com.proyecto.banco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.banco.model.Gestor;
import com.proyecto.banco.repository.GestorRepository;

@Service
public class GestorService {

	@Autowired
	private GestorRepository gestorRepository;

	public List<Gestor> findAll() {
		return gestorRepository.findAll();
	}

	public Gestor findById(Long id) {
		return gestorRepository.findById(id).orElse(null);
	}

	public Gestor save(Gestor gestor) {
		return gestorRepository.save(gestor);
	}

	public void deleteById(Long id) {
		gestorRepository.deleteById(id);
	}
	public Optional<Gestor> login(String correo, String password) {
		return gestorRepository.findByCorreoAndPassword(correo, password);
	}
}
