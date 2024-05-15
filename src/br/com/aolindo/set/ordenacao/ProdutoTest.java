package br.com.aolindo.set.ordenacao;

public class ProdutoTest {

	public static void main(String[] args) {
		
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		cadastroProdutos.adicionarProduto(123L, "Produto 5", 15.0, 5);
		cadastroProdutos.adicionarProduto(124L, "Produto 0", 20.0, 10);
		
		//Produto 3 não aparece pq o codigo esta duplicado
		cadastroProdutos.adicionarProduto(124L, "Produto 3", 10.0, 2);
		cadastroProdutos.adicionarProduto(126L, "Produto 9", 2.0, 2);
		
		cadastroProdutos.exibirTodosProdutos();
		System.out.println(cadastroProdutos.exibirProdutosPorNome());
		System.out.println(cadastroProdutos.exibirProdutoPorPreco());
		
		
	}
}
