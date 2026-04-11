import java.util.Scanner;
import java.util.Random;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random sort = new Random();
        System.out.println("=".repeat(50));
        System.out.println("***** Bem-vindo ao jogo de advinhação *****");
        System.out.println("=".repeat(50));
        System.out.println("Você tem 3 tentativas para advinhar um número. Entre 1 e 10.");
        System.out.println("Esse número será sorteado pelo Pc.");
        System.out.println("Boa Sorte!!");
        int tentativas = 3;
        int numeroSecreto = sort.nextInt(10) + 1;        
        do {
            System.out.print("Digite o número (Entre 1 e 10): ");
            int numero = scan.nextInt();
            if (numero == numeroSecreto){
                System.out.println("Parabéns!!!");
                System.out.println("Você acertou!!!");
                break;
            } else if (numero > numeroSecreto){
                System.out.println("Menor!");
            } else {
                System.out.println("Maior!");
            }
            tentativas--;
            if (tentativas > 0) {
                System.out.println("Tente Novamente...");
            }
        } while (tentativas > 0);
        if (tentativas == 0){
            System.out.println("=".repeat(50));
            System.out.println("Perdeu!!!!");
            System.out.println("Você não acertou o número.");
            System.out.println("O número era: " + numeroSecreto);
            System.out.println("=".repeat(50));
        }
        scan.close();
    }
}
