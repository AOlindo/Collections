package br.com.aolindo.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

	private Set<Produto> produtosSet = new HashSet<>();
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtosSet.add(new Produto(cod, nome, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome(){
		//O TreeSet permite que o conjunto venha ordenado;
		Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
		return produtosPorNome;
	}
	
	public Set<Produto> exibirProdutoPorPreco(){
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		
		produtosPorPreco.addAll(produtosSet);
		return produtosPorPreco;
	}
	
	public void exibirTodosProdutos() {
		System.out.println(produtosSet);
	}
}
