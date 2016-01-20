package com.guilherme.test.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.guilherme.model.Cargo;
import com.guilherme.model.Funcionario;
import com.guilherme.service.CalculadoraSalario;

public class CalculadoraSalarioTest {

	@Test
	public void calculaSalarioDev(){
		CalculadoraSalario calculadora = new CalculadoraSalario(); 
		Funcionario funcionario = new Funcionario("Guilherme",
				Cargo.DESENVOLVEDOR, 3700.0);
		double resultadoEsperado = 2960.0;
		double resultado = calculadora.calculaSalario(funcionario);
		assertEquals(resultadoEsperado, resultado, 0.00001);
	}
/*	@Test
	public void calculaSalarioDevMaiorTest() {
		CalculadoraSalario calculadora = new CalculadoraSalario(); 
		Funcionario funcionario = new Funcionario("Guilherme",
				Cargo.DESENVOLVEDOR, 3700.0);
		double resultadoEsperado = 2960.0;
		double resultado = calculadora.calculaSalario(funcionario);
		assertEquals(resultadoEsperado, resultado, 0.00001);
	}
	
	@Test
	public void calculaSalarioDevMenorTest() {
		CalculadoraSalario calculadora = new CalculadoraSalario(); 
		Funcionario funcionario = new Funcionario("Guilherme",
				Cargo.DESENVOLVEDOR, 3000.0);
		double resultadoEsperado = 2700.0;
		double resultado = calculadora.calculaSalario(funcionario);
		assertEquals(resultadoEsperado, resultado, 0.00001);
	}
	
	@Test
	public void calculaSalarioDBAouTESTERMenorTest() {
		CalculadoraSalario calculadora = new CalculadoraSalario(); 
		Funcionario funcionario = new Funcionario("Guilherme",
				Cargo.DBA, 2000.0);
		double resultadoEsperado = 1700.0;
		double resultado = calculadora.calculaSalario(funcionario);
		assertEquals(resultadoEsperado, resultado, 0.00001);
	}
	
	@Test
	public void calculaSalarioDBAouTESTERMaiorTest() {
		CalculadoraSalario calculadora = new CalculadoraSalario(); 
		Funcionario funcionario = new Funcionario("Guilherme",
				Cargo.TESTADOR, 3000.0);
		double resultadoEsperado = 2250.0;
		double resultado = calculadora.calculaSalario(funcionario);
		assertEquals(resultadoEsperado, resultado, 0.00001);
	}*/

}
