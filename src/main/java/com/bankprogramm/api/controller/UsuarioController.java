package com.bankprogramm.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankprogramm.domain.model.Usuario;
import com.bankprogramm.domain.model.exceptions.EntidadeNaoEncontradaException;
import com.bankprogramm.domain.repository.UsuarioRepository;
import com.bankprogramm.domain.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/{usuarioId}")
	public ResponseEntity<?> buscarUsuario(@PathVariable Long usuarioId) {
		try {
			Usuario usuario = usuarioService.buscar(usuarioId);
			return ResponseEntity.status(HttpStatus.OK).body(usuario);
		} catch (EntidadeNaoEncontradaException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

}
