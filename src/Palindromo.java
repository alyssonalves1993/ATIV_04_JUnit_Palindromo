public class Palindromo implements Ipalindromo {
	/* Declara��o dos m�todos */

	public boolean isPalindromo(String texto) {
		String textoinvertido = null;
		if (texto == null){
			return false;
		}else{
			texto = texto.toUpperCase();
			textoinvertido = new StringBuffer(texto).reverse().toString();
			if (texto.equals(textoinvertido)) {
				// � palindrome
				return true;
			} else {
				// n�o � palindrome
				return false;
			}
		}

	}

}
