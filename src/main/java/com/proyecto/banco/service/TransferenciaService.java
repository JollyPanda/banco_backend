package com.proyecto.banco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.banco.model.Transferencia;
import com.proyecto.banco.repository.TransferenciaRepository;

@Service
public class TransferenciaService {

	@Autowired
	private TransferenciaRepository transferenciaRepository;

	public List<Transferencia> findAll() {
		return transferenciaRepository.findAll();
	}

	public Transferencia findById(Long id) {
		return transferenciaRepository.findById(id).orElse(null);
	}

	public Transferencia save(Transferencia transferencia) {
		return transferenciaRepository.save(transferencia);
	}

	public void deleteById(Long id) {
		transferenciaRepository.deleteById(id);
	}

	public List<Transferencia> getTransferenciasByClienteOrdenante(Long id) {
		return transferenciaRepository.findByOrdenanteId(id);
	}
}