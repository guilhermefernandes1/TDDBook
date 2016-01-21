package com.guilherme.service;

import java.util.Calendar;
import java.util.List;

import com.guilherme.model.AcaoAposGerarNota;
import com.guilherme.model.NotaFiscal;
import com.guilherme.model.Pedido;

public class GeradorNotaFiscal {
	private final List<AcaoAposGerarNota> acoes; 
	
	public GeradorNotaFiscal(List<AcaoAposGerarNota> acoes){
		this.acoes = acoes;
	}
	
	public NotaFiscal gera(Pedido pedido){
		NotaFiscal nf = new NotaFiscal(pedido.getCliente(),
				pedido.getValor() * .94,
				Calendar.getInstance());
		
		for(AcaoAposGerarNota acao : acoes){
			acao.executa(nf);
		}
		
		return nf;
	}
}
