package com.tgid.spring.domain;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tgid.spring.domain.enums.EstadoPagamento;

@Entity
@JsonTypeName("pagamentoComCartao")
public class PagamentoComCartao extends Pagamento{

	private static final long serialVersionUID = 1L;
	
	private Integer numeroDePacelas;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDePacelas) {
		super(id, estado, pedido);
		this.numeroDePacelas = numeroDePacelas;
	}

	public Integer getNumeroDePacelas() {
		return numeroDePacelas;
	}

	public void setNumeroDePacelas(Integer numeroDePacelas) {
		this.numeroDePacelas = numeroDePacelas;
	}
	
	
	
}
