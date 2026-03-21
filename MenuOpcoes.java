import java.util.Scanner;

public class MenuOpcoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=".repeat(50));
        System.out.println("***** Menu de Serviços *****");
        System.out.println("1 - Novo documento de identidade.");
        System.out.println("2 - Carteira Profissional CTPS.");
        System.out.println("3 - CNH.");
        System.out.println("4 - Título de Eleitor.");
        System.out.println("9 - Sair do Sistema.");
        System.out.println("=".repeat(50));
        System.out.print("Digite uma opção do Menu: ");
        int opcao = scan.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Dirija-se à mesa 12.");
                break;
            case 2:
                System.out.println("Dirija-se à mesa 25.");
                break;
            case 3:
                System.out.println("Dirija-se ao setor Amarelo.");
                break;
            case 4:
                System.out.println("Dirija-se ao setor TRE.");
                break;
            case 9:
                System.out.println("Encerrando o Sistema.");
                break;
            default:
                System.out.println("Opção Inválida.");
        }
        scan.close();
    }
}