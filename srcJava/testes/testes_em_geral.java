package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sys.NotasNaoCadastradasException;

class testes_em_geral {

	@Test
	void testeDeErroDeMedia() {
		sys.Materia materia = new sys.Materia(2,sys.NomesMateria.POSTUGUES);
		materia.cadastrarNota(2, 1);
		try {
			double media = materia.calcularMedia();
			fail("exceção esperada. Media obtida: "+media);
		} catch (NotasNaoCadastradasException e) {
			
		}
	}
	
	@Test
	void testeDeGeracaoDeMatricula() {
		sys.Aluno a = new sys.Aluno("Jão", "28/02/2013");
		assertEquals("00000001", a.getMatricula());
	}

}
