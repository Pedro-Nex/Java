public class ForEach1 {
    public static void main(String[] args) {
        String[] nomes = {"Pedro", "Maya", "Molodoy", "Fallen"};
        System.out.println("=".repeat(40));
        for (String nome : nomes){
            System.out.println("Nome: " + nome);
            System.out.println("=".repeat(40));
        }

        int[] numeros = {23, 45, 83, 13, 67, 74, 99};
        int soma = 0;
        for (int numero : numeros){
            soma += numero;
        }
        System.out.println("Total: " + soma);
    }
}
