package POO;

public class MathematicsMain {

	public static void main(String[] args) {
		
		Mathematics mathematics = new Mathematics();

		// Factorielle ===================================
		
//		int fact12 = mathematics.factorial(12);
//		System.out.println("La factorielle de 12 est: " + fact12);
//		
//		int fact6 = mathematics.factorial(6);
//		System.out.println("La factorielle de 6 est: " + fact6);
//		
//		int fact4 = mathematics.factorial(4);
//		System.out.println("La factorielle de 4 est: " + fact4);
	
		for (int i = 1; i <= 10; i++) {
			System.out.println("La factorielle de " + i + " est: " + mathematics.factorial(i));
		}
		
		// Addition
		
		int cinqPlusTrois = mathematics.addition(5, 3);
		System.out.println("L'addition de 5 et 3 vaut : " + cinqPlusTrois);
	}

}
