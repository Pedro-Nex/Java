import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("=".repeat(40));
        System.out.println("* Escola Celso Charuri *");
        System.out.println("=".repeat(40));

        System.out.print("Quantas notas deseja lançar: ");
        int numNotas = scan.nextInt();

        double[] notas = new double[numNotas];
        scan.nextLine();

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scan.nextLine();

        for (int i = 0; i < notas.length; i++){
            System.out.print("Digite a " + (i + 1) + "ª Nota: ");
            notas[1] = scan.nextDouble();
        }
        double somaNotas = 0;
        for (int i = 0; i < notas.length; i++){
            somaNotas += notas[i];
        }
        double media = somaNotas / notas.length;
        System.out.println("=".repeat(40));
        System.out.println("A média do " + nomeAluno + " é: " + String.format("%.1f", media));
        for (int i = 0; i < notas.length; i++){
            System.out.println("Nota: " + notas[i]);
        }
        System.out.println("=".repeat(40));
        scan.close();
    }
}
