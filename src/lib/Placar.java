package lib;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Placar {

	private Set<Aluno> alunos;

	public Placar(Parser parser) {
		this.alunos = parser.getAlunos();
	}

	public String getNomeDoAlunoReprovado() {
		return new TreeSet<Aluno>(alunos).first().getNome();
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

}
