package com.exemplo;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import com.exemplo.model.Cliente;

public class CadastroCliente {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("João Silva", LocalDate.of(1998, Month.SEPTEMBER, 17));

		int idade = Period.between(cliente.getNascimento(), LocalDate.now()).getYears();


		if(idade >= 18) {
			System.out.printf("Cadastro liberado, você tem %d anos de idade", idade);			
		} else {
			System.out.printf("Cadastro não permitido, você tem %d anos de idade", idade);					
		}
	}

}
