public class palindromo implements Ipalindromo {
	/* Declaração dos métodos */
	@Override
	public boolean isPalindromo(String texto) {
		String textoinvertido;
		textoinvertido = new StringBuffer(texto).reverse().toString(); 
		if(texto.equals(textoinvertido)){
		  //é palindrome
			return true;
		}else{
		  //não é palindrome
			return false;
		}
		
	}
	
}
