package com.bootcamp.financeira;

import com.bootcamp.consumidor.Cliente;

import lombok.Getter;

@Getter
public class ContaPoupanca extends Conta {

	private static int sequencial = 1;

	private String variacao;
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		this.variacao = String.valueOf(sequencial++);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("--------------Extrato Conta Poupança--------------");
		System.out.println("Variação: "+ this.variacao);
		super.imprimirDadosConta();
	}
	
}
