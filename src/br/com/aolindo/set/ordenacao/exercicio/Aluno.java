package br.com.aolindo.set.ordenacao.exercicio;

public class Aluno implements Comparable<Aluno>{

	private long matricula;
	private String nome;
	private double media;
	
	public Aluno(long matricula, String nome, double media) {
		this.matricula = matricula;
		this.nome = nome;
		this.media = media;
	}
	
	public long getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public double getMedia() {
		return media;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [matricula = ");
		builder.append(matricula);
		builder.append(", nome = ");
		builder.append(nome);
		builder.append(", media = ");
		builder.append(media);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Aluno aluno) {
		return nome.compareTo(aluno.getNome());
	}

	

	

	
	
	
	
	
	
	
}
