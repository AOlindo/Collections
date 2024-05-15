package br.com.aolindo.set.exercicio;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

	private Set<Tarefa> tarefasSet = new HashSet<>();

	public void adicionarTarefa(String descricao) {
		tarefasSet.add(new Tarefa(descricao));
	}
	
	public Set<Tarefa> removerTarefa(String descricao) {
		Set<Tarefa> removerTarefa = new HashSet<>();
		for (Tarefa tarefa : tarefasSet) {
			if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				removerTarefa.add(tarefa);
			}
		}
		tarefasSet.removeAll(removerTarefa);
		return tarefasSet;
	}

	public void exibirTarefas() {
		System.out.println(tarefasSet);
	}

	public void contarTarefas() {
		System.out.println("Quantidade de tarefas: " + tarefasSet.size());
	}
	
	public Set<Tarefa> obterTarefasConcluidas(){
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		for (Tarefa tarefa : tarefasSet) {
			if(tarefa.isTarefaFinalizada() == true) {
				System.out.println(tarefa);
			}
		}
		return tarefasConcluidas;
	
	}
	public Set<Tarefa> obterTarefasPendentes(){
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		for (Tarefa tarefa : tarefasSet) {
			if(!tarefa.isTarefaFinalizada() == true) {
				System.out.println(tarefa);
			}
		}
		return tarefasPendentes;
	
	}

	public Set<Tarefa> marcarTarefaConcluida(String descricao){
		Set<Tarefa> marcarComoConcluida = new HashSet<>();
		for (Tarefa tarefa : tarefasSet) {
			if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefa.setTarefaFinalizada(true);
			}
		}
		return marcarComoConcluida;
	}
	
	public Set<Tarefa> marcarTarefasPendentes(String descricao){
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		for (Tarefa tarefa : tarefasSet) {
			if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefa.setTarefaFinalizada(false);
			}
		}
		return tarefasConcluidas;
		
	}
	
	public void limparListaTarefas() {
		this.tarefasSet.clear();
	}
	
}


