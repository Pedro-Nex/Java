import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoErro1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Digite um numero inteiro: ");
            int numero = scan.nextInt();
            System.out.println("O número é: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Erro: A entrada deve ser de números inteiros");
            System.out.println("Informe ao suporte o erro: " + e);
        } finally {
            System.out.println("Sistema de gestão de números.");
        }
        scan.close();
    }
}
