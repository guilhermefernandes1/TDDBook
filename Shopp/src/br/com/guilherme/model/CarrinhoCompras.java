package br.com.guilherme.model;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	private List<Item> aItens;
	
	public CarrinhoCompras(){
		this.aItens = new ArrayList<Item>();
	}
	
	public void addItem(Item oItem){
		this.aItens.add(oItem);
	}
	
	public List<Item> getItens(){
		return this.aItens;
	}
	
	public double maiorValor(){
		double dMaior = 0;
		if (this.aItens.isEmpty()) return dMaior;
		else {			
			for(Item item : this.aItens){
				double dItemAtual = item.getdValorUnitario();
				if(dMaior < dItemAtual){
					dMaior = dItemAtual;
				}
			}
		}
		return dMaior;
	}
}
