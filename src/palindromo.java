public class palindromo implements Ipalindromo {
	/* Declara��o dos m�todos */
	@Override
	public boolean isPalindromo(String texto) {
		String textoinvertido;
		textoinvertido = new StringBuffer(texto).reverse().toString(); 
		if(texto.equals(textoinvertido)){
		  //� palindrome
			return true;
		}else{
		  //n�o � palindrome
			return false;
		}
		
	}
	
}
