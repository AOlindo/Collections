package br.com.aolindo.list.pesquisa;

public class Livro {

	private String titulo;
	private String autor;
	private int anoPublicacao;

	public Livro(String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro [titulo = ");
		builder.append(titulo);
		builder.append(", autor = ");
		builder.append(autor);
		builder.append(", anoPublicacao = ");
		builder.append(anoPublicacao);
		builder.append("]");
		return builder.toString();
	}
	
	

}
