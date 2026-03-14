package aula05;
import java.util.Scanner;

public class ExercicioIfElse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("=".repeat(50));

        String nome, cidade;
        System.out.print("Digite o seu nome: ");
        nome = scan.nextLine();
        System.out.print("Digite o nome da sua cidade: ");
        cidade = scan.nextLine();

        System.out.println("=".repeat(50));

        if(cidade.equalsIgnoreCase("Guarulhos")){
            System.out.println(nome + ". A sua contratação será para a modalidade Presencial.");
        }else{
            System.out.println(nome + ". A sua contratação será para a modalidade Home Office.");
        }

        System.out.println("***** Wayne Recursos Humanos *****");

        System.out.println("=".repeat(50));

        scan.close();
    }
}