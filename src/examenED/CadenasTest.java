package examenED;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CadenasTest {
	Cadenas c;
	
	@Before
	public void beforeCadenas() {
		c = new Cadenas ();
	}
	
	@Test
	public void quitarAen2primerasPosicionestestLenghtMalo() {
		
		String resultado = c.quitarAenPrimeras2Posiciones("PA");
		assertEquals("P", resultado);
	}
	
	@Test
	public void quitarAen2primerasPosicionestest() {
		
		String resultado = c.quitarAenPrimeras2Posiciones("PATATA");
		assertEquals("PTATA", resultado);
	}
	
	@Test
	public void sonPrimerosYultimosLenght1() {
		boolean resultado = c.sonPrimerosYultimos2CharsLosMismos("U");
		assertFalse( resultado );
		
	}
	
	@Test
	public void sonPrimerosYultimosLenghtMayor2Correcto() {
		boolean resultado = c.sonPrimerosYultimos2CharsLosMismos("TATA");
		assertTrue( resultado );
		
	}
	
	@Test
	public void sonPrimerosYultimosLenghtMayor2NoCorrecto() {
		boolean resultado = c.sonPrimerosYultimos2CharsLosMismos("PATATA");
		assertFalse( resultado );
		
	}
	
	

}
