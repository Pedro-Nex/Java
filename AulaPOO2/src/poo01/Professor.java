package poo01;

public class Professor extends Pessoa {
	String disciplina;
	double salarioHora;
	
	public Professor(String nome, String cpf, String rg, String disciplina, double salarioHora) {
		super(nome, cpf, rg); // Chama o construtor da Class mãe (Pessoa)
		this.disciplina = disciplina;
		this.salarioHora = salarioHora;
	}
	
	@Override // Anotação para sobreposição de métodos
	public void exebirDetalhes() {
		super.exebirDetalhes();
		System.out.println("Disciplina: " + this.disciplina);
		System.out.println("Salário por Hora: R$" + String.format("%,.2f",this.salarioHora));
	}
}