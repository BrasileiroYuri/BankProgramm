package com.bankprogramm.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bankprogramm.domain.model.PessoaFisica;
import com.bankprogramm.domain.repository.PessoaFisicaRepository;
import com.bankprogramm.domain.service.PessoaFisicaService;

@RestController
@RequestMapping("/pessoa-fisica")
public class PessoaFisicaController {

	@Autowired
	private PessoaFisicaRepository repository;

	@Autowired
	private PessoaFisicaService service;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<PessoaFisica> listar() {
		return repository.findAll();
	}

	@GetMapping("/{pessoaId}")
	public PessoaFisica buscar(@PathVariable Long pessoaId) {
		return service.buscar(pessoaId);
	}

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public void adicionar(@RequestBody PessoaFisica pessoaFisica) {
		service.adicionar(pessoaFisica);
	}

}
