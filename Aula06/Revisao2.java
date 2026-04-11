import java.util.Scanner;

public class Revisao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=".repeat(40));
        System.out.println("* Escola Celso Charuri *");
        System.out.println("=".repeat(40));
        System.out.print("Quantas notas deseja lançar: ");
        int numNotas = scan.nextInt();
        double somaNotas = 0;

        for (int i = 1; i <= numNotas; i++){
            System.out.print("Digite a " + i + "ª Nota: ");
            double nota = scan.nextDouble();
            somaNotas += nota;
        }
        double media = somaNotas / numNotas;
        System.out.println("=".repeat(40));
        System.out.println("A média do aluno é: " + String.format("%.1f", media));
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
