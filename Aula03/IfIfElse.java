package aula05;
import java.util.Scanner;

public class IfIfElse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();
        scan.nextLine();
        System.out.print("Digite seu sexo (M/F): ");
        String sexo = scan.nextLine();
        if(sexo.equalsIgnoreCase("M")){
            if(idade == 18){
                System.out.println(nome + ". Entre no site GOV para o Alistamento Militar");
            } else {
            System.out.println(nome + ". Você não está apto para o serviço militar.");
            }
        } else if (sexo.equalsIgnoreCase("F")){
            System.out.println(nome + ". Pessoa do sexo Feminino não são obrigadas a fazer o alistamento militar");
        } else {
            System.out.println("Sexo Informado Inválido");
        }
        scan.close();
    }
}
