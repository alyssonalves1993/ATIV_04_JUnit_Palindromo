public class Palindromo implements Ipalindromo {
	/* Declaração dos métodos */

	public boolean isPalindromo(String texto) {
		String textoinvertido = null;
		if (texto == null){
			return false;
		}else{
			texto = texto.toUpperCase();
			textoinvertido = new StringBuffer(texto).reverse().toString();
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
