package br.com.aolindo.list.exercicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Item {

	private String nome;
	private double preco;
	private int quantidade;
	private LocalDate dataVenda;
	
	private  List<Double> valoresPendetes = new ArrayList<Double>();
	

	
	public Item(String nome, double preco, int quantidade, LocalDate datavenda) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.dataVenda= datavenda;
		this.valoresPendetes = Arrays.asList(new Random().nextDouble());
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
		builder.append("Item = ");
		builder.append(nome);
		builder.append(", preco = ");
		builder.append(preco);
		builder.append(", quantidade = ");
		builder.append(quantidade);
		builder.append(" ]");
		return builder.toString();
	}


	public List<Double> getValoresPendetes() {
		return valoresPendetes;
	}

	



		
	
	
	
	
	
}
