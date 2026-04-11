import java.util.Random;

public class Array03 {
    public static void main(String[] args) {
        Random sorteio = new Random();
        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = sorteio.nextInt(60) + 1;
        }

        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
    }
}
