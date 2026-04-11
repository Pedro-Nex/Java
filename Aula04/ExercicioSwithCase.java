import java.util.Scanner;

public class ExercicioSwithCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=".repeat(60));
        System.out.println("***** Escola Tech Nine *****");
        System.out.println("=".repeat(60));

        System.out.print("Nome do aluno: ");
        String nome = scan.nextLine();

        System.out.println("=".repeat(60));
        System.out.println("D - Desenvolvimento.");
        System.out.println("ED - Em Desenvolvimento.");
        System.out.println("ND - Não Desenvolvido.");
        System.out.println("S - Sair do Sistema.");
        System.out.println("=".repeat(60));

        System.out.print("Qual menção do aluno, " + nome + ": ");
        String mencao = scan.nextLine();
        mencao = mencao.toUpperCase();

        switch (mencao) {
            case "D":
                System.out.println("Aluno Aprovado.");
                break;
            case "ED":
                System.out.println("Aluno De Recuperação.");
                break;
            case "ND":
                System.out.println("Aluno Reprovado.");
                break;
            case "S":
                System.out.println("Encerrando o Sistema.");
                break;
            default:
                System.out.println("Nota Inválida.");
        }

        System.out.println("=".repeat(60));
        System.out.println("***** Escola Tech Nine *****");
        System.out.println("=".repeat(60));
        
        scan.close();
    }
}
