package POO;

public class TodoList {
	private String[] todos = new String[10];
	private int currentPosition = 0;
	

	public void add(String t) {
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
