package br.com.aolindo.map.ordenacao;

public class Evento {

	private String nome;
	private String atracao;
	
	public Evento(String nome, String atracao) {
		this.nome = nome;
		this.atracao = atracao;
	}

	public String getNome() {
		return nome;
	}

	public String getAtracao() {
		return atracao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[nome = ");
		builder.append(nome);
		builder.append(", atracao = ");
		builder.append(atracao);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
