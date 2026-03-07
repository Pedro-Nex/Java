package aula04;

public class Exercicio4a {
    public static void main(String args[]){
        double nota1, nota2, nota3, nota4, media;

        nota1 = 10;
        nota2 = 5;
        nota3 = 3;
        nota4 = 7;

        media =  (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua média foi: " + media);
        if (media >= 6) {
            System.out.println("Você passou de ano.");
        }
        else{
            System.out.println("Você não passou de ano.");
        }
    }
}
