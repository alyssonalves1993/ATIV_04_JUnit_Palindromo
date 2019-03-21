public class Palindromo implements Ipalindromo {
	/* Declaração dos métodos */

	public boolean isPalindromo(String texto) {
		String textoinvertido = null;
		texto = texto.toUpperCase();
		textoinvertido = new StringBuffer(texto).reverse().toString();
		if ( texto == null) {
			return true;
		} else {
			if (texto.equals(textoinvertido)) {
				// é palindrome
				return true;
			} else {
				// não é palindrome
				return false;
			}
		}
	}

}
