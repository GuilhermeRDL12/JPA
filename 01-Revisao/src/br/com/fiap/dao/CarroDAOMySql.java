package br.com.fiap.dao;

import java.io.Serializable;
import java.util.List;

import br.com.fiap.bean.Carro;
//uma classe pode herdar de uma classe
//Uma classe podew implemnetar mais de uma interface
public class CarroDAOMySql implements CarroDAO, Serializable {

	@Override
	public List<Carro> buscarCarros() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void criar(Carro carro) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
