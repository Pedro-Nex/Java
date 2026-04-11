import java.util.Scanner;

public class Convidados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Número maximo de convidados: 100 pessoas.");
        System.out.print("Digite o número de convidados: ");
        int convidados = scan.nextInt();

        do {
            if (convidados > 100) {
                System.out.println("Número inválido de convidados.");
                System.out.print("Digite outro número de convidados: ");
                convidados = scan.nextInt();
            }
        } while (convidados > 100);
        System.out.println("Reserva efetuada com Sucesso!");
        System.out.println("Enviando e-mail com as instruções");
        System.out.println("Sistema de Salão");
        scan.close();
    }
}
