package com.exemplo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;

import com.exemplo.model.Aluguel;
import com.exemplo.model.Carro;
import com.exemplo.model.Cliente;

public class AluguelCarro {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("João Silva", LocalDate.of(1998, Month.SEPTEMBER, 17));
		Carro carro = new Carro("Cruze", 160.00, Year.parse("2016"));


	 LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(), LocalTime.of(LocalTime.now().getHour(), 0));
	 LocalDateTime dataEHoraPrevistaParaDevolucao = LocalDateTime.now().plusDays(3).plusHours(3);
	 
	 Aluguel aluguel = new Aluguel(cliente, carro, dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao);
	 

	 System.out.println(">>>>>>>>>>>>>>>> RECIBO >>>>>>>>>>>>>>>>>");
	 System.out.println("Carro: " + aluguel.getCarro().getMarca());
	 System.out.println("Cliente: " + aluguel.getCliente().getNome());
	 
	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	 System.out.println("Data e hora da retirada: " + aluguel.getDataEHoraDaRetirada().format(formatter));
	 System.out.println("Data e prevista para devolução: " + aluguel.getDataEHoraPrevistaParaDevolucao().format(formatter));
	 
	}

}
