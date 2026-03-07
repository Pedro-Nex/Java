package aula04;

public class Exercicio4b {
    public static void main(String args[]){

        System.out.println("=".repeat(50));

        double saldo = 1500;

        System.out.println("Saldo Inicial: R$" + String.format("%,.2f", saldo));

        saldo -= 350;

        System.out.println("\nFoi débitado R$ 350,00 da sua conta.");
        System.out.println("Saldo Atual: R$" + String.format("%,.2f", saldo));

        saldo += 500;

        System.out.println("\nFoi creditado R$ 500,00 na sua conta.");
        System.out.println("Saldo Atual: R$" + String.format("%,.2f", saldo));

        System.out.println("=".repeat(50));
    }
}
