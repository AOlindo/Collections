package br.com.aolindo.list.ordenacao;

public class OrdenacaoTest {

	public static void main(String[] args) {
		
		OrdenacaoPessoas orderPessoa = new OrdenacaoPessoas();
		
		orderPessoa.adicionarPessoa("Nome 1 ", 20, 1.56);
		orderPessoa.adicionarPessoa("Nome 2 ", 30, 1.80);
		orderPessoa.adicionarPessoa("Nome 3 ", 25, 1.78);
		orderPessoa.adicionarPessoa("Nome 4 ", 17, 1.56);
		
		System.out.println(orderPessoa.ordenarPorIdade());
		System.out.println(orderPessoa.ordenarPorAltura());
	}

}
