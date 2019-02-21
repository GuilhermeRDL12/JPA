package br.com.fiap.teste;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.anotacao.Tabela;
import br.com.fiap.anotacao.TabelaMae;
import br.com.fiap.anotacao.TabelaProduto;
import br.com.fiap.bean.Aluno;
import br.com.fiap.bean.Cliente;
import br.com.fiap.bean.Mae;
import br.com.fiap.bean.Produto;

public class Teste {

	public static void main(String[] args) {
		//instaciar cliente
//		Cliente cliente = new Cliente();
//		
//		//API de reflection para recuperar os metodos
//		Method[] metodos = cliente.getClass().getDeclaredMethods();
//		
//		for(int i =0; i< metodos.length;i++) {
//			System.out.println(metodos[i].getName());
//		}
//		
//		//recuperar atributos
//		
//		Field[] f = cliente.getClass().getDeclaredFields();
//		for(Field x : f) {
//			System.out.println(x.getName());
//			Coluna coluna = x.getAnnotation(Coluna.class);
//			System.out.println("Obrigatorio "+coluna.obrigatorio());
//		}
//		
//		//exibir nome classe
//		System.out.println(cliente.getClass().getName());
//		
//		Aluno aluno = new Aluno();
//		Method[] metodo =  aluno.getClass().getDeclaredMethods();
//		for(int i = 0; i<metodo.length;i++ ) {
//			System.out.println(metodo[i].getName());
//		}
//		
//		Tabela anotacao = aluno.getClass().getAnnotation(Tabela.class);
//		System.out.println("select * from "+anotacao.nome());
//	
//	
		
//		
//		Produto produto = new Produto();
//		 
//		TabelaProduto anotacao = produto.getClass().getAnnotation(TabelaProduto.class);
//		System.out.println("Selec * from "+anotacao.nome()+";");
//		
//		Method[] metodo = produto.getClass().getDeclaredMethods();
//		for(Method m : metodo) {
//			System.out.println(m.getName());
//		}
		
		Mae mae = new Mae();
		TabelaMae anotacao = mae.getClass().getAnnotation(TabelaMae.class);
		System.out.println("Select * from "+anotacao.nome());
		
		Cliente cli = new Cliente();
		Field[] f = cli.getClass().getDeclaredFields();
		for(Field x : f) {
			Coluna coluna = x.getAnnotation(Coluna.class);
			System.out.println(coluna.nome());
		}
		
		
	}
	
}
