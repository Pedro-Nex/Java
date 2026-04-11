/* Esse programa demonstra a declaração e o uso dos
tipos primitivos em Java.
Eles são a base para armazenar dados simples e eficientes.
*/

public class TiposPrimitivos{
	public static void main(String args[]){
		// Tipos de números inteiros.
		byte idade = 20;
		short temperatura = -20000;
		int populacaoCidade = 200000;
		long distanciaEstrelas = 9876543210L; // Sufixo L é obrigatório.
		// Tipos de números decimais (ponto flutuante).
		float precoUnitario = 19.99F; // Sufixo F é obrigatório.
		double pi = 3.1415926535;
		// Tipos para caracter e lógico.
		char inicial = 'P';
		boolean ehAluno = false;
		
		System.out.println("==============================");
		System.out.println("");
		System.out.println("Tipo Byte");
		System.out.println("Idade: " + idade);
		System.out.println("");
		System.out.println("Tipo Short");
		System.out.println("Temperatura: " + temperatura);
		System.out.println("");
		System.out.println("Tipo Int");
		System.out.println("População da Cidade: " + populacaoCidade);
		System.out.println("");
		System.out.println("Tipo Long");
		System.out.println("Distacia das Estrelas: " + distanciaEstrelas);
		System.out.println("");
		System.out.println("Tipo Float");
		System.out.println("Preço Unitário: " + precoUnitario);
		System.out.println("");
		System.out.println("Tipo Double");
		System.out.println("Número PI: " + pi);
		System.out.println("");
		System.out.println("Tipo Char");
		System.out.println("Inicial do Nome: " + inicial);
		System.out.println("");
		System.out.println("Tipo Boolean");
		// Operador ternário.
		// Variável_bolean ? resposta_verdadeira : resposta_falsa.
		System.out.println(ehAluno ? "Ele é aluno." : "Ele não é aluno.");
		System.out.println("");
		System.out.println("==============================");
		
		/*
		Comentarios em varias linha.
		*/
		
		//Comentarios em linha.
	}
}
