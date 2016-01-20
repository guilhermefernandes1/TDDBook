package com.guilherme.service;

import com.guilherme.model.Funcionario;

public class QuinzeOuVinteCincoDesconto implements RegraDeCalculo{

	public double calcula(Funcionario funcionario){
		if(funcionario.getSalario() <= 2500){
			return funcionario.getSalario() * .85;
		} else{
			return funcionario.getSalario() * .75;
		}
	}
}
