package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.produto.Cliente;
import br.com.fiap.produto.Genero;

public class CadastroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//criar um gerenciador de unidades
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		Cliente cliente = new Cliente("André",new GregorianCalendar(2000, Calendar.MARCH,2), "123.456.789.99", Genero.MASCULINO, null, true);
		
		em.persist(cliente);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		fabrica.close();
	}

}
