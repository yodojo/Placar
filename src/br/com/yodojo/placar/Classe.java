package br.com.yodojo.placar;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Classe {

	private Set<Aluno> alunos;

	private int quantidadeDeAlunos;

	public Classe(int quantidadeDeAlunos, Set<Aluno> alunos) {
		this.quantidadeDeAlunos = quantidadeDeAlunos;
		this.alunos = alunos;
	}

	public boolean temEntreUmECemAlunos() {
		return (quantidadeDeAlunos >= 1 && quantidadeDeAlunos <= 100);
	}

	public String getNomeDoAlunoReprovado() {
		return new TreeSet<Aluno>(alunos).first().getNome();
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

}
