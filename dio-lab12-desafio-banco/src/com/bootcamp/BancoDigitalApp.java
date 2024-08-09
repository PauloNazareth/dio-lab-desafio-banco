package com.bootcamp;

import java.time.LocalDate;

import com.bootcamp.consumidor.Cliente;
import com.bootcamp.financeira.Conta;
import com.bootcamp.financeira.ContaCorrente;
import com.bootcamp.financeira.ContaException;
import com.bootcamp.financeira.ContaPoupanca;
import com.bootcamp.financeira.Emprestimo;

public class BancoDigitalApp {

	public static void main(String[] args) throws ContaException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Paulo H.");
		
		Conta contaCorrente = new ContaCorrente(cliente);
		Conta contaPoupanca = new ContaPoupanca(cliente);
		
		contaCorrente.depositar(100);
		contaCorrente.transferir(70, contaPoupanca);
		Emprestimo emprestimo = new Emprestimo(900, 12, LocalDate.of(2024, 8, 01));
		contaCorrente.emprestimo(emprestimo);
		
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
				
	}
}
