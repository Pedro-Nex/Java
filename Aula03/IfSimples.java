package aula05;
import java.util.Scanner;

public class IfSimples {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("=".repeat(50));
        System.out.println("* Verificação de Idade para Acesso *");
        System.out.println("=".repeat(50));
        System.out.print("Digite a idade do Convidado: ");
        int idade = scan.nextInt();
        System.out.println("=".repeat(50));

        if (idade >= 18){
            System.out.println("Idade Verificada: " + idade + " anos.");
            System.out.println("Acesso liberado!");
        }
        if (idade < 18){
            System.out.println("Idade Verificada: " + idade + " anos.");
            System.out.println("Acesso Negado!");
        }

        System.out.println("=".repeat(50));
        System.out.println("Sistema Lotus");

        scan.close();
    }
}
