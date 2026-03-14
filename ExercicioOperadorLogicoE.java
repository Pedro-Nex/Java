package aula05;
import java.util.Scanner;

public class ExercicioOperadorLogicoE {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=".repeat(50));
        System.out.print("Nome do Aluno: ");
        String nome = scan.nextLine();
        System.out.print("Idade do Aluno: ");
        int idade = scan.nextInt();
        if(idade >= 13 && idade <= 17){
            System.out.println(nome + ", você é da: Elite do Futebol.");
        }else if(idade >= 8 && idade < 12){
            System.out.println(nome + ", você é da: Craque da Bola.");
        }else if(idade >= 5 && idade < 7){
            System.out.println(nome + ", você é da: Leõezinhos.");
        }else{
            System.out.println("Idade Inválida para nossos programas.");
        }
        System.out.println("=".repeat(50));
        scan.close();
    }
}
