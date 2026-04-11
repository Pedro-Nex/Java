import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] infos = new String[3][4];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("Digite as infos da " + (i+1) + "º Linha: ");
                infos[i][j] = scan.nextLine();
            }
        }
        for(int i = 0; i < 3; i++){ // se refere as linhas
            System.out.println("Linha " + (i+1) + " da Array.");
            for(int j = 0; j < 4; j++){ // se refere as colunas de cada linhas
                System.out.print(infos[i][j] + " ");
            }
            System.out.println();
            System.out.println("=".repeat(40));
        }
        scan.close();
    }
}
