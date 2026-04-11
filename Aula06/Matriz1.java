public class Matriz1 {
    public static void main(String[] args) {
        int[][] temp = new int[3][4]; // 3 linhas e 4 colunas

        // Primeira Linha
        temp[0][0] = 25;
        temp[0][1] = 20;
        temp[0][2] = 18;
        temp[0][3] = 22;

        // Segunda Linha
        temp[1][0] = 26;
        temp[1][1] = 24;
        temp[1][2] = 25;
        temp[1][3] = 26;

        // Terceira linha
        temp[2][0] = 28;
        temp[2][1] = 28;
        temp[2][2] = 26;
        temp[2][3] = 22;

        for(int i = 0; i < temp.length; i++){ // se refere as linhas
            System.out.println("Linha " + i + " da Array.");
            for(int j = 0; j < temp[i].length; j++){ // se refere as colunas de cada linhas
                System.out.print(temp[i][j] + "° ");
            }
            System.out.println();
            System.out.println("=".repeat(40));
        }
    }
}
