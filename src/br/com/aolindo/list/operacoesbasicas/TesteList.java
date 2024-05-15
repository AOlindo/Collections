package br.com.aolindo.list.operacoesbasicas;

public class TesteList {

	public static void main(String[] args) {
		
		ListaTarefa listaTarefa = new ListaTarefa();
		
		System.out.println("O numero total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.adicionarTarefa("Estudar List");
		listaTarefa.adicionarTarefa("Estudar Arrays");
		listaTarefa.adicionarTarefa("Estudar Arrays");
		
		System.out.println("O numero total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.removerTarefa("Estudar List");
		
		System.out.println("O numero total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.obterDescricoesTarefas();
		
		
	
		
	}
}
