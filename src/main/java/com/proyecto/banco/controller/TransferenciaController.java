package com.proyecto.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.proyecto.banco.model.Transferencia;
import com.proyecto.banco.service.TransferenciaService;

import java.util.List;

@RestController
@RequestMapping("/transferencia")
@CrossOrigin(origins = "http://localhost:4200")
public class TransferenciaController {

	@Autowired
	private TransferenciaService transferenciaService;

	@GetMapping
	public List<Transferencia> findAll() {
		return transferenciaService.findAll();
	}

	@GetMapping("/{id}")
	public Transferencia findById(@PathVariable Long id) {
		return transferenciaService.findById(id);
	}

	@PostMapping
	public Transferencia save(@RequestBody Transferencia transferencia) {
		return transferenciaService.save(transferencia);
	}

	@PutMapping
	public Transferencia update(@RequestBody Transferencia transferencia) {
		return transferenciaService.save(transferencia);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		transferenciaService.deleteById(id);
	}
	@GetMapping("/ordenante/{id}")
	public List<Transferencia> getTransferenciasEnviadas(@PathVariable Long id) {
		return transferenciaService.getTransferenciasByClienteOrdenante(id);
	}
}