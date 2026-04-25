import java.util.Scanner;
import java.util.InputMismatchException;

public class TratamentoErro4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Calculadora para Divisão de Números");
                System.out.println("-".repeat(40));
                System.out.print("Digite um numerador da divisão: ");
                int numerador = scan.nextInt();
                System.out.print("Digite o denominador da divisão: ");
                int denominador = scan.nextInt();

                int resultado = numerador / denominador;
                System.out.println("Resultado: " + resultado);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Erro: Não é possivel dividir um número por 0.");
                scan.next();
            } catch (InputMismatchException e) {
                System.out.println("Erro: A entrada deve ser de número inteiro");
                scan.next();
            } catch (Exception e) {
                System.out.println("Erro no sistema!");
                System.err.println("Informe ao suporte o erro: " + e);
                break;
            }
        }
        scan.close();
    }
}
