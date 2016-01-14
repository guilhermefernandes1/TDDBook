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
		carrinho.addItem(new Item("Telefone",1,110.90));
		double resultado = carrinho.maiorValor();
		double resultadoEsperado = 110.90;
		assertEquals(resultadoEsperado, resultado,0.0001);
	}
	
	@Test
	public void testMaisItens(){
		carrinho.addItem(new Item("Telefone",3,110.90));
		carrinho.addItem(new Item("Geladeira",1,910.90));
		carrinho.addItem(new Item("Fogäo",1,1200.00));
		carrinho.addItem(new Item("Notebook",2,3500.50));
		double resultado = carrinho.maiorValor();
		double resultadoEsperado = 3500.50;
		assertEquals(resultadoEsperado, resultado,0.0001);
	}

}
