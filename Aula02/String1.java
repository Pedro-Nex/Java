package aula04;

public class String1 {
    public static void main(String args[]){
        String nome = "Pedro de Sousa Neves";

        System.out.println("Maiúsculas: "+ nome.toUpperCase());
        System.out.println("Manúsculas: "+ nome.toLowerCase());
        System.out.println("Número de caracteres: "+ nome.length());
        System.out.println("Tem Neves no nome: "+ nome.contains("Neves"));
        System.out.println("Tem Sousa no nome: "+ nome.contains("SOUSA"));
        System.out.println("Tem PEDRO no nome: "+ nome.toUpperCase().contains("PEDRO"));
        System.out.println("Parte do nome: "+ nome.substring(9, 14));
        System.out.println("Normal: "+ nome);
    }
}
