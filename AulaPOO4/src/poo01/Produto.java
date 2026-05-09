package poo01;

public class Produto {
	String nome;
	double preco;
	int quant;
	int estoque;
	
	public Produto(String nome, double preco, int quant) {
		this.nome = nome;
		this.preco = preco;
		this.quant = quant;
		this.estoque += quant;
	}
	public double calularValorEstoque() {
		double valorEstoque = this.preco * this.estoque;
		return valorEstoque;
	}
	public void exibirDetalhes() {
		System.out.println("Produto: " + this.nome);
		System.out.println("Preço: R$" + String.format("%,.2f", this.preco));
		System.out.println("Estoque: " + this.estoque + " unidades.");
		System.out.println("Valor do Estoque: R$" + String.format("%,.2f", calularValorEstoque()));
		
	}
}
