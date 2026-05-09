package poo01;

public class Gerente extends Funcionario {
	String dp;
	
	public Gerente (String nome, String cargo, double salario, String dp) {
		super(nome, cargo, salario);
		this.dp = dp;
	}
	public void gerenciarEquip() {
		System.out.println(this.nome + ", está gerenciando a equipe do departamento " + this.dp + ".");
	}
	
	@Override
	public void exibir() {
		super.exibir();
		System.out.println("Departamento: " + this.dp);
		System.out.println("Responsabilidade: " + "Gerente de Equipe.");
	}
	@Override
	public void trabalhar() {
		System.out.println(this.nome + ", está planejando e supervisionando as atividades do departamento de " + this.dp + ".");
	}
}
