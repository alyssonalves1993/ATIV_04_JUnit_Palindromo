import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestePalindromo{
	// criando um objeto 
	Palindromo p = new Palindromo();

	// declarando as varíaveis
	@Before
	public void Inicializar(){
	String texto = null;
	Boolean result = null;
	}
	
	@Test
	public void TesteNomeSimplesVerdadeiro() {

		String texto = "arara";
		Boolean result ;

		result = p.isPalindromo(texto);
		
		assertEquals(result, true);
	}
	@Test
	public void TesteNomeSimplesCaseSentive() {

		String texto = "ararA";
		Boolean result ;

		result = p.isPalindromo(texto);
		
		assertEquals(result, true);
	}

	@Test
	public void VerificarNulo() {
		String texto = null;
		Boolean result ;

		result = p.isPalindromo(texto);
		
		assertEquals(result, false);
	}
	@After
	public void Finalizar(){
	String texto = null;
	Double result = null;
	}
}
