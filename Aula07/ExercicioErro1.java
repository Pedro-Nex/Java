import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioErro1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("-".repeat(40));
                System.out.println("Sistema de Notas");
                System.out.println("-".repeat(40));
                System.out.print("Digite a 1ª Nota: ");
                int nota1 = scan.nextInt();
                System.out.print("Digite a 2ª Nota: ");
                int nota2 = scan.nextInt();
                System.out.print("Digite a 3ª Nota: ");
                int nota3 = scan.nextInt();
                System.out.print("Digite a 4ª Nota: ");
                int nota4 = scan.nextInt();

                int media = (nota1 + nota2 + nota3 + nota4) / 4;

                System.out.println("A média é: " + media);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: A entrada deve ser apenas números");
                scan.next();
            } catch (Exception e) {
                System.out.println("Erro no sistema!");
                System.err.println("Informe ao suporte o erro: " + e);
                break;
            }
        }
        scan.close();
    }
}
