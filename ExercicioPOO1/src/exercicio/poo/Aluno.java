package exercicio.poo;

public class Aluno {
	String nome;
	String disciplina;
	double nota;
	
	public void estudar() {
		System.out.println(nome + ", está estudando.");
	}
	public void descansar() {
		System.out.println(nome + ", está dormindo. Zzzzzz");
	}
	public void imprimir() {
		System.out.println("Nome do aluno(a): " + nome);
		System.out.println("Disciplina: " + disciplina);
		System.out.println("Nota do aluno(a): " + nota);
	}
}
