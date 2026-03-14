package aula05;
import java.util.Scanner;

public class OperadoresLogicos2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o memória do computador: ");
        int memoria = scan.nextInt();
        System.out.print("Digite o processador do computador: ");
        String processador = scan.next();

        if(memoria >= 16 && processador.equalsIgnoreCase("i7") || processador.equalsIgnoreCase("i9")){
            System.out.println("Requisitos recomendados atendidos: Desempenho Ultra.");
        }else if(memoria >= 8 && processador.equalsIgnoreCase("i5") || processador.equalsIgnoreCase("i7") || processador.equalsIgnoreCase("i9")){
            System.out.println("Requisito minimos atendidos: Desempenho Médio.");
        }else {
            System.out.println("Hardware Insuficiente para esse Software.");
        }
        scan.close();
    }
}
