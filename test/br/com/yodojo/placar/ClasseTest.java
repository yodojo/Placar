package br.com.yodojo.placar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class ClasseTest {

	private Classe classe;

	@Before
	public void setUp() {
		int quantidadeDeAlunosDaInstancia = 4;

		classe = new Classe(quantidadeDeAlunosDaInstancia, alunosDaInstancia());
	}

	private Set<Aluno> alunosDaInstancia() {
		Aluno cardonha = new Aluno("cardonha", 9);
		Aluno infelizreprovado = new Aluno("infelizreprovado", 3);
		Aluno maciel = new Aluno("marcel", 9);
		Aluno infelizaprovado = new Aluno("infelizaprovado", 3);

		Set<Aluno> alunos = new HashSet<Aluno>();

		alunos.add(infelizaprovado);
		alunos.add(infelizreprovado);
		alunos.add(maciel);
		alunos.add(cardonha);
		return alunos;
	}

	@Test
	public void cadaClasseDeveConterEntreUmECemAlunos() {
		assertTrue(classe.temEntreUmECemAlunos());
	}

	@Test
	public void aPrimeiraInstanciaDeveConterQuatroAlunos() {
		assertEquals(4, classe.getAlunos().size());
	}

	@Test
	public void aSaidaDeveSerIgualAInfelizreprovado() {
		assertEquals("infelizreprovado", classe.getNomeDoAlunoReprovado());
	}
}
