package com.guilherme.test.service;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import com.guilherme.model.AcaoAposGerarNota;
import com.guilherme.model.NotaFiscal;
import com.guilherme.model.Pedido;
import com.guilherme.service.GeradorNotaFiscal;

public class GeradorNotaFiscalTest {

	@Test
	public void testGera() {
		AcaoAposGerarNota acao1 = Mockito.mock(AcaoAposGerarNota.class);
		AcaoAposGerarNota acao2 = Mockito.mock(AcaoAposGerarNota.class);
		
		List<AcaoAposGerarNota> acoes = Arrays.asList(acao1,acao2);
		
		Pedido pedido = new Pedido("Guilherme", 89.50, 1);
		GeradorNotaFiscal gerador = new GeradorNotaFiscal(acoes);
		
		NotaFiscal nf = gerador.gera(pedido);
		assertEquals(89.5*.94, nf.getValor(),0.001);
		
		Mockito.verify(acao1).executa(nf);
		Mockito.verify(acao2).executa(nf);
	}

}
