package br.com.aolindo.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

	//A coleção Set não permite elementos duplicados
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite ) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for (Convidado convidado : convidadoSet) {
			if(convidado.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = convidado;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	
	//retorna o numero de elementos que exite na coleção set
	public int contarConvidados() {
		return convidadoSet.size();
		
	}
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
}
