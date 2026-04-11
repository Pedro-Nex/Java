import java.util.Scanner;

public class ConceitoFinal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        double nota, soma, media;
        int contador;
        nota = 0.0;
        soma = 0.0;
        media = 0.0;
        contador = 1;

        System.out.println("----- Conceito 5 Notas -----");
        System.out.print("Nome do Aluno: ");
        nome = scan.nextLine();

        while (contador <= 5) {
            System.out.println("Digite a " + contador + "ª Nota: ");
            nota = scan.nextDouble();
            soma += nota;
            contador++;
        }
        media = soma / 5;

        if (media >= 6) {
            System.out.println("O aluno, " + nome + ". Obteve a média " + String.format("%.1f", media));
            System.out.println("Resultado: Aprovado.");
        } else if (media >= 3 && media < 6) {
            System.out.println("O aluno, " + nome + ". Obteve a média " + String.format("%.1f", media));
            System.out.println("Resultado: Recuperação.");
        } else {
            System.out.println("O aluno, " + nome + ". Obteve a média " + String.format("%.1f", media));
            System.out.println("Resultado: Reprovado.");
        }

        scan.close();
    }
}
