package aula04;

import java.util.Scanner;

public class CalculoMedia {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String nome;
        double n1, n2, n3, n4, media;
        System.out.println("=".repeat(50));
        System.out.print("Qual é o seu nome: ");
        nome = scan.nextLine();
        System.out.println("=".repeat(50));
        System.out.print("Nota da 1° prova: ");
        n1 = scan.nextDouble();
        System.out.print("Nota da 2° prova: ");
        n2 = scan.nextDouble();
        System.out.print("Nota da 3° prova: ");
        n3 = scan.nextDouble();
        System.out.print("Nota da 4° prova: ");
        n4 = scan.nextDouble();
        scan.close();
        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("=".repeat(50));
        System.out.println("Olá, " + nome + ". Sua média foi: " + String.format("%.2f", media));
        if (media >= 6) {
            System.out.println("Você passou de ano.");
        }
        else{
            System.out.println("Você não passou de ano.");
        }
        System.out.println("=".repeat(50));
    }
}