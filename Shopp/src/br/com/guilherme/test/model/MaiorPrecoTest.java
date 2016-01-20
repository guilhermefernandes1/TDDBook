package br.com.guilherme.test.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.guilherme.model.CarrinhoCompras;
import br.com.guilherme.model.Item;

public class MaiorPrecoTest {
	
	private CarrinhoCompras carrinho;
	
	@Before
	public void inicializa(){
		this.carrinho = new CarrinhoCompras();
	}

	@Test
	public void testVazio() {
		double resultado = carrinho.maiorValor();
		double resultadoEsperado = 0;
		assertEquals(resultadoEsperado, resultado,0.0001);
	}
	
	@Test
	public void testUmItem(){
		this.carrinho = new CarrinhoComprasBuilder()
		.addItem(110.90)
		.cria();		
		double resultado = carrinho.maiorValor();
		double resultadoEsperado = 110.90;
		assertEquals(resultadoEsperado, resultado,0.0001);
	}
	
	@Test
	public void testMaisItens(){
		this.carrinho = new CarrinhoComprasBuilder()
				.addItem(110.9,910.9,1200.00,3500.50)
				.cria();
		double resultado = carrinho.maiorValor();
		double resultadoEsperado = 3500.50;
		assertEquals(resultadoEsperado, resultado,0.0001);
	}

}
