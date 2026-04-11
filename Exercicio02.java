import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] numeros = new double[6];
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite o " + (i + 1) + "° Numero: ");
            numeros[i] = scan.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        System.out.println("=".repeat(40));
        System.out.println("A soma é: " + String.format("%,.1f", soma));
        System.out.println("=".repeat(40));
        scan.close();
    }
}
