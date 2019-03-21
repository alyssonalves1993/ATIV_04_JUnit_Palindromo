import java.text.Normalizer;

public class Palindromo implements Ipalindromo {
	/* Declara��o dos m�todos */

	public boolean isPalindromo(String texto) {
		String textoinvertido = null;
		if (texto == null){
			return false;
		}else{
			texto = texto.toUpperCase();
			texto = Normalizer.normalize(texto, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
			textoinvertido = new StringBuffer(texto).reverse().toString();
			if (texto.equals(textoinvertido) && !texto.equals("") && !texto.equals(" ")) {
				// � palindrome
				return true;
			} else {
				// n�o � palindrome
				return false;
			}
		}

	}

}
