package br.com.yodojo.placar;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ClasseTest {

	private Classe classe;

	@Before
	public void setUp() {
		classe = new Classe();
	}

	@Test
	public void quantidadeDeAlunosPorClasseDeveSerMaiorQueUmEMenorQueCem() {
		classe.setQuantidadeDeAlunos(10);
		assertEquals(10, classe.getQuantidadeDeAlunos());
	}

}
