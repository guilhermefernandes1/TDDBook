package com.guilherme.test.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.guilherme.model.Cargo;
import com.guilherme.model.Funcionario;
import com.guilherme.service.DezOuVinteDesconto;

public class DezOuVinteDescontoTest {

	@Test
	public void testCalculaMaior() {
		Funcionario funcionario = new Funcionario("Guilherme",Cargo.DESENVOLVEDOR,7000.20);
		double resultadoEsperado = 5600.16;
		double resultado = new DezOuVinteDesconto().calcula(funcionario);
		assertEquals(resultadoEsperado, resultado,0.00001);
	}
	
	@Test
	public void testCalculaMenor(){
		Funcionario funcionario = new Funcionario("Guilherme", Cargo.DESENVOLVEDOR, 2000.0);
		double resultadoEsperado = 1800.0;
		double resultado = new DezOuVinteDesconto().calcula(funcionario);
		assertEquals(resultadoEsperado, resultado,0.00001);
	}

}
