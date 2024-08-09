package com.bootcamp.instituicao;

import java.util.List;

import com.bootcamp.financeira.Conta;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Banco {

	private String nome;
	
	private List<Conta> contas;
	
}
