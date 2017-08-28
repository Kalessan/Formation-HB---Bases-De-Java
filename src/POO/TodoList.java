package POO;

public class TodoList {
	private int currentPosition = 0;
	private String[] todos;

	public void add(String t) {
		// Création d'un tableau temporaire pour sauvegarder les données déjà entrées.
		String[] todosTemp = new String[(currentPosition)];
		for (int i = 0; i < todosTemp.length; i++) {
			todosTemp[i] = todos[i];
		}
		
		// Modification de la taille du tableau final, et réinsertion des anciennes données
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
		// A FAIRE: augmenter la capacité du tableau a chaque itération (en en créant un nouveau a chaque fois)

	}

}
