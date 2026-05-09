package poo01;

public class Main {

	public static void main(String[] args) {
		System.out.println("***** Gestão de Funcionários *****");
		
		linha();
		
		Funcionario func1 = new Funcionario("Pedro", "Engenheiro", 12899.00);
		func1.exibir();
		func1.trabalhar();
		
		linha();
		
		Gerente gen1 = new Gerente("Pedro", "Gerente de Projetos", 18959.86, "Desenvolvimento");
		gen1.exibir();
		gen1.trabalhar();
		gen1.gerenciarEquip();
		
		linha();
		
		Programador prog1 = new Programador("Pedro", "Dev Back-end", 26756.98, "Java, Angular, Python");
		prog1.exibir();
		prog1.trabalhar();
		prog1.codificar();
		
		linha();
	}
	public static void linha() {
		System.out.println("=".repeat(50));
	}
}
