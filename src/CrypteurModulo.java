
public class CrypteurModulo {

	public static void main(String[] args) {
		String motACrypter = "bonjour";
		String motCrypte = "";
		int n = 7;
		int indiceDeA = 'a';
		
		for(int i = 0; i < motACrypter.length(); i++) {
			char currentChar = motACrypter.charAt(i);
			//currentChar += n;
			//motCrypte += currentChar;
			
			int indiceLettreCryptee = indiceDeA + ((currentChar + n) - indiceDeA) % 26;
			motCrypte += (char) indiceLettreCryptee;
			
			//indiceLettreCryptee = currentChar;
			//indiceLettreCryptee += n;
			//indiceLettreCryptee -= indiceDeA;
			//indiceLettreCryptee %= 26;
			//indiceLettreCryptee += indiceDeA;
		}
		System.out.println(motCrypte);
	}

}
