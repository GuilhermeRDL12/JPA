package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.bean.Carro;
//uma interface pode herdar de uma ou mais interfaces
public interface CarroDAO {
	
	List<Carro> buscarCarros();
	void criar (Carro carro);

}
