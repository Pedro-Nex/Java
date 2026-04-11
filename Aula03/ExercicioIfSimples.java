package aula05;
import java.util.Scanner;

public class ExercicioIfSimples {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String produto;
        int estoqueAtual, estoqueMinimo;

        System.out.println("=".repeat(50));

        System.out.print("Nome do Produto: ");
        produto = scan.nextLine();

        System.out.print("Qual é a quantidade em Estoque: ");
        estoqueAtual = scan.nextInt();

        System.out.print("Qual é o Estoque Minimo: ");
        estoqueMinimo = scan.nextInt();

        System.out.println("=".repeat(50));

        if (estoqueMinimo >= estoqueAtual){
            System.out.println("Produto: " + produto);
            System.out.println("Estoque Atual: " + estoqueAtual);
            System.out.println("ESTOQUE ABAIXO DO MÍNIMO, SOLICITANDO PEDIDO AO DEPARTAMENTO DE COMPRAS!");
        }

        if (estoqueMinimo < estoqueAtual){
            System.out.println("Produto: " + produto);
            System.out.println("Estoque Atual: " + estoqueAtual);
        }

        System.out.println("=".repeat(50));
        
        scan.close();
    }
}
