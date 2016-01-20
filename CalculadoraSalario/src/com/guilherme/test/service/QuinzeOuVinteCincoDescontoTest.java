package com.guilherme.test.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.guilherme.model.Cargo;
import com.guilherme.model.Funcionario;

import com.guilherme.service.QuinzeOuVinteCincoDesconto;

public class QuinzeOuVinteCincoDescontoTest {

	@Test
	public void testCalculaMaior() {
		Funcionario funcionario = new Funcionario("Guilherme",Cargo.DBA,3000.0);
		double resultadoEsperado = 2250;
		double resultado = new QuinzeOuVinteCincoDesconto().calcula(funcionario);
		assertEquals(resultadoEsperado, resultado,0.001);
	}

	@Test
	public void testCalculaMenor() {
		Funcionario funcionario = new Funcionario("Guilherme",Cargo.DBA,2000.0);
		double resultadoEsperado = 1700;
		double resultado = new QuinzeOuVinteCincoDesconto().calcula(funcionario);
		assertEquals(resultadoEsperado, resultado,0.001);
	}
	
}
