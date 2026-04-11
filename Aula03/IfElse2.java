package aula05;
import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número interiro: ");
        int numero = scan.nextInt();

        if(numero % 2 == 0){
            System.out.println("O número " + numero + " é PAR!");
        }else{
            System.out.println("O número " + numero + " é ÍMPAR!");
        }
        scan.close();
    }
}
