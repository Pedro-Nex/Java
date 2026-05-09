package poo01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Carro car1 = new Carro("BMW", "M3", 2025);
		car1.acelerar();
		car1.imprimirDados();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a marca do carro: ");
		String marca = scan.nextLine();
		System.out.print("Digite o modelo do carro: ");
		String modelo = scan.nextLine();
		System.out.print("Digite o ano do carro: ");
		int ano = scan.nextInt();
		
		Carro car2 = new Carro(marca, modelo, ano);
		car2.acelerar();
		car2.imprimirDados();
		
		scan.close();
	}
}