package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.produto.Cliente;
import br.com.fiap.produto.Genero;

public class Exercicio {

	public static void main(String[] args) {
		//Realizar CRUD para produto
		
		//cadastrar
		EntityManagerFactory f = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = f.createEntityManager();
		 Cliente cliente = new Cliente("Bota", new GregorianCalendar(2013, Calendar.NOVEMBER, 29), "12312345697", Genero.FEMININO, null, true);
		
		em.persist(cliente);
		em.getTransaction().begin();
		em.getTransaction().commit();
		em.close();
		f.close();
	}
}
