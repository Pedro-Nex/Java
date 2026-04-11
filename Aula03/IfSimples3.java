package aula05;
import java.util.Scanner;

public class IfSimples3 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("=".repeat(50));
        System.out.println("**** Sistema de Folha de Pagamento ****");
        System.out.println("=".repeat(50));
        double salarioMinimo = 1621.00;

        System.out.print("Digite o salário do funcionário: ");
        double salario = scan.nextDouble();

        if (salario < salarioMinimo){
            double valorAumento = salario * 0.15;
            salario += valorAumento;
        }

        System.out.println("Salário Atual: " + salario);

        scan.close();
    }
}
