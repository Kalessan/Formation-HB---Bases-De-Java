package POO;

public class CaesarCrypterMain {

	public static void main(String[] args) {
		CaesarCrypter crypter = new CaesarCrypter();
		String cryptedResult = crypter.encrypt("hello, ça va?", 13);
		System.out.println(cryptedResult);		
		cryptedResult = crypter.encrypt(cryptedResult, 13);
		System.out.println(cryptedResult);
	}

}
