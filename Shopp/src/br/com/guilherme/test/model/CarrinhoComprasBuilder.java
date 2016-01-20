package br.com.guilherme.test.model;

import br.com.guilherme.model.CarrinhoCompras;
import br.com.guilherme.model.Item;

public class CarrinhoComprasBuilder {
	public CarrinhoCompras carrinho;
	
	public CarrinhoComprasBuilder(){
		this.carrinho = new CarrinhoCompras();
	}
	
	public CarrinhoComprasBuilder addItem(double ... valores){
		for(double valor : valores){
			this.carrinho.addItem(new Item("Item",1,valor));
		}
		return this;
	}
	
	public CarrinhoCompras cria(){
		return this.carrinho;
	}
}
