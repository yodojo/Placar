package test;

import static org.junit.Assert.assertEquals;
import lib.Parser;
import lib.Placar;

import org.junit.Before;
import org.junit.Test;

public class PlacarTest {

	private Placar placar;

	@Before
	public void setUp() {
		String entrada = "4\n" + "cardonha 9\n" + "infelizreprovado 3\n"
				+ "marcel 9\n" + "infelizaprovado 3";
		placar = new Placar(new Parser(entrada));
	}

	@Test
	public void aPrimeiraInstanciaDeveConterQuatroAlunos() {
		assertEquals(4, placar.getAlunos().size());
	}

	@Test
	public void aSaidaDeveSerIgualAInfelizreprovado() {
		assertEquals("infelizreprovado", placar.getNomeDoAlunoReprovado());		
	}

}
