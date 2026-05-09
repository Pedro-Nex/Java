package poo01;

public class Main {

	public static void main(String[] args) {
		linha();
		System.out.println("* Registrando Visitante na Escola *");
		linha();
		
		Pessoa visitante = new Pessoa("Pedro", "111.222.333-44", "123.456.789-0");
		visitante.exebirDetalhes();
		
		linha();
		System.out.println("* Registrando Professor na Escola *");
		linha();
		
		Professor prof01 = new Professor("Pedro", "222.333.444-55", "234.567.890-1", "Java", 68.50);
		prof01.exebirDetalhes();
		
		linha();
		System.out.println("* Registrando Aluno na Escola *");
		linha();
		
		Aluno aluno01 = new Aluno("Pedro", "333.444.555-66", "345.678.901-2", "229152024", "Java");
		
		System.out.println("O aluno está " + aluno01.verificarMedia(10));
		aluno01.exebirDetalhes();
		linha();
	}
	public static void linha() {
		System.out.println("=".repeat(50));
	}
}