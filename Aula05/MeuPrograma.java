package aula04;

import java.util.Scanner;

public class MeuPrograma {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("=".repeat(50));

        double saldo = 1500;
        System.out.println("Saldo Inicial: R$" + String.format("%,.2f", saldo));

        System.out.print("\nDigite o valor que quer retirar: ");
        double sacar = scanner.nextDouble();
        System.out.println("\nFoi débitado, R$" + String.format("%,.2f", sacar) + " da sua conta.");
        saldo -= sacar;

        System.out.println("Saldo Atual: R$" + String.format("%,.2f", saldo));

        System.out.print("\nDigite o valor que quer incluir: ");
        double incluir = scanner.nextDouble();
        System.out.println("\nFoi creditado, R$" + String.format("%,.2f", incluir) + " na sua conta.");
        saldo += incluir;
        
        System.out.println("Saldo Atual: R$" + String.format("%,.2f", saldo));

        scanner.close();
        System.out.println("=".repeat(50));
    }
}
