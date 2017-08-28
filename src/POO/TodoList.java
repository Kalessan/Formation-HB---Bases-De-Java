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
		for (int i = 0; i < todos.length; i++) {
			System.out.println((i+1) + ". " + todos[i]);
		}
		// A FAIRE: augmenter la capacit� du tableau a chaque it�ration (en en cr�ant un nouveau a chaque fois)

	}

}
