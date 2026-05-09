package poo01;

public class Programador extends Funcionario {
	String linguaProg;
	
	public Programador (String nome, String cargo, double salario, String linguaProg) {
		super(nome, cargo, salario);
		this.linguaProg = linguaProg;
	}
	public void codificar() {
		System.out.println(this.nome + ", está programando em " + this.linguaProg + ".");
	}
	@Override
	public void exibir() {
		super.exibir();
		System.out.println("Linguagem de Programação: " + this.linguaProg);
	}
	@Override
	public void trabalhar() {
		System.out.println(this.nome + ", está desenvolvendo software e resolvendo problemas de código.");
	}
}
