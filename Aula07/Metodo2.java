import java.util.Scanner;

public class Metodo2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = scan.nextLine();
        tracar();
        Metodo2 objeto = new Metodo2();
        objeto.saudarUsuario(nome);
        tracar();
        System.out.print("Digite outro nome: ");
        nome = scan.nextLine();
        tracar();
        objeto.saudarUsuario(nome);
        tracar();
        scan.close();
    }
    // Método não estático: utilização por instância.
    // Método sem retorno com atributos.
    public void saudarUsuario(String nomeUsuario) {
        System.out.println("Olá, " + nomeUsuario + "!");
        System.out.println("Seja bem-vindo ao sistema!");
    }
    // Método estático (static): utilização por classe.
    // Método sem retono e sem atributo.
    public static void tracar() {
        System.out.println("*" + "=".repeat(40) + "*");
    }
}