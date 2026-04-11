package aula04;

public class ConversaoTempo {
    public static void main(String args[]) {
        int totalSegundos = 137;
        int minutos = totalSegundos / 60;
        int resto = totalSegundos % 60;

        System.out.println("=".repeat(50));

        System.out.println("Total de segundos: " + totalSegundos);
        System.out.println("A máquina levou " + minutos + " minutos e " + resto + " segundos.");

        System.out.println("=".repeat(50));

    }
}
