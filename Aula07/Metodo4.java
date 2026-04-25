import java.util.Scanner;

public class Metodo4 {
    public static int somarNumeros(int n1, int n2, int n3) {
        int resultado = n1 + n2 + n3;
        return resultado;
    }
    public String criarEmail(String nome, String sobrenome){
        String email = nome.toLowerCase() + "." + sobrenome.toLowerCase() + "@senaisp.edu.br";
        return email;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o 1° Número: ");
        int num1 = scan.nextInt();
        System.out.print("Digite o 2° Número: ");
        int num2 = scan.nextInt();
        System.out.print("Digite o 3° Número: ");
        int num3 = scan.nextInt();

        int resultado = somarNumeros(num1, num2, num3);

        System.out.println("A soma dos números é: " + resultado);
        System.out.println("=".repeat(40));

        System.out.print("Digite o seu 1° Nome: ");
        String nome = scan.next();
        System.out.print("Digite o seu 1° Sobrenome: ");
        String sobreNome = scan.next();

        Metodo4 objetoEmail = new Metodo4();
        String email = objetoEmail.criarEmail(nome, sobreNome);

        System.out.println("Seu E-mail é: " + email);
        scan.close();
    }
}
