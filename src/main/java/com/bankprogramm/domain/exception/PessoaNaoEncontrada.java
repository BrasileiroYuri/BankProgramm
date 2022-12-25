package com.bankprogramm.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PessoaNaoEncontrada extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private PessoaNaoEncontrada(String mensagem) {
		super(mensagem);
	}

	public PessoaNaoEncontrada(Long pessoaId) {
		this(String.format("Cadastro de pessoa com id %d", pessoaId));

	}
}
