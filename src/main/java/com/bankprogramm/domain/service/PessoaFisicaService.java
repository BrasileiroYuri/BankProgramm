package com.bankprogramm.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankprogramm.domain.exception.PessoaNaoEncontrada;
import com.bankprogramm.domain.model.PessoaFisica;
import com.bankprogramm.domain.repository.PessoaFisicaRepository;

@Service
public class PessoaFisicaService {

	@Autowired
	private PessoaFisicaRepository repository;	
	
	private PessoaFisica buscar(Long pessoaId) {
		return repository.findById(pessoaId).orElseThrow(() -> new PessoaNaoEncontrada(null));
		
		
	}
	
	
	
}
