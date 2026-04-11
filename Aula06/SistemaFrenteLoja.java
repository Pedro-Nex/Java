import java.util.Scanner;

public class SistemaFrenteLoja {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=".repeat(50));
        System.out.println("***************** Lojas Maribase *****************");
        System.out.println("=".repeat(50));
        System.out.print("Vendedor: ");
        String nomeVendedor = scan.nextLine();
        System.out.println("-".repeat(50));
        System.out.print("Produto: ");
        String nomeProduto = scan.nextLine();
        System.out.print("Valor Total: R$");
        double valorTotal = scan.nextDouble();
        System.out.print("Parcelas (Entre 1 e 10): ");
        int parcelas = scan.nextInt();
        if (parcelas >= 1 && parcelas <= 10) {
            System.out.println("Número de parcelas aceito.");
        } else {
            System.out.println("Número de parcelas recusado");
            System.exit(0);
        }
        System.out.print("Dia de pagamento (5, 10, 15, 20 ou 25): ");
        int diaPag = scan.nextInt();
        if (diaPag == 5 || diaPag == 10 || diaPag == 15 || diaPag == 20 || diaPag == 25) {
            System.out.println("Dia de pagamento aceito.");
        } else {
            System.out.println("Dia de pagamento recusado");
            System.exit(0);
        }
        System.out.println("-".repeat(50));
        int contador = 1;
        if (parcelas == 1){
            double valorDesconto = valorTotal * 0.10;
            valorTotal -= valorDesconto;
        }
        double valorParcela = valorTotal / parcelas;
        int mes, ano;
        ano = 2026;
        mes = 04;
        while (contador <= parcelas) {
                System.out.println(contador + " - " + diaPag + "/" + mes + "/" + ano + " - " + "R$ " + String.format("%,.2f", valorParcela));
                contador++;
                mes++;
                if(mes > 12){
                    mes = 1;
                    ano++;
                } 
        }
        System.out.println("-".repeat(50));
        System.out.println(nomeVendedor + ", mais uma venda!! O " + nomeProduto + " deve ser entrege em 5 dias.");
        System.out.println("=".repeat(50));
        System.out.println(" **** SISGER - Sistema Gerenciador de Loja ****");
        System.out.println("=".repeat(50));

        scan.close();
    }
}
