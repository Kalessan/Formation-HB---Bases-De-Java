
public class WordCount {

	public static void main(String[] args) {
		//
		String sentence = "    Ceci est une     longue phrase, enfin pas trop mais un peu    ";
		String processedSentence = sentence.trim();
		
		int wordsFound = 0;
		
		if(! processedSentence.isEmpty()) {
			wordsFound++;
			for(int i = 1; i < processedSentence.length(); i++) {
				if((processedSentence.charAt(i) != ' ') && (processedSentence.charAt(i-1) == ' ')) {
					wordsFound++;
				}
			}
		}
		
		System.out.println("Le nombre de mots de la phrase est : " + wordsFound);
	}
}
