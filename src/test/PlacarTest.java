package test;

import static org.junit.Assert.assertEquals;
import lib.Aluno;
import lib.Parser;
import lib.Placar;

import org.junit.Before;
import org.junit.Test;

public class PlacarTest {

	private Placar classe;

	@Before
	public void setUp() {
		String entrada = "4\n" + "cardonha 9\n" + "infelizreprovado 3\n"
				+ "marcel 9\n" + "infelizaprovado 3";
		classe = new Placar(new Parser(entrada));
	}

	@Test
	public void aPrimeiraInstanciaDeveConterQuatroAlunos() {
		assertEquals(4, classe.getAlunos().size());
	}

	@Test
	public void aSaidaDeveSerIgualAInfelizreprovado() {
		assertEquals("infelizreprovado", classe.getNomeDoAlunoReprovado());
		
		for (Aluno a : classe.getAlunos()) {
			System.out.println(a.getNome() +" - "+a.getQuantidadeDeExerciciosResolvidos());
		}
	}

}
