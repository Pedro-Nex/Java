package poo01;

public class Carro {
	String marca;
	String modelo;
	int ano;
	
	// Construtor
	public Carro(String marcaCarro, String modeloCarro, int anoCarro) {
		marca = marcaCarro;
		modelo = modeloCarro;
		ano = anoCarro;
	}
	public void acelerar() {
		System.out.println("O carro " + modelo + " está acelerando.");
	}
	public void imprimirDados() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
	}
}
