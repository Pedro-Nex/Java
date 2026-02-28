/* Nesse programa vamos estudar os operadores aritimeticos usados para realizar operações matemáticas básicas.
 Adição (+)
 Subtração (-)
 Multiplicação (*)
 Divisão (/)
 Modulo(Resto da divisão) (%)
*/

public class Operadores{
	public static void main(String args[]){
		int valor1 = 29;
		int valor2 = 13;
		double valor3 = 2.5;
		
		System.out.println("\n\n\n===========================================================");
		
		int soma1 = valor1 + valor2;
		double soma2 = valor1 + valor3;
		
		System.out.println("\nA soma: " + valor1 + " + " + valor2 + " = " + soma1);
		System.out.println("A soma: " + valor1 + " + " + valor3 + " = " + soma2);
		
		System.out.println("\n===========================================================");
		
		int sub1 = valor1 - valor2;
		int sub2 = valor2 - valor1;
		double sub3 = valor1 - valor3;
		
		System.out.println("\nA subtração: " + valor1 + " - " + valor2 + " = " + sub1);
		System.out.println("A subtração: " + valor2 + " - " + valor1 + " = " + sub2);
		System.out.println("A subtração: " + valor1 + " - " + valor3 + " = " + sub3);
		
		System.out.println("\n===========================================================");
		
		int mult1 =  valor1 * valor2;
		double mult2 =  valor1 * valor3;
		double mult3 = valor2 * (int)valor3;
		
		System.out.println("\nA multiplicação: " + valor1 + " * " + valor2 + " = " + mult1);
		System.out.println("A multiplicação: " + valor1 + " * " + valor3 + " = " + mult2);
		System.out.println("A multiplicação: " + valor2 + " * " + (int)valor3 + " = " + mult3);
		
		System.out.println("\n===========================================================");
		
		double div1 = (double)valor1 / (double)valor2;
		double div2 = (double)valor2 / (double)valor1;
		double div3 = (double)valor1 / valor3;
		double div4 = (double)valor2 / valor3;
		
		System.out.println("\nA divisão: " + valor1 + " / " + valor2 + " = " + div1);
		System.out.println("A divisão: " + valor2 + " / " + valor1 + " = " + div2);
		System.out.println("A divisão: " + valor1 + " / " + valor3 + " = " + div3);
		System.out.println("A divisão: " + valor2 + " / " + valor3 + " = " + div4);
		
		System.out.println("\n===========================================================");
		
		int resto1 = valor1 % valor2;
		double resto2 = valor1 % valor3;
		
		System.out.println("\nO resto: " + valor1 + " % " + valor2 + " = " + resto1);
		System.out.println("O resto: " + valor1 + " % " + valor3 + " = " + resto2);
		
		System.out.println("\n===========================================================\n\n\n");
	}
}