package br.com.aolindo.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

	//Sintaxe do Map
	//Map<Chave, Valor>
	private Map<Long, Produto> estoqueProdutoMap = new HashMap<Long, Produto>();
	
	public void adicionarProduto(Long cod, String nome, double preco, int quantidade) {
		estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
	}
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutoMap);
	}
	
	public double calcularValorTotalEstoque() {
		//Cria variavel que vai retornar
		double valorTotalEstoque = 0;
		//verificar se o map esta vazio
		if (!estoqueProdutoMap.isEmpty()) {
			//se não estiver vazio, cria um for para percorrer o map.
			//Tipo do for é Produto, cria o nome da variavel e percorrer os valores do Map
			for (Produto produto : estoqueProdutoMap.values()) {
				valorTotalEstoque += produto.getQuantidade() * produto.getPreco();
			}
		}
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if (!estoqueProdutoMap.isEmpty()) {
			for (Produto produto : estoqueProdutoMap.values()) {
				if (produto.getPreco() > maiorPreco) {
					produtoMaisCaro = produto;
				}
			}
		}
		return produtoMaisCaro;
	}
}
