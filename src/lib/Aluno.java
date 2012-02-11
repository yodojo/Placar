package lib;

public class Aluno implements Comparable<Aluno> {

	private String nome;
	private int quantidadeDeExerciciosResolvidos;

	public Aluno(String nome, int quantidadeDeExerciciosResolvidos) {
		this.nome = nome;
		this.quantidadeDeExerciciosResolvidos = quantidadeDeExerciciosResolvidos;
	}

	public String getNome() {
		return nome;
	}

	public int getQuantidadeDeExerciciosResolvidos() {
		return quantidadeDeExerciciosResolvidos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public int compareTo(Aluno alunoComparacao) {
		if (quantidadeDeExerciciosResolvidos < alunoComparacao.getQuantidadeDeExerciciosResolvidos()) {
			return -1;
		} else if (quantidadeDeExerciciosResolvidos == alunoComparacao.getQuantidadeDeExerciciosResolvidos()) {
			return alunoComparacao.getNome().compareTo(nome);
		}
		return 0;
	}
}
