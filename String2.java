package aula04;

public class String2 {
    public static void main(String args[]){
        System.out.println("=".repeat(50));

        String frase1 = "     Hoje está chovendo.     ";

        System.out.println(frase1);

        String frase2 = "Amanhã deve chover também.";

        System.out.println(frase1 + frase2);
        System.out.println(frase1.trim()+ frase2);

        String resposta = "S";
        System.out.println("Aceitou o valor: " + resposta.equals("S"));
        System.out.println("Realmente aceitou: " + resposta.equalsIgnoreCase("s"));
        
        resposta = "SIM";

        System.out.println("Respondeu (s): " + resposta.substring(0,1).equalsIgnoreCase("s"));

        System.out.println("=".repeat(50));
    }
}
