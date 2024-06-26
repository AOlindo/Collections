package br.com.aolindo.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	private List<Livro> livrosList;

	public CatalogoLivros() {
		this.livrosList = new ArrayList<Livro>();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livrosList.add(new Livro(titulo, autor, anoPublicacao));
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		if (!livrosList.isEmpty()) {
			for (Livro livro : livrosList) {
				if (livro.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(livro);
				}
			}
		}

		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if (!livrosList.isEmpty()) {
			for (Livro livro : livrosList) {
				if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAnos.add(livro);
				}
			}
		}
		return livrosPorIntervaloAnos;
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if (!livrosList.isEmpty()) {
			for (Livro livro : livrosList) {
				if (livro.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = livro;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
}
