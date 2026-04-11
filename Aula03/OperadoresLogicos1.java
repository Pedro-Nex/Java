package aula05;
import java.util.Scanner;

public class OperadoresLogicos1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=".repeat(50));
        
        System.out.println("Escola Senai Celso Charuri");
        System.out.println("=".repeat(50));
        System.out.print("1° Nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("2° Nota: ");
        double nota2 = scan.nextDouble();
        System.out.print("3° Nota: ");
        double nota3 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 50 && media <= 100){
            System.out.println("Aluno Aprovado.");
            System.out.println("Média: " + String.format("%.1f", media));
        }else if(media >= 20 && media < 50){
            System.out.println("Aulno de Recuperação");
            System.out.println("Média: " + String.format("%.1f", media));
        }else if(media >= 0 && media < 20){
            System.out.println("Aulno Reprovado");
            System.out.println("Média: " + String.format("%.1f", media));
        }else{
            System.out.println("Notas informadas inválidas");
        }
        scan.close();
    }
}
