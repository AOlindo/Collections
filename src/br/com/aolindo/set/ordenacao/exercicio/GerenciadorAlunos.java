package br.com.aolindo.set.ordenacao.exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciadorAlunos {

	List<Aluno> alunos = new ArrayList<>();

	public void adicionarAluno(String nome, long matricula, double media) {
		alunos.add(new Aluno(matricula, nome, media));
	}

	public void exibirAlunos() {
		System.out.println(alunos);
	}

	public void removerAluno(long matricula) {
		List<Aluno> removerMatricula = new ArrayList<>();
		for (Aluno alunoMatricula : alunos) {
			if (alunoMatricula.getMatricula() == matricula) {
				removerMatricula.add(alunoMatricula);
				break;
			} else {
				System.out.println("Matricula invalida");
				break;
			}

		}
		alunos.removeAll(removerMatricula);
	}

	public List<Aluno> exibirAlunosPorNome() {
		List<Aluno> listaPorNome = new ArrayList<Aluno>(alunos);
		Collections.sort(listaPorNome);
		return listaPorNome;
	}

	public List<Aluno> exibirAlunosPorNota() {
		List<Aluno> listaPorMedia = new ArrayList<Aluno>(alunos);
		Collections.sort(listaPorMedia, new ComparatorPorMedia());
		return listaPorMedia;
	}
}
