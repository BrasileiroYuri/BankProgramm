package com.bankprogramm.domain.model.exceptions;

public class StatusInvalidoException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public StatusInvalidoException(String mensagem) {
		super(mensagem);
	}
}
