package br.com.fiap.bean;

import java.util.Calendar;

public class Carro {

	
	//constante
	public static final String EXEMPLO_TESTE = "teste";
	
	
	//public, private
	//protected-> no msm pacote, e nas filhas.
	//default/package->pode ser visto no msm pacote apenas.
	
	private Transmissao cambio;
	
	private String cor;
	private Calendar dataLancamento;
	
	
	
	public Carro() {
		super();
	}

	public Carro(String cor) {
		super();
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Transmissao getCambio() {
		return cambio;
	}

	public void setCambio(Transmissao cambio) {
		this.cambio = cambio;
	}

	public Calendar getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	
}
