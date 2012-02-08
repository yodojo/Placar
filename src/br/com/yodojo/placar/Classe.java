package br.com.yodojo.placar;

import java.util.List;

public class Classe {

	private List<Aluno> alunos;

	private int quantidadeDeAlunos;

	public Classe(String entrada) {
		leEntrada(entrada);
	}

	private void leEntrada(String entrada) {
		String[] linhas = entrada.split("\n");
		quantidadeDeAlunos = Integer.parseInt(linhas[0]);
	}

	public boolean temEntreUmECemAlunos() {
		return (quantidadeDeAlunos >= 1 && quantidadeDeAlunos <= 100);
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

}
