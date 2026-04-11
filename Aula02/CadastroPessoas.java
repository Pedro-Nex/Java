package aula04;

import java.util.Scanner;

public class CadastroPessoas {
    public static void main(String args[]){
        Scanner leia = new Scanner(System.in);

        String nome, sexo;
        int idade;
        double altura;

        System.out.print("Digite seu nome Completo: ");
        nome = leia.nextLine();
        System.out.print("Digite a sua idade: ");
        idade = leia.nextInt();
        System.out.print("Digite a sua altura: ");
        altura = leia.nextDouble();
        System.out.print("Digite o seu sexo (Masculino ou Feminino): ");
        sexo = leia.next();

        System.out.println("---------------- Informações ----------------\n");
        System.out.println("Nome Completo: " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "\nSexo: " + sexo);
        System.out.println("\n---------------- Informações ----------------");

        leia.close();
    }
}
