package br.com.aolindo.map.operacoesbasicas.exercicio;

public class DicionarioTest {
	
	public static void main(String[] args) {
		
		Dicionario dicionarioMap = new Dicionario();
		
		dicionarioMap.adicionarPalavra("Aleluia ", " Igreja da fé");
		dicionarioMap.adicionarPalavra("Pc ", " Computador de Tubo");
		dicionarioMap.adicionarPalavra("Pregador", " Estender roupa");
		dicionarioMap.adicionarPalavra("Sei lá ", " Sei lá mano");
		
		dicionarioMap.exibirPalavras();
		
		dicionarioMap.removerPalavra("Pc ");
		
		dicionarioMap.exibirPalavras();
		
		System.out.println(dicionarioMap.pesquisarPorPalavra("Pregador"));
	}

}
