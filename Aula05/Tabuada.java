
/**
 * Nesse programa vamos solicitar ao usuario para digitar um número para impressão da tabuada
 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=".repeat(50));
        System.out.println("*************** Sistema de Tabuada ***************");
        System.out.println("-".repeat(50));
        System.out.print("Digite um número para tabuada: ");
        int numero = scan.nextInt();
        System.out.println("-".repeat(50));
        System.out.println("                Tabuada do " + numero);
        System.out.println("-".repeat(50));

        int contador = 1;
        int limite = 10;
        while (contador <= limite) {
            int total = contador * numero;
            System.out.println(numero + " X " + contador + " = " + total);
            contador++;
        }
        System.out.println("-".repeat(50));
        System.out.println("Fim da Tabuada.");
        scan.close();
    }
}
