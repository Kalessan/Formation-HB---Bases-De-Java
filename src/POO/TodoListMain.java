package POO;

public class TodoListMain {

	public static void main(String[] args) {
		TodoList todoList = new TodoList();
		
		todoList.add("un truc � faire");
		todoList.add("encore un truc � faire");
		todoList.add("faut bosser");
		todoList.add("et si on bosse bien...");
		todoList.add("on a plus besoin de definir les dimensions du tableau ;)");

		todoList.printTodos(); // afficher les choses � faire
		// 1. un truc � faire  
		// 2. encore un truc � faire  
		// 3. faut bosser
	}

}
