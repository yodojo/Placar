package lib;

import java.util.HashSet;
import java.util.Set;

public class Parser {

	private int quantidadeDeAlunos;
	private Set<Aluno> alunos;

	public Parser(String entrada) {
		init(entrada);
	}

	private void init(String entrada) {
		String[] linhas = entrada.split("\n");
		quantidadeDeAlunos = Integer.parseInt(linhas[0]);

		alunos = new HashSet<Aluno>();
		for (int i = 1; i < linhas.length; i++)
			alunos.add(fabricaAluno(linhas[i]));
	}

	private Aluno fabricaAluno(String linha) {
		String[] campos = linha.split(" ");		
		String nome = campos[0];
		int questoesResolvidas = Integer.parseInt(campos[1]);

		return new Aluno(nome, questoesResolvidas);
	}

	public boolean temEntreUmECemAlunos() {
		return (quantidadeDeAlunos >= 1 && quantidadeDeAlunos <= 100);
	}

	public Set<Aluno> getAlunos() {
		return alunos;
	}	

	public boolean temAQuantidadeDeAlunosEsperados() {
		return quantidadeDeAlunos == alunos.size();
	}

}
