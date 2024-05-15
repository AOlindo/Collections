package br.com.aolindo.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

	private List<Pessoa> pessoasList = new ArrayList<>() ;

	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoasList.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
		
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoaPorAltura = new ArrayList<Pessoa>(pessoasList);
		Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
		return pessoaPorAltura;
	}
	
	
	
}
