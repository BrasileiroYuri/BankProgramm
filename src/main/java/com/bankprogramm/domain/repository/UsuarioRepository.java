package com.bankprogramm.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankprogramm.domain.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
