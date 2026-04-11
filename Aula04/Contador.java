import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador = 1;
        while (contador <= 10){
            System.out.println("Númeor: " + contador);
            System.out.println("-".repeat(10));
            contador++;
        }
        scan.close();
    }
}
