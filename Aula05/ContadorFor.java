import java.util.Scanner;

public class ContadorFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i=1;i<=10;i++){
            System.out.println(i);
        }

        System.out.println("=".repeat(50));

        System.out.println("Contagem Regressiva.");
        for(int i=10;i>0;i--){
            System.out.println(i + "...");
        }
        System.out.println("Fogo!!!!!!!!!!");

        System.out.println("=".repeat(50));

        System.out.println("Sequência de 10 em 10.");
        for(int i=10;i<=100;i+=10){
            System.out.println(i);
        }
        scan.close();
    }
}
