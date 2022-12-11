package com.bankprogramm.domain.model;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String senha;
	private String nomeUsuario;
	private Instant dataCadastro;

	private Status status;

	public Usuario(String senha, String nomeUsuario, Instant dataCadastro, Status status) {
		this.senha = senha;
		this.nomeUsuario = nomeUsuario;
		this.dataCadastro = dataCadastro;
		this.status = status;
	}
}
