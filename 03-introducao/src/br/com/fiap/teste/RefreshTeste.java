package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.produto.Cliente;

public class RefreshTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory f = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = f.createEntityManager();
		 
		Cliente cliente = em.find(Cliente.class, 1);
		System.out.println("Valor em banco: "+ cliente.getNome());
		//alterar nome
		cliente.setNome("Wilson");
		System.out.println("Nome modificado no java: "+ cliente.getNome());
		//realizar refresh
		em.refresh(cliente);
		//exibir tema
		System.out.println("Nome apos o refresh: "+ cliente.getNome());
		
		em.close();
		f.close();
	}

}
