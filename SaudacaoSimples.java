// Nesse programa vamos declarar variáveis String e fazer a concatenção de variáveis.

public class SaudacaoSimples{
	public static void main(String args[]){
		// Declaração de variável String.
		String nome = "Pedro";
		String sobrenome = "Neves";
		int idade = 20;
		double altura = 1.75;
		String saudacao = "\nOlá, " + nome + " " + sobrenome;
		saudacao = saudacao + "\nVocê tem " + idade;
		saudacao = saudacao + " anos. \nMede " + altura;
		saudacao = saudacao + " metros de altura.";
		
		System.out.println(saudacao);
	}
}