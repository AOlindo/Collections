package br.com.aolindo.list.exercicios;

import java.time.LocalDate;

public class CarrinhoComprasTest {
	
	public static void main(String[] args) {
		
		CarrinhoDeCompras compras = new CarrinhoDeCompras();
		
		compras.adicionarItem("Arroz", 5.0, 5, LocalDate.now());
		compras.adicionarItem("Feijao", 10.0, 5, LocalDate.now());
		compras.adicionarItem("Feijao 23", 10.0, 5, LocalDate.parse("2024-05-08"));
		compras.adicionarItem("Feijao 2", 10.0, 5, LocalDate.parse("2024-05-07"));

		
		compras.exibirItens();
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		//compras.removerItem("Feijao");
	
		System.out.println(compras.calcularValorTotal());
		
//		compras.adicionarItem("Macarrao", 3.0, 3, LocalDate.parse("2024-05-07"));
//		
//		compras.exibirItens();
//		
//		compras.calcularValorTotal();
//		compras.exibirMap();
	}

}
