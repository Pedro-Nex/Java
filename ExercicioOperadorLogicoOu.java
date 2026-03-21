import java.util.Scanner;

public class ExercicioOperadorLogicoOu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=".repeat(50));
        System.out.println("***** Dias da Semana *****");
        System.out.println("1 - Domingo.");
        System.out.println("2 - Segunda-Feira.");
        System.out.println("3 - Terça-Feira.");
        System.out.println("4 - Quarta-Feira.");
        System.out.println("5 - Quinta-Feira.");
        System.out.println("6 - Sexta-Feira.");
        System.out.println("7 - Sábado.");
        System.out.println("=".repeat(50));
        System.out.print("Qual dia da Semana: ");
        int dia = scan.nextInt();
        if (dia == 1 || dia == 7) {
            if (dia == 1) {
                System.out.println("Dia de Missa!!");
            }
            System.out.println("Final de Semana.");
        } else if (dia == 2 || dia == 3) {
            System.out.println("Inicio da Semana.");
        } else if (dia == 4 || dia == 5 || dia == 6) {
            System.out.println("Resto da Semana.");
        } else {
            System.out.println("Número Inválido");
        }
        scan.close();
    }
}
