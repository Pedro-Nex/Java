package aula05;
import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("=".repeat(50));

        System.out.print("Digite o nome do candidato a Presidente: ");
        String nome = scan.nextLine();

        System.out.print("Digite a idade do candidato: ");
        int idade = scan.nextInt();

        System.out.println("=".repeat(50));

        if(idade < 35){
            System.out.println("Pela constituição de 1988, o candidato deve ter 35 anos completos para esse cargo.");
        }else{
            System.out.println("Parabéns, " + nome + ". Candidatura registrada com sucesso!");
        }

        System.out.println("Tribunal Superior Eleitoral");

        System.out.println("=".repeat(50));

        scan.close();
    }
}