package com.bankprogramm.domain.model;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class UsuarioDTO {

	private Usuario usuario;
	private String name;
	private Instant dataCadastroDto;
	
}
