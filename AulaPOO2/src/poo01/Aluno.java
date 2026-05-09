package poo01;

public class Aluno extends Pessoa {
	String matricula, curso;
	double media;
	
	public Aluno(String nome, String cpf, String rg, String matricula, String curso) {
		super(nome, cpf, rg); // Chama o construtor da Class mãe (Pessoa)
		this.matricula = matricula;
		this.curso = curso;
		
	}
	public String verificarMedia(double media) {
		this.media = media;
		if (this.media >= 7) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}
	@Override // Anotação para sobreposição de métodos
	public void exebirDetalhes() {
		super.exebirDetalhes();
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Curso: " + this.curso);
		System.out.println("Média: " + this.media);
		System.out.println("Resultado Final: " + verificarMedia(this.media));
	}
}
