package br.com.aolindo.map.pesquisa;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [nome = ");
		builder.append(nome);
		builder.append(", preco = ");
		builder.append(preco);
		builder.append(", quantidade = ");
		builder.append(quantidade);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
