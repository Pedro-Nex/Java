package aula05;
import java.util.Scanner;

public class IfElseIf2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String nome, nota;

        System.out.print("Digite o nome do aluno: ");
        nome = scan.nextLine();

        System.out.print("Digite a nota do aluno (D, ED ou ND): ");
        nota = scan.nextLine();


        if (nota.equalsIgnoreCase("D")){
            System.out.println(nome + ". está APROVADO nessa disciplina.");
        }else if(nota.equalsIgnoreCase("ED")){
            System.out.println(nome + ". está de RECUPERAÇÃO nessa disciplina.");
        }else if(nota.equalsIgnoreCase("ND")){
            System.out.println(nome + ". está de REPROVADO nessa disciplina.");
        }else{
            System.out.println("Nota digitada inválida.");
        }

        System.out.println("=".repeat(50));
        System.out.println("*** Sistema Educacional Plutão ***");
        System.out.println("=".repeat(50));

        scan.close();
    }
}