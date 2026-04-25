import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoErro2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Calculadora para Divisão de Números");
            System.out.println("-".repeat(40));
            System.out.print("Digite um numerador da divisão: ");
            int numerador = scan.nextInt();
            System.out.print("Digite o denominador da divisão: ");
            int denominador = scan.nextInt();

            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possivel dividir um número por 0.");
            System.err.println("Informe ao suporte o erro: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro: A entrada deve ser de números inteiros");
            System.err.println("Informe ao suporte o erro: " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}
