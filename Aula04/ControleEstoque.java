import java.util.Scanner;

public class ControleEstoque {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*** Controle Estoque ***");
        System.out.println("=".repeat(50));
        System.out.print("Digite a quantidade no Estoque: ");
        int quantEstoque = scan.nextInt();
        if (!(quantEstoque > 0)) {
            System.out.println("Produto Esgotado.");
        } else if (!(quantEstoque > 100)) {
            System.out.println("Estoque Mínimo.");
            System.out.println("Solicitação de compra emitido.");
        } else {
            System.out.println("Produto sendo Separado.");
        }
        scan.close();
    }
}
