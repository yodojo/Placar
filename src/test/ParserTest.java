package test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import lib.Aluno;
import lib.Parser;
import org.junit.Before;
import org.junit.Test;

public class ParserTest {

	private String entrada;
	private Parser parser;

	@Before
	public void setup() {
		entrada = "4\n" + "cardonha 9\n" + "infelizreprovado 3\n"
				+ "marcel 9\n" + "infelizaprovado 3";

		parser = new Parser(entrada);
	}

	@Test
	public void aPrimeiraLinhaDeCadaInstanciaDeveSerUmInteiroEntreUmECem() {
		assertTrue(parser.temEntreUmECemAlunos());
	}

	@Test
	public void aQuantidadeDeAlunosListadosDeveSerIgualAQuantidadeInformada() {
		assertTrue(parser.temAQuantidadeDeAlunosEsperados());
	}

	@Test
	public void asDemaisLinhasDevemConterONomeDoAlunoEONumeroDeProblemaQueResolveu() {
		Aluno cardonha = new Aluno("cardonha", 9);
		Aluno infelizreprovado = new Aluno("infelizreprovado", 3);
		Aluno maciel = new Aluno("marcel", 9);
		Aluno infelizaprovado = new Aluno("infelizaprovado", 3);

		Set<Aluno> alunos = new HashSet<Aluno>();
		alunos.add(cardonha);
		alunos.add(infelizreprovado);
		alunos.add(maciel);
		alunos.add(infelizaprovado);

		assertArrayEquals(alunos, parser.getAlunos());
	}

	private void assertArrayEquals(Set<Aluno> alunosEsperados, Set<Aluno> alunos) {
		for (Iterator<Aluno> i = alunos.iterator(); i.hasNext();) {
			Object aluno = i.next();
			assertTrue(alunosEsperados.contains(aluno));
		}
	}

}
