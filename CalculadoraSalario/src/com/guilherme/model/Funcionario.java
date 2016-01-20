package com.guilherme.model;

public class Funcionario {
	private double salario;
	private Cargo cargo;
	private String nome;
	
	public Funcionario(String nome, Cargo cargo, double salario){
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public String getNome() {
		return nome;
	}
}
