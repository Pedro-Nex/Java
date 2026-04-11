public class Array01 {
    public static void main(String[] args) {
        String[] alunos = {"Pedro", "Maya", "Fran", "Rita"};
        int tamanhoAlunos = alunos.length;

        double[] notas = new double[4];
        notas[0] = 5.5;
        notas[1] = 4.5;
        notas[2] = 6.5;
        notas[3] = 9.5; 
        
        for (int i = 0; i < tamanhoAlunos; i++){
            System.out.println("Aluno: " + alunos[i] + " = Nota: " + notas[i]);
        }
    }
}
