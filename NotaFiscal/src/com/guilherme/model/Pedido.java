package com.guilherme.model;

public class Pedido {
	private String cliente;
	private double valor;
	private int quantidade;
	
	public Pedido(String cliente, double valor, int quantidade){
		this.cliente = cliente;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public String getCliente() {
		return cliente;
	}
	public double getValor() {
		return valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
}
