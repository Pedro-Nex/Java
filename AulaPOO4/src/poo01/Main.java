package poo01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o nome do Produto: ");
		String nomeProd = scan.nextLine();
		System.out.print("Digite o preço do Produto: R$");
		double precoProd = scan.nextDouble();
		System.out.print("Digite a quantidade do Produto: ");
		int quantProd = scan.nextInt();
		
		Produto prod1 = new Produto(nomeProd, precoProd, quantProd);
		
		prod1.exibirDetalhes();
		
		scan.close();
	}
}