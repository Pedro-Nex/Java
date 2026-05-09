package poo01;

public class Funcionario {
	String nome, cargo;
	double salario;
	
	public Funcionario(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	public void exibir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Salário: R$" + String.format("%,.2f", this.salario));
	}
	public void trabalhar() {
		System.out.println(this.nome + ", está realizando suas tarefas como " + this.cargo + ".");
	}
}