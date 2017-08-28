
public class Crypteur {

	public static void main(String[] args) {
		int shift = 2;
		String stringOrig = "Ceci est du code, c'est cool hein?";
		String stringCrypt = "";
		int distZ = 0;

		// Crypteur
		for(int i=0; i < stringOrig.length(); i++) {
			char newChar = stringOrig.charAt(i);
			
			// Pour les minuscules
			if(newChar <= 'z' && newChar >= 'a') {
				distZ = 'z' - newChar;
				if(distZ < shift) {
					newChar = 'a';
					newChar += (shift - distZ);
					newChar--;
				} else {
					newChar = stringOrig.charAt(i);
					newChar += shift;
				}
			}
			
			//Pour les Majuscules
			if(newChar <= 'Z' && newChar >= 'A') {
				distZ = 'Z' - newChar;
				if(distZ < shift) {
					newChar = 'A';
					newChar += (shift - distZ);
					newChar--;
				} else {
					newChar = stringOrig.charAt(i);
					newChar += shift;
				}
			}
			//System.out.println("DEBUG: " + stringOrig.charAt(i) + " " + i + " ==> " + newChar); // DEBUG
			stringCrypt += newChar;
		}
		System.out.println("Cryptage   : Avec une décalage de " + shift + ", \"" + stringOrig + "\" devient \"" + stringCrypt + "\".");
	
		//Meilleure méthode, avec % 26		
		
		
		
		
		
		// Decrypteur
		//String stringDecrypt = " ";
		
		//newChar = stringCrypt.charAt(i);
		
		// Pour les minuscules
		//if(newChar <= 'z' && newChar >= 'a') {
			//distZ = 'z' - newChar;
			//if(distZ < shift) {
			//	newChar = 'a';
			//	newChar += (shift - distZ);
			//	newChar--;
			//} else {
			//	newChar = stringOrig.charAt(i);
			//	newChar += shift;
			//}
		//}
		
		//Pour les Majuscules
		//if(newChar <= 'Z' && newChar >= 'A') {
			//distZ = 'Z' - newChar;
			//if(distZ < shift) {
			//	newChar = 'A';
			//	newChar += (shift - distZ);
			//	newChar--;
			//} else {
				//newChar = stringOrig.charAt(i);
				//newChar += shift;
			//}
		//}
	}

}
