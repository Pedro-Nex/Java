package aula04;

import java.util.Scanner;

public class Exercicio4c {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double altura, peso, imc;
        String nome;
        System.out.print("Qual é o seu nome: ");
        nome = scan.nextLine();
        System.out.print("Qual é o seu peso (use ,): ");
        peso = scan.nextDouble();
        System.out.print("Qual é a sua altura (use ,): ");
        altura = scan.nextDouble();
        imc = peso / (altura * altura);
        System.out.println(nome + ", o seu IMC é: " + String.format("%.1f", imc));
        scan.close();
    }
}
