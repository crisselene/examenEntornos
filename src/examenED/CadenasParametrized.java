package examenED;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CadenasParametrized {
	//parámetros
	private String cadenaInicial  ;
	private String primeros2Chars;
	private String cadenaMenosPrimeros2Chars;
	private String resultadoFinal;
	
	//constructor
	public CadenasParametrized(String cadenaInicial, String primeros2Chars, String cadenaMenosPrimeros2Chars,
			String resultadoFinal) {
		super();
		this.cadenaInicial = cadenaInicial;
		this.primeros2Chars = primeros2Chars;
		this.cadenaMenosPrimeros2Chars =cadenaMenosPrimeros2Chars;
		this.resultadoFinal = resultadoFinal;
		
	}
	@Parameters
	public static Collection<Object[]> cadenas() {
		return Arrays.asList(new Object[][] {
			{"PATATA","PA","TATA","PTATA"},
			{"PA", "PA","","P"}
		});
	}
	


	@Test
	public void quitarAen2primerasPosicionestestLenghtMalo() {
		Cadenas c = new Cadenas ();
		String resultado = c.quitarAenPrimeras2Posiciones(cadenaInicial);
		assertEquals(resultadoFinal, resultado);
	}
	
	@Test
	public void quitarAen2primerasPosicionestest() {
		Cadenas c = new Cadenas ();
		String resultado = c.quitarAenPrimeras2Posiciones(cadenaInicial);
		assertEquals(resultadoFinal, resultado);
	}

}
