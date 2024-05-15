package br.com.aolindo.map.operacoesbasicas.exercicio;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

	private Map<String, String> dicionario = new HashMap<String, String>();
	
	public void adicionarPalavra(String palavra, String definicao) {
		dicionario.put(palavra, definicao);
	}
	
	public void exibirPalavras() {
		System.out.println(dicionario);
	}
	
	public void removerPalavra(String palavra) {
		if (!dicionario.isEmpty()) {
			dicionario.remove(palavra);
		}
	}
	
	public String pesquisarPorPalavra(String palavra) {
		String pesquisarPorPalavra = null;
		if (!dicionario.isEmpty()) {
			pesquisarPorPalavra = dicionario.get(palavra);
		}
		return pesquisarPorPalavra;
		
	}
}
