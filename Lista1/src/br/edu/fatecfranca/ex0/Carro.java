package br.edu.fatecfranca.ex0;

import javax.swing.JOptionPane;

public class Carro {

	// Declaração de variáveis
	String modelo;
	int ano;
	float velocidade;
	boolean motor;

	// Métodos construtores
	Carro() {

	}

	Carro(String modelo, int ano, float velocidade, boolean motor) {
		this.modelo = modelo;
		this.ano = ano;
		this.velocidade = velocidade;
		this.motor = motor;
	}

	// Métodos
	void ligar() {
		this.motor = true;
	}

	void desligar() {
		this.motor = false;
	}

	void acelearar(float x) {
		this.velocidade += x;
	}

	void frear(float x) {
		this.velocidade -= x;
	}

	void mostrar() {
		JOptionPane.showMessageDialog(null, "Modelo: " + this.modelo + ", Ano: " + this.ano + ", Vel: "
				+ this.velocidade + ", Motor: " + this.motor);
	}
}
