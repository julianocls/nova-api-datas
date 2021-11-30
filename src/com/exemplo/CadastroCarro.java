package com.exemplo;

import java.time.Year;
import java.util.Arrays;
import java.util.List;

import com.exemplo.model.Carro;

public class CadastroCarro {

	public static void main(String[] args) {

		Carro gol = new Carro("Gol", 90.00, Year.of(2012));
		Carro cruze = new Carro("Cruze", 160.00, Year.parse("2016"));
		Carro celta = new Carro("Celta", 80.00, Year.of(2015));

		List<Carro> carros = Arrays.asList(gol, cruze, celta);

		//carros.stream().filter(c -> c.getFabricacao().getValue() > Year.of(2015).getValue()).forEach(c -> System.out.println(c.getFabricacao()));
		carros.stream().filter(c -> c.getFabricacao().isAfter(Year.of(2015))).forEach(c -> System.out.printf("Modelo %s, ano %d", c.getMarca(), c.getFabricacao().getValue()));

	}

}
