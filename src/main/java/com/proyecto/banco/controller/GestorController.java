package com.proyecto.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.proyecto.banco.model.Gestor;
import com.proyecto.banco.service.GestorService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/gestor")
@CrossOrigin(origins = "http://localhost:4200")
public class GestorController {

	@Autowired
	private GestorService gestorService;

	@GetMapping
	public List<Gestor> findAll() {
		return gestorService.findAll();
	}
	@GetMapping("/{id}")
	public Gestor findById(@PathVariable Long id) {
		return gestorService.findById(id);
	}

	@PostMapping
	public Gestor save(@RequestBody Gestor gestor) {
		return gestorService.save(gestor);
	}

	@PutMapping
	public Gestor update(@RequestBody Gestor gestor) {
		return gestorService.save(gestor);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		gestorService.deleteById(id);
	}

	@PostMapping("/login")
	public ResponseEntity<Gestor> login(@RequestBody Gestor gestor) {
		Optional<Gestor> optGestor = gestorService.login(gestor.getCorreo(), gestor.getPassword());
		if (optGestor.isPresent()) {
			return ResponseEntity.ok(optGestor.get());
		} else {
			return ResponseEntity.status(401).build();
		}
	}
}