package com.exemplo.model;

import java.time.Year;

public class Carro {

	private String marca;
	private double diaria;
	private Year fabricacao;

	public Carro(String marca, double diaria, Year fabricacao) {
		this.marca = marca;
		this.diaria = diaria;
		this.fabricacao = fabricacao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getDiaria() {
		return diaria;
	}

	public void setDiaria(double diaria) {
		this.diaria = diaria;
	}

	public Year getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(Year fabricacao) {
		this.fabricacao = fabricacao;
	}

}
