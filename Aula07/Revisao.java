public class Revisao {
    public static void main(String[] args) {
        String[] nomes = { "Pedro", "Maya", "Rita", "Fran" };
        int[] idades = new int[4];
        idades[0] = 20;
        idades[1] = 22;
        idades[2] = 60;
        idades[3] = 58;
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome: " + nomes[i]);
        }
        System.out.println("=".repeat(40));
        for (String nome : nomes) {
            System.out.println("Nome Bonito: " + nome);
        }
        System.out.println("=".repeat(40));
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Nome: " + nomes[i] + " - Idade: " + idades[i]);
        }
    }
}
