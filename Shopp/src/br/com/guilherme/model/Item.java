package br.com.guilherme.model;

public class Item {
	private String sDescricao;
	private int nQtd;
	private double dValorUnitario;

	public Item(String sDescricao, int nQtd, double dValorUnitario) {
		this.sDescricao = sDescricao;
		this.nQtd = nQtd;
		this.dValorUnitario = dValorUnitario;
	}

	public double getValorTotal() {
		return this.nQtd * this.dValorUnitario;
	}

	public String getsDescricao() {
		return sDescricao;
	}

	public int getnQtd() {
		return nQtd;
	}

	public double getdValorUnitario() {
		return dValorUnitario;
	}

}
