import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nome do Aluno: ");
        String aluno = scan.nextLine();
        
        int numNotas = 0;
        double somaNotas = 0;

        while (true) {
            System.out.print("Digite a nota do Aluno: ");
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
        System.out.println("A média do aluno " + aluno + " é: " + String.format("%.1f", media));
        if (media >= 6) {
            System.out.println("Aluno Aprovado.");
        } else if (media >= 3 && media < 6) {
            System.out.println("Aluno de Recuperação.");
        } else {
            System.out.println("Aluno Reprovado");
        }
        scan.close();
    }
}
