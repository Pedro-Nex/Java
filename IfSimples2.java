package aula05;
import java.util.Scanner;
import java.time.LocalDate;

public class IfSimples2 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        LocalDate dataAtual = LocalDate.now();
        
        int anoAtual = dataAtual.getYear();
        System.out.println("Data Atual: " + anoAtual);
        System.out.print("Digite o seu ano de nascimento: ");
        int anoNasc = scan.nextInt();
        int idade = anoAtual - anoNasc;

        System.out.print("Você já fez aniversário esse ano (S/N)? ");
        String resposta = scan.next();
        if (resposta.equalsIgnoreCase("N")){
            idade -= 1;
        }
        System.out.println("Sua idade é: " + idade);

        scan.close();
    }
}