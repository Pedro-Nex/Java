public class Matriz2 {
    public static void main(String[] args) {
        double[][] notas = {
            {4.5, 6.9, 5.5, 3.2},   // Linha 0
            {10.0, 9.9, 9.5, 10.0}, // Linha 1
            {2.5, 3.4, 3.2, 2.2},   // Linha 2
            {4.5, 6.6, 8.2, 5.5},   // Linha 3
        };

        String[] alunos = {"Pedro", "Maya", "Rita", "Fran"};
        double[] medias = new double[4];

        double[] somaNotas = {0, 0, 0, 0};

        for(int i = 0; i < notas.length; i++){
            for(int j = 0; j < notas[i].length; j++){
                somaNotas[i] += notas[i][j];
            }
            medias[i] = somaNotas[i] / notas[i].length;
        }
        for(int i = 0; i < notas.length; i++){
            System.out.println("Aluno: " + alunos[i]);
            System.out.println("Média: " + String.format("%.1f", medias[i]));
            if (medias[i] >= 6){
                System.out.println("Aprovado!");
            } else if (medias[i] >= 4 && medias[i] < 3){
                System.out.println("Recuperação!");
            } else {
                System.out.println("Reprovado!");
            }
            System.out.println("=".repeat(40));
        }
    }
}