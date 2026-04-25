package com.tabuada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número para a Tabuada: ");
		int num = scan.nextInt();
		
		int contador = 1;
		int limite = 10;
		
		while (contador <= limite) {
			int total = contador * num;
			System.out.println(contador + " X " + num + " = " + total);
			contador++;
		}
		scan.close();
	}
}