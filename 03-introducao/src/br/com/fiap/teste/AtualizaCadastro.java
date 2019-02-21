package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.produto.Cliente;
import br.com.fiap.produto.Genero;

public class AtualizaCadastro {
	
 public static void main(String[] args) {
	
	EntityManagerFactory f = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
	EntityManager em = f.createEntityManager();
	
	Cliente cliente = new Cliente(1, "Bolsonaro", new GregorianCalendar(2000, Calendar.JANUARY, 25 ), "12345678922",	 Genero.MASCULINO, new GregorianCalendar(2000, Calendar.FEBRUARY,2 ), null, true, 123456789);
	em.merge(cliente);
	em.getTransaction().begin();
	em.getTransaction().commit();
	em.close();
	f.close();
}
}
