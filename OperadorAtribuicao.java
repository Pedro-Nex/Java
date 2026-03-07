/**
 * Nesse progrma vamos trabalhar com operadores de atribuição simples (=) e 
 * compostos (+=, -=, *=, /=, e %=)
 */

package aula04;

public class OperadorAtribuicao {
    public static void main(String args[]){
        int total = 500;

        System.out.println("=".repeat(50));

        System.out.println("Primeiro Total: " + total);

        // Adicionando 100 ao total

        total = total + 100;

        System.out.println("Segundo Total (+100): " + total);

        // Adicionando 150 ao total 

        total += 150;

        System.out.println("Terceiro Total (+150): " + total);

        // Subtraindo 50 do total

        total -= 75;

        System.out.println("Quarto Total (-75): " + total);

        // Multiplicando o total por 10

        total *= 3;

        System.out.println("Quinto Total (x3 ): " + total);

        // Dividindo o total por 5

        total /= 2;

        System.out.println("Sexto Total (/2): " + total);

        // Módulo do total por 3

        total %= 5;

        System.out.println("Setimo Total (%5): " + total);

        System.out.println("=".repeat(50));
    }
}
