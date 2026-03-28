
/**
 * Nesse programa vamos solicitar o nome de usuario e a senha com 3 tentativas
 * Ao final da terceira tentativa sem exito, o sistema interrompe a solicitação de usuário e senha
 */
import java.util.Scanner;
import java.io.Console; // biblioteca para ocultar a senha no console

public class VerificarSenha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Console cons = System.console();
        String usuario = "admin";
        String senha = "super123";
        int tentativas = 1;
        while (tentativas <= 3) {
            System.out.print("Usuário: ");
            String nomeUsuario = scan.next();
            // System.out.print("Senha: ");
            char[] senhaArray = cons.readPassword("Senha: ");
            String senhaUsuario = new String(senhaArray);
            if (nomeUsuario.equals(usuario) && senhaUsuario.equals(senha)) {
                break;
            } else if (tentativas < 3) {
                System.out.println("Nome do Usuário ou Senha Incorretos.");
                System.out.println("Tente novamente...");
                tentativas++;
            } else {
                System.out.println("Nome do Usuário ou Senha Incorretos.");
                tentativas++;
            }
        }
        if (tentativas > 3) {
            System.out.println("Acesso Negado! Número máximo de tentativas atingido.");
        } else {
            System.out.println("Acesso concedido. Bem-vindo!");
        }
        scan.close();
    }
}