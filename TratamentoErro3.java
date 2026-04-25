import java.util.Scanner;

public class TratamentoErro3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Digite um numerador: ");
            int numerador = scan.nextInt();
            System.out.print("Digite o denominador: ");
            int denominador = scan.nextInt();

            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Erro no sistema!");
            System.err.println("Informe ao suporte o erro: " + e);            
        } finally {
            scan.close();
        }
    }
}
