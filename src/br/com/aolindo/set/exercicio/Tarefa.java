package br.com.aolindo.set.exercicio;

import java.util.Objects;

public class Tarefa {

	private String descricao;
	private boolean tarefaFinalizada;

	public Tarefa(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setTarefaFinalizada(boolean tarefaFinalizada) {
		this.tarefaFinalizada = tarefaFinalizada;
	}

	public boolean isTarefaFinalizada() {
		return tarefaFinalizada;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tarefa [descricao = ");
		builder.append(descricao);
		builder.append(", foi concluida? = ");
		builder.append(tarefaFinalizada);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(descricao, other.descricao);
	}

}
