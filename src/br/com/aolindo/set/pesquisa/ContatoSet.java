package br.com.aolindo.set.pesquisa;

public class ContatoSet {

	public static void main(String[] args) {

		AgendaContatos agenda = new AgendaContatos();

		agenda.adicionarContato("Adriana", 123456789);
		agenda.adicionarContato("Adriana", 1234);// Não entrou na lista
		agenda.adicionarContato("Adriana Dev", 123456789);
		agenda.adicionarContato("Adriana Java", 586112);
		agenda.adicionarContato("Nessie", 123456);

		agenda.exibirContato();

		System.out.println(agenda.pesquisarPorNome("Adriana"));
		
		System.out.println("Contato Atualizado: " + agenda.atualizarNumeroContato("Adriana Java", 123456));
		
		agenda.exibirContato();

	}

}
