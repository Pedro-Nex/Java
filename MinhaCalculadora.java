package aula05;

import java.util.Scanner;

public class MinhaCalculadora {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double numero1, numero2, total;
        int opcao;

        do {
            System.out.print("=".repeat(50));
            System.out.print("\nPrimeiro Número: ");
            numero1 = leia.nextDouble();

            System.out.print("Segundo Número: ");
            numero2 = leia.nextDouble();

            System.out.println("=".repeat(50));
            System.out.println("----- Escolha uma opção -----");
            System.out.println("1. Somar, 2. Subtrair, 3. Multiplicar, 4. Dividir, 0. Sair");
            System.out.print("Opção: ");
            opcao = leia.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando programa...");
                break; 
            }

            switch (opcao) {
                case 1:
                    total = numero1 + numero2;
                    System.out.println("Resultado: " + total);
                    break;
                case 2:
                    total = numero1 - numero2;
                    System.out.println("Resultado: " + total);
                    break;
                case 3:
                    total = numero1 * numero2;
                    System.out.println("Resultado: " + total);
                    break;
                case 4:
            
                    if (numero2 != 0) {
                        total = numero1 / numero2;
                        System.out.println("Resultado: " + total);
                    } else {
                        System.out.println("Erro: Divisão por zero não permitida.");
                    }
                    break;
                default:
                    System.out.println("Opção Inválida.");
            }

        } while (opcao != 0);

        leia.close();
    }
}