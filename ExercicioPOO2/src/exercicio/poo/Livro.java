package exercicio.poo;

public class Livro {
	String titulo;
	String autor;
	int numpags;
	
	public Livro(String titulo, String autor, int numpags) {
		this.titulo = titulo;
		this.autor = autor;
		this.numpags = numpags;
	}
	public void exibirDetalhes() {
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Número de Páginas: " + this.numpags);
	}
}