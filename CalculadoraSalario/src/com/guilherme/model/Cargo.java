package com.guilherme.model;

import com.guilherme.service.DezOuVinteDesconto;
import com.guilherme.service.QuinzeOuVinteCincoDesconto;
import com.guilherme.service.RegraDeCalculo;

public enum Cargo {
	DESENVOLVEDOR(new DezOuVinteDesconto()),
	DBA(new QuinzeOuVinteCincoDesconto()),
	TESTADOR(new QuinzeOuVinteCincoDesconto());
	
	private final RegraDeCalculo regra;
	
	Cargo(RegraDeCalculo regra){
		this.regra = regra;
	}
	
	public RegraDeCalculo getRegra(){
		return this.regra;
	}
}
