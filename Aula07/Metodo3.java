import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Metodo3 {
    // Método não estático: utilizado por instância de objeto.
    // Método sem atributos e com retorno.
    // Quando é para retornar algo, coloca o tipo do dado que ele vai retornar.
    public String obterDataAtual() {
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return hoje.format(dataFormatada);
    }
    public static String obterHoraAtual() {
        LocalTime agora = LocalTime.now();
        DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("HH:mm");
        return agora.format(horaFormatada);
    }
    public static void main(String[] args) {
        Metodo3 objetoData = new Metodo3();
        String dataAtaul = objetoData.obterDataAtual();
        String horaAtaul = obterHoraAtual();

        System.out.println("Hoje é: " + dataAtaul);
        System.out.println("Agora é: " + horaAtaul);
    }
}
