package br.com.aolindo.set.ordenacao.exercicio;

public class AlunosTest {

	public static void main(String[] args) {
		
		GerenciadorAlunos alunos = new GerenciadorAlunos();
		
		alunos.adicionarAluno("Nessie", 78910l, 9.0);
		alunos.adicionarAluno("Devi", 123456l, 7.5);
		alunos.adicionarAluno("Fabricio", 909192l, 6.5);
		alunos.adicionarAluno("Adriana", 202324, 10.0);
		
		alunos.exibirAlunos();
		
		System.out.println(alunos.exibirAlunosPorNome());
		
		alunos.removerAluno(78910l);
		
		alunos.exibirAlunos();
		
		System.out.println(alunos.exibirAlunosPorNome());
		
		System.out.println(alunos.exibirAlunosPorNota());
		
		
	}
}
