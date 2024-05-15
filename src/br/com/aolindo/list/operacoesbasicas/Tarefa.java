package br.com.aolindo.list.operacoesbasicas;

public class Tarefa {

	private String descricao;

	public Tarefa(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tarefa [descricao = ");
		builder.append(descricao);
		builder.append("]");
		return builder.toString();
	}
	
	

}
