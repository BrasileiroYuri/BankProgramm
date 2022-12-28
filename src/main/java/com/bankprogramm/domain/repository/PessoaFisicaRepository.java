package com.bankprogramm.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankprogramm.domain.model.PessoaFisica;

public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Long> {

}
