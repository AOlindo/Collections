package br.com.aolindo.set.exercicio;

public class TarefaTest {

	public static void main(String[] args) {

		ListaTarefas tarefas = new ListaTarefas();

		tarefas.adicionarTarefa("Estudar list");
		tarefas.adicionarTarefa("Estudar Array");
		tarefas.adicionarTarefa("Estudar Set");
		tarefas.adicionarTarefa("Estudar Set");

		tarefas.exibirTarefas();

		tarefas.removerTarefa("Estudar Set");

		tarefas.exibirTarefas();

		tarefas.contarTarefas();

		tarefas.marcarTarefaConcluida("Estudar Array");

		tarefas.exibirTarefas();
		
		tarefas.obterTarefasConcluidas();

		tarefas.obterTarefasPendentes();

		tarefas.marcarTarefasPendentes("Estudar Array");

		tarefas.exibirTarefas();

		tarefas.obterTarefasPendentes();
		
		tarefas.limparListaTarefas();
	}
}
