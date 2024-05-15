package br.com.aolindo.set.operacoesbasicas;

public class ConvidadoTest {

	public static void main(String[] args) {
		
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		
		conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
		conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
		conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
		conjuntoConvidados.adicionarConvidado("Convidado 4", 1237);
		
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set Convidados");
		
		conjuntoConvidados.exibirConvidados();
		
		conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
		
		conjuntoConvidados.exibirConvidados();
		
		
	}
	
}
