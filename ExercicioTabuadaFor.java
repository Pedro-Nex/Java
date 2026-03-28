import java.util.Scanner;

public class ExercicioTabuadaFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=".repeat(50));
        System.out.println("*************** Sistema de Tabuada ***************");
        System.out.println("-".repeat(50));
        System.out.print("Digite um número para tabuada: ");
        int numero = scan.nextInt();
        System.out.println("-".repeat(50));
        System.out.println("                Tabuada do " + numero);
        System.out.println("-".repeat(50));

        for(int i=1;i<=10;i++){
            int total = i * numero;
            System.out.println(numero + " X " + i + " = " + total);
        }
        scan.close();
    }
}
