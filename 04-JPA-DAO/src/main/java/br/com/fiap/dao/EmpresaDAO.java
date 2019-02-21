package br.com.fiap.dao;

import br.com.fiap.entity.Empresa;
import br.com.fiap.exception.CommitException;

public interface EmpresaDAO {
	
	public void cadastrar(Empresa empresa);
	
	public void atualizar (Empresa empresa);
	
	public void excluir (int codigo);
	
	Empresa pesquisar (int codigo);
	
	public void commit() throws CommitException;
}
