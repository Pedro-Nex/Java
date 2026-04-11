import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] frutas = new String[5];
        for (int i = 0; i < frutas.length; i++){
            System.out.print("Digite a " + (i + 1) + "ª Fruta: ");
            frutas[i] = scan.nextLine();
        }
        for (int i = 0; i < frutas.length; i++){
            System.out.print(frutas[i] + " ");
        }
        scan.close();
    }
}
