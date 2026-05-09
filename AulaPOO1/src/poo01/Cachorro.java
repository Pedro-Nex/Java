package poo01;

public class Cachorro {
	String nome;
	String raca;
	int idade;
	
	public void latir() {
		System.out.println(nome + ", está latindo. Au, Au, Au!");
	}
	public void correr() {
		System.out.println(nome + ", está correndo pelo jardim.");
	}
	public void imprimir() {
		System.out.println("Nome do cachorro: " + nome);
		System.out.println("Raça do cachorro: " + raca);
		System.out.println("Idade do cachorro: " + idade + " anos.");
	}
}
