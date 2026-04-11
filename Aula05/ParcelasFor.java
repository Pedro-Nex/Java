import java.util.Scanner;

public class ParcelasFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valorProduto = 2000;
        int parcelas = 12;
        int dia = 10;
        int mes = 4;
        int ano = 2026;

        double valorParcela = valorProduto / parcelas;

        for (int i=1; i<=parcelas; i++){
            System.out.println(i + " - " + dia + "/" + mes + "/" + ano + " - R$" + String.format("%.2f", valorParcela));
            mes++;
            if(mes > 12){
                mes = 1;
                ano++;
            }
        }
        scan.close();
    }
}
