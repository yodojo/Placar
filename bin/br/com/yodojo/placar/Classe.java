package br.com.yodojo.placar;

public class Classe {

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

}
