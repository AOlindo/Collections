package br.com.aolindo.set.ordenacao.exercicio;

import java.util.Comparator;

public class ComparatorPorMedia implements Comparator<Aluno> {

	@Override
	public int compare(Aluno aluno1, Aluno aluno2) {
		return Double.compare(aluno1.getMedia(), aluno2.getMedia());
	}

}
