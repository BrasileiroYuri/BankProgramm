package com.bankprogramm.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bankprogramm.domain.model.PessoaFisica;
import com.bankprogramm.domain.repository.PessoaFisicaRepository;

@RestController
@RequestMapping("/pessoafisica")
public class PessoaFisicaController {

	@Autowired
	private PessoaFisicaRepository pessoaFisicaRepository;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<PessoaFisica> listar() {
		return pessoaFisicaRepository.findAll();
	}
	@GetMapping("/{pessoaId}")
	public ResponseEntity<PessoaFisica> buscar(@PathVariable Long pessoaId) {
		Optional<PessoaFisica> optionalPessoa= pessoaFisicaRepository.findById(pessoaId);
		if (optionalPessoa.isPresent()) {
			return ResponseEntity.ok(optionalPessoa.get());
		}
		return ResponseEntity.notFound().build();
	}
}
