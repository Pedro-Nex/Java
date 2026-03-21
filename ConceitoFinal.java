package aula06;
import java.util.Scanner;

public class ConceitoFinal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("=".repeat(50));
        System.out.println("***** Escola *****");
        System.out.println("=".repeat(50));
        System.out.print("Digite o nome do Aluno: ");
        String nome = scan.nextLine();
        System.out.print("Digite a média do Aluno: ");
        double media = scan.nextDouble();
        System.out.print("Digite a porcentagem de frequência do aluno (Apenas Número): ");
        int frequencia = scan.nextInt();
        String conceito = "";

        if (media >= 7.0 && frequencia >= 75){
            conceito = "Aprovado!";
        } else if (media >= 5 && media < 7 && frequencia >= 75){
            conceito = "Recuperação!";
        } else {
            conceito = "Reprovado!";
        }

        System.out.println("=".repeat(50));
        System.out.println("***** Relatório Final *****");
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Frequeência: " + frequencia + ("%"));
        System.out.println("Conceito Final: " + conceito);
        System.out.println("=".repeat(50));
        scan.close();
    }
}
