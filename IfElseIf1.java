package aula05;
import java.util.Scanner;

public class IfElseIf1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o horário disponível (Somente Hora Cheia): ");
        int hora = scan.nextInt();

        if(hora <= 6){
            System.out.println("Turno da noite: das 22h às 6h.");
        }else if (hora <= 14) {
            System.out.println("Turno da manhã: das 6h às 14h.");
        }else if (hora <= 22) {
            System.out.println("Turno da tarde: das 14h à 22h.");
        }else {
            System.out.println("Turno da noite: das 22h à 6h.");
        }

        scan.close();
    }
}
