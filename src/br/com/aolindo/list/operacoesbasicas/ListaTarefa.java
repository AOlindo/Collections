package br.com.aolindo.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

	private List<Tarefa> tarefaList;

	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}

	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for (Tarefa tarefas : tarefaList) {
			if (tarefas.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(tarefas);
			}
		}

		tarefaList.removeAll(tarefasParaRemover);
	}

	public int obterNumeroTotalTarefas() {
		return tarefaList.size();

	}

	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
}
