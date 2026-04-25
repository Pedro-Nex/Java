import java.util.Scanner;

public class Metodo1 {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Método em Java.");
        System.out.print("Digite o seu Nome: ");
        String nome = scan.nextLine();
        System.out.print("Digite a sua Idade: ");
        int idade = scan.nextInt();
        scan.nextLine();
        System.out.print("O que gosta de fazer: ");
        String hobby = scan.nextLine();

        exibirMensagem();
        System.out.println("Seu Mome é: " + nome);

        exibirMensagem();
        System.out.println("Sua Idade é: " + idade);

        exibirMensagem();
        System.out.println("Seu hobby é: " + hobby);

        scan.close();
    }
    // Método estatico (static). Utilizado dentro da classe.
    // Método sem retorno (void) e sem atributo (dentro das ()).
    public static void exibirMensagem () {
        System.out.println("Está gostando do Java? Creio que Sim!.");
        System.out.println("=".repeat(40));
    }
}
