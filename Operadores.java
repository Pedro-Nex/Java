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
		
		int soma1 = valor1 + valor2;
		double soma2 = valor1 + valor3;
		
		System.out.println("\nA soma de " + valor1 + " + " + valor2 + " = " + soma1);
		System.out.println("A soma de " + valor1 + " + " + valor3 + " = " + soma2);
		
		int sub1 = valor1 - valor2;
		double sub2 = valor1 - valor3;
		
		System.out.println("\nA subtração de " + valor1 + " - " + valor2 + " = " + sub1);
		System.out.println("A subtração de " + valor1 + " - " + valor3 + " = " + sub2);
		
		int mult1 =  valor1 * valor2;
		double mult2 = valor1 * valor3;
		
		System.out.println("\nA multiplicação de " + valor1 + " * " + valor2 + " = " + mult1);
		System.out.println("A multiplicação de " + valor1 + " * " + valor3 + " = " + mult2);
		
		int div1 =  valor1 / valor2;
		double div2 = valor1 / valor3;
		
		System.out.println("\nA divisão de " + valor1 + " / " + valor2 + " = " + div1);
		System.out.println("A divisão de " + valor1 + " / " + valor3 + " = " + div2);
		
		int resto1 = valor1 % valor2;
		double resto2 = valor1 % valor3;
		
		System.out.println("\nO resto de " + valor1 + " % " + valor2 + " = " + resto1);
		System.out.println("O resto de " + valor1 + " % " + valor3 + " = " + resto2);
	}
}