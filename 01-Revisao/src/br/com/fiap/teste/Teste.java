package br.com.fiap.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.fiap.bean.Carro;
import br.com.fiap.bean.Transmissao;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro carro = new Carro();
		carro.setCambio(Transmissao.SEMI_AUTOMATICO);
		Calendar data2 = new GregorianCalendar(2000,Calendar.JANUARY,20);
		Calendar data = Calendar.getInstance(); //dataAtual
		carro.setDataLancamento(data);
		//formatar data
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(data.getTime()));
		System.out.println(data2.getTime());
		

	}

}
