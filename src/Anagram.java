public class Anagram {

	public static void main(String[] args) {
		String word1 = "bonjour";
		String word2 = "jourbon";
		
		boolean isAnagram = true;
		
		if(word1.length() == word2.length()) {
			
			char[] carWord1 = new char[word1.length()];
			char[] carWord2 = new char[word2.length()];
			
			for (int i = 0; i < word1.length(); i++) {
				carWord1[i] = word1.charAt(i);
				carWord2[i] = word2.charAt(i);
			}
			
			for (int i = 0; i < carWord1.length && isAnagram; i++) {
				boolean isCharFromWord1PresentInWord2 = false;
				
				for (int j = 0; j < carWord1.length && ! isCharFromWord1PresentInWord2; j++) {
					if(carWord1[i] == carWord2[j]) {
						isCharFromWord1PresentInWord2 = true;
						carWord2[j] = ' ';
					}
				}
				
				if(! isCharFromWord1PresentInWord2) {
					isAnagram = false;
				}
			}
		} else {
			isAnagram = false;
		}
		
		if(isAnagram) {
			System.out.println("Ce sont des anagrammes");
		} else {
			System.out.println("Ce ne sont pas des anagrammes");
		}

	}

}