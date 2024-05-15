package br.com.aolindo.map.operacoesbasicas;

public class AgendaContatoTest {

	public static void main(String[] args) {
		
		AgendaContatos contatos = new AgendaContatos();
		
		contatos.adicionarContato("Devi", 123456789);
		contatos.adicionarContato("Nessie", 123789123);
		contatos.adicionarContato("Devi Oi", 456789321);
		contatos.adicionarContato("Nessie", 64654878);
		
		contatos.exibirContato();
		
		contatos.removerContato("Devi");
		
		contatos.exibirContato();

		System.out.println("O numero é: " + contatos.pesquisarPorNome("Devi Oi"));
	}
}
