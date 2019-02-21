package br.com.fiap.bean;

import java.lang.annotation.ElementType;
import java.util.Calendar;

import br.com.fiap.anotacao.Coluna;

public class Cliente {

	@Coluna(nome="cd_cliente", obrigatorio = true)
	private int id;
	@Coluna(nome="nm_cliente", obrigatorio = true)
	private String nome;
	@Coluna(nome="dt_nasc", obrigatorio=false)
	private Calendar dataNascimento;

	public Cliente() {
		super();
	}

	public Cliente(int id, String nome, Calendar dataNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
