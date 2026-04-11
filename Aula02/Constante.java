package aula04;

public class Constante {
    public static void main(String args[]) {
        
        final double VALOR_PI = 3.1415926535;
        final int JUROS = 10;
        final String CAPITAL_BRASIL = "Brásilia";

        System.out.print("=".repeat(50));

        System.out.println("\n\nCalculando o raio de um círculo.");
        double area = 15;
        double raio = Math.sqrt(area / VALOR_PI);

        System.out.println("O raio do círculo de area " + area + " é " + String.format("%.2f", raio) + "\n");

        System.out.print("=".repeat(50)); //Repete o valor entre aspas

        System.out.println("\n\nCalculando o Juros simples de uma dívida.");
        double divida = 5000.00;
        double valorJuros = divida * JUROS / 100;
        double dividaComJuros = divida + valorJuros;

        System.out.println("Você está devendo: R$ " + String.format("%,.2f", dividaComJuros) + "\n");

        System.out.println("=".repeat(50));

        System.out.println("\nA Capital do Brasil é: " + CAPITAL_BRASIL + "\n");

        System.out.println("=".repeat(50));
    }
}
