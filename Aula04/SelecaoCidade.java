import java.util.Scanner;

public class SelecaoCidade {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Recrutamento e Seleção");
        System.out.print("Digite o nome da sua cidade: ");
        String cidade = scan.nextLine();

        if(!(cidade.equalsIgnoreCase("Guarulhos")) && !(cidade.equalsIgnoreCase("Santa Isabel"))){
            System.out.println("Envie o seu curricilo para o e-mail.");
            System.out.println("selecao@sp.senai.br");
        } else {
            System.out.println("Está vaga Home-Office não é para moradores de Guarulhos ou Santa Isabel.");
        }

        scan.close();
    }
}
