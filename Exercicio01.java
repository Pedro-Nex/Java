// Nesse programa vamos imprimir os dados de um produto.

public class Exercicio01{
	public static void main(String args[]){
		String produto = "Bolacha de Água e Sal";
		String categoria = "Alimentos";
		int quant =  150;
		float preco = 5.49F;
		
		String venda = "\nVocê comprou: " + produto + ".";
		venda = venda + "\nCategoria: " + categoria + ".";
		venda = venda + "\nQuantidade: " + quant + ".";
		venda = venda + "\nValor Unitario: R$ " + preco + ".";
		venda = venda + "\nPreço Total: R$ " + String.format("%.2f", quant * preco) + ".";
		
		System.out.println(venda);
		}
}