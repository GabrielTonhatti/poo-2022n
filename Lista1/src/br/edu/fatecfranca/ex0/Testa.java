package br.edu.fatecfranca.ex0;

import javax.swing.JOptionPane;

public class Testa {

	public static void main(String[] args) {

		System.out.println("Hoje é sexta-feira");

		// Cria um objeto de classe Carro
		Carro obj1 = new Carro();
		obj1.modelo = JOptionPane.showInputDialog("Informe o modelo: ");
		obj1.ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano: "));
		obj1.velocidade = Float.parseFloat(JOptionPane.showInputDialog("Informe a velocidade: "));
		int resp = JOptionPane.showConfirmDialog(null, "Criar o carro com o motor ligado?");
		obj1.motor = (resp == JOptionPane.OK_OPTION);
		obj1.mostrar();
		obj1.ligar();
		obj1.mostrar();
		obj1.acelearar(80);
		obj1.mostrar();
		obj1.frear(20);
		obj1.mostrar();
		obj1.desligar();
		obj1.mostrar();

		Carro obj2 = new Carro("Palio", 2012, 0, false);

	}

}
