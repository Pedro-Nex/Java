package aula05;
import java.util.Scanner;

public class ExercicioIfIfElse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-------- Wyane Eletricidade --------");
        System.out.print("Nome da Cidade: ");
        String cidade = scan.nextLine();
        System.out.print("Qual é a Região [ 1-Sul | 2-Norte | 3-Leste | 4-Oeste | 5-Centro ]: ");
        int polo = scan.nextInt();

        if (cidade.equalsIgnoreCase("SP")) {
            if (polo == 1) {
                System.out.println("Chamado enviado para o Polo da Região Sul.");
            } else if (polo == 2) {
                System.out.println("Chamado enviado para o Polo da Região Norte.");
            } else if (polo == 3) {
                System.out.println("Chamado enviado para o Polo da Região Leste.");
            } else if (polo == 4) {
                System.out.println("Chamado enviado para o Polo da Região Oeste.");
            } else if (polo == 5) {
                System.out.println("Chamado enviado para o Polo da Região Centro.");
            }
        } else {
            System.out.println("Nossa empresa atende apenas a cidade de São Paulo.");
            System.out.println("Empresa Wyane agradeçe.");
        }
        scan.close();
    }
}
