import java.util.Scanner;

public class Revisao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nome do Aluno: ");
        String nomeAluno = scan.nextLine();

        double somaNotas = 0;
        double numNotas = 0;

        while (true) {
            System.out.print("Digite a Nota do " + nomeAluno + ": ");
            double nota = scan.nextDouble();
            somaNotas += nota;
            numNotas++;
            System.out.print("Deseja incluir outra nota (S/N)? ");
            String reposta = scan.next();
            if (reposta.equalsIgnoreCase("N")) {
                break;
            }
        }

        double media = somaNotas / numNotas;
        System.out.println("=".repeat(40));
        System.out.println("A média do aluno " + nomeAluno + " é: " + String.format("%.1f", media));
        if (media >= 6) {
            System.out.println("Aluno Aprovado.");
        } else if (media >= 4 && media < 6) {
            System.out.println("Aluno de Recuperação.");
        } else {
            System.out.println("Aluno Reprovado");
        }
        System.out.println("=".repeat(40));
        scan.close();
    }
}
