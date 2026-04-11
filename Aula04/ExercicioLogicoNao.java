import java.util.Scanner;

public class ExercicioLogicoNao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digire a senha Atual: ");
        String senhaAtual = scan.nextLine();
        System.out.print("Digite a senha Nova: ");
        String senhaNova = scan.nextLine();
        if (!(senhaNova.equals(senhaAtual))){
            System.out.println("Senha alterada.");
        } else {
            System.out.println("Erro: A nova senha não pode ser igual a senha atual.");
        }
        scan.close();
    }
}
