package exercicio.poo;

public class Main {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();

		aluno1.nome = "Pedro";
		aluno1.disciplina = "Java Fundamental";
		aluno1.nota = 10;
		
		aluno2.nome = "Mayara";
		aluno2.disciplina = "Direito Civil";
		aluno2.nota = 1000;
		
		linha();
		
		aluno1.estudar();
		aluno1.descansar();
		aluno1.imprimir();
		
		linha();
			
		aluno2.estudar();
		aluno2.descansar();
		aluno2.imprimir();
		
		linha();
	}
	public static void linha() {
		System.out.println("=".repeat(50));
	}
}
