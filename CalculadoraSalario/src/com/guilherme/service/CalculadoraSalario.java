package com.guilherme.service;

import com.guilherme.model.Funcionario;

public class CalculadoraSalario {
	public double calculaSalario(Funcionario funcionario){
		return funcionario.getCargo().getRegra().calcula(funcionario);
	}
}
