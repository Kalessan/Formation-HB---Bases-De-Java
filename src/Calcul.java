
public class Calcul {

	public static void main(String[] args) {
		int[] notes = new int[5];
		notes[0] = 2;
		notes[1] = 14;
		notes[2] = 7;
		notes[3] = 4;
		notes[4] = 12;
		
// calculer le min ============================================================	
		int min = notes[0];
		for (int i = 1; i < notes.length; i++) {
			if (notes[i] < min) {
				min = notes[i];
			}
		}
		System.out.println("Minimum : " + min);
		
		
// calculer le max ============================================================
		int max = notes[0];
		for (int i = 1; i < notes.length; i++) {
			if (notes[i] > max) {
				max = notes[i];
			}
		}
		System.out.println("Maximum : " + max);
		
		
// calculer la moyenne ========================================================
		int sum = 0;
		for (int i = 0; i < notes.length; i++) {
			sum += notes[i];			
		}
		
		System.out.println("Moyenne : " + sum * 1.0 / notes.length);
	}
}
