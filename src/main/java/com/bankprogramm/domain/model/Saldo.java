package com.bankprogramm.domain.model;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
public class Saldo {
	
	@Getter
	private BigDecimal saldo;
	
	
}
