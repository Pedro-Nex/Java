package com.fundamentos.debug;

public class SomaAteN {

	public static void main(String[] args) {
		// Variavel que define o limite.
		int limite = 5;
		
		// Variavel para armazenar a soma.
		int soma = 0;
		
		// Loop para somar os números.
		for (int i = 1; i <= limite; i++) {
			soma = soma + i;
		}
		System.out.println("A soma de 1 até " + limite + " é: " + soma);
	}
}