import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		TodoList todolist = new TodoList();
		Task taskTodo = new Task("Hacer el aseo");
		Task taskTodo2 = new Task("Ir al gym");
		Task taskTodo3 = new Task("Estudiar java");
		
		todolist.AddTodos(taskTodo);
		todolist.AddTodos(taskTodo2);
		todolist.AddTodos(taskTodo3);
		
		todolist.getTodos();
	}
}
