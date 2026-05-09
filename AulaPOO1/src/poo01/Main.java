package poo01;

public class Main {

	public static void main(String[] args) {
		Cachorro cao01 = new Cachorro();
		Cachorro cao02 = new Cachorro();
		
		cao01.nome = "Toby";
		cao01.raca = "Yorkshire";
		cao01.idade = 5;
		
		cao02.nome = "Luna";
		cao02.raca = "Chihuahua";
		cao02.idade = 4;
		
		linha();
		
		cao01.latir();
		cao01.correr();
		cao01.imprimir();
		
		linha();
		
		cao02.latir();
		cao02.correr();
		cao02.imprimir();
		
		linha();
	}
	public static void linha() {
		System.out.println("=".repeat(50));
	}

}
