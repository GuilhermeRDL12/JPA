package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.produto.Cliente;

public class TestePesquisa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory f = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em= f.createEntityManager();
		Cliente cliente = em.find(Cliente.class, 1);
		
		System.out.println(cliente.getNome());
		//mudar o nome no banco
		cliente.setNome("Francisco");
		em.getTransaction().begin();
		em.getTransaction().commit();
		em.close();
		f.close();
	}

}
