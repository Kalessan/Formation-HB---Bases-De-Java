package POO;

public class TodoListMain {

	public static void main(String[] args) {
		TodoList todoList = new TodoList();
		
		todoList.add("un truc à faire");
		todoList.add("encore un truc à faire");
		todoList.add("faut bosser");

		
		

		todoList.printTodos(); // afficher les choses à faire
		// 1. un truc à faire  
		// 2. encore un truc à faire  
		// 3. faut bosser
	}

}
