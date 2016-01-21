package com.guilherme.model;

import java.util.Calendar;

public class NotaFiscal {
	private String cliente;
	private double valor;
	private Calendar date;
	
	public NotaFiscal(String cliente, double valor, Calendar date){
		this.cliente = cliente;
		this.valor = valor;
		this.date = date;
	}

	public String getCliente() {
		return cliente;
	}

	public double getValor() {
		return valor;
	}

	public Calendar getDate() {
		return date;
	}
	
}
