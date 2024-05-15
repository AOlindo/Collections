package br.com.aolindo.list.exercicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarrinhoDeCompras {

	private List<Item> itensList;

	public CarrinhoDeCompras() {
		this.itensList = new ArrayList<>();
	}

//	public void adicionarItemNoCarrinho(String nome, double preco, int quantidade) {
//		itensList.add(new Item(nome, preco, quantidade));
//	}

	//Adicionar item da Cami DIO
	public void adicionarItem(String nome, double preco, int quantidade, LocalDate dataVenda) {
		Item item = new Item(nome, preco, quantidade, dataVenda);
		this.itensList.add(item);
	}

//	public void removerItem(String nome) {
//		List<Item> removerItem = new ArrayList<>();
//		for (Item item : itensList) {
//			if (item.getNome().equalsIgnoreCase(nome)) {
//				removerItem.add(item);
//			}
//		}
//		itensList.removeAll(removerItem);
//
//	}
	
	//Remover item da Cami DIO
	public void removerItem(String nome) {
	    List<Item> itensParaRemover = new ArrayList<>();
	    if (!itensList.isEmpty()) {
	      for (Item i : itensList) {
	        if (i.getNome().equalsIgnoreCase(nome)) {
	          itensParaRemover.add(i);
	        }
	      }
	      itensList.removeAll(itensParaRemover);
	    } else {
	      System.out.println("A lista está vazia!");
	    }
	  }

//	public double calcularValorTotal() {
//		double valorTotal = 0;
//		for (Item item : itensList) {
//			valorTotal = item.getPreco() * item.getQuantidade();
//			System.out.println("Valor Total do item = " + valorTotal);
//		}
//		return valorTotal;
//
//	}
	
//	public double calcularValorTotal() {
//	    double valorTotal = 0d;
//	    if (!itensList.isEmpty()) {
//	      for (Item item : itensList) {
//	        double valorItem = item.getPreco() * item.getQuantidade();
//	        valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
//	        System.out.println(valorTotal);
//	      }
//	      return valorTotal;
//	    } else {
//	      throw new RuntimeException("A lista está vazia!");
//	    }
//	  }
	
	//Metodo com expressao Lambda
	public double calcularValorTotal() {
	    if (itensList.isEmpty()) {
	    	throw new RuntimeException("A lista está vazia!");
	      }
	      return itensList.stream().mapToDouble(item -> item.getPreco() * item.getQuantidade()).sum();    
	  }

	public void exibirItens() {
		System.out.println(itensList); 
	}

//	public void exibirMap() {
//		Map<String, List<Item>> map = new HashMap<>();
//		for (Item it : itensList) {
//			
//			List<Item> itemMap = map.get(it.getDataVenda().toString());
//			
//			if (itemMap == null) {
//				
//				map.put(it.getDataVenda().toString(), Arrays.asList(it));
//				
//			} else {
//				
//				List<Item> itemEncontrados = new ArrayList<Item>(itemMap);
//				itemEncontrados.add(it);
//				map.put(it.getDataVenda().toString(), itemEncontrados);
//			}
//		}
//
//	}
	
	public List<Double> getValoresPendentes() {
		List<Double> valoresPendentes = new ArrayList<Double>();
		
		for (Item item : itensList) {
			valoresPendentes.addAll(item.getValoresPendetes());
		}
		
		return valoresPendentes;
	}
}
