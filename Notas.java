import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***** Escola Tech Nine *****");
        System.out.print("Digite a nota do aluno: ");
        String nota = scan.nextLine();
        nota = nota.toUpperCase();
        switch (nota) {
            case "A":
            case "B":
                System.out.println("Aluno Aprovado.");
                break;
            case "C":
                System.out.println("Aluno De Recuperação.");
                break;
            case "D":
            case "E":
                System.out.println("Aluno Reprovado.");
                break;
            default:
                System.out.println("Nota Inválida.");
        }
        scan.close();
    }
}