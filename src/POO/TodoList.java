package POO;

public class TodoList {
	private int currentPosition = 0;
	private String[] todos;

	public void add(String t) {
		// Cr�ation d'un tableau temporaire pour sauvegarder les donn�es d�j� entr�es.
		String[] todosTemp = new String[(currentPosition)];
		for (int i = 0; i < todosTemp.length; i++) {
			todosTemp[i] = todos[i];
		}
		
		// Modification de la taille du tableau final, et r�insertion des anciennes donn�es
		todos = new String[currentPosition + 1];
		for (int i = 0; i < todosTemp.length; i++) {
			todos[i] = todosTemp[i];
		}
		
		// On renseigne la valeur actuelle
		todos[currentPosition] = t;
		currentPosition++;		
	}

	public void printTodos() {
		// Bonus Design =====================================================
		
		//Calcul de la plus grande chaine de caract�res
		int max = todos[0].length();
		for (int i = 0; i < todos.length; i++) {
			if (todos[i].length() > max) {
				max = todos[i].length();
			}
		}
	
		// Construction de la bordure du haut
		String bordureHautGauche = "";
		String bordureHautDroite = "";
		for (int i = 0; i < (max/2)+1; i++) {
			bordureHautGauche += "=";
			bordureHautDroite = bordureHautGauche;
		}
		if(max % 2 != 0) {
			bordureHautDroite = bordureHautGauche + "=";
		}		
		System.out.println(bordureHautGauche + "ToDo List" + bordureHautDroite);
		
		// Ecriture des t�ches et construction des bordures de droite 
		String bordureDroite = "  ||";
		for (int i = 0; i < todos.length; i++) {
			String espacement = "";
			for (int j = 0; j < (max - todos[i].length()) ; j++) {
				espacement += " ";
			}			
			System.out.println("||  " + (i+1) + ". " + todos[i] + espacement + bordureDroite);
		}
		
		// Construction de la bordure du Bas
		System.out.println(bordureHautGauche + "=========" + bordureHautDroite);

	}

}
