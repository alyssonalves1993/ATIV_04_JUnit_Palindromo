import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestePalindromo{
	// criando um objeto 
	//Calc c = new Calc();

	// declarando as var�aveis
	@Before
	public void Inicializar(){
	String num1 = null;
	String num2 = null;
	}
	
	@Test
	public void TesteSoma() {

		String num1 = "1";
		String num2 = "1";
		int result;

		//result = c.soma(num1,num2);
		
		//assertEquals(2, result);
	}
	@Test
	public void TesteSomaNegativoPositivo() {

		String num1 = "-1";
		String num2 = "+1";
		int result;

		//result = c.soma(num1,num2);

		//assertEquals(0, result);
	}
	@Test
	public void VerificarNulo() {
		String num1 = null;
		String num2 = null;
		int result;

		//result = c.soma(num1,num2);

		//assertEquals(0, result);
	}
	@After
	public void Finalizar(){
	String num1 = null;
	String num2 = null;
	Double result = null;
	}
}
