package br.com.yodojo.placar;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class ClasseTest {

	private Classe classe;

	@Before
	public void setUp() {
		String entrada = "4\n" + 
						 "cardonha 9\n" + 
						 "infelizreprovado 3\n" +
						 "marcel 9\n" + 
						 "infelizaprovado 3";

		classe = new Classe(entrada);
	}

	@Test
	public void aPrimeiraLinhaDeCadaInstanciaDeveSerUmInteiroEntreUmECem() {
		assertTrue(classe.temEntreUmECemAlunos());
	}
	
	@Test
	public void asDemaisLinhasDevemConterONomeDoAlunoEONumeroDeProblemaQueResolveu() {
		Aluno cardonha = new Aluno("cardonha", 9);
		Aluno infelizreprovado = new Aluno("infelizreprovado", 3);
		Aluno maciel = new Aluno("marcel", 9);
		Aluno infelizaprovado = new Aluno("infelizaprovado", 3);

		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(cardonha);
		alunos.add(infelizreprovado);
		alunos.add(maciel);
		alunos.add(infelizaprovado);

		assertArrayEquals(alunos, classe.getAlunos());
	}

	private void assertArrayEquals(List<Aluno> alunosEsperados,
			List<Aluno> alunos) {
		for (int i = 0; i < alunosEsperados.size(); i++) {
			assertTrue(alunosEsperados.get(i).equals(classe.getAlunos().get(i)));			
		}
	}
}
