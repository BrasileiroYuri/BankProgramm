package com.bankprogramm.domain.model;

import com.bankprogramm.domain.model.exceptions.StatusInvalidoException;

public enum Status {
	CLIENTE(1, "Cliente padrão."), FUNCIONARIO(2, "Funcionário da agência."), ADM(3, "Administrador do sistema.");

	private Integer codigo;
	public String descricao;

	Status(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo(Status status) {
		return status.codigo;
	}

	public Status getStatus(Integer codigo) {
		for (Status status : Status.values()) {
			if (status.getCodigo(status).equals(codigo)) {
				return status;
			}
		}
		throw new StatusInvalidoException("Código de status não encontrado");
	}
}
