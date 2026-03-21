import java.util.Scanner;

public class ExercicioCalculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total;
        System.out.print("\nPrimeiro Número: ");
        double numero1 = scan.nextDouble();
        System.out.print("Segundo Número: ");
        double numero2 = scan.nextDouble();
        System.out.println("=".repeat(50));
        System.out.println("----- Escolha uma opção -----");
        System.out.println("(+) Somar | (-) Subtrair | (*) Multiplicar | (/) Dividir | 0. Sair");
        System.out.print("Opção: ");
        String opcao = scan.next();
        switch (opcao) {
            case "+":
                total = numero1 + numero2;
                System.out.println(numero1 + " + " + numero2);
                System.out.println("Resultado: " + total);
                break;
            case "-":
                total = numero1 - numero2;
                System.out.println(numero1 + " - " + numero2);
                System.out.println("Resultado: " + total);
                break;
            case "*":
                total = numero1 * numero2;
                System.out.println(numero1 + " * " + numero2);
                System.out.println("Resultado: " + total);
                break;
            case "/":
                if (numero2 != 0) {
                    total = numero1 / numero2;
                    System.out.println(numero1 + " / " + numero2);
                    System.out.println("Resultado: " + total);
                } else {
                    System.out.println("Erro: Divisão por zero não permitida.");
                }
                break;
            case "0":
                System.out.println("Encerrando programa...");
                break;
            default:
                System.out.println("Opção Inválida.");
        }
        System.out.println("=".repeat(50));
        scan.close();
    }
}
