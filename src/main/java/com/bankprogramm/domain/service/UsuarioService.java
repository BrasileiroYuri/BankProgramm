package com.bankprogramm.domain.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankprogramm.domain.model.Usuario;
import com.bankprogramm.domain.model.exceptions.EntidadeNaoEncontradaException;
import com.bankprogramm.domain.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario buscar(Long id) {
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		if (usuario.isPresent()) {
			return usuario.get();
		}
		throw new EntidadeNaoEncontradaException(String.format("Usuário com id %d não foi encontrado.", id));
	}
}
