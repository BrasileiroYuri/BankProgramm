package com.bankprogramm.domain.model;

import java.time.Instant;

import lombok.Data;

@Data
public class UsuarioDTO {

	private Usuario usuario;
	private String name;
	private Instant dataCadastroDto;
}
